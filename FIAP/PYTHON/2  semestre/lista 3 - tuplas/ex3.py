def conta_vagais(palavra):
    vogais = 'aeiouAEIOU'
    quantidade = 0

    for caracter in palavra:
        if caracter in vogais:
            quantidade += 1

    return quantidade

print(conta_vagais("salve"))
