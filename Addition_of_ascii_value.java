package java_p;
import java.util.Scanner;
public class Addition_of_ascii_value {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 String  a = sc.nextLine();
	 int b =0;
	 int sum=0;
	 for(int i=0; i<a.length(); i++) {
		int ch = a.charAt(i);
		 b = ch-'a' + 1;
		 sum += b;
	 }
	 System.out.print(sum);

 }
}
