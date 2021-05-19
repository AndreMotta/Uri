/*Leia um valor inteiro, que é o tempo de duração em 
segundos de um determinado evento em uma fábrica, 
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos),
convertido para horas:minutos:segundos, conforme 
exemplo fornecido.*/

import java.util.Scanner;
public class Main {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

 int N=sc.nextInt();
 
 int h=N/3600;
 N=N%3600;// o que sobrar irá servir como minutos
 
 int m=N/60;
 N=N%60;// o que sobrar serve como segundos
 
 int s=N%60;
 
 System.out.printf(h + ":");
 System.out.printf(m + ":"); 
 System.out.println(s);
	
sc.close();
}}