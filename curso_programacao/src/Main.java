import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		String product1 = "Computer";
//		String product2 = "Office desk";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;

//		System.out.println("Products: ");
//		System.out.printf("%s, wich price is $ %.2f \n", product1, price1);
//		System.out.printf("%s, wich price is $ %.2f \n", product2, price2);
//		System.out.println();
//		System.out.printf("Record: %d years old, code %d and gender: %s \n", age, code, gender);
//		System.out.println();
//		System.out.printf("Measure with eight decimal places: %f \n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f \n", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("US decimal point: %.3f", measure);

//		int a, b;
//		double resultado;

//		a = 5;
//		b = 2;
//		
//		resultado = (double) a / b;
//		
//		System.out.println(resultado);

//		double a;
//		int b;
//		
//		a = 5.234;
//		b = (int) a;
//		
//		System.out.println(b);

//		Exercicio 01
//		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//		mensagem explicativa, conforme exemplos. 

//		Scanner sc = new Scanner(System.in);
//
//		int numberOne = sc.nextInt();
//		int numberTwo = sc.nextInt();
//		int sum = numberOne + numberTwo;
//
//		System.out.println("SOMA = " + sum);
//
//		sc.close();

//		Exercicio 02
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//		casas decimais conforme exemplos. 
//		 
//		Fórmula da área: area = π . raio2 
//		 
//		Considere o valor de π = 3.14159 

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double raioCirculo = sc.nextDouble();
//		double area = 3.14159 * (raioCirculo * raioCirculo);
//
//		System.out.printf("A=%.4f", area);
//
//		sc.close();

//		Exercicio 03
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 

//		Scanner sc = new Scanner(System.in);
//		
//		int a, b, c, d, diferenca;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();
//		
//		diferenca = (a * b - c * d);
//		
//		System.out.println("Diferenca = " + diferenca);
//		
//		sc.close();

//		Exercicio 04
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//		decimais. 

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int numero = sc.nextInt();
//		int horas = sc.nextInt();
//		double valorPorHora = sc.nextDouble();
//		double salario = horas * valorPorHora;
//		
//		System.out.printf("Number = %d %n", numero);
//		System.out.printf("Salary = U$ %.2f \n", salario);
//		
//		sc.close();

//		Exercicio 05
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int codigoPeca1 = sc.nextInt();
//		int numeroPeca1 = sc.nextInt();
//		double valorPeca1 = sc.nextDouble();
//		int codigoPeca2 = sc.nextInt();
//		int numeroPeca2 = sc.nextInt();
//		double valorPeca2 = sc.nextDouble();
//		double valorParaPagar = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
//		
//		System.out.printf("VALOR A PAGAR: R$ %.2f", valorParaPagar);
//		
//		sc.close();

//		Exercicio 06
//
//		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//		mostre:  
//		a) a área do triângulo retângulo que tem A por base e C por altura.  
//		b) a área do círculo de raio C. (pi = 3.14159)  
//		c) a área do trapézio que tem A e B por bases e C por altura.  
//		d) a área do quadrado que tem lado B.  
//		e) a área do retângulo que tem lados A e B. 

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		
//		double triangulo = a * c / 2.0;
//		double circulo = 3.14159 * (c * c);
//		double trapezio = (a + b) * c / 2.0;
//		double quadrado = b * b;
//		double retangulo = a * b;
//		
//		System.out.printf("Triangulo: %.3f %n", triangulo);
//		System.out.printf("Circulo: %.3f %n", circulo);
//		System.out.printf("Trapezio: %.3f %n", trapezio);
//		System.out.printf("Quadrado: %.3f %n", quadrado);
//		System.out.printf("Retangulo: %.3f %n", retangulo);
//		
//		sc.close();

//		Exercicio 01
//		Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

//		Scanner sc = new Scanner(System.in);
//
//		int number = sc.nextInt();
//
//		if (number < 0) {
//			System.out.println("NEGATIVO");
//		} else {
//			System.out.println("NAO NEGATIVO");
//		}
//
//		sc.close();
		
//		Exercicio 02
//		Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int number = sc.nextInt();
//		
//		if (number % 2 == 0) {
//			System.out.println("PAR");
//		} else {
//			System.out.println("IMPAR");
//		}
//		
//		sc.close();
		
//		Exercicio 03
//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//		ordem crescente ou decrescente. 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if (a % b == 0 || b % a == 0) {
//			System.out.println("Sao Multiplos");
//		} else {
//			System.out.println("Nao sao Multiplos");
//		}
//		
//		sc.close();
		
//		Exercicio 04
//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int horaInicial = sc.nextInt();
//		int horaFinal = sc.nextInt();
//		int duracao;
//		
//		if (horaInicial == horaFinal) {
//			System.out.println("O JOGO DUROU 24 HORA(S)");
//		} else {
//			if (horaInicial < horaFinal) {
//				duracao = horaFinal - horaInicial;
//				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//			} else {
//				duracao = 24 - horaInicial + horaFinal;
//				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//			}
//		}
//		
//		sc.close();
		
//		Exercicio 05
//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
//		seguir, calcule e mostre o valor da conta a pagar. 
		
//		CODIGO  ESPECIFICACAO     PREÇO
//		1       Cachorro Quente   R$ 4.00
//		2       X-Salada          R$ 4.50
//		3       X-Bacon           R$ 5.00
//		4       Torrada simples   R$ 2.00
//		5       Refrigerante      R$ 1.50
		
//		Scanner sc = new Scanner(System.in);
//		
//		int codigo = sc.nextInt();
//		int quantidadeItem = sc.nextInt();
//		double valorParaPagar;
//		
//		if (codigo == 1) {
//			valorParaPagar = quantidadeItem * 4.0;
//			System.out.println("Total: R$ " + valorParaPagar);
//		} 
//		else if (codigo == 2) {
//			valorParaPagar = quantidadeItem * 4.50;
//			System.out.println("Total: R$ " + valorParaPagar);
//		} 
//		else if (codigo == 3) {
//			valorParaPagar = quantidadeItem * 5.0;
//			System.out.println("Total: R$ " + valorParaPagar);
//		} 
//		else if (codigo == 4) {
//			valorParaPagar = quantidadeItem * 2.0;
//			System.out.println("Total: R$ " + valorParaPagar);
//		} else {
//			valorParaPagar = quantidadeItem * 1.50;
//			System.out.println("Total: R$ " + valorParaPagar);
//		}
//					
//		
//		sc.close();
		
//		Exercicio 06
//		Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
//		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double valor = sc.nextDouble();
//		
//		if (valor >= 0.00 && valor <= 25.00) {
//			System.out.println("Intervalo [0, 25]");
//		} else {
//			if (valor >= 25.00 && valor <= 50.00) {
//				System.out.println("Intervalo [25, 50]");
//			} else {
//				if (valor >= 50.00 && valor <= 75.00) {
//					System.out.println("Intervalo [50, 75]");
//				} else {
//					if (valor >= 75.00 && valor <= 100.00) {
//						System.out.println("Intervalo [75, 100]");
//					} else {
//						System.out.println("Fora de intervalo");
//					}
//				}
//			}
//		}
//		
//		sc.close();
		
//		Exercicio 07
//		Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
//		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
//		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
//		 
//		Se o ponto estiver na origem, escreva a mensagem “Origem”. 
//		 
//		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
//		situação. 
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		
//		if (x == 0.0 && y == 0.0) {
//			System.out.println("Origem");
//		} else {
//			if (x > 0.0 && y > 0.0) {
//				System.out.println("Q1");
//			} else {
//				if (x > 0.0 && y < 0.0) {
//					System.out.println("Q4");
//				} else {
//					if (x < 0.0 && y > 0.0) {
//						System.out.println("Q2");
//					} else {
//						System.out.println("Q3");
//					}
//				}
//			}
//		}
//		
//		sc.close();
		
//		Exercicio 08
//		Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
//		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
//		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
//		 
//		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
//		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. 
		
//		Renda                                 Imposto de Renda
//		de 0.00 a R$ 2000.00                  Isento
//		de R$ 2000.01 até R$ 3000.00          8 %
//		de R$ 3000.01 até R$ 4500.00          18 %
//		acima de R$ 4500.00                   28 %
		
//		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
//		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
//		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
//		duas casas decimais.
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double salario = sc.nextDouble();
//		double imposto;
//		
//		if (salario <= 2000.00) {
//			imposto = 0.0;
//			System.out.println(imposto);
//		} else {
//			if (salario <= 3000.00) {
//				imposto = (salario - 2000.0) * 0.08;
//				System.out.println(imposto);
//			} else {
//				if (salario <= 4500.00) {
//					imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//					System.out.println(imposto);
//				} else {
//					imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//					System.out.println(imposto);
//				}
//			}
//		}
//		
//		sc.close();
		
		System.out.println("Debug");
	
	}
}
