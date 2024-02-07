def soma_divisores(numero: int) -> int:
    """"Caucula a somatoria dos divisores de um número inteiro"""
    soma = 0
    for a in range(1, numero + 1):
        if numero % a == 0:
            soma += a
    return soma


print(soma_divisores(100))
