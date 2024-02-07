from ex2 import quadrado


def soma_dos_quadrados(num1: float, num2: float) -> float:
    """"Este método retona a soma dos quadrados dos números"""
    return quadrado(num1) + quadrado(num2)


print(soma_dos_quadrados(2, 2))
