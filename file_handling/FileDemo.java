package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException{
		//String path="C:\\Users\\User\\Desktop\\Test\\Demo";
		//String repath="C:\\Users\\User\\Desktop\\Test\\DarkKnight";
		String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\msg.txt";
		//String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file2.txt";
		File file=new File(path);
		File refile=new File(path);
		
		//file.mkdir();      //make directory
		//file.mkdirs();       //make directories
//		System.out.println(file.renameTo(refile));    //rename Demo to DarkKnight
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getParentFile());
//		System.out.println(file.getName());
//		refile.delete();
	
		file.createNewFile();     //throws exception because darkknifght deleted
		
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
		
		FileInputStream fis=new FileInputStream(file);
		
		int x;
		while ((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
		
	}
}
