package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
 public static void main(String[] args) throws IOException {
	String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\msg.txt";
	
	File file=new File(path);
	//FileOutputStream fos=new FileOutputStream(file, true);    //FileWriter also works
	FileWriter fw=new FileWriter(file, true);
	String message="Bybyeeeeeeee";
	//byte[] arr=message.getBytes();
	//fos.write(arr);
	for (int i=0; i<message.length(); i++) {
		fw.write(message);
	}
	fw.close();
	//FileOutputStream takes bytes
	//FileWriter takes character
	//FileOutputStream mein fs.close() not compulsory, good to do
	//FileWriter mein fw.close() MANDATORY, until you close message wont be printed
}
}
