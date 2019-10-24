import java.util.Scanner;
public class Exercicio7 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,v[],n=0,k,z,r=n;
		v=new int[15];
		long [] b=new long[15];
		for(k=0;k<15;k++) v[k]= k;
		for(i=1;i<15;i++) {
			n = v[i];
			r = n;
			n = 1;
			while(r > 1) {
				n= n* r;
				r--;
			}
			b[i] = n;
		}
		for (i=0;i<15;i++) System.out.println((i)+"! = "+ b[i]);
}
}