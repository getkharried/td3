package td3;

public abstract class ExpressionArythmetique {
	protected abstract double calculer(ConstEntiere constEntiere1, ConstEntiere constEntiere2);
	protected abstract double calculer(ConstRationnelle constRationnelle1, ConstRationnelle constRationnelle2);
	protected abstract double calculer(ConstRationnelle constRationnelle, ConstEntiere constEntiere);
	protected abstract double calculer(ConstEntiere constEntiere, ConstRationnelle constRationnelle);
	
	protected String simplifier() {
		return "";
	}

}
/*
methode(9 + 2 * (3-1/5+12))
for
if(tab[0] == isInteger) {
	ConstEntiere const1 = new ConstEntiere(tab[0]);
	premier = const1.getEntier();
}

methode priorité() {
	
}
var = 123,5
var = 12*0,5

2*2x+ 2x
4x+2x
6x