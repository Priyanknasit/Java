import java.util.Scanner;
class Print{
	public static void main(String []args){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=s1.nextInt();
		int i;
		for(i=1;i<=n;i++)
			System.out.print(" "+i);
	}
}
