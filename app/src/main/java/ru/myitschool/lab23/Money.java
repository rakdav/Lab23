package ru.myitschool.lab23;

import android.provider.ContactsContract;

import java.util.Date;

public class Money {
    private String type;
    private double amount;
    private Date date;

    public Money(String type, double amount, Date date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
