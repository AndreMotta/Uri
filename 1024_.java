import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
	int N= sc.nextInt();
	for (int i= 0;i<N;i++) {
		StringBuilder M= new StringBuilder (redLine(sc));
		
		for(int j=0;j<M.length();j++) {
			int cod=M.charAt(j);
			if((cod>=65 && cod <=90)||(cod>=97 && cod<=122)) {
				char c=(char)(cod+3);
				M.setCharAt(j, c);}}
		M.reverse();
		for(int j=M.length()/2;j<M.length();j++) {
			char c=(char)(M.charAt(j)-1);
			M.setCharAt(j, c);
		}
		System.out.println(M.toString());
	}
	
sc.close();
}

private static String redLine(Scanner sc) {
	String line= sc.nextLine();
	while (line.isEmpty())
		line= sc.nextLine();
	return line;
}}
