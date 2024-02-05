#Escreva um algoritmo que determine se um número N (digitado pelo usuário) é primo ou não.

numero = int(input("Digite um número inteiro: "))

conta_divisores = 0
for i in range(1, numero + 1):
    if numero % i == 0:
        conta_divisores += 1

if conta_divisores == 2:
    print("Numero primo!")
else:
    print("Não é um número primo!")