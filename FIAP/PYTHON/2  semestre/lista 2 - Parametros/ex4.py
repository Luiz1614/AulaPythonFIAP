def enviar_email(destinatario, assunto = "Sem Assunto", corpo = ""):
    """Exemplifica  o envio de um email """
    return f'\nDestinatário: {destinatario}' \
           f'\nAssunto: {assunto}' \
           f'\nCorpo: {corpo}'

print(enviar_email("Mauricio"))
