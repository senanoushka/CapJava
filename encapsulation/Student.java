package encapsulation;

import java.util.Scanner;

public class Student {
	private String email="senanoushka08@gmail.com";
	private int pwd=1234;
	private String name="Anoushka";
	private int age=22;
	private char gender='F';
	
	public void getDetails(int pwd) {
		if (this.pwd==pwd) {
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
		}
	}
	public void setAge(int pwd, int age) {
		if (this.pwd==pwd) {
			this.age=age;
		}
		else System.out.println("Wrong cred");
	}
	public void setGender(int pwd, char gender) {
		if (this.pwd==pwd) {
			this.gender=gender;
		}
		else System.out.println("Wrong cred");
	}
	public void setPassword(int pwd) {
		if (this.pwd==pwd) {
			Scanner sc=new Scanner(System.in);
			int newpwd=sc.nextInt();
			System.out.println("Confirm new pwd:");
			int confirmPwd=sc.nextInt();
			if (newpwd==confirmPwd) {
				this.pwd=confirmPwd;
				System.out.println("Updated");
			}
			else System.out.println("Wrong match");
		}
		else System.out.println("Wrong cred");
	}
	
}
	
