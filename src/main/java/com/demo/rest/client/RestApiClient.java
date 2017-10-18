package com.demo.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.messenger.model.Message;

public class RestApiClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target("http://localhost:8080/jaxrs_demo/webapi/");
		WebTarget messagesTarget = baseTarget.path("messages");
		WebTarget singleMessageTarget = messagesTarget.path("{messageId}");

		Message message1 = singleMessageTarget.resolveTemplate("messageId", "1").request(MediaType.APPLICATION_JSON)
				.get(Message.class);

		Message message2 = singleMessageTarget.resolveTemplate("messageId", "2").request(MediaType.APPLICATION_JSON)
				.get(Message.class);

		System.out.println(message1);
		System.out.println(message2);

		Message newMessage = new Message(4, "My New message from JAX-RS client", "Optimus");
		Response postResponse = messagesTarget.request().post(Entity.json(newMessage));

		if (postResponse.getStatus() != 201) {
			System.out.println("Error");
		}
		Message createdMessage = postResponse.readEntity(Message.class);
		System.out.println(createdMessage);

	}

}
