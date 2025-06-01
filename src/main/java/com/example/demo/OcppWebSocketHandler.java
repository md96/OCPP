package com.example.demo;

import java.util.logging.Logger;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OcppWebSocketHandler extends TextWebSocketHandler{

 private final ObjectMapper  mapper= new ObjectMapper();
 private static Logger logger =Logger.getLogger(OcppWebSocketHandler.class.getName());

@Override
public void afterConnectionEstablished(WebSocketSession session)throws Exception {

    logger.info("Client connected session id :"+session.getId());

}

@Override
public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
    logger.info("Recieved message :"+message.getPayload());
    session.sendMessage(new TextMessage(message.getPayload()));
}

@Override
public void afterConnectionClosed(WebSocketSession session, CloseStatus status){
    logger.info("Session id "+session.getId()+"Status"+status);
}   
    

}
