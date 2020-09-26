package td3;

import java.math.BigDecimal;

public class Addition extends ExpressionArithmetique{
	public Addition(Object expPart1, Object expPart2) {
		super(expPart1, expPart2);
	}
	
	@Override
	protected BigDecimal calculer(){
		super.calculer();
		BigDecimal resultat = this.calculParts[0];
		resultat.add(this.calculParts[1]);
		
		return resultat;
	}
	
	public String affiche() {
		return "";
	}
}
