import java.util.Scanner;

public class Main1 {
	public static void main(String[] argc) {
		System.out.println("Enter two radiuses:\n");
		Scanner in = new Scanner(System.in);
		Radius obj= new Radius();
		int R1 =in.nextInt();
		int R2 =in.nextInt();
		double answer = obj.Areaofring(R1, R2);
		System.out.println("This array is increasing?:\n"+answer);
	}
	
}
