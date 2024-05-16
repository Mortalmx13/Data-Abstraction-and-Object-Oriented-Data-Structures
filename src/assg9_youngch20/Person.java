package assg9_youngch20;

import java.io.*;
import java.util.*;

import activity12.KeyedItem;

public class Person extends KeyedItem<String> {
    private String phoneNumber;
/**
 * constutor to be called 
 * @param name
 * @param phoneNumber
 */
    public Person(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }
/**
 * gets phone number
 * @return
 */
    public String getPhoneNumber() {
        return phoneNumber;
    }
/**
 * sets phone number
 * @param phoneNumber
 */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}