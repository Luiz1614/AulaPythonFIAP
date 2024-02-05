"""
Escreva um programa que solicita ao usuário o valor de N e calcule o valor de 𝑆 na série
abaixo:
𝑆 =
1/1 + 1/2 + 1/3 + ⋯ + 1/N
"""

n = int(input("valor de N: "))

soma = 0
cont = 1
while cont <= n:
    print(f"1/{cont}")
    soma += 1/cont
    cont += 1

print(f"Resultado de S = {soma:.2f}")
