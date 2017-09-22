package javapreviousversion.com.lambda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
//        System.out.print("Hello World");
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
//		greeter.greet();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);

		Greeting myLambdaFunction = () -> System.out.println("Hello World");

//		MyAdd addFunction = (int a, int b) -> a+b;
	}
}

/*interface MyLambda {
	void foo();
}*/

/*interface MyAdd{
	int add(int a, int b);
}*/
