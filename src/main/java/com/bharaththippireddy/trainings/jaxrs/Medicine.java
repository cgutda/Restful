package com.bharaththippireddy.trainings.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;
//this is a java beans with the JAX-B annotation

@XmlRootElement(name = "Medicine")
public class Medicine {
	private long id;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		this.description = d;
	}
}
