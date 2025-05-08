package com.sdmcet.cse.oop.streams;
import java.io.*;
public class FileInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 FileInputStream fin=null;
 FileOutputStream fout=null;
   
 try {
	fin= new FileInputStream(args[0]);
	fout=new FileOutputStream(args[1]);
} catch (FileNotFoundException e) {

	e.printStackTrace();
	return;
}catch(ArrayIndexOutOfBoundsException ie) {
	System.out.println("usage :filename1 filename2");
	ie.printStackTrace();
	System.exit(1);
}
 int ch=0;
 do {
	 try {
		 ch =fin.read();
		 fout.write(ch);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	 System.out.print((char)ch);
 }while(ch !=-1);
 try {
	fin.close();
	fout.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
