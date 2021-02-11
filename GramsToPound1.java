package schoolStuff;
import java.util.Scanner;
public class GramsToPound1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter grams: ");
		float grams=sc.nextInt();
		float pounds=grams/(float)453.592;
		System.out.println(pounds);
		

	}

}
