package projetoIntegrador;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperacaoAurora {
	/*
	 * Fazenddo a chamada do scanner de forma global para ser utilizada no código
	 * inteiro. Isso evita de ficar instanciando em todas as funções.
	 */
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();

	/*
	 * Variáveis responsáveis por determinar o delay nas mensagens que serão
	 * imprimidas.
	 */
	static int tempo_dialogo = 70, tempo_narrativa = 60, tempo_transicao = 25;

	// #region Funções genéricas para utilização de forma global.

	/*
	 * Função responsável por imprir uma mensagem utilizando um tempo de exibição.
	 * 
	 * @param mensagem a mensagem que será imprimida.
	 * 
	 * @param tipo_tempo o formato de tempo que será utilizado para contabilizar o
	 * tempo.
	 * 
	 * @param tempo_mensagem por quanto tempo a mensagem será exibida.
	 */
	public static void imprimir(String mensagem, TimeUnit formato_tempo, long tempo_mensagem)
			throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);

			formato_tempo.sleep(tempo_mensagem);
		}
	}
	// #endregion

	/*
	 * Função responsável por dar ao jogador instruções sobre o jogo.
	 */
	static void intrucoes() throws Exception {
		imprimir("\nOperação Aurora é uma experiência imersiva que combina elementos de narrativa e resolução de enigmas, proporcionando a você uma jornada emocionante e cheia de mistérios para desvendar! \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Combinando narrativa envolvente com desafios matemáticos que testam as habilidades dos jogadores. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir(" *-* Aqui você irá descobrir a história de Ethan Blackwood, um jovem em busca da verdade por trás da morte misteriosa de seus pais em Sin City, 1925.. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* Explorar locais secretos, resolver enigmas e decifrar mensagens enigmáticas para avançar na investigação. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* Irá encontrar aliados improváveis e enfrentar agentes perigosos em sua jornada pela verdade e justiça. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* Tomar decisões não é uma tarefa fácil, não é mesmo? Por isso suas decisões serão cruciais, pois afetarão o desfecho da história e o destino do personagem principal. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* O mais importante! Você testará suas habilidades matemáticas ao resolver enigmas e desafios que se apresentam ao longo da narrativa \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Para ficar preparado para essa imersão de enigmas matemáticos (polinômios, equações do segundo grau e propriedades da potenciação), aí estão algumas dicas que possam te ajudar: \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
	  "\u001B[33m██████╗  ██████╗ ██╗     ██╗███╗   ██╗ ██████╗ ███╗   ███╗██╗ ██████╗ ███████╗\n"
		       +"██╔══██╗██╔═══██╗██║     ██║████╗  ██║██╔═══██╗████╗ ████║██║██╔═══██╗██╔════╝\n"
		       +"██████╔╝██║   ██║██║     ██║██╔██╗ ██║██║   ██║██╔████╔██║██║██║   ██║███████╗\n"
		       +"██╔═══╝ ██║   ██║██║     ██║██║╚██╗██║██║   ██║██║╚██╔╝██║██║██║   ██║╚════██║\n"
		       +"██║     ╚██████╔╝███████╗██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║╚██████╔╝███████║\n"
		       +"╚═╝      ╚═════╝ ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝ ╚═════╝ ╚══════╝\\u001B[0m\n");

		imprimir("Para apoio: Khan Academy - Polynomials e Brasil Escola - Polinômios \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir(" *-* Um polinômio é uma expressão algébrica que envolve variáveis elevadas a diferentes potências, multiplicadas por coeficientes e somadas ou subtraídas entre si. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* Para realizar operações com polinômios, é fundamental entender como adicionar, subtrair, multiplicar e dividir polinômios. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* É importante também saber identificar o grau de um polinômio, que é o maior expoente da variável presente no polinômio. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
	   "\u001B[33m███████╗ ██████╗ ██╗   ██╗ █████╗  ██████╗ ██████╗ ███████╗███████╗    ██████╗      ██████╗ ██████╗  █████╗ ██╗   ██╗\n"
		        +"██╔════╝██╔═══██╗██║   ██║██╔══██╗██╔════╝██╔═══██╗██╔════╝██╔════╝    ╚════██╗    ██╔════╝ ██╔══██╗██╔══██╗██║   ██║\n"
		        +"█████╗  ██║   ██║██║   ██║███████║██║     ██║   ██║█████╗  ███████╗     █████╔╝    ██║  ███╗██████╔╝███████║██║   ██║\n"
		        +"██╔══╝  ██║▄▄ ██║██║   ██║██╔══██║██║     ██║   ██║██╔══╝  ╚════██║    ██╔═══╝     ██║   ██║██╔══██╗██╔══██║██║   ██║\n"
		        +"███████╗╚██████╔╝╚██████╔╝██║  ██║╚██████╗╚██████╔╝███████╗███████║    ███████╗    ╚██████╔╝██║  ██║██║  ██║╚██████╔╝\n"
		        +"╚══════╝ ╚══▀▀═╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═════╝ ╚══════╝╚══════╝    ╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝\u001B[0m\n");

		imprimir("Para apoio: Khan Academy - Quadratic Equations e Toda Matéria - Equações do 2º Grau \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir(" *-* Uma equação do segundo grau é uma equação onde a variável está elevada ao quadrado, com a forma geral: ax² + bx + c = 0 \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* Para resolver uma equação do segundo grau, você pode usar a fórmula de Bhaskara \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* É importante lembrar que uma equação do segundo grau pode ter duas raízes (quando o discriminante é maior que zero), uma raiz (quando o discriminante é igual a zero) ou nenhuma raiz real (quando o discriminante é menor que zero). \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		System.out.println(
	   "\u001B[33m██████╗  ██████╗ ████████╗███████╗███╗   ██╗ ██████╗██╗ █████╗  ██████╗ █████╗  ██████╗ \n"
		        +"██╔══██╗██╔═══██╗╚══██╔══╝██╔════╝████╗  ██║██╔════╝██║██╔══██╗██╔════╝██╔══██╗██╔═══██╗\n"
		        +"██████╔╝██║   ██║   ██║   █████╗  ██╔██╗ ██║██║     ██║███████║██║     ███████║██║   ██║\n"
		        +"██╔═══╝ ██║   ██║   ██║   ██╔══╝  ██║╚██╗██║██║     ██║██╔══██║██║     ██╔══██║██║   ██║\n"
		        +"██║     ╚██████╔╝   ██║   ███████╗██║ ╚████║╚██████╗██║██║  ██║╚██████╗██║  ██║╚██████╔╝\n"
		        +"╚═╝      ╚═════╝    ╚═╝   ╚══════╝╚═╝  ╚═══╝ ╚═════╝╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝\u001B[0m\n");

		imprimir("Para apoio: Mundo Educação - Potenciação e Toda Matéria - Potenciação \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);	   	

		imprimir(" *-* A potenciação é uma operação matemática que consiste em multiplicar um número pela mesma quantidade de vezes indicada pelo expoente \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-* As propriedades da potenciação incluem: \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  1. produto de potências de mesma base; \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  2. divisão de potências de mesma base; \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  3. potência de potência; \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  4. produto de potências com a mesma base; \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  5. quociente de potências com a mesma base; \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  6. qualquer número elevado a zero é igual a 1; \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(" *-*  7. potência negativa é o inverso da potência positiva. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		menu();
	}

	// #region Funçõs responsáveis pelo desenvolvimento dos capitúlos/jogo.

	// Função responsável por iniciar o PRIMEIRO capitúlo.
	static void sombrasGrandeMaca() throws Exception {
		imprimir("\n\nCapitulo 1: \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
	   "\u001B[33m███████╗ ██████╗ ███╗   ███╗██████╗ ██████╗  █████╗ ███████╗    ██████╗  █████╗      ██████╗ ██████╗  █████╗ ███╗   ██╗██████╗ ███████╗    ███╗   ███╗ █████╗  ██████╗ █████╗ \n"
				+"██╔════╝██╔═══██╗████╗ ████║██╔══██╗██╔══██╗██╔══██╗██╔════╝    ██╔══██╗██╔══██╗    ██╔════╝ ██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔════╝    ████╗ ████║██╔══██╗██╔════╝██╔══██╗\n"
				+"███████╗██║   ██║██╔████╔██║██████╔╝██████╔╝███████║███████╗    ██║  ██║███████║    ██║  ███╗██████╔╝███████║██╔██╗ ██║██║  ██║█████╗      ██╔████╔██║███████║██║     ███████║\n"
				+"╚════██║██║   ██║██║╚██╔╝██║██╔══██╗██╔══██╗██╔══██║╚════██║    ██║  ██║██╔══██║    ██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║  ██║██╔══╝      ██║╚██╔╝██║██╔══██║██║     ██╔══██║\n"
				+"███████║╚██████╔╝██║ ╚═╝ ██║██████╔╝██║  ██║██║  ██║███████║    ██████╔╝██║  ██║    ╚██████╔╝██║  ██║██║  ██║██║ ╚████║██████╔╝███████╗    ██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║\n"
				+"╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝ ╚══════╝    ╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\u001B[0m");
				
		System.out.println();
		imprimir("Sin City, 1925. A cidade que nunca dorme pulsa com vida e energia, um caldeirão de sonhos, ambições e segredos obscuros.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Nas ruas movimentadas e becos escuros, a sombra da tragédia paira sobre Ethan Blackwood, um jovem atormentado pela morte misteriosa de seus pais.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("As lembranças das últimas horas com eles ainda estão frescas em sua mente: a risada contagiante de sua mãe, a voz firme de seu pai, o aconchego do lar.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("De repente, tudo se desfez em uma noite brutal, deixando apenas um rastro de perguntas sem respostas e um vazio imenso em seu coração.\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Um bar clandestino, com iluminação fraca e música de jazz ao fundo. Ethan Blackwood, de aparência abatida, está sentado no balcão, segurando um copo de whisky. O barman, um homem de meia-idade com um olhar astuto, se aproxima.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Barman: (enxugando um copo) Você tem andado pensativo, rapaz. O que te traz a este canto esquecido da cidade? \n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		imprimir("Ethan Blackwood: (olhando para o copo, com a voz baixa) Estou atrás de respostas. Meus pais... morreram de uma maneira que ninguém consegue explicar. Acho que alguém aqui sabe de algo. \n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		imprimir("Barman: (arqueando uma sobrancelha) Sin City tem um jeito de engolir segredos. Mas cuidado onde pisa, garoto. Às vezes, as respostas que buscamos são piores que as perguntas. \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("Ethan Blackwood, em um beco escuro, confrontando um informante, um homem magro e nervoso chamado Jimmy. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Ethan Blackwood: (segurando o colarinho de Jimmy) Você sabe algo sobre a noite em que meus pais morreram. Fale, ou vai se arrepender de ter nascido...\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		imprimir("Jimmy: (tentando se soltar, com medo nos olhos) Ok, ok! Tudo o que sei é que eles estavam envolvidos com algo grande. Ouvi dizer que um tal de Aurora estava no centro disso tudo. \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("No apartamento de Ethan. Ele está sentado em sua escrivaninha, examinando o medalhão de prata antigo. Ao tocá-lo, uma mensagem holográfica surge. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		imprimir("Mensagem Holográfica: Aurora... Se você está vendo isso, significa que chegamos ao fim de nossa jornada. O caminho para a verdade está no mapa escondido. Decifre-o e encontrará a chave para o próximo passo.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("Ethan está em sua sala, com documentos espalhados por todo lado. Entre eles, um mapa antigo com símbolos e marcas estranhas. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Ethan Blackwood: (falando para si mesmo) O mapa... preciso entender esses símbolos. Talvez a história da região possa me dar alguma pista.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("Biblioteca de Sin City. Ethan está rodeado por livros antigos, folheando um deles com intensidade. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Ethan Blackwood: (pensando alto) Esses símbolos... parecem ter algum tipo de ligação com antigos rituais. Preciso encontrar um local histórico que bata com essas marcas.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("Ethan encontra um mapa antigo e envelhecido, com símbolos e marcas estranhas. Após examinar o mapa e os documentos, ele percebe que as coordenadas para o local oculto estão codificadas em uma mensagem matemática. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		imprimir("A mensagem matemática possui uma série de polinômios ao lado dos símbolos no mapa. Após estudar os documentos, ele descobre que cada polinômio corresponde a uma coordenada específica. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		imprimir("A mesagem diz: 'A chave está nas raízes dos polinômios, encontre o ponto onde o sol se põe.' \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Mensagem Decifrada: \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		imprimir("1 - Símbolo: Polinômio P(x) = x² - 5x + 6\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		imprimir("2 - Símbolo: Polinômio Q(x) = x² - 7x + 10\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Ethan Blackwood: (pensando com ele mesmo) Preciso encontrar as raízes dos polinômios... Isso me dará as coordenadas do local! \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("Coordenadas: \n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Scanner scanner = new Scanner(System.in);
		
        String[] respostas = {
            "2.2° e 3.5°",  // Resposta correta
            "1.5° e 3.6°",
            "2.2° e 3.2°",
            "3.5° e 2.1°"
        };

        String[] letras = {"A", "B", "C", "D"};
		
		// Variáveis para controle das vidas
        int vidas = 3;
        boolean respostaCorreta = false;
		
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
				int j = random.nextInt(respostas.length);

                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }
            
            System.out.println();
            imprimir("Digite a letra da resposta correta: ",TimeUnit.MILLISECONDS, tempo_transicao);
            
            String resposta = scanner.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
				indexResposta = 0;
                    break;
					case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
				imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
				continue;
            }
			
            if (respostas[indexResposta].equals("2.2° e 3.5°")) {
				imprimir("Ethan Blackwood: Consegui! As coordenadas são 2.2° e 3.5° \n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
					imprimir("Raízes incorretas, tente novamente. Vidas restantes: " + vidas + "\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
					imprimir("Você perdeu todas as suas vidas. Tente novamente para ir para o próximo capítulo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    menu();
                }
            }
        }
		
		imprimir("Ethan no local indicado pelo mapa, um antigo ponto de referência da cidade.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		imprimir("Ethan: (olhando em volta, segurando o mapa) Se minha interpretação está correta, este é o lugar onde o sol se põe. Agora, só preciso encontrar a entrada secreta.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		imprimir("Após semanas de investigação, noites sem dormir e inúmeros perigos enfrentados, Ethan finalmente decifra o mapa. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		imprimir("As coordenadas o levam a um local abandonado nos arredores da cidade. Ao chegar lá, ele encontra um baú enterrado, contendo mais documentos, artefatos e outra pista que o levaria a \"Aurora\"",TimeUnit.MILLISECONDS, tempo_narrativa);		
	}

//	 Função responsável por iniciar o SEGUNDO capitúlo.

	static void desvendarOlhoSecreto() throws Exception {

		imprimir("\n\nCapitulo 2:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		System.out.println(
				"\u001B[33m██████╗ ███████╗███████╗██╗   ██╗███████╗███╗   ██╗██████╗  █████╗ ███╗   ██╗██████╗  ██████╗ \n"
						+ "██╔══██╗██╔════╝██╔════╝██║   ██║██╔════╝████╗  ██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔═══██╗\n"
						+ "██║  ██║█████╗  ███████╗██║   ██║█████╗  ██╔██╗ ██║██║  ██║███████║██╔██╗ ██║██║  ██║██║   ██║\n"
						+ "██║  ██║██╔══╝  ╚════██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║  ██║██╔══██║██║╚██╗██║██║  ██║██║   ██║\n"
						+ "██████╔╝███████╗███████║ ╚████╔╝ ███████╗██║ ╚████║██████╔╝██║  ██║██║ ╚████║██████╔╝╚██████╔╝\n"
						+ "╚═════╝ ╚══════╝╚══════╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ \n"
						+ " ██████╗      ██████╗ ██╗     ██╗  ██╗ ██████╗     ███████╗███████╗ ██████╗██████╗ ███████╗████████╗ ██████╗  \n"
						+ "██╔═══██╗    ██╔═══██╗██║     ██║  ██║██╔═══██╗    ██╔════╝██╔════╝██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔═══██╗ \n"
						+ "██║   ██║    ██║   ██║██║     ███████║██║   ██║    ███████╗█████╗  ██║     ██████╔╝█████╗     ██║   ██║   ██║ \n"
						+ "██║   ██║    ██║   ██║██║     ██╔══██║██║   ██║    ╚════██║██╔══╝  ██║     ██╔══██╗██╔══╝     ██║   ██║   ██║ \n"
						+ "╚██████╔╝    ╚██████╔╝███████╗██║  ██║╚██████╔╝    ███████║███████╗╚██████╗██║  ██║███████╗   ██║   ╚██████╔╝ \n"
						+ " ╚═════╝      ╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝     ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝    ╚═════╝\u001B[0m");

		System.out.println();
		imprimir("Ethan Blackwood: Já verifiquei quase todos os documentos, parece que não tem nada nesse lugar.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Pera aí, aqui tem mais um. Parece que esse é o último documento, mas calma, acho que tem algo escrito nele.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		String documento;

		do {
			imprimir( "Você encontrou um documento. Deseja ler? (Sim/Não)",TimeUnit.MILLISECONDS, tempo_transicao);
			documento = input.next();

			if (documento.equals("Sim") || documento.equals("sim")) {
				imprimir("Você resolveu ler o documento!!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);

			} else if (documento.equals("Não") || documento.equals("não")) {

				while (!(documento.equals("Sim") || documento.equals("sim"))) {
					imprimir("Você escolheu não ler o documento. Deseja reconsiderar? (Sim/Não)\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
					documento = input.next();
				}
				imprimir("Você resolveu ler o documento!!.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			} else {
				imprimir("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			}
		} while (!(documento.equals("Sim") || documento.equals("sim")));
		
		
		imprimir("No documento estava escrito algumas informações sobre seus pais e uma organização secreta que pertencia a eles conhecida como \"O Olho Secreto\".\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Uma organização secreta obscura, especializada em segurança nacional liderada pelo seus pais que aparentemente foram vítimas de uma traição dentro da própria organização.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("A revelaçào acaba sendo desvastadora para Ethan , o que acaba fazendo com que  ele ficasse muito confuso e devastado com tudo que ele tinha lido no documento. Ethan se vê diante de um dilema cruel.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ethan Blackwood: Será que realmente devo seguir em frente com minha vida e tentar esquecer tudo isso ou devo continuar procurando a verdade sobre a morte do meus pais e sobre essa organização chamada O Olho Secreto.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		System.out.println();

		
		int caminho = 0;
		
		while (caminho != 2) {
			imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
            imprimir("1 - Seguir em frente com sua vida e ignorar tudo que você tenha lido\n",TimeUnit.MILLISECONDS, tempo_transicao);
            imprimir("2 - Embarcar em uma jornada perigosa para desvendar a verdade sobre seus pais e a organização obscura à qual eles pertenciam.\n",TimeUnit.MILLISECONDS,tempo_transicao);

            if (input.hasNextInt()) {
                caminho = input.nextInt();
                if (caminho == 1) {
                    imprimir("\nVocê decidiu seguir em frente com sua vida e ignorar tudo que você leu. Mas será que essa é realmente uma boa decisão??\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else if (caminho == 2) {
                    imprimir("\nVocê escolheu embarcar em uma jornada perigosa em busca da verdade sobre seus pais e essa organização obscura a qual eles fizeram parte.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    
                    imprimir("Sua sede de justiça e a busca por respostas o impulsionam a seguir em frente. Você decide infiltrar-se no Olho Secreto e desvendar seus segredos e descobrir quem foi o responsável pela morte de seus pais.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                    imprimir("A missão vai ser árdua e repleta de perigos, mas você está determinado a fazer o que for preciso para obter justiça e honrar a memória de seus pais.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    imprimir("\nOpção inválida. Por favor, escolha apenas [1] ou [2]:\n",TimeUnit.MILLISECONDS, tempo_transicao);
                }
                } else {
                imprimir("\nOpção inválida. Por favor, escolha apenas [1] ou [2]:\n",TimeUnit.MILLISECONDS, tempo_transicao);
                input.next(); 
            }
        }

		imprimir("Ethan Blackwood: Preciso continuar não posso desistir agora, preciso encontrar alguns equipamentos se eu quiser me enfiltrar na organização, lembro de ter passado por uma loja enquanto interrogava alguns informamantes.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Aquele local era obscuro, é cheio de criminosos,bandidos,guangues preciso tomar cuidado, lembro que esse local ficava escondido em Sin City.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Algumas horas depois...\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ethan Blackwood: Finalmente cheguei. Esse lugar é sujo, as pessoas não param de encarar e as paredes estào cheias de rachaduras, se eu me lembro a loja está proxima.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood continua caminhando até chegar na loja, entra e encontra um senhor barbudo e careca. Na mesma hora o vendedor pegunta para Ethan Blackwood.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Vendedor: Bem Vindo rapaz. O que você procura?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		int escolha = 0;

		do {
			imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("1 - Responder ao vendedor que está procurando equipamentos e roupas.\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("2 - Perguntar o nome do vendedor.\n",TimeUnit.MILLISECONDS, tempo_transicao);

			if (input.hasNextInt()) {
				escolha = input.nextInt();
				if (escolha == 1 || escolha == 2) {
					switch (escolha) {
					case 1:
						imprimir("\nEthan Blackwood: Estou procurando alguns equipamentos e roupas. Vou precisar para uma missão.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						break;
					case 2:
						imprimir("\nEthan Blackwood: Posso saber qual o seu nome?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Vendedor: Pode sim, mas rapaz, vejo que você não é desse lugar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Ethan Blackwood: Como você sabe dessa informação?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Vendedor: Você não parece ter a aparência de um criminoso.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Ethan Blackwood: Eu realmente não faço parte desse lugar obscuro e sujo, só estou de passagem.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Vendedor: Hahahaha! Bom, não tenho interesse em saber quais são seus motivos para você estar visitando esse lugar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Vendedor: O pessoal por aqui me chama de Victor.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						imprimir("Ethan Blackwood: Estou procurando alguns equipamentos e roupas, preciso desses equipamentos para uma missão.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						break;
					}
				} else {
					imprimir("\nOpção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				}
			} else {
				imprimir("\nOpção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				input.next();
			}
		} while (escolha != 1 && escolha != 2);
		

		imprimir("Vendedor: Você está na loja certa tenho alguma roupas e equipamentos do que você precisa.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Vou precisar de um traje apropriado, uma máscara, uma identidade falsa e uma arma.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Vendedor: Vou providenciar para você, espere um pouco... Aqui está tudo o que você pediu, era isso que você precisava?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Sim está tudo certo, pode ficar com o troco.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Vendedor: Tome cuidado e vê se não morre em sua missão, afinal me preocupo com meus clientes.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Você se preocupa é com o dinheiro, mas espero que eu não tenha que voltar para esse lugar denovo.\n",TimeUnit.MILLISECONDS,tempo_dialogo);
		imprimir("Vendedor: Hahahaha, tome cuidado.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan sai pela porta e diz:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan Blackwood: Bom acho posso ir até o Olho Secreto, espero que eu consiga descobrir toda a verdade.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		// Enigma 2: O Código Secreto:

		imprimir("Você chega até a base do olho secreto e consegue se infiltrar na base sem ser visto pelos guardas.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ao se infiltrar na base você se depara com um computador protegido por um código complexo que proteje a entrada da organização.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("O acesso a porta está bloqueado e tudo depende da decifração do código, que parece ser um criptograma elaborado.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Qual é o resultado de 2^3 * 2^2 ?\n",TimeUnit.MILLISECONDS, tempo_transicao);
		
		input.nextLine();
	      
        String[] respostas = {
            "2^5",  // Resposta correta
            "2^6",
            "2^4",
            "2^7"
        };

        String[] letras = {"A", "B", "C", "D"};

        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            
            
            System.out.println();
            imprimir("Digite a letra da resposta correta: ",TimeUnit.MILLISECONDS, tempo_transicao);
            
            String resposta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("2^5")) {
                imprimir("Você conseguiu destravar a porta!",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    imprimir("Codigo Invalido, tente novamente. Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    imprimir("Você perdeu todas as suas vidas. Fim de jogo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    menu();
                }
            }
        }

	}

	// Função responsável por iniciar o TERCEIRO capitúlo.
	static void buscarVerdade() throws Exception {
		imprimir("\n\nCapitulo 3:\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
		
		System.out.println(
			    "\u001B[33m███████╗███╗   ███╗    ██████╗ ██╗   ██╗███████╗ ██████╗ █████╗     ██████╗  █████╗     ██╗   ██╗███████╗██████╗ ██████╗  █████╗ ██████╗ ███████╗\n"
						+ "██╔════╝████╗ ████║    ██╔══██╗██║   ██║██╔════╝██╔════╝██╔══██╗    ██╔══██╗██╔══██╗    ██║   ██║██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝\n"
						+ "█████╗  ██╔████╔██║    ██████╔╝██║   ██║███████╗██║     ███████║    ██║  ██║███████║    ██║   ██║█████╗  ██████╔╝██║  ██║███████║██║  ██║█████╗  \n"
						+ "██╔══╝  ██║╚██╔╝██║    ██╔══██╗██║   ██║╚════██║██║     ██╔══██║    ██║  ██║██╔══██║    ╚██╗ ██╔╝██╔══╝  ██╔══██╗██║  ██║██╔══██║██║  ██║██╔══╝  \n"
						+ "███████╗██║ ╚═╝ ██║    ██████╔╝╚██████╔╝███████║╚██████╗██║  ██║    ██████╔╝██║  ██║     ╚████╔╝ ███████╗██║  ██║██████╔╝██║  ██║██████╔╝███████╗\n"
						+ "╚══════╝╚═╝     ╚═╝    ╚═════╝  ╚═════╝ ╚══════╝ ╚═════╝╚═╝  ╚═╝    ╚═════╝ ╚═╝  ╚═╝      ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝\u001B[0m\n");

		imprimir("Através de sua inteligência e perspicácia, você consegue se infiltra dentro do Olho Secreto.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ethan Blackwood: Esses corredores parecem gigantes, preciso me esconder não posso deixar que os guardas me vejam.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Preciso dar um jeito de passar por esses dois guardas, sem chamar atenção.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Você pega sua arma e resolve atirar nos dois guardas, você estava um pouco nevorso e sua mira não estava muito boa.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

//			Conta para acerta os guardas

		imprimir("Para disparar resolva a equação: (3^2)^2.\n",TimeUnit.MILLISECONDS, tempo_transicao);
	      
        String[] respostas = {
            "196",  // Resposta correta
            "729",
            "512",
            "821"
        };

        String[] letras = {"A", "B", "C", "D"};
        
        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            System.out.println();
            imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String resposta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("729")) {
                imprimir("Você acertou! Você matou os dois guardas com dois tiros.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    imprimir("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida. Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    imprimir("Você perdeu todas as suas vidas. Fim de jogo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    menu();
                }
            }
        }

		imprimir("Ethan Blackwood: Finalmente consegui matar os dois guardas, não posso parar agora preciso continuar seguindo em frente.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Parece quem tem alguém ali na frente, mas essa pessoa parece diferente.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Essa pessoa não se parece com nehum guarda que eu tenha visto, será que ele é uma pessoa da organização?.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Ele parece estar se aproximando.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Olhando para o homem Ethan disse:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ethan Blackwood: FIQUE PARADO ONDE ESTÁ SE NÃO EU ATIRO!!!!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Se acalme meu jovem não precisa apontar essa arma para mim, não irei te machucar, me chamo Magnus Montgomery.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: O que você faz aqui dentro, como posso saber se você não é nenhum inimigo ou alguém que faz parte do olho secreto.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Não precisa se preocupar, se eu fosse algum inimigo eu já teria te atacado, poderia abaixar a sua arma.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		
		int escolha = 0;

		do {
			imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("1 - Abaixar a arma e perguntar para Magnus o que ele estava fazendo naquele lugar.\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("2 - Continuar com a arma apontada e ameaçar Magnus a falar o que ele estava fazendo naquele lugar.\n",TimeUnit.MILLISECONDS, tempo_transicao);

			if (input.hasNextInt()) {
				escolha = input.nextInt();
			if (escolha == 1 || escolha == 2) {
				switch (escolha) {
				case 1:
					imprimir("\nEthan Blackwood: Faz sentido, o que você está fazendo nesse lugar? Por que você está aqui sozinho?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
					break;
				case 2:
					imprimir("\nEthan Blackwood: NÃO IREI ABAIXAR MINHA ARMA, COMO POSSO CONFIAR EM ALGUÉM DENTRO DESSE LUGAR?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
			        imprimir("Magnus Montgomery: Ok então meu rapaz, como posso fazer para você acreditar em mim?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
			        imprimir("Ethan Blackwood: Me fale o que você está fazendo nesse lugar sozinho.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
					break;
					}
				} else {
					imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				}
			} else {
				imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				input.next();
			}
		} while (escolha != 1 && escolha != 2);
		
	
		imprimir("Magnus Montgomery: Estou investigando essa organização já faz algum tempo, mas só agora consegui invadi-la, eles mataram alguém que eu amava, então quero leva-los a ruina.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Tudo bem, irei abaixar minha arma. Vou acreditar em você. Me chamo Ethan Blackwood, estou investigando a organização para descobrir quem foi responsável pela morte dos meus pais.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Eles faziam parte da organização, e a única pista que tenho é uma mensagem com o nome \"AURORA SINCLAIR\" que encontrei. Por isso, estou investigando este local.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Já que você está investigando a organização, posso te ajudar Ethan . Quem sabe a gente possa encontrar os responsáveis pela morte de seus pais.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Ok, eu aceito sua ajuda.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Os dois caminham pelos corredores e descobrem uma sala. Dentro dessa sala, eles encontram alguns quadros, documentos e algumas fotos.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ethan percebe que em uma das fotos há a imagem de seus pais. Então, na mesma hora o vem lembraças. Ele se lembra das risadas de sua mãe e da voz de seu pai.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Magnus Montgomery: Você está bem, Ethan?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Estou sim, apenas lembrei dos meus pais. Sinto falta deles, mas não posso me isso deixar distrair.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Vamos continuar investigando. Talvez a gente encontre alguma informação que possa nos ajudar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Olha só, falei que se continuássemos procurando acharíamos algo.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Encontrei uma gaveta. Dentro dela está cheio de papéis e documentos.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Espera........\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Acho que encontrei algo entre os documentos, parece ser um tipo de mensagem está cheia de números, mas está difícil de decifrar.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

//		Enigma 3: A Mensagem Oculta
	
        imprimir("Para decifrar resolva a seguinte questão. Considere o monômio 2x e o polinômio 3x^2 + 4x - 5.\n",TimeUnit.MILLISECONDS, tempo_transicao);
        imprimir("Qual é o resultado da multiplicação desse monômio pelo polinômio?\n",TimeUnit.MILLISECONDS, tempo_transicao);

        Scanner scanner = new Scanner(System.in);
        
        String[] respostas2 = {
            "6x^3 + 8x^2 - 10x",  // Resposta correta
            "6x^3 + 8x",
            "5x^3 + 6x^2 - 8x",
            "6x^2 + 8x - 5"
        };

        String[] letras2 = {"A", "B", "C", "D"};

        vidas = 3;
        boolean respostaCorreta2 = false;
        while (!respostaCorreta2) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas2.length; i++) {
                int j = random.nextInt(respostas2.length);
                String temp = respostas2[i];
                respostas2[i] = respostas2[j];
                respostas2[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas2.length; i++) {
                imprimir(letras2[i] + ") " + respostas2[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }
            

            System.out.println();
            imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String resposta = scanner.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas2[indexResposta].equals("6x^3 + 8x^2 - 10x")) {
                imprimir("Você conseguiu decifrar o código!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta2 = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    imprimir("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida. Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    imprimir("Você perdeu todas as suas vidas. Fim de jogo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    menu();
                }
            }
        }

		
		imprimir("Magnus Montgomery: Você conseguiu decifrar o codigo Ethan. O que está escrito no documento?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir(
				"Ethan Blackwood: A mensagem parece ser uma citação de um poema, mas inda não sei sua ligaçào com o nome \"AURORA\", o poema está escrito com as seguintes palavras:\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Em uma terra distante, de passado velado,\n" + "Jaz uma propriedade, outrora iluminada.\n"
				+ "Erguida em segredo, nos confins do oculto,\n" + "Onde mistérios e sombras teciam o seu vulto.\n\n" +

				"Ali repousava, oculta aos olhos comuns,\n" + "A propriedade do Olho Secreto, guardiã dos rumos.\n"
				+ "Um casarão antigo, em ruínas envolto,\n" + "Onde segredos se ocultavam em cada recanto.\n\n" +

				"Nos corredores, ecoavam histórias sombrias,\n" + "De tempos idos, de uma era esquecida.\n"
				+ "Nas paredes, retratos de rostos desconhecidos,\n" + "Testemunhas mudas de mistérios escondidos.\n\n"
				+

				"Entre os escombros, sussurros do passado ecoam,\n" + "Lembranças de uma época em que o medo voava.\n"
				+ "A propriedade, outrora poderosa e temida,\n" + "Agora jaz em silêncio, em sua própria partida.\n\n" +

				"Em uma terra distante, onde a luz mal alcança,\n" + "Ergue-se a propriedade em silêncio e esperança.\n"
				+ "Nos confins do mundo, em um recanto esquecido,\n"
				+ "Lá repousa o segredo, em um lugar escondido.\n\n" +

				"Entre vales profundos e montanhas isoladas,\n" + "Nas margens de um rio onde a névoa é prateada,\n"
				+ "Encontra-se a morada, em seu local isolado,\n" + "Onde o Olho Secreto foi outrora aclamado.\n\n" +

				"Mas além das colinas e além do horizonte,\n" + "Existe uma pista, um sussurro que confronte.\n"
				+ "Através de uma foto, revela-se o mistério,\n" + "A localização da propriedade, um enigma sério.\n\n"
				+

				"Pois quem souber decifrar a imagem ancestral,\n" + "Encontrará a propriedade, além do temporal.\n"
				+ "Em uma terra esquecida, em um lugar remoto,\n"
				+ "Onde o Olho Secreto repousa, em seu sagrado loto.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Magnus Montgomery: Calma ai, lembro de ter visto a foto de uma casa em cima da mesa, vou pegar para você!!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Está vendo, parece ser a propriedade que o poema cita, talvez ela tenha relação com a organização.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Sim, parerece que esta propriedade está ligada a organização, mas não consigo identificar a localização dela.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery:HMMMMMMM.....\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery:Lembrei de algo, quando estava investigando a organização. Lembro de ter ouvido algo sobre uma propriedade abandonada no sul de Sin City.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: O que você acha da gente dá uma olhada nessa propriedade?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		
		int opcao = 0;

        do {
            imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
            imprimir("1 - Ir verificar propriedade que o Magnus mencionou.\n",TimeUnit.MILLISECONDS, tempo_transicao);
            imprimir("2 - Verificar se tem alguma outra pista na sala.\n",TimeUnit.MILLISECONDS, tempo_transicao);

            // Verifica se o próximo token de entrada é um inteiro
            if (input.hasNextInt()) {
                opcao = input.nextInt();
                if (opcao == 1 || opcao == 2) {
                    switch (opcao) {
                        case 1:
                            imprimir("\nEthan Blackwood: Vamos, talvez a gente encontre alguma coisa nessa propriedade.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            
                            break;
                        case 2:
                            imprimir("Ethan Blackwood: Acho que a gente deveria dar mais uma olhada nessa sala, talvez tenha mais alguma coisa por aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            imprimir("Magnus Montgomery: Ok, vou dar mais uma olhada por aqui, por que você não verifica aqueles quadros ali na parede?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            imprimir("Ethan Blackwood: Já olhei esses quadros e não achei nada!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            imprimir("Magnus Montgomery: Na verdade também não encontrei nada no restante da sala, acho que a gente não deveria perder mais tempo, vamos até essa propriedade.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            imprimir("Ethan Blackwood: Acho uma boa ideia, vamos!!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            break;
                    }
                } else {
                    imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
                }
            } else {
                // Limpa o buffer de entrada antes de continuar
                imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
                input.next(); // Isso limpará o token inválido do scanner
            }
        } while (opcao != 1 && opcao != 2);
		
		
	}
	

//	  Função responsável por iniciar o QUARTO capitúlo.

	static void alianca() throws Exception {

		imprimir("\n\nCapitulo 4:\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
		System.out.println(
			    "\u001B[33m██╗   ██╗███╗   ███╗     █████╗ ██╗     ██╗ █████╗ ██████╗  ██████╗     ██╗███╗   ██╗███████╗███████╗██████╗ ███████╗██████╗  █████╗ ██████╗  ██████╗ \n"
						+ "██║   ██║████╗ ████║    ██╔══██╗██║     ██║██╔══██╗██╔══██╗██╔═══██╗    ██║████╗  ██║██╔════╝██╔════╝██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔═══██╗\n"
						+ "██║   ██║██╔████╔██║    ███████║██║     ██║███████║██║  ██║██║   ██║    ██║██╔██╗ ██║█████╗  ███████╗██████╔╝█████╗  ██████╔╝███████║██║  ██║██║   ██║\n"
						+ "██║   ██║██║╚██╔╝██║    ██╔══██║██║     ██║██╔══██║██║  ██║██║   ██║    ██║██║╚██╗██║██╔══╝  ╚════██║██╔═══╝ ██╔══╝  ██╔══██╗██╔══██║██║  ██║██║   ██║\n"
						+ "╚██████╔╝██║ ╚═╝ ██║    ██║  ██║███████╗██║██║  ██║██████╔╝╚██████╔╝    ██║██║ ╚████║███████╗███████║██║     ███████╗██║  ██║██║  ██║██████╔╝╚██████╔╝\n"
						+ " ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝     ╚═╝╚═╝  ╚═══╝╚══════╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝\u001B[0m \n");

		imprimir("Algumas horas depois....\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Magnus Montgomery: Chegamos a propriedade, ela fica logo ali na frente, acho melhor a gente ir caminhando.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Tem certeza que essa propriedade pertencia a organização? Ela parece abandonada!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Ela pode aparentar abandonada por fora, mas ainda pode ter alguma coisa nela que nos ajude a descobrir algo sobre O Olho Secreto.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Olha o estado desse portão. Ele parece enferrujado, parece não ter nenhum tipo de alarme ou cadeado nele, vou tentar abrir o portão.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Tome cuidado Ethan pode ser uma armadilha!!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		int verificar;
        String resposta;

        do {
            imprimir("1 - Abrir o portão e entrar na propriedade abandonada\n",TimeUnit.MILLISECONDS, tempo_transicao);
            imprimir("2 - Verificar se possui alguma armadilha.\n",TimeUnit.MILLISECONDS, tempo_transicao);

            while (!input.hasNextInt()) {
                imprimir("Por favor, insira um número válido:\n",TimeUnit.MILLISECONDS, tempo_transicao);
                input.next(); 
            }
            verificar = input.nextInt();
            input.nextLine(); 

            if (verificar == 1) {
                imprimir("\nEthan Blackwood: Parece que não tem nenhum tipo de armadilha, acho que ela está realmente abandonada.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                
            } else if (verificar == 2) {
                imprimir("\nEthan Blackwood: Acho melhor a gente verificar se não possui algum tipo de armadilha.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                imprimir("Magnus Montgomery: Vou dar uma olhada nos fundos da casa e você olha em volta dela.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                imprimir("Ethan Blackwood: Tudo bem, a gente se encontra aqui de novo quando acabarmos de verificar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                imprimir("Você caminha em volta da propriedade abandonada mas não encontra nada.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                imprimir("Então você resolve voltar até a entrada da casa e aguardar.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                imprimir("Magnus Montgomery: Ethan, verifiquei nos fundos e não encontrei nada. Você encontrou alguma coisa?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

                do {
                    imprimir("Responda \"Não\":",TimeUnit.MILLISECONDS, tempo_transicao);
                    resposta = input.nextLine().trim().toLowerCase();

                    if (resposta.equals("não")) {
                        imprimir("\nEthan Blackwood: Não, não encontrei nada.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                    } else {
                        imprimir("\nResposta inválida. Por favor, responda apenas 'não' para responder a pergunta.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    }
                } while (!resposta.equals("não"));

            } else {
                imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

        } while (verificar != 1 && verificar != 2);

		imprimir("Magnus Montgomery: Vamos entrar, mas fique atento mesmo assim, não sabemos o que podemos encontrar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Parece que a porta está aberta também, acho que não tem ninguém.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: vamos ver se encontramos alguma pista. Talvez tenha algo que nos ajude.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Por onde você gostaria de começar a procurar?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		boolean salaVerificada = false;
	    boolean quartosVerificados = false;
	    boolean bibliotecaVerificada = false;

	    int pista;

	    while (!salaVerificada || !quartosVerificados || !bibliotecaVerificada) {
	        if (!salaVerificada) {
	            imprimir("1 - Verificar a sala.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }
	        if (!quartosVerificados) {
	            imprimir("2 - Verificar os quartos.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }
	        if (!bibliotecaVerificada) {
	            imprimir("3 - Verificar a biblioteca.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }

	        while (!input.hasNextInt()) {
	            imprimir("Por favor, insira um número válido:\n", TimeUnit.MILLISECONDS, tempo_transicao);
	            input.next();
	        }
	        pista = input.nextInt();
	        input.nextLine();

	        if (pista == 1 && !salaVerificada) {
	            salaVerificada = true;
	            imprimir("\nEthan Blackwood: Vamos verificar a sala.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: Boa ideia. A sala pode conter alguma pista sobre quem esteve aqui recentemente.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Ethan Blackwood: Vou checar perto da lareira, você pode dar uma olhada nos armários.\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Você procura perto da lareira mas não encontra nada!!\n\n", TimeUnit.MILLISECONDS, tempo_transicao);
	            imprimir("Ethan Blackwood: Você encontrou alguma coisa?\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: Não encontrei nada também, o que você acha da gente verificar os outros cômodos da casa?\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);

	        } else if (pista == 2 && !quartosVerificados) {
	            quartosVerificados = true;
	            imprimir("\nEthan Blackwood: vamos verificar os quartos.\n", TimeUnit.MILLISECONDS,tempo_dialogo);
	            imprimir("Magnus Montgomery: Boa escolha, os quartos podem ter itens pessoais ou documentos.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Ethan Blackwood: Eu vou começar pelo quarto principal, você pode ver o quarto de hóspedes.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: Combinado. Mantenha os olhos abertos para qualquer coisa fora do comum.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Você verifica o quarto principal mas não encontra nada!!\n", TimeUnit.MILLISECONDS, tempo_transicao);
	            imprimir("Magnus Montgomery: Parece que não tivemos sorte dessa vez, não encontramos nada.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: O que você acha da gente ir verificar os outros cômodos da casa?.\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);

	        } else if (pista == 3 && !bibliotecaVerificada) {
	            bibliotecaVerificada = true;
	            imprimir("\nEthan Blackwood: Vamos verificar a biblioteca.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: A biblioteca pode ter registros importantes ou diários.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Ethan Blackwood: Vou olhar nas prateleiras do fundo, você pode ver a mesa de leitura?\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: Sim, vou ver se encontro algum livro ou documento relevante.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Ethan Blackwood: Estranho esse livro parece ser diferente dos outros, vou dar uma olhada.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Ethan Blackwood: Magnus, vem ver isso, acho que encontrei algo. Puxei este livro e essa porta com senha apareceu.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            imprimir("Magnus Montgomery: Essa porta parece ter algum tipo de trava com uma senha, você acha que consegue destravar descobrindo a senha?\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            break; // Saímos do loop ao escolher a biblioteca

	        } else {
	            imprimir("Opção inválida ou já escolhida. Por favor, escolha uma das opções disponíveis.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }
	    }

//        Enigma 4: A Prova Final	
        

        imprimir("Resolva a equação do segundo grau x^2 - 3x + 2 = 0 para destravar a porta. Qual é o valor de x?\n",TimeUnit.MILLISECONDS, tempo_transicao);
        

        String[] respostas = {
            "-3 e x = -2",  // Resposta correta
            "1 e x = 3",
            "-2 e x = 1",
            "2 e x = -1"
        };

        String[] letras = {"A", "B", "C", "D"};

        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            System.out.println();
            imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String respostaConta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (respostaConta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("-2 e x = 1")) {
                imprimir("\nAcesso liberado! Sistema destravado.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    imprimir("Código inválido! Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    imprimir("Você perdeu todas as suas vidas. Fim de jogo.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    menu();
                }
            }
        }

		imprimir("Pratileira: CRRRRREEEEAAAKKKK... THUD!\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Magnus Montgomery: Parece que encontramos uma passagem secreta.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Devemos descer e ver onde leva?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Com certeza. Vamos descobrir o que estão escondendo aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Fique atento. Não sabemos o que podemos encontrar lá embaixo.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Esse lugar parece realmente abandonado...\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Parece que chegamos!",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Olha para esse lugar parece que realmente eles estiveram por aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Ethan, venha ver isso aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Não consigo acreditar no que estou vendo, parece que é um plano para acabar com todos os antigos agentes da organização.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Realmente, e parace que eles conseguiram eliminar quase todos.\n",TimeUnit.MILLISECONDS,tempo_dialogo);
		imprimir("Magnus Montgomery: Não consigo acreditar que eles estavam planejando fazer isso.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Espere, ali tem alguns papéis!!.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: E olha, em baixo desses papeis, parece ser uma foto de uma mulher!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Atrás da foto está escrito algo, parece ser um suposto endereço e um nome, mas não consigo reconhecer nada do que está escrito parece estar escrito em outro idioma.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Posso dar uma olhada nessa foto?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		String foto;

		do {
			imprimir("Mostrar a foto para o Magnus Montgomery? - (Sim)",TimeUnit.MILLISECONDS, tempo_narrativa);
			foto = input.next();

			if (foto.equalsIgnoreCase("Sim")) {
				imprimir("\nVocê resolveu mostrar a foto para o Magnus.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
			} else if (!foto.equalsIgnoreCase("Nao")) {
				imprimir("Resposta inválida. Por favor, digite 'Sim' ou 'Nao'.\n",TimeUnit.MILLISECONDS, tempo_transicao);
			}
		} while (!foto.equalsIgnoreCase("Sim"));

		imprimir("Magnus Montgomery: O nome que está escrito parece se chamar \"Aurora Sinclar\" e esse endereço parece ser de um templo budista no Himalaia.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Será que essa mulher é a tal Aurora? Para ter certeza precisamos ir verificar o mais rapido possivel se realmente é ela.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Esse templo fica longe de Sin City, mas o que você acha da gente ir agora checar?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Acho uma boa ideia, vamos sim!\n",TimeUnit.MILLISECONDS, tempo_dialogo);

	}

//	  Função responsável por iniciar o QUINTO capitúlo.

	static void encontrarAurora() throws Exception {
		imprimir("\n\nCapitulo 5: \n\n",TimeUnit.MILLISECONDS, 1);
				System.out.println( 
						  " \u001B[33m█████╗          ██╗ ██████╗ ██████╗ ███╗   ██╗ █████╗ ██████╗  █████╗     ██████╗  █████╗ ██████╗  █████╗     ███████╗███╗   ██╗ ██████╗ ██████╗ ███╗   ██╗████████╗██████╗  █████╗ ██████╗ \n"
							       +"██╔══██╗         ██║██╔═══██╗██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗██╔══██╗    ██╔════╝████╗  ██║██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗\n"
							       +"███████║         ██║██║   ██║██████╔╝██╔██╗ ██║███████║██║  ██║███████║    ██████╔╝███████║██████╔╝███████║    █████╗  ██╔██╗ ██║██║     ██║   ██║██╔██╗ ██║   ██║   ██████╔╝███████║██████╔╝\n"
							       +"██╔══██║    ██   ██║██║   ██║██╔══██╗██║╚██╗██║██╔══██║██║  ██║██╔══██║    ██╔═══╝ ██╔══██║██╔══██╗██╔══██║    ██╔══╝  ██║╚██╗██║██║     ██║   ██║██║╚██╗██║   ██║   ██╔══██╗██╔══██║██╔══██╗\n"
							       +"██║  ██║    ╚█████╔╝╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝██║  ██║    ██║     ██║  ██║██║  ██║██║  ██║    ███████╗██║ ╚████║╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║  ██║██║  ██║██║  ██║\n"
							       +"╚═╝  ╚═╝     ╚════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═══╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝\n"

						 		   +" █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗     ███████╗██╗███╗   ██╗ ██████╗██╗      █████╗ ██╗██████╗ \n"
							       +"██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗    ██╔════╝██║████╗  ██║██╔════╝██║     ██╔══██╗██║██╔══██╗\n"
							       +"███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║    ███████╗██║██╔██╗ ██║██║     ██║     ███████║██║██████╔╝\n"
							       +"██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║    ╚════██║██║██║╚██╗██║██║     ██║     ██╔══██║██║██╔══██╗\n"
							       +"██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║    ███████║██║██║ ╚████║╚██████╗███████╗██║  ██║██║██║  ██║\n"
							       +"╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝\u001B[0m\n");

		imprimir(
				"A jornada ao Himalaia é árdua e repleta de perigos. Eles enfrentam tempestades de neve, avalanches e animais selvagens, por todo o caminho.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir(
				"Finalmete após semanas de viagem, eles chegam ao templo budista, um santuário pacífico escondido entre as montanhas.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Ethan Blackwood: Até que enfim chegamos Magnus, essa viagem foi longa.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir(
				"Magnus Montgomery: Concordo com você Ethan, mas o importante é que chegamos. Agora vamos ver se achamos essa tal Aurora Sinclair!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Ethan Blackwood: Sim Magnus chegamos, mas você vê alguma passagem até o templo ?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Não, não vejo, vamos procurar ?",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Sim, vamos!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Digite a resposta correta para achar a entrada do templo.",TimeUnit.MILLISECONDS, tempo_transicao);
		
		imprimir(" Resolva a seguinte equação do segundo grau: 2x^2 - 5x + 3 = 0.\n",TimeUnit.MILLISECONDS, tempo_transicao);
        

        String[] respostas = {
            "x1 = 3/2 e x2 = 1",  // Resposta correta
            "x1 = 5/2 e x2 = -1",
            "x1 = 1/2 e x2 = 3",
            "x1 = -1 e x2 = 3/2"
        };

        String[] letras = {"A", "B", "C", "D"};

        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            System.out.println();
            imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String respostaConta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (respostaConta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("x1 = 3/2 e x2 = 1")) {
                imprimir("\nEthan Blackwood: Achei uma passagem que leva até a entrada Magnus!.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    imprimir("\nMagnus Montgomery: Caminho errado acho que não é por aqui! Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    imprimir("\nEthan e Magnus se perderam! Você perdeu todas as suas vidas. Fim de jogo.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                    menu();
                }
            }
        }
		
		 
		imprimir("Ao adentrar no templo, Magnus e Ethan se deparam com um monge, que no mesmo momento os perguntam o que estão fazendo lá:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Monge: Olá o que trazem vocês aqui?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Oi monge, tudo bem? Estamos procurando uma mulher chamada Aurora Sinclair.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Magnus Montgomery: Sim, isso mesmo.\n",TimeUnit.MILLISECONDS, 1);
		imprimir("Ethan Blackwood: Você por algum acaso conhece alguém que veio ou esteja aqui com esse nome?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		imprimir("Muito tempo atrás, ao Aurora chegar no templo pedindo refugio ao monge, ela pediu para que nunca dissesse que a\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("mesma estava lá, pois tinham pessoas à procurando e querendo sua morte. Então quando Ethan Blackwood perguntou sobre ela, o monge disse:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Monge: Não, nunca veio ninguém aqui com esse nome!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Tem certeza senhor?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Monge: Sim, tenho muito certeza!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Monge: Mas qual o seu nome Jovem?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Meu nome é Ethan Blackwood e o dele é Magnus Montgomery.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		imprimir("Mal eles sabiam que Aurora estava o tempo todo escutando a conversa, mas ja estava planejando sair quando escuto o nome de Ethan. Na mesma hora ela o reconheceu.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ficou na dúvida se parava de escutar a conversa e iria se revelar para Ethan Blackwood ou se deixava tudo como estava. Depois de tanta agonia, ela resolveu ir falar com ele:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Aurora Sinclair: Sim Ethan estou aqui!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Blackwood: Quem é você? Não me diga que é Aurora.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Aurora Sinclair: Sim, sou eu mesma e já até sei o motivo de você estar aqui.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		imprimir("Aurora revela sua história. Ela confirma que foi traída por um membro chamado Viktor Delacroix de alto escalão de \"O Olho Secreto\" e coagida a\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("participar da morte dos pais de Ethan. No entanto, ela alega que não agiu por maldade, mas sob ameaça de morte dela\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("e de pessoas próximas. Consumida pelo remorso, fugiu da organização e buscou refúgio no templo, buscando redenção por seus atos.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Diante da confissão de Aurora, Ethan se vê diante de uma escolha crucial:\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("1 - Perdoar Aurora: Reconhecer a complexidade da situação e aceitar seu arrependimento.\n",TimeUnit.MILLISECONDS, tempo_transicao);
		imprimir("2 - Buscar Vingança: Consumir-se pela raiva e punir Aurora pelos seus crimes.\n",TimeUnit.MILLISECONDS, tempo_transicao);
		imprimir("3 - Uma Nova Jornada: Após saber sobre toda a verdade, decide honrar seus pais e seguir com seus passos, reabrindo a agência \"O Olho Secreto\". \n\n",TimeUnit.MILLISECONDS, tempo_transicao);

		imprimir("Qual será sua escolha ?\n",TimeUnit.MILLISECONDS, tempo_transicao);
		int escolha = input.nextInt();

		switch (escolha) {

		case 1:
			imprimir("\nVocê escolheu Perdoar Aurora.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			perdoarAuroraFinal();
			break;
		case 2:
			imprimir("\nVocê escolheu Buscar Vingança.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			buscarVingancaFinal();
			break;
		case 3:
			imprimir("\nVocê escolheu Uma Nova Jornada.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			umaNovaJornadaFinal();
			break;
		default:
			imprimir("\nOpção inválida. Tente novamente!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			break;
		}
		

	}

	public static void perdoarAuroraFinal() throws Exception {
		imprimir("Com os primeiros raios de sol iluminando o jardim zen do templo budista, Ethan Blackwood olha profundamente nos olhos de Aurora.\n"
				+ "A tensão é palpável, mas há algo mais – um entendimento silencioso. Ele respira fundo, sentindo o peso da decisão iminente. Após um momento \nque parece eterno, ele finalmente fala:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan Blackwood: Eu te perdoo, Aurora.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Essas palavras, simples mas poderosas, ecoam pelo jardim. Aurora, com lágrimas nos olhos, ajoelha-sediante de Ethan Blackwood,a gratidão \n"
				+ "e o alívio transbordando de sua expressão. O monge ancião, observando de perto, sorri serenamente, como se já soubesse que essa seria a escolha.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Aurora Sinclair: Obrigado. Prometo que dedicarei minha vida a corrigir meus erros e ajudar a desmantelar \"O Olho Secreto\". \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("De volta a Sin City, Ethan Blackwood, Aurora Sinclair e Magnus Montgomery começam a reunir evidências contra o traidor, Viktor Delacroix. Aurora,\n"
				+ "com seu conhecimento interno, ajuda a identificar os principais apoiadores de Delacroix e os pontos fracos da organização. Eles criam uma \n"
				+ "rede de aliados confiáveis, incluindo antigos membros desiludidos de 'O Olho Secreto' e agentes de segurança locais, determinados a acabar com a corrupção.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("A operação é tensa, mas a confiança mútua e o apoio de Aurora são cruciais. Eles enfrentam agentes leais ao traidor e superam diversas armadilhas \n"
				+ "mortais. Finalmente, chegam ao coração da base, onde Delacroix está prestes a executar o plano que mataria os últimos antigos agentes.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("O confronto final é intenso, mas Delacroix é derrotado graças à combinação das habilidades de combate de Ethan Blackwood, a astúcia de Magnus Montgomery\n"
				+ "e o conhecimento interno de Aurora Sinclair. Com Delacroix neutralizado e as provas em mãos, 'O Olho Secreto' começa a ruir por dentro.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Aurora cumpre sua promessa, expondo a organização ao mundo e garantindo que suas operações nunca mais sejam realizadas nas sombras. De volta a Sin City, Ethan Blackwood\n"
				+ "visita o túmulo de seus pais, finalmente em paz. Aurora, fiel à sua palavra, abre um orfanato, oferecendo um lar seguro para crianças vulneráveis.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan Blackwood, Aurora Sinclair e Magnus Montgomery continuam suas vidas, sabendo que a luta pela verdade e pela justiça nunca termina, mas agora com um propósito renovado.\n"
				+ "O caminho do perdão trouxe não apenas justiça, mas também a chance de um novo começo, onde a escuridão do passado foi finalmente iluminada pela luz do perdão e da redenção.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		
		
		System.out.println(
			   "\u001B[33m███████╗██╗███╗   ███╗\n"
						+"██╔════╝██║████╗ ████║\n"
						+"█████╗  ██║██╔████╔██║\n"
						+"██╔══╝  ██║██║╚██╔╝██║\n"
						+"██║     ██║██║ ╚═╝ ██║\n"
						+"╚═╝     ╚═╝╚═╝     ╚═╝\u001B[0m");
		
		
		
	}

	public static void buscarVingancaFinal() throws Exception {
		
		imprimir("Aurora encara Ethan com uma expressão de desafio, seus olhos não revelando nenhum sinal de remorso, apenas uma determinação fria e diz: \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Aurora Sinclair: Sim, foi minha mão que os silenciou. Eles eram uma ameaça, um obstáculo no caminho para o poder que eu almejava.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Aurora Sinclair: Não houve hesitação quando os matei. Foi um passo necessário para garantir meu domínio sobre \"O Olho Secreto\".\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Sua confissão atinge Ethan Blackwood como um soco no estômago, deixando-o atordoado pela crueldade de suas palavras. A verdade nua\n"
		+"e crua diante dele, sem remorso, sem piedade. Ele luta para aceitar a realidade chocante diante dele, sua mente rejeitando\n"
		+ "a ideia de que alguém pudesse ser tão impiedoso.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Com um olhar feroz e determinado, Ethan avança em direção a Aurora, cujos olhos gelados encaram-no com uma serenidade perturbadora.  \n"
				+ "Na palma de sua mão, ele segura uma lâmina afiada como a própria raiva que consome seu coração, reluzindo sinistramente à luz do luar.\n"
				+ "Cada passo de Ethan ressoa no silêncio sufocante do templo, carregado de uma energia sombria e implacável.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Aurora dá um passo para trás, sua expressão impassível, mas um brilho fugaz de temor atravessa seus olhos, reconhecendo \n"
				+ "a intenção mortal de Ethan Blackwood. Ela tenta escapar, mas encontra-se encurralada contra a parede fria do templo, sem escapatória \n"
				+ "diante das sombras que se aproximam. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Sem proferir uma palavra, sem hesitação, Ethan ergue a lâmina e avança, seu rosto contorcido pela dor e pela sede de \n"
				+ "vingança. O metal cortante perfura o ar com um sibilo sinistro antes de encontrar seu alvo com uma precisão assustadora. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Um grito rasgado irrompe pelo templo quando a lâmina penetra fundo no peito de Aurora, arrancando-lhe um gemido\n"
				+ "angustiante. Ela cai de joelhos, os olhos ainda cravados nos de Ethan Blackwood, agora obscurecidos pelo choque e pela dor.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan observa em silêncio enquanto Aurora luta nos últimos momentos de sua vida, cada respiração tornando-se\n"
				+ "mais difícil, cada batida do coração mais fraca. O som do vento sussurrando pelas folhas do templo testemunhao desfecho sombrio do confronto.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Com um suspiro final, Aurora desaba no chão, seus olhos perdendo o brilho da vida enquanto a escuridão a consome. Ethan permanece\n"
				+ "de pé, seu peito pesado com a tormenta de emoções, mas uma sensação de alívio sombrio o envolve e em seguida diz:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan Blackwood: Isso foi pelos meus pais, a vida deles não foram em vão, eu os vinguei!!!!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Após assistir a vida de Aurora saindo lentamente de seu corpo, Ethan foge sem deixar rastros.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
			"\u001B[33m███████╗██╗███╗   ███╗\n"
			+"██╔════╝██║████╗ ████║\n"
			+"█████╗  ██║██╔████╔██║\n"
			+"██╔══╝  ██║██║╚██╔╝██║\n"
			+"██║     ██║██║ ╚═╝ ██║\n"
			+"╚═╝     ╚═╝╚═╝     ╚═╝\u001B[0m");
			
		}
		
	public static void umaNovaJornadaFinal() throws InterruptedException {
		imprimir("Carta: Querido Ethan, se você encontrou isso, significa que descobriu o segredo de nossa família. 'O OLho Secreto' era o nosso sonho, uma rede de agentes dedicados a proteger a cidade das sombras que a ameaçam. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Se você estiver lendo isso, saiba que acreditamos em você. Continue nosso trabalho e faça a diferença. Com amor, Mamãe e Papai \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan sente uma onda de emoções ao ler a carta. As palavras de seus pais lhe dão um novo propósito. Ele retorna à cidade com um novo objetivo: honrar o legado de sua família e continuar o trabalho que seus pais começaram.\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("Ethan decide reabrir a agência \"O Olho Secreto\", uma agência de detetives que operava secretamente na cidade. ",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ele usa os documentos e artefatos deixados por seus pais para construir uma nova base de operações. Reúne uma equipe de aliados confiáveis, pessoas que ele conheceu durante sua busca e que compartilham seu desejo de justiça \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan Blackwood: (em pé na frente de sua nova equipe, segurando o medalhão de prata) Meus pais começaram algo importante. Eles acreditavam que uma pessoa pode fazer a diferença. \n",TimeUnit.MILLISECONDS, tempo_dialogo);
		imprimir("Ethan Backwood: 'O Olho Secreto' renasce hoje, e juntos, vamos continuar esse legado. Vamos proteger a cidade e garantir que a verdade sempre prevaleça. \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Equipe: (em uníssono) Para o Olho Secreto! \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		imprimir("Ethan, agora com uma equipe dedicada ao seu lado, começa a operar a agência. Eles resolvem casos complexos, desvendam mistérios e protegem os inocentes.",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("A agência se torna um símbolo de esperança e justiça em Sin City, e o nome Blackwood volta a ser respeitado e temido pelos criminosos. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		imprimir("E assim, Ethan Blackwood honrou o legado de seus pais e encontrou seu propósito. A agência 'O Olho Secreto' renasceu, e com ela, a promessa de um futuro mais justo e seguro para Sin City. ",TimeUnit.MILLISECONDS, tempo_narrativa);
		imprimir("Ethan seguiu os passos de seus pais, mas com sua própria marca de coragem e determinação. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		imprimir("Ethan encontra paz e propósito ao continuar o trabalho de seus pais, reabrindo \"O Olho Secreto\" e dedicando sua vida a proteger a cidade e honrar o legado de sua família. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
				   "\u001B[33m███████╗██╗███╗   ███╗\n"
							+"██╔════╝██║████╗ ████║\n"
							+"█████╗  ██║██╔████╔██║\n"
							+"██╔══╝  ██║██║╚██╔╝██║\n"
							+"██║     ██║██║ ╚═╝ ██║\n"
							+"╚═╝     ╚═╝╚═╝     ╚═╝\u001B[0m");
	}

	
	// #endregion

   /*
    * Função responsável por iniciar o jogo. 
    */ 
	static void jogar() throws Exception {
		System.out.println(
	"\u001B[33m\n███████╗███████╗     ██╗ █████╗     ██████╗ ███████╗███╗   ███╗    ██╗   ██╗██╗███╗   ██╗██████╗  ██████╗      █████╗\n"    
		       +"██╔════╝██╔════╝     ██║██╔══██╗    ██╔══██╗██╔════╝████╗ ████║    ██║   ██║██║████╗  ██║██╔══██╗██╔═══██╗    ██╔══██╗\n" 
		       +"███████╗█████╗       ██║███████║    ██████╔╝█████╗  ██╔████╔██║    ██║   ██║██║██╔██╗ ██║██║  ██║██║   ██║    ███████║\n"  
		       +"╚════██║██╔══╝  ██   ██║██╔══██║    ██╔══██╗██╔══╝  ██║╚██╔╝██║    ╚██╗ ██╔╝██║██║╚██╗██║██║  ██║██║   ██║    ██╔══██║\n" 
		       +"███████║███████╗╚█████╔╝██║  ██║    ██████╔╝███████╗██║ ╚═╝ ██║     ╚████╔╝ ██║██║ ╚████║██████╔╝╚██████╔╝    ██║  ██║\n" 
		       +"╚══════╝╚══════╝ ╚════╝ ╚═╝  ╚═╝    ╚═════╝ ╚══════╝╚═╝     ╚═╝      ╚═══╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝     ╚═╝  ╚═╝\n"  

		
			   +" ██████╗ ██████╗ ███████╗██████╗  █████╗  ██████╗ █████╗  ██████╗      █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗ ██╗\n"
			   +"██╔═══██╗██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔════╝██╔══██╗██╔═══██╗    ██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗██║\n"
			   +"██║   ██║██████╔╝█████╗  ██████╔╝███████║██║     ███████║██║   ██║    ███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║██║\n"
			   +"██║   ██║██╔═══╝ ██╔══╝  ██╔══██╗██╔══██║██║     ██╔══██║██║   ██║    ██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║╚═╝\n"
			   +"╚██████╔╝██║     ███████╗██║  ██║██║  ██║╚██████╗██║  ██║╚██████╔╝    ██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║██╗\n"
			   +" ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝\u001B[0m\n");

		
		
		
		
		imprimir("Preparado(a) para uma aventura nunca antes vivida? Aperte os cintos e vamos lá!", TimeUnit.MILLISECONDS, tempo_transicao);

        /* 
		 * Inicializando os capitúlos do jogo e seus respectivos aspectos.
		 */ 

		// 1 - capitulo
		sombrasGrandeMaca();

		// 2 - capitulo
		desvendarOlhoSecreto();

		// 3 - capitulo
		buscarVerdade();

		// 4- capitulo
		alianca();

		// 5 - capitulo
		encontrarAurora();
	}

	// //#endregion

	/*
	 * Função responsável por exibir os criadores do jogo.
	 */
	static void creditos() throws Exception {
		imprimir("\n\n</> Desenvolvedores </>\n\n-> Mariana Medeiros \n-> Breno Silva \n-> Gustavo Amorim\n\n", TimeUnit.MILLISECONDS,
				tempo_transicao);

		menu();
		// Colocar as opções do menu para continuar a navegação do jogo.
	}

	/*
	 * Função responsável por dar opções referentes ao jogo para o jogador.
	 */
	static void menu() throws Exception {
		int escolha_menu = 0;

		do {
			System.out.print("Olá meu caro desbravador. Escolha uma opção: \n");
			imprimir("1 - Instruções\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("2 - Jogar\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("3 - Créditos\n",TimeUnit.MILLISECONDS, tempo_transicao);
			imprimir("4 - Sair\n",TimeUnit.MILLISECONDS, tempo_transicao);

			System.out.println("\n");

			escolha_menu = input.nextInt();

			switch (escolha_menu) {
			case 1:
				intrucoes();
				break;

			case 2:
				jogar();
				break;

			case 3:
				creditos();
				break;

			case 4:
				System.exit(0);
				break;

			default:
				imprimir("Reposta inválida, digite novamente: ",TimeUnit.MILLISECONDS, tempo_transicao);
				break;
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	}

	/*
	 * Função responsável por iniciar a classe e suas devidas funções.
	 */
	public static void main(String[] args) throws Exception {
		// Iniciando o jogo com o menu
		menu();
		
		// Ao final de tudo é encerrado as classes globais.
		input.close();
	}
}