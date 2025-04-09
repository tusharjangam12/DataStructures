package beginnerStarprograms;

public class Practice1 {
	
	void ReversePiramid () {
		for (int i =0; i<=5 ;i++) {
			for (int j=5; j>= i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Practice1 p = new Practice1 ();
		p.ReversePiramid();

	}

}
