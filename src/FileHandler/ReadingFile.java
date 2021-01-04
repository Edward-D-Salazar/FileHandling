package FileHandler;

import java.io.*;
import java.util.*;

public class ReadingFile {
	
	private Scanner x;
	
	public void openFile() {
		try {
			x = new Scanner(new File("Text.txt"));
		}
		catch(Exception e){
			System.out.println("Could not find file");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			String a = x.nextLine();
			System.out.println(a);
		}
	}
	
	public void closeFile() {
		x.close();
	}

}
