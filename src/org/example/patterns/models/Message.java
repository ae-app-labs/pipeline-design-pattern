package org.example.patterns.models;

/**
 * Represents a message
 */
public class Message {

	private long id;
	private String name;
	private String message;

	public Message() {
	}
	
	public static Message of(long id, String name, String message) {
		return new Message(id, name, message);
	}

	private Message(long id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Message other = (Message) obj;
		if (id != other.id)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[id=" + id + "] " + name + " : " + message;
	}

}
