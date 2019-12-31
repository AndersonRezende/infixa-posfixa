/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressoes;

import java.util.Stack;

/**
 *
 * @author anderson
 */
public class Posfixa 
{
    public static String conversao(String infixa)
    {
	String posfixa = "";
	Stack<Integer> pilha = new Stack<Integer>();
	int cont = 0;
	char c;
	
        while(cont < infixa.length())
        {
            c = infixa.charAt(cont);
            switch(c)
            {
    		case '*':
	       	case '/':
	       	case '+':
	       	case '-':
	       	case '^':
                    while((!pilha.empty()) && prioridade(c) <= prioridade((char)((int) pilha.peek())))
                        posfixa += (char)((int)pilha.pop());
                    
                    pilha.add((int)c);
                    break;
                
                case '(':
                    pilha.add((int)c);
                    break;
                
                case ')':
                    while((char)((int)pilha.peek()) != '(')
                        posfixa += (char)((int)pilha.pop());
                    
                    if((char)((int)pilha.peek()) == '(')
                        pilha.pop();
                    break;
                
                default:
                    posfixa += infixa.charAt(cont);
                    break;
            }
            cont++;
    	}
    	
        while(pilha.size() > 0)
            if((char)((int)pilha.peek()) != '(')
                posfixa += (char)((int)pilha.pop());
            else
                pilha.pop();
    	
    	return posfixa;
    }
    
    
    public static int prioridade(char elemento)
    {
        int prioridade;
        switch(elemento)
        {
            case '+':
            case '-':
                prioridade = 1;
                break;
            
            case '*':
            case '/':
                prioridade = 2;
                break;
            case '^':
                prioridade = 3;
                break;
            
            default:
                prioridade = 0;
                break;
        }
        
        return prioridade;
    }
}
