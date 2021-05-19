import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
		double R, A, pi=3.14159;
		R= sc.nextDouble();
		A= pi * R * R;
		
		System.out.printf("A=%.4f%n", A);
		sc.close();
	}

}
