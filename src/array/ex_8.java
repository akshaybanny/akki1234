package array;



public class ex_8 {
	public static void main(String[] args) {
		
     int [][]ar =new int [2][3];
       ar[0][0]=10;
       ar[0][1]=20;
       ar[0][2]=30;
       ar[1][0]=40;
       ar[1][1]=50;
       ar[1][2]=60;
		
		System.out.println(ar[1][1]);
		System.out.println(ar.length);
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}









	}

}
