""""
 Faça um programa que solicita ao usuário um único número inteiro com três dígitos e exibe o
número invertido.
"""

num1 = int(input("Digite um valor inteiro de 3 digitos: "))

cent = num1 // 100
dez = num1 % 100 // 10
uni = num1 % 10

print(f"{uni}{dez}{cent} ")


