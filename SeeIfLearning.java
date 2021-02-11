package basics;
import java.util.Scanner;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SeeIfLearning {

	public static void main(String[] args) {
		System.out.print("Enter a word: ");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println(word.length());
		Map m=new HashMap();
		for (char i:word.toCharArray()) {
			if (m.containsKey(i)==false) {
				m.put(i,1);
			}
			else {
				int n=(int)m.get(i);
				n++;
				m.put(i, n);
				
			}
		}
		m.remove(' ');
		System.out.println(m);
		System.out.println(word.contains("i"));
	}

}
