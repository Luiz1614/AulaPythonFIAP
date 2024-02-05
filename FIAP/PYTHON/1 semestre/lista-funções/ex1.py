"""
Escreva um programa para solicitar as notas de duas provas. Faça uma função que receba as duas
notas por parâmetro e exibe a mensagem “Você foi Aprovado!” ou “Você foi Reprovado!”. Considere
6.0 a média mínima para aprovação.
"""

def media():
    if(nota1 + nota2) / 2 >= 6:
        print("Aprovado!")
    else:
        print("Reprovado.")


nota1 = int(input("Digite a primeira nota: "))
nota2 = int(input("Digite a segunda nota: "))

media()



