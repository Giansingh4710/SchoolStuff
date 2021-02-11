package basics;
import java.util.Arrays;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[5];
		//You can have only 5 nums in the arr because you set that num. NO more but can do less.
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		char[] b= {'a','6','r','8'};
		String[] c= {"hel","der"};
		int[] h= {1,2,3,44};
		System.out.println(a[2]);
		System.out.println(b[2]);
		// Sorting and stuff
		int[] x= {99,43,54,74,42,2112,4,45,4,32-6,53-43,4};
		System.out.println(x[1]);
		Arrays.sort(x,1,7);//sort part of an array by putting 2 more arguments(start and end index)
		//to sort the whole array, just leave the 2 arguments
		System.out.println(x);//for arrays, it prints the memory address
		int count=0;
		for(int i:x) {
			count++;
			System.out.print(count+")"+i+" ");
			if (count==x.length) {
				System.out.println(" ");
				System.out.println("Done With arrays, Now messing with functions\n\n");
			}
		}
		test();//just called my first func in java
		
		
		
	}
	public static void test() {
		System.out.println("WWOWO. This is the first time i made a function");
	}

}
