import java.util.Scanner;
public class Exercicio15 {
 	public static void main(String[] args) {
		  int A[]= new int[10]; 
		  int B[]= new int[10]; 
		  int C[]= new int[10]; 
		  int i=0, k=0, crescente,decrescente; 
		  Scanner in= new Scanner (System.in);
		  for (i=0;i<10;i++) {
			  System.out.println("Digite o "+(i+1)+"° valor:");
			  A[i]= in.nextInt();
		  }
		  for (i=0;i<10;i++) {
		     crescente=0;
		     for(k=0;k<10;k++) {
		       if (A[i]>A[k])
		    	   crescente++;
		     }
		     B[crescente]= A[i];
		  }
		  for (i=0;i<10;i++) {
		     decrescente=0;
		     for(k=0;k<10;k++) {
		       if (A[i]<A[k])
		    	   decrescente++;
		     }
		     C[decrescente]= A[i];
		  }
		  for (i=0;i<10;i++) System.out.print(B[i]+" " );
		  System.out.println("");
		   for (i=0;i<10;i++) System.out.print(C[i]+" " );
 	 }
}
