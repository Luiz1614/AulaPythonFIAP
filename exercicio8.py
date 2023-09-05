nomeVendedor = input("Nome do vendedor: ")
carrosVendidos = int(input("Quantidade de carros vendidos: "))

comissao = carrosVendidos * 200 + 300000.0 * 0.2
salarioBase = 2.500
salarioFinal = salarioBase + comissao

print(salarioFinal)



