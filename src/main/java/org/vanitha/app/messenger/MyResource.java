package org.vanitha.app.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.jdt.internal.compiler.util.Messages;

import com.vanitha.app.messenger.model.Message;
import com.vanitha.app.messenger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	MessageService messageService = new MessageService();
	
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
    	
        return messageService.getAllMessages();
    }
}
