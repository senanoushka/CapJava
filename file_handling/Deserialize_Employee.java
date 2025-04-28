package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize_Employee {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\serialize.txt";
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee employee=(Employee)ois.readObject();
		System.out.println(employee);
	}

}
