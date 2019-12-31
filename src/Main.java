import java.util.Scanner;

import expressoes.Posfixa;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String expressao = "";
		
		if(args.length == 0)
		{
			System.out.println("Informe a expressão infixa: ");
			expressao = scanner.nextLine().replace(" ", "");
		}
		else
			expressao = args[0];
		System.out.println(Posfixa.conversao(expressao));
	}
}
