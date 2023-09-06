""""
Uma concessionária de veículos paga aos seus vendedores um salário base de R$ 2.500,00. Além
disso, uma comissão de R$ 200,00 por cada carro vendido e 2% do valor total das vendas.
Escreva um programa que solicite o nome do vendedor, a quantidade de carros vendidos e o valor
total de suas vendas. O programa deve calcular e exibir o salário final do vendedor.
"""

nomeVendedor = input("Nome do vendedor: ")
carrosVendidos = int(input("Quantidade de carros vendidos: "))
valorVenda = float(input("Digite o valor total de vendas:"))

comissao = 200 * carrosVendidos
acrescimo = valorVenda * 2 / 100
total = 2500 + comissao + acrescimo

print(f"salário final: {total}")



