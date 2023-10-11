#Criar um algoritmo que leia dez números inteiros e informe o maior e o menor número.

numero = int(input("Número: "))
maior = numero
menor = numero

for i in range(9):
    numero = int(input("Número: "))

    if numero > maior:
        maior = numero

    if numero < menor:
        menor = numero


print(f"\nMaior: {maior}")
print(f"Menor: {menor}")

