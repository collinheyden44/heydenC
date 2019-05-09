package inheritance;

public class BallTest {

	public static void main(String[] args) {
		
		Basketball bob = new Basketball();
		
		System.out.println(bob.method1());
		System.out.println(bob.method2());
		System.out.println(bob.method3());
		System.out.println(bob.method4());
		

		Ball jeff = new Ball();
		
		System.out.println(jeff.method1());
		System.out.println(jeff.method2());
		System.out.println(jeff.method4());


	}

}
