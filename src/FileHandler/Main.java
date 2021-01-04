package FileHandler;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		WritingAndAppending file = new WritingAndAppending();
		ReadingFile read = new ReadingFile();
		try {
			File f = new File("Text.txt");
			file.write("This is the string that has been written to the file\n", f);
			file.append("This is added to the end of the file\n", f);
			
		}
		catch(IOException e) {
			
		}
		
		read.openFile();
		read.readFile();
		read.closeFile();

	}

}
