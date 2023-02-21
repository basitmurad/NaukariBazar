package com.example.naukaribazar.model;

public class ProposalClass {
    int image;
    private  String name,emailId,time,dollars;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDollars() {
        return dollars;
    }

    public void setDollars(String dollars) {
        this.dollars = dollars;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ProposalClass(String name, String emailId, String time, String dollars, int image) {


        this.name = name;
        this.emailId = emailId;
        this.time = time;
        this.dollars = dollars;
        this.image = image;
    }

    public ProposalClass(int image, String name, String emailId) {
        this.image = image;
        this.name = name;
        this.emailId = emailId;
    }
}
