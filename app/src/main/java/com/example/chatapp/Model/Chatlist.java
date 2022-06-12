package com.example.chatapp.Model;

//Model class for the ChatList
public class Chatlist {
    public String id;

    //Constructor
    public Chatlist(String id){
        this.id = id;
    }
    public Chatlist() {
    }
    //Getter and Setter Methods
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}