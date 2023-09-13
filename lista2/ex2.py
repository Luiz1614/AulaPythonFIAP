total = int(input('Total de segundos: '))

horas = total // 3600
resto = total % 3600
minutos = resto // 60
segundos = resto % 60

print(f'{horas} horas, {minutos} minutos e {segundos} segundos')
