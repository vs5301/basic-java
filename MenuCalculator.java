import java.util.Scanner;

public class MenuCalculator {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			while (true) {

				System.out.println("Enter the operation");
				System.out.println("For addition + ");
				System.out.println("For subtraction - ");
				System.out.println("For multiplication * ");
				System.out.println("For division / ");
				System.out.println("For inverse-additive a ");
				System.out.println("For inverse-multiplicative m ");
				System.out.println("Any other key for exit : ");
				
				char op = sc.next().charAt(0);
				
				if (op == '+' || op == '-' || op == '*' || op == '/' || op == 'a' || op == 'm') {
					System.out.println("Enter the first number : ");
					double firstNumber = sc.nextDouble();
					System.out.println("Enter the second number : ");
					double secondNumber = sc.nextDouble();
					if (op == '+') {
						System.out.println("The summation of " + firstNumber + " and " + secondNumber + " = "
								+ (firstNumber + secondNumber));
					} else if (op == '-') {
						System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + " = "
								+ (firstNumber - secondNumber));
					} else if (op == '*') {
						System.out.println("The multiplication of " + firstNumber + " and " + secondNumber + " = "
								+ (firstNumber * secondNumber));
					} else if (op == '/') {
						System.out.println("The division of " + firstNumber + " and " + secondNumber + " = "
								+ (firstNumber / secondNumber));
					} else if (op == 'a') {
						System.out.println("The additive inverse of "+ firstNumber + "is" + (firstNumber*(-1)) 
								+ "and" + secondNumber + "is" + (secondNumber*(-1)));
					} else if (op == 'm') {
						System.out.println("The multiplicative inverse of "+ firstNumber + "is" + ((1/firstNumber)) 
								+ "and" + secondNumber + "is" + (1/secondNumber));
					} else {
						System.out.println("Please enter valid operator");
					}
				
				} else {
					System.out.println("Successful exit");
					break;
				}
			}
		}
	}
}