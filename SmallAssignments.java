package smallAssignments;
import java.util.Scanner;
public class SmallAssignments {
	public static void main(String[]args) {
		for(int i=0;i<=200;i+=2) {
			System.out.println(i);
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of odd numbers to print: ");
		int n=scan.nextInt();
		System.out.print("Enter the starting number: ");
		int s=scan.nextInt();
		if(s%2==0) {
			s++;
		}
		for(int i=s;i<s+n*2;i+=2) {
			System.out.println(i);
		}
		
		isPrime(4);
		
		int pal=120;
		String palS=""+pal;
		boolean isPal=true;
		for(int i=0;i<palS.length()/2;i++) {
			if(palS.charAt(i)== palS.charAt(palS.length()-1-i) ) {
				continue;
			}
			else {
				isPal=false;
				System.out.println("Not a palindrome");
			}
		}
		if(isPal) {
			System.out.println("Number is a palindrome");
		}
		
		isArmstrong(153);
		
		String repChar="abahrtha";
	
		
	}
	public static void isArmstrong(int num) {
		int sum=0;
		int temp=num;
		while(temp>0) {
			int nextDig=temp%10;
			temp=temp/10;
			sum+=nextDig*nextDig*nextDig;
		}
		if(sum==num) {
			System.out.println(num +" is an Armstrong number");
		}
		else {
			System.out.println(num +" is not an Armstrong number");
		}
	}
	public static void isPrime(int num) {
		int breakpoint=num/2;
		if(num==0||num==1) {
			System.out.println("Number not Prime");
			return;
		}
		else {
			for(int i=2;i<=breakpoint;i++) {
				if(num%i==0) {
					System.out.println("Number not Prime");
					return;
				}
			}
		}
		System.out.println("Number is prime");
	}

}
