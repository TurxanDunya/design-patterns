package gangoffour.creational.factorymethod;

import gangoffour.creational.factorymethod.message.Message;

/**
 * We use this pattern when we do not know which class we may need to instantiate beforehand.
 * Also to allow new classes to be added to system and handle their creation without affecting client code.
 * We let subclasses decide which object to instantiate by overriding the factory method.
 *
 * Difference between this and Simple Factory: this Factory Pattern doesn't know of object types.
 * Subclasses defines it.
 * Remember, the most defining characteristics of factory method is "subclasses providing the actual instance".
 *
 * Advantage of this pattern is that we can simply add new subclasses.
 */
public class Client {
	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());
	}

	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
