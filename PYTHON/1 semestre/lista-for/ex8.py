# Escreva um algoritmo que solicite o valor de N e calcule o fatorial de N.


while True:
    n = int(input("Número: "))

    if n > 0:

        fat = 1
        for i in range(n, 0, -1):
            fat *= i

        print(f"Fatorial: {fat}")
        break
    else:
        print("Número inválido!")
