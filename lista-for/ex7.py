#Escreva um algoritmo que exiba 20 números aleatórios sorteados entre 1 e 50 (Dica: utilize a
#biblioteca random).

import random

for i in range(1, 21):
    num = random.randrange(1, 51)
    print(num)

