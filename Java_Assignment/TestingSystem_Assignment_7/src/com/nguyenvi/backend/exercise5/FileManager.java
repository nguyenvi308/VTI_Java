package com.nguyenvi.backend.exercise5;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import java.util.Arrays;
import java.util.List;

public class FileManager {
	
	
	private static final String FILE_IS_EXISTS = "FILE IS EXISTS"; 
	private static final String FILE_IS_NOT_EXISTS = "FILE IS NOT EXISTS"; 
	private static final String FILE_WITH_SAME_NAME = "FILE WITH SAME NAME"; 
	
	// question 1 Check if files is exists 
	public boolean isExists(String path)
	{
		File file = new File(path); 
		if(file.exists())
		{
			return true; 
		}else
		{
			return false; 
		}
		
	}
	
	// question 2 Create new files 
	public void createNewFile(String filePath) throws IOException
	{
		File file = new File(filePath);
		
		if(file.exists() == false)
		{
			file.createNewFile(); 
		}else
		{
			throw new IOException(FILE_IS_EXISTS); 
		}
	}
	public void createNewFile(String path,String fileName) throws IOException
	{
		File file = new File(path , fileName);
		
		if(file.exists() == false)
		{
			file.createNewFile(); 
		}else
		{
			throw new IOException(FILE_IS_EXISTS); 
		}
	}
	// question 4 Delete the file 
	public void deleteFile(String filePath) throws IOException
	{
		File file = new File(filePath);
		
		if(file.exists() == true)
		{
			file.delete(); 
		}else
		{
			throw new IOException(FILE_IS_NOT_EXISTS); 
		}
	}
	// question 5 Is File or Folder 
	public void isFileOrFolder(String path)
	{
		File file = new File(path); 
		if(file.isFile())
		{
			System.out.println("This is file !");
		}else
		{
			System.out.println("This is folder !");
		}
	}
	// question 6 get all file in folder 
	public List<String> getAllFileOfFolder(String path)
	{
		File file = new File(path); 
		List<String> listFile = null;  
		if(!file.isFile())
		{
			String[] arr = file.list();
			listFile = Arrays.asList(arr); 
			
		}
		return listFile;
		
	}
	// question 7 copy file 
	public void copyFile(String source, String target) throws IOException
	{
		Path sourcePath = Paths.get(source); 
		Path targetPath = Paths.get(target);
		
		
		if(!Files.exists(sourcePath))
		{
			throw new IOException(FILE_IS_NOT_EXISTS);
				
		}
		if(!Files.exists(targetPath))
		{
			throw new IOException(FILE_WITH_SAME_NAME);
			
		}
		
		Files.copy(sourcePath, targetPath); 
		
	}
	// question 8 Move file 
	public void moveFile(String source , String target,  StandardCopyOption s) throws IOException
	{
		Path sourceFile = Paths.get(source); 
		Path destDirectory = Paths.get(target); 
		
		Files.move(sourceFile, destDirectory,s); 
	}
	
	// question 9 rename 
	public void renameFile(String source,String newName) throws IOException
	{
				Path sourcePath = Paths.get(source);  
			    Files.move(sourcePath, sourcePath.resolveSibling(newName));
	}
	// question 10 Create new folder 
	public void createFolder(String newPathFolder)
	{
		File file = new File(newPathFolder); 
		boolean b = file.mkdir(); 
		if(b)
		{
			 System.out.println("Directory created successfully");
		}else
		{
			System.out.println("Sorry couldn't create specified directory");
		}
		



		
	}
	
	
	
	
	

}
