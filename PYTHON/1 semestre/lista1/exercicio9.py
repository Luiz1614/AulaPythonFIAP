""""
 Escreva um programa que solicita ao usuário dois números inteiros e armazena nas variáveis A e B.
Troque os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa.
Ao final exiba na tela os valores que ficaram armazenados nas variáveis A e B respectivamente.
"""

a = int(input("Digite o valor do A:"))
b = int(input("Digite o valor de B:"))

c = a
a = b
b = c

print(f"Valor de A: {a}")
print(f"Valor de B: {b}")