package XorPgms;

public class SwapNum{
	public static void main(String[] args) {
		int a = 35;
		int b = 40;
		System.out.println("=====Before Swapping Numbers are :===== ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("=====After Swapping Numbers are :===== ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
