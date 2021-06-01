package com.example.fragments_comm;

public class DataObject {
    String sender,subject,text;
    int resid;

    public DataObject(String sender, String subject, String text, int resid) {
        this.sender = sender;
        this.subject = subject;
        this.text = text;
        this.resid = resid;}

    public String getSender() {
        return sender;

    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public int getResid() {
        return resid;
    }


}
