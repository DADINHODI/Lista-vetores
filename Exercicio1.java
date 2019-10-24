import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,vb[], va[],d=0,z=10;
		va=new int [20];
		vb=new int[20];
		for(i=0;i<20;i++) {
			va[i] = i;
			
		}
		for(i=0;i<20;i++) {
			if(va[i] %2==0) {
				vb[d]=va[i];
				d++;
				System.out.println(va[i]+" é par");
			}else {
				vb[z]=va[i];
				z--;
				System.out.println(va[i]+" é impar");
			}
		
		}
		
		
}
}