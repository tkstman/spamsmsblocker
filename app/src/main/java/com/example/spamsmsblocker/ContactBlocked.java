package com.example.spamsmsblocker;

public class ContactBlocked {

    private String contactName;
    private Boolean autoDelete;
    private Boolean denyNotifications;
    private int imageID;

    public ContactBlocked(String contactName, Boolean autoDelete, Boolean denyNotifications,int imageID)
    {
        this.contactName= contactName;
        this.autoDelete = autoDelete;
        this.denyNotifications = denyNotifications;
        this.imageID = imageID;
    }


    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Boolean getAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public Boolean getDenyNotifications() {
        return denyNotifications;
    }

    public void setDenyNotifications(Boolean denyNotifications) {
        this.denyNotifications = denyNotifications;
    }



}
