
public class Radius {
	public double Areaofcir(int R) {
		double S=Math.PI*R*R;
		return S;
	}
	public double Areaofring(int R1, int R2) {
		double S1 = Areaofcir(R1);
		double S2 = Areaofcir(R2);
		Areaofcir(R2);
		double S=S1-S2;
		return S;
	}
}
