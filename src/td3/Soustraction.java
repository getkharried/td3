package td3;

import java.math.BigDecimal;

public class Soustraction extends ExpressionArithmetique {
	public Soustraction(Object expPart1, Object expPart2) {
		super(expPart1, expPart2);
	}
	
	@Override
	protected BigDecimal calculer(){
		super.calculer();
		BigDecimal resultat = this.calculParts[0];
		resultat.subtract(this.calculParts[1]);
		
		return resultat;
	}
	
	public String affiche() {
		return "";
	}
}

