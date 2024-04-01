import json

try:
    with open('foods.csv', 'r', encoding='utf-8') as arquivo:
        arquivo.__next__()
        dicionario = {}
        for linha in arquivo:
            lista = linha.split(',')
            nome = lista[0]
            id = lista[1]
            prato = lista[2].replace('\n', '')

            dicionario[id] = {'nome': nome, 'prato': prato}


    with open('foods.json', 'w', encoding='utf8') as arquivo:
        json.dump(dicionario, arquivo, indent=4)

except FileNotFoundError:
    print('Arquivo nao encontrado!')


