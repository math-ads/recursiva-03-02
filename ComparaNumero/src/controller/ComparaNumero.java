package controller;

public class ComparaNumero {

	public ComparaNumero() {
		super();}
	
	public int comparaNum(int numeA, int numeB, int quantidade) {
		
		if (numeA==0) {
			/*
			 * numero deve ser comparado a 0 pois se for igual 0 
			 * todos seus digitos foram lidos pela comparacao
			 
			 */
	return(quantidade);}
	else {
		if(numeA%10==numeB) {
			return comparaNum(numeA/10, numeB, quantidade+1);
		}
		
		return comparaNum(numeA/10, numeB, quantidade);
		/*
		 * o if e necessario pois a quantidade so e aumentada se passar pela 
		 * condicao
		 */
	}
		   }

	}
	