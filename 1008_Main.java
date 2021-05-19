import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int A,B;
	double C, Salario;
	A= sc.nextInt();
	B= sc.nextInt();
	C= sc.nextDouble();
	Salario= B*C; 
	
	System.out.println("NUMBER = " + A);
	System.out.printf("SALARY = U$ %.2f" , Salario);
	
	sc.close();
}}
