import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int km= 1;
	int tempo=2;
	int kmP=sc.nextInt();
	int distancia= kmP*(km*tempo);
	
	System.out.println(distancia +  " minutos");
	
	
	sc.close();
	}}