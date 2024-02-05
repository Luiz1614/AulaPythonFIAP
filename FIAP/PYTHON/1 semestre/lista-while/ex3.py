#Escreva um algoritmo que solicite a idade de 15 pessoas e informe a quantidade de
#pessoas com idade inferior a 18 anos.

cont = 1

while cont <= 15:
    idade = int(input("Idade: "))
    if idade < 18:
        print(f"{idade} é menor que 18!")
    cont += 1

