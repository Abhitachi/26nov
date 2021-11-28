package geek_assignment_26;
import java.util.Scanner;
public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		int r=a.length;
		int c=a[0].length;
		int count=0;
		System.out.println("enter elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int size=r*c;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==0) {
					count++;
				}
			}
		}
		if(count>(size/2)) {
			System.out.println("matrix is sparse matrix");
		}
		else {
			System.out.println("matrix is not sparse matrix");
		}
	}

}
