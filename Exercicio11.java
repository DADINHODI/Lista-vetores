import java.util.Scanner;
public class Exercicio11 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,x,r=0,d=0,j;
		int a[] = new int [10];
		boolean er=false;
		for (i=0;i<10;i++) {
			a[i]=ler.nextInt() ;	
		}
			System.out.println("Digite o número para pesquisarmos no vetor");
			x =ler.nextInt();
			for (i=0;i<1;i++) {
				for (j=0;j<10;j++)
				if (a[j]  == x) {
					er=true;
			}
		}if (er==true) {
			System.out.println("O elemento "+x+" está amarzenado no vetor");
		}else {
			System.out.println("O elemento não foi encontrado");
		}
	}
}
