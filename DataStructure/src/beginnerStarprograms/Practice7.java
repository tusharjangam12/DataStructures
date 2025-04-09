package beginnerStarprograms;

public class Practice7 {
	void pyramid1 () {
		for(int i =0; i<=4 ;i++) {
			for (int j=4; j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=0;k<(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Practice7 y = new Practice7();
		y.pyramid1();
		for (  int i=0; i<=4; i++) {
			for (int j =4 ; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k =0; k<=i;k++) {
				System.out.print("*");
			}
			for (int m=1; m<=i ; m++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
