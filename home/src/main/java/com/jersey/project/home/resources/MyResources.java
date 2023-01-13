package com.jersey.project.home.resources;
import java.util.List;

import com.jersey.project.home.model.Message;
import com.jersey.project.home.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/messages")
public class MyResources {
	
	MessageService msg = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> resourcemethods() {
		return msg.messages();
	}
}
