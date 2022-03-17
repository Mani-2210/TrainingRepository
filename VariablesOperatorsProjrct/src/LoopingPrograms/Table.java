package LoopingPrograms;

import java.util.Scanner;

public class Table {
	public void display() {
Scanner sc = new Scanner(System.in);
System.out.println("enter the value");
int i = sc.nextInt();
for(int j=1;j<=10;j++)
{
	int val =0;
	val+=i*j;
	System.out.println(i+"*"+j+"="+val);
}
}
}
