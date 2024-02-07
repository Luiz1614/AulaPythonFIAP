def caucular_salario(salario: float) -> float:
    """"Este método retorna o salario do funcionario, se for maior que 2000 tera um aumento  de 7%, se for menor que 2000 tera um aumento de 15%"""
    if salario > 2000:
        return salario + (salario * 0.07)
    else:
        return salario + (salario * 0.15)


print(caucular_salario(5000))
