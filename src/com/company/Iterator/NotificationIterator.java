package com.company.Iterator;

public class NotificationIterator implements Iterator {

    Notification [] notificationsList;
    int pos = 0;

    public NotificationIterator(Notification[] notificationsList) {
        this.notificationsList = notificationsList;
    }

    @Override
    public boolean hasNext() {
        if(pos >= notificationsList.length || notificationsList[pos] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object getNext() {
        Notification notification = notificationsList[pos];
        pos++;
        return notification;
    }
}
