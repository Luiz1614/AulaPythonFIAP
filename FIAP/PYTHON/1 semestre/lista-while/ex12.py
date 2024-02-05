"""
Faça um algoritmo que solicite um número inteiro ao usuário e calcule o fatorial desse
número. O fatorial de um número N é a multiplicação de N por seus antecessores
maiores ou iguais a 1.
Por exemplo: o fatorial de 5 é igual a 5*4*3*2*1 = 120.
"""

fat = 1
n = int(input("Digite um numero inteiro: "))

while n >= 1:
    if n == 1:
        print(n, end=' = ')
    else:
        print(n, end=' * ')
    fat *= n
    n -= 1


print(fat)
