programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3],linha, coluna, valor, soma 
		para(linha=0; linha<3; linha++){
			para(coluna=0; coluna<3; coluna++){
				escreva("\n Entre com valores:")
				leia(valor)
				matriz[linha][coluna]=valor
			}
			
		}
		soma=matriz[0][0]+matriz[1][1]+matriz[2][2]
		escreva("\n A soma da diagonal da matriz é:" +soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */