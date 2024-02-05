import math

comprimento = float(input("Digite o comprimento da cozinha: "))
largura = float(input("Digite a largura da cozinha: "))
altura = float(input("Digite a altura da cozinha: "))

area1 = (comprimento * altura) * 2
area2 = (largura * altura) * 2
areaTotal = area1 + area2

caixas = areaTotal / 1.5
print(f"Quantidade de caixas: f{math.ceil(caixas)}")

