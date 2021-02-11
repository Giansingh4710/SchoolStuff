package basics;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<=10;i++) {
			System.out.print("Vaheguru");
		}
		for (int a=0;a<20;a+=1) {
			if(a%2==0) {
				System.out.println(a);
				System.out.print(' ');
			}
		}
		int[] a= {1,5,7,3,4,6};
		for (int i=0; i<a.length ;i+=1) {
			if (i==(a.length-1)) {
				System.out.println(a[i]);
			}
			else {
			System.out.print(a[i]);
			}
		}
		System.out.println("The array is "+a.length);
		System.out.println(2+2+"h"+(a.length+4)+'4');
		
		int[] s= {1,2,3,4,5,4,3,2,123,3};
		int aa=0;
		for (int i:s) {
			if (i==s[aa]) {
				System.out.println(aa+":"+i);
				
			}
			aa++;
			
		}
		System.out.println(s.length);
	
	}

}
