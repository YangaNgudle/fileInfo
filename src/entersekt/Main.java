package entersekt;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome To The Directory Gossiper App");
	System.out.println("Enter a directory name and I'll tell you everything about it");
	String directory = scanner.next();
	while(directory.isEmpty()) {
		System.out.println("Error enter an actual file name like: C:\\");
		directory = scanner.next();
	}
   
	// list directory listing
	File f = new File(directory);
	if(!f.exists()) {
		System.out.println("The directory doesn't exist try something like C:\\");
	} else {
	ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
	System.out.println("Here's the gossip: \n");
	for(File file: files) {
		System.out.println(file.toString()
				+"\n - Size: "+file.length()+ " bytes"
				+"\n - Attributes:"
				+"\n\t - Path: "+file.getPath()
                +"\n\t - Is Hidden:"+file.isHidden()
                +"\n\t - File Name: "+file.getName());
	 }
    }
	scanner.close();
  }
}
