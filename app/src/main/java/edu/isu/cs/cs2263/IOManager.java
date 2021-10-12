package edu.isu.cs.cs2263;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class IOManager {

    public List<Student> readData(String file){
        List<Student> studentList = new ArrayList<>();
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
            File f = new File(file);
            if(f.exists()){
               f.delete();
            }
            FileWriter fw = new FileWriter(file,true);
            for (Student st : data) {
                String studentData = g.toJson(st);
                fw.write(studentData + "\n");
            }
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
