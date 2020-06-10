package org.example.patterns.stage;

import org.example.patterns.models.Message;
import org.example.patterns.models.Messages;

public class OutputMessagesStage implements Stage<Messages> {

	@Override
	public Messages execute(Messages input) {
		for(Message message : input.getMessages()) {
			System.out.println(message);
		}
		return input;
	}

}
