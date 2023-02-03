package de.jena.sensinact;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import org.eclipse.sensinact.prototype.PrototypePush;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.typedevent.TypedEventBus;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushEvent.EventType;
import org.osgi.util.pushstream.PushStream;

import de.jena.icesensor.api.IceSensorService;
import de.jena.model.icesensor.SensorData;

@Component(immediate = true)
public class IceSensor {
	private static final Logger logger = System.getLogger(IceSensor.class.getName());

	@Reference
	private IceSensorService service;
	@Reference
	private TypedEventBus bus;

	@Reference
	private PrototypePush sensiNact;

	private PushStream<SensorData> subcribtion;

	@Activate
	public void activate() {
		
		subcribtion = service.subcribe();
		subcribtion.forEachEvent(this::handle);
		logger.log(Level.INFO, "Sensinect IceSensor started.");
	}

	@Deactivate
	private void deactivate() {
		subcribtion.close();
	}

	/**
	 * Message coming in from the sensor, just like a custom model
	 */
	public void onMessage(SensorData iceSENSOR) {
		// Create the DTO
		IceSensorDto dto = toDTO(iceSENSOR);

		try {
			// Send the dto data to sensiNact core somehow?
			// e.g. Typed Events
//			bus.deliver("sensiNact/push/event", dto);
			// e.g. Direct to core
			sensiNact.pushUpdate(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private long handle(PushEvent<? extends SensorData> event) {
		EventType type = event.getType();
		switch (type) {
		case CLOSE:
			logger.log(Level.INFO, "PushStream closed.");
			break;
		case DATA:
			onMessage(event.getData());
			break;
		case ERROR:
			event.getFailure().printStackTrace();
			break;
		default:
			break;
		}
		return 0;
	}

	IceSensorDto toDTO(SensorData data) {
		IceSensorDto dto = new IceSensorDto();
		dto.data = data.getAvg();
		dto.service = data.getSensor_type();
		dto.provider = data.getGateway();
		dto.timestamp = data.getCreated_at().getTime();
		return dto;
	}
}
