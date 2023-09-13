nulo = int(input("votos nulos: "))
valido = int(input("votos válido: "))
branco = int(input("votos brancos: "))

total = nulo + valido + branco

print(f'Votos brancos: {branco * 100 / total}%')
print(f'Votos nulos: {nulo * 100 / total}%')
print(f'Votos validos: {valido * 100 / total}%')

