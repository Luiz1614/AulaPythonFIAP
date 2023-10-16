"""
Faça uma função que receba como parâmetro o número de lados de um polígono e:
- Se o número de lados for igual a 3, escrever TRIÂNGULO.
- Se o número de lados for igual a 4, escrever QUADRILÁTERO.
- Se o número de lados for igual a 5, escrever PENTÁGONO.
- Se o número de lados for diferente de 3, 4 ou 5, escrever VALOR INVÁLIDO.
"""

def numero_lados (lados):
    if lados == 3:
        print("Triângulo")
    elif lados == 4:
        print("Quadrilátero")
    elif lados == 5:
        print("Pentágono")
    else:
        print("Valor Inválido!")


numero_lados(2)

