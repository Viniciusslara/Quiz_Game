package view;
/**
*
* @author Vinícius Lara - 2361154
*/
import java.util.Scanner;

import controller.CheckAnswer;
import controller.Input;
import model.Player;
import model.Question;


public class Quiz implements CheckAnswer{

	public Scanner inpt = new Scanner(System.in);
	public Input input = new Input();
	public Player player = new Player();
	public Question quest = new Question();
	
	public void menu() {
		
		if(player.getPoints() == 100) {
			System.out.println(" -- PARABÉNS VOCÊ CONCLUIU O QUIZ COM SUCESSO! --");
			System.out.print("\n- Deseja jogar novamente?(s/n): ");
			String op = inpt.next();
			
			if(op.equals("s") || op.equals("S")) {
				player.setPoints(0);
				menu();
			}else {
				System.out.println("\n-- OBRIGADO POR JOGAR O NBA QUIZ! -- ");
				System.exit(0);
			}
		}
		System.out.println("==========================================================");
		System.out.println("\n                        NBA QUIZ ");
		System.out.println("\nPlayer: "+player.getName()+" ---------------------------- Pontos: "+player.getPoints());
		System.out.println("\n======================== NIVEIS ==========================");
		System.out.println("\n  --> 1 - BASICO ");
		System.out.println("  --> 2 - ASPIRANTE ");
		System.out.println("  --> 3 - INTERMEDIARIO ");
		System.out.println("  --> 4 - DIFICIL ");
		System.out.println("  --> 5 - LENDA DA NBA ");
		System.out.println("\n==========================================================");
		System.out.println("\n  --> 6 - REGRAS ");
		System.out.println("  --> 7 - SAIR ");
		int option = input.inputInt("\nInforme o numero da opção desejada: ");
		
		if(option == 6) {
			limpatela();
			rule();
		}else 
			if(option == 7){
				System.out.println("\n-- OBRIGADO POR JOGAR O NBA QUIZ! -- ");
				System.exit(0);
			}else {
				quiz(option);
		}
	}
	
	
	
	public void quiz(int option) {
		char anwser = 'a';
		
		if(option == 1) {
			player.setPoints(0);
			for(int i = 1; i <= 2; i++) {
				limpatela();
				quest.quetion(i,player.getName());
				anwser = input.inputAlt("Informe a anternativa correta: ");
				check(i, anwser); 
			}
			limpatela();
			menu();
		}else
			if(option == 2) {
				if(player.getPoints() < 20) {
					limpatela();
					System.out.println(" ----> Pontuação não atingida para jogar este nivel <----");
				}else {
					player.setPoints(20);
					for(int i = 3; i <= 4; i++) {
						limpatela();
						quest.quetion(i,player.getName());
						anwser = input.inputAlt("Informe a anternativa correta: ");
						check(i, anwser); 
					};
					limpatela();
					menu();
				}
				menu();
			}else
				if(option == 3) {
					if(player.getPoints() < 40) {
						limpatela();
						System.out.println(" ----> Pontuação não atingida para jogar este nivel <----");
					}else {
						player.setPoints(40);
						for(int i = 5; i <= 6; i++) {
							limpatela();
							quest.quetion(i,player.getName());
							anwser = input.inputAlt("Informe a anternativa correta: ");
							check(i, anwser); 
						}
						limpatela();
						menu();
					}
					menu();
				}else
					if(option == 4) {
						if(player.getPoints() < 60) {
							limpatela();
							System.out.println(" ----> Pontuação não atingida para jogar este nivel <----");
						}else {
							player.setPoints(60);
							for(int i = 7; i <= 8; i++) {
								limpatela();
								quest.quetion(i,player.getName());
								anwser = input.inputAlt("Informe a anternativa correta: ");
								check(i, anwser);  
							}
							limpatela();
							menu();
						}
						menu();
					}else
						if(option == 5) {
							if(player.getPoints() < 80) {
								limpatela();
								System.out.println(" ----> Pontuação não atingida para jogar este nivel <----");
							}else {
								player.setPoints(80);
								for(int i = 9; i <= 10; i++) {
									limpatela();
									quest.quetion(i,player.getName());
									anwser = input.inputAlt("Informe a anternativa correta: ");
									check(i, anwser);  
								}
								limpatela();
								menu();
							}
							menu();
						}
		
	}
	
	public void start() {
		
		String name = "";
		
		System.out.println(" ======== NBA QUIZ ========");
		System.out.print(" --Insert your Nickname: ");
		name = inpt.nextLine();
		player.setName(name);
		
		limpatela();
		menu();
		
	}
	
	public void limpatela() {
		for(int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	
	public void rule() {
		
		String op;
		
		do {
			System.out.println("Quero(a) player "+player.getName()+" o NBA Quiz consiste em um jogo de perguntas e respostas.");
			System.out.println("No menu você pode optar pelo nivel que tu você deseja jogar, mas para jogar os niveis");
			System.out.println("você precisa libera-los. O nivel basico ja vem liberado para jogar, o nivel Aspirante é necessario");
			System.out.println("alcançar 20 pontos para joga-lo, o Intermediário 40, o Dificil 60 e o Lenda da NBA 80 pontos.");
			
			System.out.println("\nAo jogar o nivel Basico e não atingir os 20 pontos para liberar o nivel Intermediario, será");
			System.out.println("necessario jogar o nivel Basico novamente até atingir os 20 pontos. Ao jogar um nivel novamente");
			System.out.println("os seus pontos voltam para a quantidade que estava antes de o ter iniciado, ou seja, se ao completar");
			System.out.println("o nivel Aspirante você não fazer os 40 pontos necessário para liberar o proximo nivel, será necessario");
			System.out.println("jogar o nivel Aspirante novamente e ao fazer isso, seus pontos voltam para 20. Isso aconteceu para os outros");
			System.out.println("niveis, se for necessario jogar o Basico seus pontos voltam para 0, Aspirante 20, Intemediario 40, Dificil 60,");
			System.out.println("Lenda da NBA 80.");
			
			System.out.println("\nModo de jogar:");
			System.out.println("No menu de niveis você terá 7 opções de escolha, entre 2 delas a regra do jogo e a opção de sair. Para escolher");
			System.out.println("uma das opções digite o numero referente a opção desejada.");
			System.out.println("\nAs perguntas são compostas de 4 alternativas e para responder, digite a letra correspondente a alternativa que você");
			System.out.println("acredita ser a correta.");
			
			System.out.println("\nAo completar 100 pontos, você acertou todas as perguntas do NBA Quiz :)");
			
			System.out.println("\n ----> DIVIRTA - SE <----");
			
			System.out.print("\nDigite 1 para voltar ao menu: ");
			op = inpt.next();
			limpatela();
			
			if (op.equals("1")) {
				menu();
			}
			
		}while(!op.equals("1"));
	}

	@Override
	public void check(int numquest, char answer) {
		// TODO Auto-generated method stub
		
		if(answer == quest.answer(numquest)){
			int pontos = player.getPoints() + 10;
			player.setPoints(pontos);
		}
	}

}

