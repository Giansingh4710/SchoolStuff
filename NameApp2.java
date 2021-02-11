package schoolStuff;
import java.util.*;
import java.util.Random;
public class NameApp2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		System.out.print("What is the first name?: ");
		String firstName=sc.next();
		System.out.print("What is the last name?: ");
		String lastname=sc.next();
		Random gen=new Random();
		int num=gen.nextInt(99)+1;
		String ans=lastname.substring(0,1)+firstName.substring(0,5)+num;
		System.out.println(ans);
		
		
	}

}

