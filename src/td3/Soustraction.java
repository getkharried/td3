package td3;

public class Soustraction extends ExpressionArythmetique{
	@Override
	protected double calculer(ConstEntiere constEntiere1, ConstEntiere constEntiere2){
		int resultat = constEntiere1.getEntier() - constEntiere2.getEntier();
		return resultat;
	}
	
	@Override
	protected double calculer(ConstRationnelle constRationnelle1, ConstRationnelle constRationnelle2){
		double resultat = constRationnelle1.getEntier() - constRationnelle2.getEntier();
		return resultat;
	}
	
	@Override
	protected double calculer(ConstRationnelle constRationnelle, ConstEntiere constEntiere){
		double resultat = constRationnelle.getEntier() - constEntiere.getEntier();
		return resultat;
	}
	
	@Override
	protected double calculer(ConstEntiere constEntiere, ConstRationnelle constRationnelle){
		double resultat = constRationnelle.getEntier() - constEntiere.getEntier();
		return resultat;
	}
}
