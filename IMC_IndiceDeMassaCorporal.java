package Fundamentos.Desafios;

import javax.swing.JOptionPane;

public class IMC_IndiceDeMassaCorporal {
	public static void main(String[] args) {

		String altura = JOptionPane.showInputDialog("Digite a Altura").replace(",", ".");
		String peso = JOptionPane.showInputDialog("Digite a Peso").replace(",", ".");
		Double altura1 = Double.parseDouble(altura);
		altura1 = Math.pow(altura1, 2);
		Double peso1 = Double.parseDouble(peso);
		peso1 = (peso1/altura1);
		String  resultado ;
	
		resultado = 17   >  peso1   ? " Muito abaixo do peso ideal ":"0 ";
		resultado = 17   <= peso1 && 18.49 >= peso1  ? " Abaixo do peso ":resultado;
		resultado = 18.5 <= peso1 && 24.99 >= peso1  ? " Peso norma ":resultado;
		resultado = 25   <= peso1 && 29.99 >= peso1  ? " Acima do peso ":resultado;
		resultado = 30   <= peso1 && 34.99 >= peso1  ? " Obesidade grau 1\"":resultado;
		resultado = 35   <= peso1 && 39.99 >= peso1  ? " Obesidade grau 2\"":resultado;
		resultado = 40   == peso1   ? " Obesidade grau 3\" (mórbida)":resultado;
				
		System.out.printf("Indice De Massa Corporal. %.2f %s ",peso1,resultado);

	}


}
