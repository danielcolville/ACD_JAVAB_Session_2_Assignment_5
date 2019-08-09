package smallAssignments;
import java.util.Scanner;
public class SmallAssignments {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		printEvens();//Q3
		printOddsUser(scan);//Q4
			
		isPrime(4);//Q5
			
		palInt(121);//Q6
		
		isArmstrong(153);//Q7
		
		String dups="abbacdef";//Q8
		System.out.println("Original String: "+dups);
		System.out.println("With duplicate characters removed: "+rmDupChar(dups));
		
		
		//Q9
		System.out.print("Enter number of characters: ");
		int numC=scan.nextInt();
		String str="";
		System.out.print("Enter a character");
		str+=scan.next().charAt(0);
		
		while(str.length()<numC) {
			System.out.print("Enter another character");
			char next=scan.next().charAt(0);
			boolean add=true;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==next) {
					add=false;
				}
			}
			if(add) {
				str+=next;
			}
		}
		
		printComb(str,str.length());
	}
		
		public static void printEvens() {
			for(int i=0;i<=200;i+=2) {
				System.out.println(i);
			}
		}
		public static void printOddsUser(Scanner scan) {
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
		}
		public static void palInt(int pal) {
			String palS=""+pal;
			boolean isPal=true;
			for(int i=0;i<palS.length()/2;i++) {
				if(palS.charAt(i)== palS.charAt(palS.length()-1-i) ) {
					continue;
				}
				else {
					isPal=false;
					System.out.println(pal+" is a palindrome");
				}
			}
			if(isPal) {
				System.out.println(pal+" is a palindrome");
			}
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
				System.out.println(num+" is not Prime");
				return;
			}
			else {
				for(int i=2;i<=breakpoint;i++) {
					if(num%i==0) {
						System.out.println(num+" is not Prime");
						return;
					}
				}
			}
			System.out.println(num+" is prime");
		}

		public static String rmDupChar(String str) {
			String a="";
			char[] added=new char[26];
			a+=str.charAt(0);
			for(int i=1;i<str.length();i++) {
				boolean add=true;
				for(int j=0;j<a.length();j++) {
					if(a.charAt(j)==str.charAt(i)) {
						add=false;
						break;
					}
				}
				if(add) {
					a+=str.charAt(i);
				}
			}
			return a;
		}
		public static void printComb(String opt,int len) {
			
			String data="";
			
			helpComb(opt,data,0,len-1,0,len);
		}
		public static void helpComb(String opt, String curr,int start, int end,int ind, int len) {
			if(curr.length()==opt.length()) {
				for(int i=0;i<curr.length();i++) {
					System.out.print(curr.charAt(i));
				}
				System.out.println();
				return;
			}
			for(int i=start;i<=end && end-i+1>= len-ind;i++) {
				//System.out.println(curr+" "+ opt);
				curr+=opt.charAt(i);
				helpComb(opt,curr,i+1,end,ind+1,len);
			}
		}

	}

