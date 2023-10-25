
public class FibonacciSeries {

	public static void main(String[] args) {
		int i=0;
		int j=1;
        int l=0;
		System.out.print(i+" "+j);
		for(int k=2;k<10;k++) {
		  l=i+j;
		  i=j;
		  j=l;
		  System.out.print(" "+l);
		}
	}
}
