
public class Swap {

	public static void main(String[] args) {

		double num1=7.5, num2 = 6.5, dummy;
		/*
		 * dummy= num2; num2=num1; num1=dummy;
		 */
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("num1 is "+ num1 +"; num2 is "+num2);
	}

}
