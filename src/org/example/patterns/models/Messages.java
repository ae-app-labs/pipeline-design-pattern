package org.example.patterns.models;

import java.util.List;

/**
 * A wrapper that can hold a list of Messages, and any other metadata
 *
 */
public class Messages {

	List<Message> messages;

	public List<Message> getMessages() {
		return messages;
	}

	public Messages() {
	}

	public Messages(List<Message> messages) {
		this.messages = messages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Messages other = (Messages) obj;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Messages [messages=" + messages + "]";
	}

}
