package smallAssignments;
import java.util.Scanner;
public class SmallAssignments {
		public static void main(String[] args) {
			/*printEvens();
			printOddsUser();
			
			isPrime(4);
			
			palInt(121);
			
			
			isArmstrong(153);
			
			System.out.println(rmDupChar("abbacdef"));
			*/
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter a String with no duplicates: ");
			String str=scan.next();
			str=rmDupChar(str);
			
			printComb(str,str.length());
			scan.close();
		}
		public static void printEvens() {
			for(int i=0;i<=200;i+=2) {
				System.out.println(i);
			}
		}
		public static void printOddsUser() {
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
			scan.close();
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
					System.out.println("Not a palindrome");
				}
			}
			if(isPal) {
				System.out.println("Number is a palindrome");
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

