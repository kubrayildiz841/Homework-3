public class App {


	public static void main(String[] args) {
		java.util.Scanner kb= new java.util.Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int a= Integer.parseInt(kb.nextLine());
		
		Util.signum(a);
		kb.close();
	}

}
class Util {
	public static void signum(int val)
	{
		if (val<0)
			System.out.println("Negatif");
		else if (val==0)
			System.out.println("0 (Sifir)");
		else
			System.out.println("Pozitif");
	}
}