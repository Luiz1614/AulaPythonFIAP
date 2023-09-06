""""
 Escreva um programa que receba o preço de um produto e calcule o seu preço final com um
desconto de 10%.
"""

preco = float(input("Digite o valor do produto:"))

desconto = preco * 10/100

preco = preco - desconto
print(f"O valor com 10% de desconto é de {preco}")
