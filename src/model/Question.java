package model;
/**
*
* @author Vinícius Lara - 2361154
*/
public class Question {

	public void quetion(int numquest, String name) {

		switch (numquest) {
		case 1:

			System.out.println("\n=== Player: " + name + " -- Questão: 01 -- Nivel: Básico ===");
			System.out.println("\n---> Em qual time Michel Jordan conquistou seus 6 titulos da NBA?");
			System.out.println("\na) Seattle SuperSonics");
			System.out.println("b) Los Angeles Lakers");
			System.out.println("c) Chicago Bulls");
			System.out.println("d) Boston Celtics");
			break;

		case 2:

			System.out.println("\n=== Player: " + name + " -- Questão: 02 -- Nivel: Básico ===");
			System.out.println("\n---> Em qual time Stephen Curry joga atualmente?");
			System.out.println("\na) Atlanta Hawks");
			System.out.println("b) Golden State Warrions");
			System.out.println("c) Boston Celtics");
			System.out.println("d) Los Angeles Clippers");
			break;

		case 3:

			System.out.println("\n=== Player: " + name + " -- Questão: 03 -- Nivel: Aspirante ===");
			System.out.println("\n---> Quantos titulos da NBA possui o Cleveland Cavaliers?");
			System.out.println("\na) 1");
			System.out.println("b) 3");
			System.out.println("c) 2");
			System.out.println("d) 5");
			break;

		case 4:

			System.out.println("\n=== Player: " + name + " -- Questão: 04 -- Nivel: Aspirante ===");
			System.out.println("\n---> Kobe Bryant atuou durante toda sua carreira em qual time??");
			System.out.println("\na) Los Angeles Clippers");
			System.out.println("b) Los Angeles Lakers");
			System.out.println("c) Orlando Magic");
			System.out.println("d) Miami Heat");
			break;


		case 5:

			System.out.println("\n=== Player: " + name + " -- Questão: 05 -- Nivel: Intermediario ===");
			System.out.println("\n---> Em qual ano Lebron James foi draftado pelo Cleveland Cavaliers?");
			System.out.println("\na) 2001");
			System.out.println("b) 2003");
			System.out.println("c) 2002");
			System.out.println("d) 2005");
			break;

		case 6:

			System.out.println("\n=== Player: " + name + " -- Questão: 06 -- Nivel: Intermediario ===");
			System.out.println("\n---> Kevin Durant fez sua estreio na NBA em qual time?");
			System.out.println("\na) Golden State Warriors");
			System.out.println("b) Oklahoma City Thunder");
			System.out.println("c) Seattle SuperSonics");
			System.out.println("d) Brooklyn Nets");
			break;

		case 7:

			System.out.println("\n=== Player: " + name + " -- Questão: 07 -- Nivel: Dificil ===");
			System.out.println("\n---> Qual jogador é conhecido por seu apelido: The Claw?");
			System.out.println("\na) Kawhi Leonard");
			System.out.println("b) Scottie Pipen");
			System.out.println("c) Chris Paul");
			System.out.println("d) Allen Iverson");
			break;

		case 8:

			System.out.println("\n=== Player: " + name + " -- Questão: 08 -- Nivel: Dificil ===");
			System.out.println("\n---> Qual o nome e por qual time joga o irmão de Stephen Curry?");
			System.out.println("\na) Stephen Curry III - Brooklyn Nets");
			System.out.println("b) Stephen Curry III - Philadelphia 76ers");
			System.out.println("c) John Curry - Utah Jazz");
			System.out.println("d) Seth Curry - Brooklyn Nets");
			break;

		case 9:

			System.out.println("\n=== Player: " + name + " -- Questão: 09 -- Nivel: Lenda da NBA ===");
			System.out.println("\n---> Russell Westbrook ultrapassou Oscar Robertson se tornando o jogador com o maior"
					+ "numero de Triple Doubles na história da NBA. Quantos Triple Doubles Westbrook precisou para"
					+ "alcançar essa marca?");
			System.out.println("a) 180");
			System.out.println("b) 183");
			System.out.println("c) 181");
			System.out.println("d) 182");
			break;

		case 10:

			System.out.println("\n=== Player: " + name + " -- Questão: 10 -- Nivel: Lenda da NBA ===");
			System.out.println("\n---> Stephen Curry ultrapassou Rey Allen se tornando o jogador com o maior"
					+ "numero de bolas de 3 pontos convertidas na história da NBA. Quantas bolas de 3 Curry precisou para"
					+ "alcançar essa marca?");
			System.out.println("\na) 2.973");
			System.out.println("b) 2.974");
			System.out.println("c) 2.971");
			System.out.println("d) 2.975");
			break;
			
		}

	}

	public char answer(int numquest) {
		
		switch (numquest) {
			case 1:

				return 'c';

			case 2:

				return 'b';

			case 3:

				return 'a';

			case 4:

				return 'b';

			case 5:

				return 'b';

			case 6:

				return 'c';

			case 7:

				return 'a';

			case 8:

				return 'd';

			case 9:

				return 'd';

			case 10:

				return 'b';

			default:
				return 'e';
		}
	}
}
