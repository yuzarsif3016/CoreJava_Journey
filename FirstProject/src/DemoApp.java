
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 44;
		System.out.println("a"); // a
		System.out.println(a); // 44
		
		byte b = 45;
		double d = b; // implicit type casting
		System.out.println(d);
		
		double demo = 45.4;
		
		int i = (int) demo; // expicit type casting -- > loss of data / precision
		
		System.out.println(i); //45

	}

}
