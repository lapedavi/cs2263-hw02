package edu.isu.cs.cs2263;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOManager {

    public List<Student> readData(String file){
        List<Student> studentList = new ArrayList<Student>();
        Gson g = new Gson();
        File File = new File(file);
        try {
            Scanner sc = new Scanner(File);
            while (sc.hasNextLine()) {
                Student currentStudent = g.fromJson(sc.nextLine(), Student.class);
                studentList.add(currentStudent);
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return studentList;
    }

    public void writeData(String file, List<Student> data){
        Gson g = new Gson();
        try {
            FileWriter fw = new FileWriter(file,true);
            for (Student st : data) {
                String studentData = g.toJson(st);
                fw.write(studentData);
            }
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return;
    }

}
