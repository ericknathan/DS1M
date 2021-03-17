package aumentos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcularAumentos {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("\n______________________________________________");
        System.out.println("|                                            |");
        System.out.println("|          CALCULADORA DE AUMENTOS           |");
        System.out.println("|____________________________________________|");
		System.out.print("\nDigite o salário atual do funcionário: R$");
		double salario = leitor.nextDouble();
		
		if(salario <= 2000) {
		    double aumento = (salario / 100) * 10;
		    double total = salario + aumento;
		    System.out.println("Esse funcionário com o ganho de R$" + formatador.format(salario) + " mensais, terá um aumento de 10%(R$" + formatador.format(aumento) + ") totalizando em R$" + formatador.format(total));
		} else if(salario > 2000 && salario <= 5000) {
            double aumento = (salario / 100) * 7;
		    double total = salario + aumento;
		    System.out.println("Esse funcionário com o ganho de R$" + formatador.format(salario) + " mensais, terá um aumento de 7%(R$" + formatador.format(aumento) + ") totalizando em R$" + formatador.format(total));
		} else {
            double aumento = (salario / 100) * 5;
		    double total = salario + aumento;
		    System.out.println("Esse funcionário com o ganho de R$" + formatador.format(salario) + " mensais, terá um aumento de 5%(R$" + formatador.format(aumento) + ") totalizando em R$" + formatador.format(total));
		}
	}
}
