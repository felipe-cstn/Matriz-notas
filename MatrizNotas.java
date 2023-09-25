package classe;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de linhas:" );
		int  linha = entrada.nextInt();
		
		System.out.println("Informe a quantidade de colunas:" );
		int  coluna = entrada.nextInt();
		
		
		double[][] nota = new double[linha][coluna];
		
		for(int i = 0; i < nota.length; i++) {
			for(int j = 0; j < nota.length; j++) {
				System.out.printf("Posicao [%d][%d]: \n",i,j);
					nota[i][j] = entrada.nextDouble();
			}
		}	
	
	
		for(double[] mostrar:nota) {
			System.out.println(Arrays.toString(mostrar));
		}
	}
}
