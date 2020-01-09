/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixa.posfixa;

import expressoes.Posfixa;
import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class InfixaPosfixa
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String expressao;
		
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
