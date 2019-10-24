import java.util.Scanner;
public class Exercicio8 {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i,v[],vb[],r=0,d=0,e;
		v=new int[10];
		vb=new int[10];
		for(i=0;i<10;i++) {
			System.out.println("digite o "+(i+1)+"° valor:");
			v[i] =ler.nextInt();
		}
		for(i=0;i<10;i++) {
			for(d=9;d>=i;d--) {
				e=0;
				r=e;
				while(e<=v[i]) {
					r+=e;
					e++;
				}
				vb[i]=r;
			}
		}
		for (i=0;i<10;i++) System.out.println(v[i]+" ");
		for (i=0;i<10;i++) System.out.println(vb[i]+" ");









}
}