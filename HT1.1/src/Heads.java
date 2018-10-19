
public class Heads {
	public static int Head(int N) {
		int heads = 0;
		if(N<200) {
			heads = N*3;
		}
		if(N>200 && N<300) {
			heads = 199*3 + (N-199)*2;
		}
		if(N>300) {
			heads = 199*3 + 100*2 + (N-299);
		}
		return heads;
	}
	public static int Eyes(int heads) {
		int eyes = 0;
		eyes = heads*2;
		return eyes;
	}
}
