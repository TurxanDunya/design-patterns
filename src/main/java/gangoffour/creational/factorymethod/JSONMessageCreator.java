package gangoffour.creational.factorymethod;

import gangoffour.creational.factorymethod.message.JSONMessage;
import gangoffour.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages.
 * Remember, the most defining characteristics of factory method is "subclasses providing the actual instance".
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
