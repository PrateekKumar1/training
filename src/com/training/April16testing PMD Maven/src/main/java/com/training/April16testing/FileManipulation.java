/*  Program name        : 	File IO
 *	Program Description :	Read a file from a local disk.
 *							Manipulate it- Read content,change it and save it in different folder.
 *							Don't use absolute path.
 *  Date created		:	16-April-2018
 */
package com.training.April16testing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileManipulation
{
public void Readmyfile() throws IOException
{
FileReader fr = null;
try {
fr = new FileReader("./hello.txt");
} catch (FileNotFoundException e) {
 e.printStackTrace();
}    
 int i;    
while((i=fr.read())!=-1)    
System.out.print((char)i);    
fr.close();   
}
public void writemyfile() throws IOException
{
try{    
 FileWriter fw=new FileWriter("./hello.txt");    
 fw.write("Welcome to javaTpoint.");    
 fw.close();    
 }catch(Exception e){System.out.println(e);}    
 System.out.println("Success...");    
}
public static void main(String args[]) {    
FileManipulation m = new FileManipulation();
try {
m.Readmyfile();
m.writemyfile();
} catch (IOException e) {
e.printStackTrace();
}
}  
}
