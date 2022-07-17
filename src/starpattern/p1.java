package starpattern;

public class p1 {
	public static void main(String[] args) {
		int space=5;
		int star=1;


		for(int i=1;i<=6;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			star++;
			space--;
		}

		int space1=0;
		int star1=5;


		for(int i=1;i<=6;i++) {
			for(int j=1;j<=space1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			star--;
			space++;
		}

		
		
		
		
		
		
		
		
		
		
	}

}
