import java.util.Scanner;
public class Exercicio3 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,v[],n=0,k;
		boolean primo=false;
		v=new int[] {2,3,15,12,77,87,90,20,66,24};
		for(k=0;k<10;k++) {
			n=0;
		for(i=1;i<=v[k];i++) {
			if (v[k] % i == 0) {
				n++;
			}
		}
			if(n==2) {
				primo=true;
				System.out.println(v[k]+" é primo");
			}
			else {
				System.out.println(v[k]+" não é primo");
				}
	}
}
}