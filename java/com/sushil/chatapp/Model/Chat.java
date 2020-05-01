package com.sushil.chatapp.Model;

public class Chat {
    private String sender;
    private String receiver;
    private  String message;
    private boolean issues;

    public Chat(String sender, String receiver, String message, boolean issues) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.issues = issues;
    }
    Chat(){


    }

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

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIssues() {
        return issues;
    }

    public void setIssues(boolean issues) {
        this.issues = issues;
    }

    public Chat get(int position) {
        return null;
    }

    public int size() {

        return 0;
    }

    public boolean isIsseen() {
        return false;
    }
}
