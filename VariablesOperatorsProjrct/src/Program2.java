import java.util.Scanner;

public class Program2 {
	public void convert()
	{
	float c,f;
	System.out.println("enter the celsius temp");
	Scanner sc = new Scanner(System.in);
	c =  sc.nextFloat();
	f =(c*9/5)+32;
	System.out.println("the farenhiet temp is "+f);
			
	}
public static void main(String[] args) {
	Program2 p = new Program2();
	p.convert();
}
}
