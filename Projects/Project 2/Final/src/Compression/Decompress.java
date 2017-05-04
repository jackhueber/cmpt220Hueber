package Compression;

import java.util.Scanner;
import java.io.*;
import java.util.zip.*;

//This class requires that the user has two new folders on their desktop named Compressed and Decompress
public class Decompress {
	
	public static void decompress(File source, File destination) throws IOException{
		//Buffer is set at a kilobyte
		byte[] buff = new byte[1024];
		FileInputStream fileIn = new FileInputStream(source);
		FileOutputStream fileOut = new FileOutputStream(destination);
		GZIPInputStream gzipIn = new GZIPInputStream(fileIn);
		int read;
		
		while((read = gzipIn.read(buff)) != -1){
			fileOut.write(buff, 0, read);
		}
		gzipIn.close();
		fileIn.close();
		fileOut.close();
	}
	
	public static void main(String[] args) {
		//input is the pathway of the file you would like to decompress
		Scanner input = new Scanner(System.in);
		//input2 is the name of the newly decompressed file
		Scanner input2 = new Scanner(System.in);
		//input3 is the name of the user, this is implemented in the pathway for where the decompressed file is stored
		Scanner input3 = new Scanner(System.in);
				
		//Asks for the name of the user and the name of the compressed file
		System.out.println("Please enter the pathway of the file you would like to decompress using double slashes: ");
		File source = new File(input.nextLine());	
		//Asks for the destination of the file you would like to compress
		System.out.println("Please enter the user name and the name of the newly decompressed file: ");
		File destination = new File("C:\\Users\\" + input3.nextLine() + "\\Desktop\\decompress\\" + input2.nextLine());
		
		//This try, catch block will see if the file source and the file destination are correct
		try {
			decompress(source, destination);
		} catch(IOException ex) {
			System.out.println(ex);
		}
		
		//This try, catch statement will delete the source file
		try{
    		if(source.delete()){
    			System.out.println(source.getName() + " is now decompressed and deleted.");
    		}else{
    			System.out.println("The file could not be deleted.");
    		}
    		}catch(Exception ex2){
    		ex2.printStackTrace();
    	}
	}
}