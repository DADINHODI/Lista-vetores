import java.util.Scanner;
public class Exercicio13 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[]= new int [] {0,4,3,2,1,7,9,6,5,8};
		int b[]= new int [10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			if (a[i]%2==0) b[i]=1;
			else b[i]=0;
		}for (i=0;i<10;i++) System.out.println(b[i]+"    ");
	}
}