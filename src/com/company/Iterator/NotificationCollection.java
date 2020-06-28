package com.company.Iterator;

import java.util.ArrayList;

public class NotificationCollection {

    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    Notification [] notificationsList;

    public NotificationCollection() {
        notificationsList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
    }

    public void addItem(String str){
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Array is Full");
        } else {
            notificationsList[numberOfItems] = new Notification(str);
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new NotificationIterator(notificationsList);
    }
}
