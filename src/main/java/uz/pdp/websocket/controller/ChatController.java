package uz.pdp.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import uz.pdp.websocket.model.Message;

@Controller
public class ChatController {

    @MessageMapping("/hello")
    @SendTo("/topic/messages")
    public Message greeting(Message message) throws Exception {
        Thread.sleep(1000);
        return new Message(message.getText());
    }
}
