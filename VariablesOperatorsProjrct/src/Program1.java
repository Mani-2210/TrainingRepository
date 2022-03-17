import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	int a,b,c;
	System.out.println("enter the values");
	Scanner sc = new Scanner(System.in);

	a = sc.nextInt();
	b= sc.nextInt();
	c = a+b;
	System.out.println("the sum of given values is "+c);
}
}
