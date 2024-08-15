 package view;

import javax.swing.JOptionPane;

import controller.ComparaNumero;

public class Principal {

	public static void main(String[] args) {
		int numA;
		int numB;
		int quantidade=0;
		do {
		numA = Integer.parseInt(JOptionPane.showInputDialog("insira numero entre 10 e 999999"));
		}while (numA<10||numA>999999);
		
		do {
			numB = Integer.parseInt(JOptionPane.showInputDialog("insira numero entre 0 e 9"));
			}while (numB<0||numB>10);
		ComparaNumero compNum= new ComparaNumero();
		int resp = compNum.comparaNum(numA, numB, quantidade);
		System.out.println( numB + " se repete " + resp+ " vezes em "+ numA );
	}
	
}
