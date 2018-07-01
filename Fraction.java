package by.epam.lesson5.hometask;

public class Fraction {
	private int num;
	private int den;

	public Fraction(int num, int den) {
		if(den == 0) { den = 1; }
		this.num = num;
		this.den = den;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		if(den == 0) { den = 1; }
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}
	
}
