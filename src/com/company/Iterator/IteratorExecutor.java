package com.company.Iterator;

public class IteratorExecutor {
    public void execute(){
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();
    }
}
