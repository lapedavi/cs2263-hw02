package edu.isu.cs.cs2263;

public class Course {

    private int number;
    private String subject;
    private String title;

    public Course(){}

    public void setNumber(int num){
        number = num;
    }

    public int getNumber(){
        return number;
    }

    public void setSubject(String subj){
        subject = subj;
    }

    public String getSubject(){
        return subject;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return getNumber() + ", " + getTitle() + ", " + getSubject();
    }
}
