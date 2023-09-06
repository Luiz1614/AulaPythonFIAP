""""
Escreva um algoritmo que solicite o peso e a altura de uma pessoa e calcule o seu IMC (Índice de
Massa Corpórea). Utilize a fórmula abaixo:
IMC = 𝑝𝑒𝑠𝑜 / 𝑎𝑙𝑡𝑢𝑟𝑎2
"""

peso = float(input("Digite seu peso:"))
altura = float(input("Digite sua altura:"))

imc = peso / altura**2
print(imc)
