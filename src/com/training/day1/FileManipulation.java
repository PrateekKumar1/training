package com.training.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileManipulation {

    public static void main(String[] args) {

        File file = new File("./hii.txt");
        FileInputStream fs = null;

        try {
            fs = new FileInputStream(file);

           
            int content;
            while ((content = fs.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
            
            
            File data = new File("./hii.txt");  
            FileOutputStream f2 = new FileOutputStream(data);  
            FilterOutputStream filter = new FilterOutputStream(f2);  
            String str="Welcome to java.";      
            byte b[]=str.getBytes();      
            filter.write(b);     
            filter.flush();  
            filter.close();  
            f2.close();  
            System.out.println("Success...");  
            
                      

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fs != null)
                    fs.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
           
        
    }
}
