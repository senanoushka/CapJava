package exception_handling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		try {
			div(10,2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //checked exception

	}
	public static void div(int x, int y) throws RuntimeException, ClassNotFoundException, Exception{
		System.out.println(x/y);   //unchecked exception
		Class.forName("Demo");

	}

}
