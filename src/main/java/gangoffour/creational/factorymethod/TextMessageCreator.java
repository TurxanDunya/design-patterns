package gangoffour.creational.factorymethod;

import gangoffour.creational.factorymethod.message.Message;
import gangoffour.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages.
 * Remember, the most defining characteristics of factory method is "subclasses providing the actual instance".
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}