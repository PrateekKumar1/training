package com.training.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileManipulation {

    public static void main(String[] args) {

        File file = new File("./hii.txt");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

           
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
            
            
            File data = new File("./testout.txt");  
            FileOutputStream file2 = new FileOutputStream(data);  
            FilterOutputStream filter = new FilterOutputStream(file2);  
            String s="Welcome to java.";      
            byte b[]=s.getBytes();      
            filter.write(b);     
            filter.flush();  
            filter.close();  
            file2.close();  
            System.out.println("Success...");  
            
                      

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
           
        
    }
}
