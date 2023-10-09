'''
Escreva um algoritmo que solicite 15 números e informe o somatório de todos os
números ímpares digitados.
'''

cont = 1
soma = 0

while cont <= 15:
    num = int(input("Número: "))
    if num % 2 != 0:
       soma += num
    cont += 1

print(f"soma = {soma}")
