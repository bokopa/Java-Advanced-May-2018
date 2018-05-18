import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String first = scanner.next("\\w+");
		String seccond = scanner.next("\\w+");
		double firstNum = Double.parseDouble(first);
		double secondNum = Double.parseDouble(seccond);
		double area = firstNum*secondNum;
		System.out.printf("%.2f", area);
	}

}
