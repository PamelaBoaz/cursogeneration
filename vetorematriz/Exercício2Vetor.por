programa
{
	//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
	//apresente também quantas foram as ocorrências da maior pontuação
	funcao inicio()
	{
		inteiro dado[10], oco=0, maior=0, soma=0, media
		para(inteiro i=0; i<10; i++){
			escreva("\n Entre com o valor do lançamento", i+1, ":")
			leia(dado[i])
			
			se(dado[i]<=0 ou dado[i]>6){
				escreva("\n Entrada inválida. Reinicie o programa.")
				i-= 1
				
			}senao{
				soma+=dado[i]
			}
		}
		
		media = soma/10
		escreva("\n Média dos lançamentos é:" + media)

		para(inteiro i=0; i<10; i++){
			se(dado[i]>maior){
				oco=0
				maior=dado[i]
				oco+= 1
			}
			senao se(dado[i]==maior){
					oco+=1
			}	
			
		}
		escreva("\n Maior:"+maior+" | Ocorreu  "+oco+ "  vezes.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 766; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */