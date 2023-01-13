package com.jersey.project.home.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jersey.project.home.model.Message;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



public class MessageService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> messages() {
		Message msg = new Message(1, "This is first message", new Date(), "amit");
		Message msg1 = new Message(2, "This is second message", new Date(), "ankit");

		List<Message> msgs = new ArrayList<>();
		msgs.add(msg1);
		msgs.add(msg);
	
		return msgs;
	}
}
