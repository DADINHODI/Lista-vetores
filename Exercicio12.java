import java.util.Scanner;
public class Exercicio12 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int c=0,i,j=0,x=0,y=9;
		int a[] = new int [] {0,1, 7,3,4,4,3,2,1,0};
		int b[] = new int [10];
		for (i=0;i<10;i++) {
			System.out.println(" Digite o "+(i+1)+ " ° valor");
			a[i]=ler.nextInt();
		}
		for (i=0;i<10; i++) {
			if (a[x]==a[y]) {
				b[i]=a[x];
				j++;
				System.out.print(b[i]+ "      ");
			}
			x++;
			y--;
		}if (j==0) System.out.println("Esse vetor não é palíndromo");
	}	
}
