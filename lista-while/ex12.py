
fat = 1
n = int(input("Digite um numero inteiro: "))

while n >= 1:
    if n == 1:
        print(n, end=' = ')
    else:
        print(n, end=' * ')
    fat *= n
    n -= 1


print(fat)
