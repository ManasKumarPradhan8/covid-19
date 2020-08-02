package FileProgram;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args)  {
		try{
		File file=new File("E:\\Newfile.txt");
		if(file.createNewFile()){
			System.out.println("FILE CREATED SUCCESSFULLY");
			}

		else{
			System.out.println("FILE NOT CREATED SUCCESSFULLY");
		}}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
			
		}
		


