package org.example.patterns.stage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.example.patterns.models.Message;
import org.example.patterns.models.Messages;

public class RemoveDuplicatesStage implements Stage<Messages> {

	@Override
	public Messages execute(Messages input) {
		Set<Message> messages = new HashSet<Message>();
		messages.addAll(input.getMessages());

		return new Messages(new ArrayList<Message>(messages));
	}

}
