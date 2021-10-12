package edu.isu.cs.cs2263;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Course> courseList;

    Student(){}
    Student(String firstName, String lastName, List<Course> courseList){
        setFirstName(firstName);
        setLastName(lastName);
        setCourseList(courseList);
    }

    public void setFirstName(String name){
        firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getLastName(){return lastName;}

    public void setCourseList(List<Course> courses){courseList = courses;}

    public List<Course> getCourseList() {return courseList;}

    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
