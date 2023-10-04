
numero = float(input("Digite o número: "))
menor = numero

cont = 1

while cont <= 9:
    numero = float(input("Digite o número: "))
    if numero < menor:
        menor = numero
    cont += 1

print(f"Menor: {menor}")
