import java.util.Scanner;


public class Main {
		public static void main(String[] argc) {
			System.out.println("Enter the Dragons age");
			Scanner in = new Scanner(System.in);
			int Old = in.nextInt();
			int Head = Heads.Head(Old);
			int Eyes = Heads.Eyes(Head);
			System.out.println("The number of heads is: " + Head);
			System.out.println("The number of eyes is: " + Eyes);
		}
}
