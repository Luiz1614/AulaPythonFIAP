"""
Faça uma função que recebe um número inteiro por parâmetro e retorna True se for par e False se
for ímpar.
"""

def par_ou_impar(num):
    if num % 2 == 0:
        print("Par")
    elif num % 2 != 0:
        print("Impar")


par_ou_impar(7)
