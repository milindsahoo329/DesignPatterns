package com.company.Iterator;

public class NotificationBar {
    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications(){
        Iterator iterator = notificationCollection.createIterator();
        System.out.println("Notifications Bar");
        while (iterator.hasNext()){
            Notification notification = (Notification)iterator.getNext();
            System.out.println(notification.getNotification());
        }
    }
}
