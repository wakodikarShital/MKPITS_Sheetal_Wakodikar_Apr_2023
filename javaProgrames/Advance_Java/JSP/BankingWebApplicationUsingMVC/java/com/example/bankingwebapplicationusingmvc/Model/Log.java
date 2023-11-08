package com.example.bankingwebapplicationusingmvc.model;

import java.sql.Timestamp;

public class Log {
    private Timestamp timestamps;
    private String activity;
    private String uerId;

    public Log() {
    }

    public Log(Timestamp timestamps, String activity, String uerId) {
        this.timestamps = timestamps;
        this.activity = activity;
        this.uerId = uerId;
    }

    public Timestamp getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(Timestamp timestamps) {
        this.timestamps = timestamps;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getUerId() {
        return uerId;
    }

    public void setUerId(String uerId) {
        this.uerId = uerId;
    }
}
