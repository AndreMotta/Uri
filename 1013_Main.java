/*Faça um programa que leia três valores e apresente o 
 * maior dos três valores lidos seguido da mensagem “eh o maior”.
 *  Utilize a fórmula: MaiorAb=(a+b+abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros
(a e b). Um segundo passo, portanto é necessário para chegar
 no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e 
a mensagem "eh o maior".*/
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,b,c,m,m1;

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

m = (a + b + Math.abs(a - b)) / 2;
m1 = (c + m + Math.abs(c - m)) / 2;

System.out.println(m1 + " eh o maior");
sc.close();}}

