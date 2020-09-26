package td3;

public class Addition extends ExpressionArythmetique{
	
	@Override
	protected int calculer(ConstEntiere constEntiere1, ConstEntiere constEntiere2){
		int resultat = constEntiere1.getEntier() + constEntiere2.getEntier();
		return resultat;
	}
	
}
