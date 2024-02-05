'''
 Faça um algoritmo que solicite N números e calcule a média dos números pares e a
média dos números ímpares (o valor de N deve ser solicitado ao usuário no início do
programa).
'''

n = int(input("Quantidade de números: "))

contaPar = 0
contaImpar = 0

somaPar = 0
somaImpar = 0


cont = 1
while cont <= n:
    number = int(input("Numero: "))
    if number % 2 == 0:
        somaPar += number
        contaPar += 1
    else:
        somaImpar += number
        contaImpar += 1
    cont += 1


if contaPar > 0:
    mediaPares = somaPar / contaPar
    print(f"Média dos pares:  {mediaPares}")
else:
    print("Não há números pares.")

if contaImpar > 0:
    mediaIpares = somaImpar / contaImpar
    print(f"Média dos impares: {mediaIpares}")
else:
    print("Não há números impares.")
