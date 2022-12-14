package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
	private int id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;

	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}
