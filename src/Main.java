import java.util.Scanner;

import expressoes.Posfixa;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String expressao = "";
		
		System.out.println("Informe a expressão infixa: ");
		expressao = scanner.nextLine().replace(" ", "");
		System.out.println(Posfixa.conversao(expressao));
	}
}
