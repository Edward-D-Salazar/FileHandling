package FileHandler;

import java.io.*;

public class WritingAndAppending {
	
	//Write over the file with the string that was passed
	public static void write(String s, File f) throws IOException {

		FileWriter fw = new FileWriter(f);
		fw.write(s);
		fw.close();
	}
	
	//Appends to the file, adds the string that was passed to the end of the file
	public static void append(String s, File f) throws IOException {

		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
	}
	
	
	
	

}
