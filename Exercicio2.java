import java.util.Scanner;
public class Exercicio2 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,v[],r=0,d=0,e;
		v=new int[5];
		for(i=0;i<5;i++) v[i] =ler.nextInt();
		for(i=0;i<5;i++) {
			for(d=0;d<10;d++) {
				System.out.println(v[i]+ " * "+(d+1)+" = "+(v[i]*(d+1)));
			}
		}
		
		
		
}
}