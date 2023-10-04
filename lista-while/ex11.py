n = int(input("valor de N: "))

soma = 0
cont = 1
while cont <= n:
    print(f"1/{cont}")
    soma += 1/cont
    cont += 1

print(f"Resultado de S = {soma:.2f}")
