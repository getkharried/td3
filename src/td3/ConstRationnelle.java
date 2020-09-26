package td3;

public final class ConstRationnelle {
	private int numerateur;
	private int denominateur;
	
	public ConstRationnelle(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
	
	public int[] getRationnel() {
		int[] rationnel = { this.numerateur, this.denominateur };
		return rationnel;
	}
}
