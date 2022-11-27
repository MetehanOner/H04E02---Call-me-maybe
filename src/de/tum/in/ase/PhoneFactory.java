package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class PhoneFactory {

    //TODO: Initialize the phoneList attribute (as an ArrayList or a LinkedList) in the constructor and add a getter, setter for this attribute
    List<Phone>phoneList = new ArrayList<>();
    //TODO: Implement the producePhones method which adds the parameter phone to the phoneList
    public void producePhone(Phone phone){

    }
    //TODO: Implement the findPhones method which searches through the entire phoneList and returns the phone with the matching id. If no such phone exists, return a new phone with the brand "", price -1 and without touchscreen feature
    public Phone findPhone(int id){
        return new Phone("",0,false);
    }
    //TODO: Implement the removePhone method which removes the phone with the given id from the phoneList and returns the removed phone. If no phone with the given id exists, then follow the same rule in the findPhones method.
    public Phone removePhone(){
        return new Phone("",0,false);
    }
    //TODO: Implement findTouchPhones method that iterates over the phoneList and store all touchscreen phones in a new list and return this list.
    public List<Phone> findTouchPhones(){
        List<Phone> pList = new ArrayList<>();
        return pList;
    }
    //TODO: Implement containsPhone that checks if the given phoneList contains the given phone. Return true if it does and false if it doesn't.
    public boolean containsPhone(List<Phone> givenList, Phone givenPhone){
        return true;
    }
    //TODO: Implement removeByBrand that removes all the phones with the brand from the list phones and returns a list that doesn't contain phones of this brand. If brand or phones is null, return an empty list.
    public List<Phone> removeByBrand(List<Phone> givenList, String brand){
        List<Phone> pList = new ArrayList<>();
        return pList;
    }
    //TODO: Implement findSmallestByLex method that returns the phone with the lexicographically smallest brand
    public Phone findSmallestByLex(List<Phone> givenList){
        return new Phone("",0,false);
    }
    //TODO: Implement sortByTouch that stores all the phones with a touchscreen in the beginning of a list, the rest of the phones at the end and return this list of phones.
    public List<Phone> sortByTouch(){
        List<Phone> pList = new ArrayList<>();
        return pList;
    }
    //TODO: Implement sortByBrand that sorts the phones lexicographically according to their brand and return a list of sorted phones.
    public List<Phone> sortByBrand(List<Phone> givenList){
        List<Phone> pList = new ArrayList<>();
        return pList;
    }
    //TODO: Implement sortByPrice that sorts the list of phones according to their price in increasing order and return the sorted list
    public List<Phone> sortByPrice(){
        List<Phone> pList = new ArrayList<>();
        return pList;
    }


}
