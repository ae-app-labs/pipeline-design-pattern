package org.example.patterns.stage;

import java.util.ArrayList;
import java.util.List;

import org.example.patterns.models.Message;
import org.example.patterns.models.Messages;

public class CreateMessagesStage implements Stage<Messages> {

	@Override
	public Messages execute(Messages input) {
		List<Message> messages = new ArrayList<Message>();
		messages.add( Message.of(1, "Alice", "Says Hi") );
		messages.add( Message.of(1, "Alice", "Says Hi") );
		messages.add( Message.of(2, "Bob", "Hi Alice") );
		messages.add( Message.of(3, "Charles", "Hello everyone") );
		messages.add( Message.of(4, "Alice", "Hello Bob") );
		messages.add( Message.of(5, "Alice", "Hello Charles") );
		messages.add( Message.of(6, "Bob", "How are you, Charles?") );
		messages.add( Message.of(6, "Bob", "How are you, Charles?") );
		
		return new Messages(messages);
	}

	
}
