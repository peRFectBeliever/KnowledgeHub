package com.devd.personal.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
    public static void main(String args[]){
        Scanner sc;
        try {
            sc = new Scanner(new File("/home/devd/Workdisk/Repos/KnowledgeHub/Scaler/src/main/java/com/devd/personal/learning/testFiles/text.txt"));
            System.out.println(sc.nextLine());
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
    
}
