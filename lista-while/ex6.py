'''
. Solicite vários números ao usuário (até que ele digite o número zero) e informe o
somatório dos números digitados.
'''

soma = 0

while True:
    numero = int(input('número: '))
    if numero == 0:
        break
    soma += numero

print(f"somatorio: {soma}")

