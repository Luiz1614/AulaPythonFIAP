#Escreva um algoritmo que exiba 20 números aleatórios sorteados entre 1 e 50 (Dica: utilize a
#biblioteca random).

import random

for i in range(20):
    num = random.randint(1,50)
    print(num)

