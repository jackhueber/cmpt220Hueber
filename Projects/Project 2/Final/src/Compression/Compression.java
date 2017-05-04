package Compression;

import java.util.Scanner;
import java.io.*;
import java.util.zip.*;

//This class requires that the user has two new folders on their desktop named Compressed and Decompress
public class Compression {
	
	public static void compress(File source, File destination) throws IOException{
		//Buffer is set at a kilobyte
		byte[] buff = new byte[1024];
		FileInputStream fileIn = new FileInputStream(source);
		FileOutputStream fileOut = new FileOutputStream(destination);
		GZIPOutputStream gzipOut = new GZIPOutputStream(fileOut);
		int read;
		
		while((read = fileIn.read(buff)) != -1){
			gzipOut.write(buff, 0, read);
		}
		gzipOut.finish();
		gzipOut.close();
		fileIn.close();
		fileOut.close();
	}
	
	//The main method is where the inputs for files and destinations are stated
	public static void main(String[] args) {
		//input is the pathway of the file that you would like too compress
		Scanner input = new Scanner(System.in);
		//input2 is the name of the new file of the compressed version of the file in input
		Scanner input2 = new Scanner(System.in);
		//input3 is the name of the user, this is implemented in the pathway for where the compressed file is stored
		Scanner input3 = new Scanner(System.in);
		
		//Asks for the destination of the file you would like to compress
		System.out.println("Please enter the source of the file using double slashes: ");
		File source = new File(input.nextLine());
		//Asks for the name of the user and the name of the compressed file
		System.out.println("Please enter the name of the user and the name of the compressed file: ");
		File destination = new File("C:\\Users\\" + input3.nextLine() + "\\Desktop\\Compressed\\" + input2.nextLine());
		
		//This try, catch block will see if the file source and the file destination are correct
		try {
			compress(source, destination);
		} catch(IOException ex) {
			System.out.println(ex);
		}
		
		//This try, catch statement will delete the source file
		try{
		    if(source.delete()){
		    	System.out.println(source.getName() + " is now compressed and deleted.");
		    }else{
		    	System.out.println("The file could not be deleted.");
		    }
		    }catch(Exception ex2){
		    ex2.printStackTrace();
		   }
	}
}