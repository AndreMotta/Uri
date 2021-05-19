import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double x1,x2,y1,y2,p1,p2,distancia;
	x1=sc.nextDouble();
	y1=sc.nextDouble();
	x2=sc.nextDouble();
	y2=sc.nextDouble();

	p1=(x2-x1);
	p2= (y2-y1);
	
	distancia= Math.sqrt((p1*p1) + (p2*p2));
	
	System.out.printf("%.4f%n", distancia);
	
	sc.close();}}

