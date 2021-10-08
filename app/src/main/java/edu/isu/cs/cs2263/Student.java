package edu.isu.cs.cs2263;

public class Student {
    private String firstName;
    private String lastName;

    Student(){}

    public void setFirstName(String name){
        firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return getLastName() + ", " + getFirstName();
    }
}
