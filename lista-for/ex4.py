#Escreva um algoritmo que leia quinze números informados pelo usuário e exiba a raiz quadrada de
#cada número (Dica: utilize a biblioteca math)

import math

for i in range(1, 16):
    num = int(input("Número: "))
    raiz = math.sqrt(num)
    print(f"A raiz do número {num} é {raiz:.2f}")
