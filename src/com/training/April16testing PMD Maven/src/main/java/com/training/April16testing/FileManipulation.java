/*  Program name        : 	File IO
 *	Program Description :	Read a file from a local disk.
 *							Manipulate it- Read content,change it and save it in different folder.
 *							Don't use absolute path.
 *  Date created		:	16-April-2018
 */
package com.training.April16testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileManipulation {

    public static void main(String[] args) throws IOException {

  //      File file = new File("./hii.txt");
    //    FileInputStream fs = null;
    	 FileReader fr=new FileReader("./testout.txt");    
         int ind1;    
         while((ind1=fr.read())!=-1)    {
        	 System.out.print((char)ind1);  
         }
         FileWriter writer = new FileWriter("testout.txt", true);
         writer.write("Hello World");
         writer.write("\r\n");   // write new line
         writer.write("Good Bye!");
         writer.close();
         fr.close();    
       
    }
}
