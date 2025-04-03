package exception_handling;

public class Child extends Parent {
	//void demo() throws Exception - throws error beacause Exception is Parent exception of runtime exception
	//void demo() throws ArithmeticException - no error as AritghmeticExcep is child exception of runtime exception
	//void demo() throws RuntimeException - no error as same exception also allo0wed
	void demo() {     // - no error as exception not necessary tio give
		
		
	}
}
