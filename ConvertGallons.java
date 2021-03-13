package convertGallonsToLitter;
import java.util.Scanner;

public class ConvertGallons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Gallons;
		double convert;
		
		System.out.print("Masukkan Gallon yang ingin di konversi : ");
		Gallons = scan.nextInt();
		convert = Gallons*3.785;
		System.out.print("Hasil konversi : " + convert + " Liter" );
		
		
	}

}
