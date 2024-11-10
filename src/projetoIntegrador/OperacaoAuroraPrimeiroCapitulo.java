package projetoIntegrador;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperacaoAuroraPrimeiroCapitulo {
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
	public static void Imprimir(String mensagem, TimeUnit formato_tempo, long tempo_mensagem)
			throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);

			formato_tempo.sleep(tempo_mensagem);
		}
	}

    static void SombrasGrandeMaca() throws Exception {
		Imprimir("\n\nCapitulo 1: \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
	   "\u001B[33m███████╗ ██████╗ ███╗   ███╗██████╗ ██████╗  █████╗ ███████╗    ██████╗  █████╗      ██████╗ ██████╗  █████╗ ███╗   ██╗██████╗ ███████╗    ███╗   ███╗ █████╗  ██████╗ █████╗ \n"
				+"██╔════╝██╔═══██╗████╗ ████║██╔══██╗██╔══██╗██╔══██╗██╔════╝    ██╔══██╗██╔══██╗    ██╔════╝ ██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔════╝    ████╗ ████║██╔══██╗██╔════╝██╔══██╗\n"
				+"███████╗██║   ██║██╔████╔██║██████╔╝██████╔╝███████║███████╗    ██║  ██║███████║    ██║  ███╗██████╔╝███████║██╔██╗ ██║██║  ██║█████╗      ██╔████╔██║███████║██║     ███████║\n"
				+"╚════██║██║   ██║██║╚██╔╝██║██╔══██╗██╔══██╗██╔══██║╚════██║    ██║  ██║██╔══██║    ██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║  ██║██╔══╝      ██║╚██╔╝██║██╔══██║██║     ██╔══██║\n"
				+"███████║╚██████╔╝██║ ╚═╝ ██║██████╔╝██║  ██║██║  ██║███████║    ██████╔╝██║  ██║    ╚██████╔╝██║  ██║██║  ██║██║ ╚████║██████╔╝███████╗    ██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║\n"
				+"╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝ ╚══════╝    ╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\u001B[0m");
				
		System.out.println();
		Imprimir("Sin City, 1925. A cidade que nunca dorme pulsa com vida e energia, um caldeirão de sonhos, ambições e segredos obscuros.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Nas ruas movimentadas e becos escuros, a sombra da tragédia paira sobre Ethan Blackwood, um jovem atormentado pela morte misteriosa de seus pais. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("As lembranças das últimas horas com eles ainda estão frescas em sua mente: a risada contagiante de sua mãe, a voz firme de seu pai, o aconchego do lar. \n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("De repente, tudo se desfez em uma noite brutal, deixando apenas um rastro de perguntas sem respostas e um vazio imenso em seu coração.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Um bar clandestino, com iluminação fraca e música de jazz ao fundo. Ethan Blackwood, de aparência abatida, está sentado no balcão, segurando um copo de whisky. O barman, um homem de meia-idade com um olhar astuto, se aproxima.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Barman: (enxugando um copo) Você tem andado pensativo, rapaz. O que te traz a este canto esquecido da cidade? \n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		Imprimir("Ethan Blackwood: (olhando para o copo, com a voz baixa) Estou atrás de respostas. Meus pais... morreram de uma maneira que ninguém consegue explicar. Acho que alguém aqui sabe de algo. \n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		Imprimir("Barman: (arqueando uma sobrancelha) Sin City tem um jeito de engolir segredos. Mas cuidado onde pisa, garoto. Às vezes, as respostas que buscamos são piores que as perguntas. \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("Ethan Blackwood, em um beco escuro, confrontando um informante, um homem magro e nervoso chamado Jimmy. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Ethan Blackwood: (segurando o colarinho de Jimmy) Você sabe algo sobre a noite em que meus pais morreram. Fale, ou vai se arrepender de ter nascido...\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		Imprimir("Jimmy: (tentando se soltar, com medo nos olhos) Ok, ok! Tudo o que sei é que eles estavam envolvidos com algo grande. Ouvi dizer que um tal de Aurora estava no centro disso tudo. \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("No apartamento de Ethan. Ele está sentado em sua escrivaninha, examinando o medalhão de prata antigo. Ao tocá-lo, uma mensagem holográfica surge. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		Imprimir("Mensagem Holográfica: Aurora... Se você está vendo isso, significa que chegamos ao fim de nossa jornada. O caminho para a verdade está no mapa escondido. Decifre-o e encontrará a chave para o próximo passo.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("Ethan está em sua sala, com documentos espalhados por todo lado. Entre eles, um mapa antigo com símbolos e marcas estranhas. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Ethan Blackwood: (falando para si mesmo) O mapa... preciso entender esses símbolos. Talvez a história da região possa me dar alguma pista.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("Biblioteca de Sin City. Ethan está rodeado por livros antigos, folheando um deles com intensidade. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Ethan Blackwood: (pensando alto) Esses símbolos... parecem ter algum tipo de ligação com antigos rituais. Preciso encontrar um local histórico que bata com essas marcas.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("Ethan encontra um mapa antigo e envelhecido, com símbolos e marcas estranhas. Após examinar o mapa e os documentos, ele percebe que as coordenadas para o local oculto estão codificadas em uma mensagem matemática. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		Imprimir("A mensagem matemática possui uma série de polinômios ao lado dos símbolos no mapa. Após estudar os documentos, ele descobre que cada polinômio corresponde a uma coordenada específica. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		Imprimir("A mesagem diz: 'A chave está nas raízes dos polinômios, encontre o ponto onde o sol se põe.' \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Mensagem Decifrada: \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		Imprimir("1 - Símbolo: Polinômio P(x) = x² - 5x + 6\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		Imprimir("2 - Símbolo: Polinômio Q(x) = x² - 7x + 10\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Ethan Blackwood: (pensando com ele mesmo) Preciso encontrar as raízes dos polinômios... Isso me dará as coordenadas do local! \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("Coordenadas: \n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
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
                Imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }
            
            System.out.println();
            Imprimir("Digite a letra da resposta correta: ",TimeUnit.MILLISECONDS, tempo_transicao);
            
            String resposta = "A";

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
				Imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
				continue;
            }
			
            if (respostas[indexResposta].equals("2.2° e 3.5°")) {
				Imprimir("Ethan Blackwood: Consegui! As coordenadas são 2.2° e 3.5° \n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
					Imprimir("Raízes incorretas, tente novamente. Vidas restantes: " + vidas + "\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
					Imprimir("Você perdeu todas as suas vidas. Tente novamente para ir para o próximo capítulo.",TimeUnit.MILLISECONDS, tempo_transicao);
					System.exit(0);
                }
            }
        }
		
		Imprimir("Ethan no local indicado pelo mapa, um antigo ponto de referência da cidade.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		
		Imprimir("Ethan: (olhando em volta, segurando o mapa) Se minha interpretação está correta, este é o lugar onde o sol se põe. Agora, só preciso encontrar a entrada secreta.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);		
		
		Imprimir("Após semanas de investigação, noites sem dormir e inúmeros perigos enfrentados, Ethan finalmente decifra o mapa. \n",TimeUnit.MILLISECONDS, tempo_narrativa);		
		Imprimir("As coordenadas o levam a um local abandonado nos arredores da cidade. Ao chegar lá, ele encontra um baú enterrado, contendo mais documentos, artefatos e outra pista que o levaria a \"Aurora\"",TimeUnit.MILLISECONDS, tempo_narrativa);		
	}

	/*
	 * Função responsável por iniciar a classe e suas devidas funções.
	 */
	public static void main(String[] args) throws Exception {
		// Iniciando o teste
		SombrasGrandeMaca();
		
		// Ao final de tudo é encerrado as classes globais.
		input.close();
	}	
}