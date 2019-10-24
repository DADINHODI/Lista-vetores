import java.util.Scanner;
public class Exercicio10 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int [] {0,1,2,3,4,5,6,7,8,9};
		int b[] = new int [] {100,-1,-2,-3,-4,-5,6,7,8,9};
		int c[] = new int [10];
		int j, i, d;
		for (i=0;i<10;i++) {
			d=0;
			for (j=0;j<10;j++) {
				if (a[i]!=b[j]) d++;
				if (d==10) c[i]=a[i];
			}
		}
		for (i=0;i<10;i++) {
			d=0;
			for (j=0;j<10;j++) {
				if (b[i]!=a[j]) ;
				if (d==10) c[i]=b[i];
			}
		}
		for (j=0;j<10;j++) System.out.print (c[j]+"   ");
		System.out.println("");
	}
}
