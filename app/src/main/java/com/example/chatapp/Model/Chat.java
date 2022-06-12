package com.example.chatapp.Model;

//Model Class for the Chat
public class Chat {

    private  String sender;
    private String receiver;
    private String message;
    private boolean isseen;

    //Constructor
    public Chat(String sender, String receiver, String message,boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen =isseen;
    }

    public Chat(){
    }

    //Getter and Setter Methods
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String mesaage) {
        this.message = mesaage;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
