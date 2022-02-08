package com.mypackage.file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileOperation{
	public void createNewFile(String filename) throws IOException{
		File file=new File(filename);
		if(file.createNewFile()){
			System.out.println("file created");
			}
		else{
			System.out.println("file Already Exist");
			}
	}
	public void writefile(String  filename, String content ) throws IOException{
		File file=new File(filename);
		FileWriter writer=new FileWriter(file);
	    writer.write(content);
		writer.close();
	}
	public void readFile(String filename){
		String file=filename;
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(file),StandardCharsets.UTF_8);
			Iterator<String> iterator=lines.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}
		catch (Exception e){
			e.printStackTrace();
			}
		}
	public void appendFile(String filename, String content) throws IOException{
		File f1=new File(filename);
		if(f1.exists()){
			Files.write(Paths.get(filename), Arrays.asList(content + "\n"),StandardCharsets.UTF_8,
			StandardOpenOption.APPEND);
			System.out.println("Data Append");
		}
		else{
			Files.write(Paths.get(filename), Arrays.asList(content), StandardCharsets.UTF_8,
			StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			System.out.println("Create New");
		}
	}
	        
}
	


