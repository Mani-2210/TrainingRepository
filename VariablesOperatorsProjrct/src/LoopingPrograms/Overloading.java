package LoopingPrograms;

public class Overloading {
public int addition(int a,int b)
{
	return a+b;
}
public void addition(int a,int b,int c)
{
	System.out.println(a+b+c);
}
public float addition(int a,float b)
{
	return a+b;
}
public static void main(String[] args) {
	Overloading o = new Overloading();
	int b=o.addition(12,45);
	o.addition(3,5,1);
	float a =o.addition(67,4.6f);
	System.out.println(b);
	System.out.println(a);
}
}
