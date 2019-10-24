import java.util.Scanner;
import java.util.Random;
	public class Exercicio9 {
		public static void main(String[] args) {
			int A[]= new int[10];
			int B[]= new int[10];
			int i=0,j=0; 
			int[] C= new int[20];
			Random rand= new Random();
			for (i=0;i<A. length;i++) A[i]=rand.nextInt(16);
			for (i=0;i<6;i++) B[i]=rand.nextInt(16);
			for (i=0;i<A[i];i++) {
				for (j=0;j<6;j++) {
					if (B[i]==A[j]) C[i]=(B[i]);
				}	
			}
			System.out.print("C: ");
			for (i=0;i<C.length;i++) {
				System.out.print(C[i]+" ");
				} 
			System.out.println("");
			System.out.print("A: "); 
			for (i=0;i<A.length;i++) {
				System.out.print(A[i]+"   ");
			}
			System.out.println("");
			System.out.print("B: ");
			for (i=0;i<6;i++) { System.out.print(B[i]+"     ");
			}
		}
	}