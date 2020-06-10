package org.example.patterns.stage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.example.patterns.models.Message;
import org.example.patterns.models.Messages;

public class SortMessagesStage implements Stage<Messages> {

	@Override
	public Messages execute(Messages input) {
		List<Message> messages = input.getMessages();
		
		Comparator<Message> compareById =
				(Message o1, Message o2) -> Long.compare(o1.getId() , o2.getId() );
		
		Collections.sort(messages, compareById);
		return new Messages(messages);
	}

}
