dias = int(input("Quantidade de dias trabalhados: "))
valor = dias * 80.0
desconto = valor * 8/100
salario = valor - desconto

print(f"Salario Final: {salario}")
