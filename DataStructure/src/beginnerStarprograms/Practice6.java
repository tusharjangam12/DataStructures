package beginnerStarprograms;

public class Practice6 {
	
	void pyramid () {
		for(int i=0; i<=4;i++) {
			for (int j=4 ; j>= 1 ; j--) {
				if (j>i) {
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			} System.out.println();
			
		}
	}

	public static void main(String[] args) {
		Practice6 h = new Practice6 ();
		h.pyramid();
		
		for (int i =0; i<=4 ; i++) {
			
			for (int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k =0 ; k<=i; k++) {
				System.out.print(" *");
			}
			System.out.println();
				
		}

	}

}
