#Escreva um algoritmo que solicite 10 números e exiba o dobro de cada número digitado.

cont = 1

while cont <= 10:
    numero  = int(input('Numero: '))
    dobro = numero * 2
    print(f"O dobro do número {numero} é: {dobro}")
    cont += 1
