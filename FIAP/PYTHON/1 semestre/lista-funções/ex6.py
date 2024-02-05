"""
Implementar uma função que recebe como parâmetro a altura em metros (exemplo: 1.70) e o sexo
('M' para masculino e 'F' para feminino) de uma pessoa e retorne o seu peso ideal, sendo que:
Peso Ideal (para homens) = (72.7 * altura) - 58
Peso Ideal (para mulheres) = (62.1 * altura) - 44.7
"""

def calcula_peso(altura, sexo):
    if sexo == "m":
        return (72.7 * altura) - 58
    elif sexo == "f":
        return (62.1 * altura) - 44.7

print(calcula_peso(1.70, "m"))
