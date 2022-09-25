package gangoffour.creational.factorymethod;

import gangoffour.creational.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	// Notice this method returns Message.
	// And in this point MessageCreator knows what is its object type
	// In Simple Factory, we have to define all object types. But, in this case not.
	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	//Factory method. Subclasses will override it. The key point is here also
	protected abstract Message createMessage();

}
