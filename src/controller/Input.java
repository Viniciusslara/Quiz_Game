package controller;
/**
*
* @author Vinícius Lara - 2361154
*/
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input {


	public char inputAlt(String entrada ) {
		
		Scanner inpt = new Scanner(System.in);
		boolean teste = true;
		char ler = 'a';
		
		
		while(teste) {
			
			System.out.print(entrada);
			ler = inpt.next().charAt(0);
		
			if(Character.isAlphabetic(ler)) {
				if(ler >= 65 && ler <= 68) {
					teste = false;
				}else
					if(ler >= 97 && ler <= 100) {
						teste = false;
					}else {
						System.out.println("\n\n->ENTRADA INVALIDA!<-\n");
					}
		
			}else {
				System.out.println("\n\n->ENTRADA INVALIDA!<-\n");
			}
		}
		inpt.close();
		return ler;
	}
	
public int inputInt(String entrada ) {
		
		boolean teste = true;
		int ler = 0;
		Scanner inpt;
		
		while(teste) {
			try {
				System.out.print(entrada);
				inpt = new Scanner(System.in);
				ler = inpt.nextInt();
		
				if(ler >=1 && ler <=7 ) {
					teste = false;
				}else {
					System.out.println("\n\n->ENTRADA INVALIDA!<-\n");
				}
			}catch (InputMismatchException exp) {
				// TODO: handle exception
				System.out.println("\n\n->ENTRADA INVALIDA!<-\n");
			}
		}
		return ler;
	}

}
