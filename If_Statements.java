package basics;

import java.util.Scanner;

public class If_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Guess?");
				Scanner askname=new Scanner(System.in);
				String name=askname.nextLine();
				if (name.equals("gian")||(name.equals("Gian"))) {
					System.out.println("Good Guess.");
				}
				else if (name.equals("Vaheguru")) {
					System.out.println("Vaheguru");
				}
				else {
					System.out.println("Nope");
				}
				System.out.print("What is your age: ");
				Scanner askage=new Scanner(System.in);
				String strage=askage.nextLine();
				int age=Integer.parseInt(strage);
				if(age<=12) {
					System.out.println("Your Less than 12");
					System.out.print("What year were you born: ");
					String year= askage.next();
					int intyear=Integer.parseInt(year);
					if (intyear<2008) {
						System.out.println("Your Older than 12.\nYOU LIED!!!");
						
					}
					else {
						System.out.println("NICEE!!!");
					}
				}
				else if(age>12 && age<=19) {
					System.out.println("You a teenager");
				}
				else {
					System.out.println("YOu Old".substring(6,7));
				}		
	}

}
