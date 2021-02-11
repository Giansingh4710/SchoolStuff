package basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean j= 1>2;
		boolean q= 1==1;
		boolean w= (1!=1||1>2)&&1<2;
		boolean t= j&&q;
		System.out.println(w);
		System.out.println(t);
		System.out.println("hello");
		// to compare strings use ().equals(somthing);
		String a="Hello";
		boolean bb= a.equals("hello"); 
		System.out.println(bb);
		String str="hello";
		System.out.println(str.substring(0,1));
		

	}

}
