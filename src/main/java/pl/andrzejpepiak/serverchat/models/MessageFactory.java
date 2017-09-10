package pl.andrzejpepiak.serverchat.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import sun.plugin2.message.Message;


public class MessageFactory {
    public static transient Gson GSON = new GsonBuilder().create();

    public enum MessageType{
        SEND_MESSAGE, USER_JOIN, USER_LEFT, GET_ALL_USERS, SET_NICK, NICK_NOT_FREE ;
    }

    private String message;
    private String author;
    private MessageType messageType;


    public MessageFactory(){

    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public static Gson getGSON() {
        return GSON;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public static void setGSON(Gson GSON) {
        MessageFactory.GSON = GSON;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
