numero1 = 0
numero2 = 0

while numero1 == numero2:
    numero1 = float(input("Primeiro número: "))
    numero2 = float (input("Segundo número: "))
    if numero1 == numero2:
        print('\nOs números devem ser diferentes. Digite novamente.\n')

if numero1 > numero2:
    diferenca = numero1 - numero2
    print(f'A diferença entre {numero1} e {numero2} é: {diferenca}')
else:
    diferenca = numero2 - numero1
    print(f'A diferença entre {numero2} e {numero1} é: {diferenca}')


