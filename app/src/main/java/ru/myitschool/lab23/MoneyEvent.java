package ru.myitschool.lab23;

import java.util.Date;

import kotlin.text.UStringsKt;

public interface MoneyEvent {
    void add(String type, double money, Date date);
}
