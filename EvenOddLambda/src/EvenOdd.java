import java.util.Scanner;
public class EvenOdd {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please Enter Number: ");
		int no = new Scanner(System.in).nextInt();
		LambdaExp le = new LambdaExp();
		le.getEvenNumbers(no);
		le.getOddNumbers(no);
	}
}
