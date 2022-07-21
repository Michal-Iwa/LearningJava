package com.MobilePhone;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String myPhoneNumber){
        this.myNumber = myPhoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index < 0) return false;
        myContacts.set(index, newContact);
        return true;
    }
    public boolean removeContact(Contact contact){
        int index = findContact(contact);
        if(index < 0) return false;
        myContacts.remove(contact);
        return true;
    }
    private int findContact(String contactName){
        for(int i = 0; i < myContacts.size(); i++){
            if(Objects.equals(myContacts.get(i).getName(), contactName))
                return i;
        }
        return -1;
    }
    public Contact queryContact(String string){
        int index = findContact(string);
        if(index < 0) return null;
        return myContacts.get(index);
    }
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++)
            System.out.println( (i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
    }
}
