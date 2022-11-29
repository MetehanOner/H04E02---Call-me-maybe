package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneFactory {

    //TODO: Initialize the phoneList attribute (as an ArrayList or a LinkedList) in the constructor and add a getter, setter for this attribute
    private List<Phone> phoneList;

    public PhoneFactory(){
        this.phoneList = new ArrayList<>();
        setPhoneList(phoneList);
    }
    //TODO: Implement the producePhones method which adds the parameter phone to the phoneList
    public void producePhone(Phone phone){

        getPhoneList().add(phone);

    }
    //TODO: Implement the findPhones method which searches through the entire phoneList and returns the phone with the matching id. If no such phone exists, return a new phone with the brand "", price -1 and without touchscreen feature
    public Phone findPhone(int id){

        if (id < 0){
            return new Phone("",-1,false);
        }

        for (int i = 0; i < getPhoneList().size(); i++) {
            if(id == getPhoneList().get(i).getId()){
                return getPhoneList().get(i);
            }
        }
        return new Phone("",-1,false);
    }
    //TODO: Implement the removePhone method which removes the phone with the given id from the phoneList and returns the removed phone. If no phone with the given id exists, then follow the same rule in the findPhones method.
    public Phone removePhone(int id){

        Phone removedPhoned = findPhone(id);

        getPhoneList().remove(removedPhoned);

        return removedPhoned;

    }
    //TODO: Implement findTouchPhones method that iterates over the phoneList and store all touchscreen phones in a new list and return this list.
    public List<Phone> findTouchPhones(){

        List<Phone> pList = new ArrayList<>();

        for (int i = 0; i < getPhoneList().size(); i++) {
            if(getPhoneList().get(i).isTouchscreen()){
                 pList.add(getPhoneList().get(i));
            }
        }
        return pList;
    }
    //TODO: Implement containsPhoneO that checks if the given phoneList contains the given phone. Return true if it does and false if it doesn't.
    public boolean containsPhone(List<Phone> givenList, Phone givenPhone){

        for (int i = 0; i < givenList.size(); i++) {
            if(givenList.get(i) == givenPhone){
                return true;
            }
        }
        return false;

    }
    //TODO: Implement removeByBrand that removes all the phones with the brand from the list phones and returns a list that doesn't contain phones of this brand. If brand or phones is null, return an empty list.
    public List<Phone> removeByBrand(List<Phone> givenList, String brand){

        if(givenList == null || brand == null){
            return new ArrayList<>();
        }

        for (int i = 0; i < givenList.size(); i++) {
            if(Objects.equals(givenList.get(i).getBrand(), brand)){
                givenList.remove(givenList.get(i));
            }
        }

        return givenList;
    }
    //TODO: Implement findSmallestByLex method that returns the phone with the lexicographically smallest brand
    public Phone findSmallestByLex(List<Phone> givenList){

        if (givenList == null || givenList.size() == 0){
            return null;
        }

        String smallest = givenList.get(0).getBrand();

        for (int i = 1; i < givenList.size(); i++) {

            int x = smallest.compareTo(givenList.get(i).getBrand());

            if (x>0) {
                smallest = givenList.get(i).getBrand();
            }
        }

        Phone Obj = new Phone("", -1, false);
        for (int i = 0; i < givenList.size(); i++) {
            if(Objects.equals(smallest, givenList.get(i).getBrand())){
                Obj =  givenList.get(i);
                break;
            }
        }

        return Obj;

    }
    //TODO: Implement sortByTouch that stores all the phones with a touchscreen in the beginning of a list, the rest of the phones at the end and return this list of phones.
    public List<Phone> sortByTouch() {

        if (getPhoneList().size() == 0){
            return null;
        }

        Phone touchPhone;
        if (getPhoneList().size()>1)
        {
            for (int x=0; x < getPhoneList().size(); x++)
            {
                for (int i=0; i < getPhoneList().size() - x - 1 ; i++) {
                    if ((getPhoneList().get(i).isTouchscreen()) && (!getPhoneList().get(i + 1).isTouchscreen()))
                    {
                        touchPhone = getPhoneList().get(i);
                        getPhoneList().set(i, getPhoneList().get(i+1));
                        getPhoneList().set(i+1, touchPhone);
                    }
                }
            }
        }

        return getPhoneList();

    }
    //TODO: Implement sortByBrand that sorts the phones lexicographically according to their brand and return a list of sorted phones.
    public List<Phone> sortByBrand(List<Phone> givenList){

        if (getPhoneList().size() == 0){
            return null;
        }

        Phone smallPhone;
        if (getPhoneList().size()>1)
        {
            for (int x=0; x < getPhoneList().size(); x++)
            {
                for (int i=0; i < getPhoneList().size() - x - 1 ; i++) {
                    if (getPhoneList().get(i).getBrand().compareTo(getPhoneList().get(i + 1).getBrand()) > 0)
                    {
                        smallPhone = getPhoneList().get(i);
                        getPhoneList().set(i, getPhoneList().get(i+1));
                        getPhoneList().set(i+1, smallPhone);
                    }
                }
            }
        }

        return getPhoneList();
    }
    //TODO: Implement sortByPrice that sorts the list of phones according to their price in increasing order and return the sorted list
    public List<Phone> sortByPrice(){

        if (getPhoneList().size() == 0){
            return null;
        }

        Phone cheapPhone;
        if (getPhoneList().size()>1)
        {
            for (int x=0; x < getPhoneList().size(); x++)
            {
                for (int i=0; i < getPhoneList().size() - x - 1 ; i++) {
                    if (getPhoneList().get(i).getPrice() > getPhoneList().get(i+1).getPrice())
                    {
                        cheapPhone = getPhoneList().get(i);
                        getPhoneList().set(i, getPhoneList().get(i+1));
                        getPhoneList().set(i+1, cheapPhone);
                    }
                }
            }
        }

        return getPhoneList();
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }
}
