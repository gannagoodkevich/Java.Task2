import java.util.Random;


public class YourMood {
public static int GenRandom() {
	Random obj = new Random(System.currentTimeMillis());
	int ran = 1+obj.nextInt(6);
	return ran;
}
}
