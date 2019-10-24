import java.util.Scanner;
public class Exercicio6 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,v[],n=0,k;
		v=new int[] {1,2,4,3,7,3,4,2,1,8};
		for(k=0;k<10;k++) v[k]= (int) Math.pow(2,v[k]);
		for(i=1;i<10;i++) System.out.println("2 ^ "+i+" = "+ v[i]); 
}
}