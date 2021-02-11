package basics;

public class FibRecur {

	public static void main(String[] args) {
		for(int i=0;i<45;i++) {
			System.out.println(i+": "+fib(i));}
		System.out.println("done!");

	}
	public static int fib(int n) {
		if ((n==1)||(n==0)||(n==2)) {
			return 1;
		}return fib(n-1)+fib(n-2); 
	}

}
