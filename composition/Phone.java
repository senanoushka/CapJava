package composition;

public class Phone {
	String phoneName;
	Battery b;
	
	Phone(String phoneName, String batteryName){
		this.phoneName=phoneName;
		this.b=new Battery(batteryName);    //only new Battery(batteryName); also works
	}
	public void display() {
		System.out.println(this.phoneName+" "+b.batteryName);
	}
}
