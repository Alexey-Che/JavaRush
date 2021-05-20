package com.javarush.task.task30.task3008;

import java.io.Serializable;

public class Message implements Serializable {
    private final MessageType type;
    private final String data;

    public Message(MessageType messageType) {
        this.type = messageType;
        this.data = null;
    }

    public Message(MessageType messageType, String data) {
        this.type = messageType;
        this.data = data;
    }

    public MessageType getType() {
        return type;
    }

    public String getData() {
        return data;
    }


}
