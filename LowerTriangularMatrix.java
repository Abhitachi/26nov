package geek_assignment_26;
import java.util.Scanner;
public class LowerTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] mat=new int[3][3];
		int r=mat.length;
		int c=mat[0].length;
		System.out.println("enter element");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		if(r!=c) {
			System.out.println("matrix should be square");
		}
		else {
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.println(mat[i][j]);
				}
				System.out.println();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j>i) {
					System.out.print("0 ");
				}
				else {
					System.out.print(mat[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
