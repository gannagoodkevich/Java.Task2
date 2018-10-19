/*Main
 * 
 * hometask2-5
 * 
 * 19.10.2018
 * 
 * gannagoodkevich@gmail.com
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] acds) {
		System.out.println("Enter date, please(day month year)");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		DateAns date = new DateAns();
		date = Date.nextDay(a, b, c);
		System.out.println("The next date is: " + date.a + " " + date.b + " " + date.c);
	}
	
}
