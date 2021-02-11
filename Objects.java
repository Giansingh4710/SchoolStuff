package basics;

public class Objects {

	public static void main(String[] args) {
		Dogs kute=new Dogs("kute");
		kute.addDogs("Gian");
		kute.addDogs("me");
		kute.addDogs("bob");
		Dogs kukar=new Dogs("kukar");
		kukar.addDogs("Daas");
		kukar.addDogs("nammDharis");
		System.out.println(kukar.dogsinBreed()==kute.dogsinBreed());
		System.out.println(Dogs.dogs);
		System.out.println(Dogs.breeds);
	
	}
}
