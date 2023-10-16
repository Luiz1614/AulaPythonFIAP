"""
Faça um programa para uma calculadora simples com as seguintes operações: adição, subtração,
multiplicação e divisão.
O programa começa apresentando ao usuário um menu de opções semelhante ao mostrado abaixo:

Calculadora:
1 - Adição
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Sair do programa
Selecione sua opção:

Crie uma função chamada Menu, que exiba o menu acima e retorna a opção do usuário para o
programa principal. Se a opção for inválida, informe ao usuário e peça a ele para entrar com uma
opção válida.
De acordo com a opção do usuário, chame uma das seguintes funções: adicao, subtracao,
multiplicacao, divisao, passando como parâmetros dois números também informados pelo usuário.
Após a execução da operação o programa volta a apresentar o menu inicial até que o usuário encerre
o programa com a opção 5.
"""

def menu():
    print("\n1 - Adição")
    print("2 - Subtração")
    print("3 - Multiplicação")
    print("4 - Divisão")
    print("5 - Sair do programa\n")
    opcao = int(input("Digite a Opção: "))
    return opcao

def soma(num1, num2):
    print(f"Resultado: {num1 + num2}")

def subtracao(num1, num2):
    print(f"Resultado: {num1 - num2}")

def multiplicacao(num1, num2):
    print(f"Resultado: {num1 * num2}")

def divisao(num1, num2):
    print(f"Resultado: {num1 / num2}")


while True:
    match menu():
        case 1:
            num1 = int(input("Digite o primeiro número: "))
            num2 = int(input("Digite o segundo número: "))
            soma()
        case 2:
            num1 = int(input("Digite o primeiro número: "))
            num2 = int(input("Digite o segundo número: "))
            subtracao()
        case 3:
            num1 = int(input("Digite o primeiro número: "))
            num2 = int(input("Digite o segundo número: "))
            multiplicacao()
        case 4:
            num1 = int(input("Digite o primeiro número: "))
            num2 = int(input("Digite o segundo número: "))
            divisao()
        case 5:
            print("Tchal Tchal!")
            break

