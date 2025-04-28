package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize_Employee {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\User\\Desktop\\Test\\Test1\\Test2\\file1.txt\\serialize.txt";
		File file=new File(path);
		
		file.createNewFile();
		
		Employee employee = new Employee(123, "Anoushka", 22);
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		
		oos.writeObject(employee);
		oos.flush();
		
		oos.close();
		fos.close();

	}

}
