
package basics;
import java.util.*;

public class Dogs {
	public static int breeds=0;
	public static int dogs=0;
	private String breed;
	private List dogsin;
	public Dogs(String breed) {//this is the init method
		this.breed=breed;
		this.dogsin=new ArrayList<>();
		Dogs.breeds+=1;
				
	}
	public void addDogs(String name) {
		this.dogsin.add(name);
		Dogs.dogs+=1;
	}
	public int dogsinBreed() {
		int num=this.dogsin.size();
		System.out.println(num);
		return num;
	}
	

}
