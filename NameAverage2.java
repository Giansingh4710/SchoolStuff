package schoolStuff;
import java.util.*;
public class NameAverage2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name: ");
		String fir=sc.nextLine();
		System.out.print("Enter another name: ");
		String sec=sc.nextLine();
		System.out.print("Enter a name for the last time: ");
		String thir=sc.nextLine();
		int sum=fir.length()+sec.length()+thir.length();
		double ave=(double)sum/3.0;
		System.out.println(ave);
		System.out.println(fir.substring(0,1)+sec.substring(0,1)+thir.substring(0,1));
		
	}

}
