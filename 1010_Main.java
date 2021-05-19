/*

Neste problema, deve-se ler o código de uma peça 1, o
 número de peças 1, o valor unitário de cada peça 1,
  o código de uma peça 2, o número de peças 2 e o valor 
  unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. 
Em cada linha haverá 3 valores, respectivamente dois inteiros e
 um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 lembrando de deixar um espaço após os dois pontos e um espaço após 
 o "R$".
 O valor deverá ser apresentado com 2 casas após o ponto.
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
	Scanner sc=new Scanner(System.in);
	int c1, n1,c2,n2;
	double v1,v2,vp;
	
	c1=sc.nextInt();
	n1=sc.nextInt();
	v1=sc.nextDouble();

	c2=sc.nextInt();
	n2=sc.nextInt();
	v2=sc.nextDouble();
	
	vp=(n1*v1) + (n2*v2);
	
	System.out.printf("Valor a pagar: R$ %.2f%n", vp);
	
	sc.close();}}
