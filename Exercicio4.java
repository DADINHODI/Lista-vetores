import java.util.Scanner;
public class Exercicio4 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,v[],n=0,k;
		v=new int[] {2,3,15,12,77,87,90,20,66,24};
		for(k=0;k<10;k++) {
			System.out.println("Todos os pares até"+v[k]);
		for(i=1;i<=v[k];i++) {
			if (i%2 == 0) System.out.println(i); 
				
		}
	}
}
}