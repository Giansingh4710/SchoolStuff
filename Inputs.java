package basics;
import java.util.Scanner;
public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("What is your name?");
		//String x=in.next();
		boolean b=((1>2)||(2<3))&&1>0;
		System.out.println("hello ");//+x);
		System.out.println(b+"\n\n");
		int q=902;
		int w=75;
		int qr=q%w;
		double d=q/w;
		double n=(double)q/w;
		double pow=Math.pow(2,4);
		System.out.println(d);
		System.out.println(n);
		System.out.println(pow);
		System.out.println(qr);
		System.out.println("NEW STUFF");
		System.out.println("__________");
		System.out.println("          |");
		System.out.println("          |");
		System.out.println("          |");
		System.out.println("__________");
		Scanner ask=new Scanner(System.in);
		System.out.println("Whats Your Name?");
		String name=ask.next();
		System.out.println("Hello "+name+'!');
		System.out.println("How Old ARE U?");
		Scanner askage=new Scanner(System.in);
		String age=askage.next();
		int intage=Integer.parseInt(age);
		System.out.println("Where do you live?");
		Scanner asklive=new Scanner(System.in);
		String live=asklive.next();
		System.out.println("So you are "+intage+" years old and live in "+live);
		Scanner yn=new Scanner(System.in);
		boolean ans=yn.nextBoolean();
		System.out.println(ans);
	}

}
