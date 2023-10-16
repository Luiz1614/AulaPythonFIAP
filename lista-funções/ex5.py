"""
Escreva um programa que leia o raio de um círculo e faça duas funções: uma função chamada area
que calcula e retorna a área do círculo e outra função chamada perimetro que calcula e retorna o
perímetro do círculo. Utilize as fórmulas abaixo
Área = π * r2
Perímetro = π * 2 * r
"""

raio = int(input("Digite o valor do raio: "))


def calcula_raio():
    area = 3.14 * raio**2
    perimetro = 3.14 * 2 * raio
    print(f"Área: {area:.2f}")
    print(f"Perímetro: {perimetro:.2f}")

calcula_raio()
