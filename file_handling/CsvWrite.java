package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWrite {
	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\studentData.txt";
		File file=new File(path);
		file.createNewFile();   
		
		try(FileWriter writer= new FileWriter(file)){
			writer.append("id,name,age\n");
			writer.append("1,Anoushka,22\n");
			writer.append("2,Raj,25\n");
			writer.append("3,Aarav,20\n");
			
			System.out.println("CSV written success");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
