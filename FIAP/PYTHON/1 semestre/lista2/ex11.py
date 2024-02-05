paes = int(input("Quantidade de Pães: "))
broas = int(input("Quantidade de broas: "))

total = paes * 0.38 + broas * 4.50
poupanca = total * 10/100

print(f"Valor total Arrecadado: {total:.2f}")
print(f"Valor destinado a poupança: {poupanca:.2f}")