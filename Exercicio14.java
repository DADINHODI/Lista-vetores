import java.util.Scanner;
public class Exercicio14 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[]= new int [] {0,12,23,13,87,34,3,6,7,0};
		int b[]= new int [] {18,54,23,76,12,23,25,67,12,6};
		int c[]= new int [10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			if (a[i]>b[i]) c[i]=1;
			if (a[i]==b[i]) c[i]=0;
			if (a[i]<b[i]) c[i]=-1;
		}for (i=0;i<10;i++) System.out.println(b[i]+"    ");
	}
}