package com.example.naukaribazar.model;

import android.graphics.Bitmap;

public class StatusClass {
    private int logo;
    private String companyName,companySubTitle,time,proposals;

    public StatusClass(int logo, String companyName, String companySubTitle, String time, String proposals) {
        this.logo = logo;
        this.companyName = companyName;
        this.companySubTitle = companySubTitle;
        this.time = time;
        this.proposals = proposals;
    }


    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySubTitle() {
        return companySubTitle;
    }

    public void setCompanySubTitle(String companySubTitle) {
        this.companySubTitle = companySubTitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProposals() {
        return proposals;
    }

    public void setProposals(String proposals) {
        this.proposals = proposals;
    }
}
