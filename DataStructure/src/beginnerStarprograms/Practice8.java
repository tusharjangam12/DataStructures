package beginnerStarprograms;

public class Practice8 {

	public static void main(String[] args) {
		for (int i=0; i<=4; i++) {
			for (int j =0; j<=i; j++) {
				System.out.print(" ");
			}
			for (int k=4; k>=i; k--) {
				System.out.print("*");
			}
			for (int a =4; a>=i; a--) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		for (int q =0; q<=4; q++) {
			for (int w=0; w<= q; w++) {
				if (q>=1 && w<= q-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
