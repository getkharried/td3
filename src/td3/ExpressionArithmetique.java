package td3;

import java.math.BigDecimal; // pour plus de précision

public abstract class ExpressionArithmetique {
	protected Object[] expParts;
	protected BigDecimal[] calculParts;
	
	public ExpressionArithmetique(Object expPart1, Object expPart2) {
		if(this.validExpPart(expPart1) && this.validExpPart(expPart2)) {
			this.expParts[0] = expPart1;
			this.expParts[1] = expPart2;
		}
		
		else throw new IllegalArgumentException("Une partie des paramètres n'est ni une expression ni une constante !");
	}
	
	protected BigDecimal calculer() {
		for(int i = 0; i<2; i++) {
			if(expParts[i] instanceof ConstEntiere) calculParts[i] = new BigDecimal(((ConstEntiere) expParts[i]).getEntier());
			
			else if(expParts[i] instanceof ConstRationnelle) {
				int[] rationnel = ((ConstRationnelle) expParts[i]).getRationnel();
				calculParts[i] = new BigDecimal(rationnel[0] / rationnel[1]);
			}
			
			else {
				calculParts[i] = ((ExpressionArithmetique) expParts[i]).calculer();
			}
		}
		
		return new BigDecimal(0); // parce qu'il faut retourner quelque chose même si on ne s'en sert pas réellement
	}
	
	public abstract String affiche();
		
	protected String simplifier() {
		return "";
	}
	
	protected boolean validExpPart(Object expPart) {
		return (expPart instanceof ConstEntiere || expPart instanceof ExpressionArithmetique
				|| expPart instanceof ConstRationnelle);
	}
}
