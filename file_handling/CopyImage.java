package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {
//		String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\image.png";
//		File file=new File(path);
//		file.createNewFile();
		
		String destination="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\image.png";
		File destFile=new File(destination);
		destFile.createNewFile();
		
		String sourcePath="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\images.png";
		File sourceFile = new File(sourcePath);
		
		FileInputStream fis=new FileInputStream(sourceFile);
		byte[] arr=new byte[(int)sourceFile.length()];
		fis.read(arr);
		
		FileOutputStream fos=new FileOutputStream(destFile);
		fos.write(arr);
		
		fos.close();
		fis.close();
		
		
	}

}
