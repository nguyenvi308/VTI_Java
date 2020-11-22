package com.nguyenvi.frontend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Scanner;

import com.nguyenvi.backend.exercise5.FileManager;

public class Exercise3_File {

	private static final Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) throws IOException {
		FileManager fm = new FileManager();
//		System.out.println("Enter Full Name of File : " );
//		String path = scanner.nextLine(); 
//		if(fm.isExists(path)) {
//			System.out.println("File is exists");
//		}else
//		{
//			System.out.println("File is not exists");
//		}
//		try {
//			fm.createNewFile(path);	
//		}catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//		
//		if(fm.isExists(path)) {
//			System.out.println("File is exists");
//		}else
//		{
//			System.out.println("File is not exists");
//		}
		
//		try {
//			fm.deleteFile("C:\\Users\\nguye\\Desktop\\test.txt");
//		}catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//		
//		fm.isFileOrFolder("C:\\Users\\nguye\\Desktop");
//		
//		List<String> list = fm.getAllFileOfFolder("C:\\Users\\nguye\\Desktop"); 
//		list.forEach(System.out::println);
//		
//		
//		fm.createNewFile("C:\\Users\\nguye\\Desktop\test.txt");
//		fm.createNewFile("C:\\Users\\nguye\\Desktop\test1.txt");
		
		// question 7 copy file 
		
		// fm.copyFile("C:\\Users\\nguye\\Desktop\\test1.txt", "C:\\Users\\nguye\\Desktop\\text2.txt");
		
		// question 8 Move file 
		// Access Denied 
//		fm.moveFile("C:\\test1\\ab.txt", "C:\\test",  StandardCopyOption.REPLACE_EXISTING);
		
//		fm.moveFile("C:\\test1\\ab.txt", "C:\\test",  StandardCopyOption.ATOMIC_MOVE);
		
		// question 9 rename file 
//		fm.renameFile("C:\\Users\\nguye\\Desktop\\test4.txt" , "Test5.txt");
		
		// question 10 Create folder 
		// fm.createFolder("C:\\Users\\nguye\\Desktop\\Test2");


		Path file = Paths.get("C:\\Users\\nguye\\Desktop\\test4.txt");
		BasicFileAttributes attr =
				Files.readAttributes(file, PosixFileAttributes.class);
		System.out.println(attr.creationTime());
	


		
		
	}
}
