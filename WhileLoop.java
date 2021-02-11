package basics;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"______" , "|   |" , "|   o" , "|  /|\\" , "|   |" , "|  / \\"};
        //for (String i:a){
        //    System.out.println(i);
        //}
		int x=0;
		while (true) {
			x++;
			System.out.println("not yet");
			break;
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("10");
		int num; //declare it before so we can use it as a condition in the while loop
		do {
			System.out.print("Guess Num: ");
			num= sc.nextInt();
		}while (num!=203);
		System.out.println("Good Guess");
    }
    
}

	
