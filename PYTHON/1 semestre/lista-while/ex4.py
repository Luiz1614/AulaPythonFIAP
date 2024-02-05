#Escreva um algoritmo que solicite 10 números e informe quantos números entre 100 e
#200 foram digitados.

cont = 1
resposta = 0

while cont <= 10:
    num = int(input("Número: "))
    if num > 100 and num < 200:
        resposta += 1
        print(f"Foram digitados {resposta} numeros.")
    cont += 1


