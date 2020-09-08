import java.util.Scanner;

public class Myclass {
	public static void main(String[] args) {
		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		n=scan.nextInt();
		for(int i=0;i<n;i++)
		 {
			if(i==1) {
			System.out.println("My Name Is Naveen");	
			}
			else
				System.out.println("my Name is Cherry");
		}	
	}
}
