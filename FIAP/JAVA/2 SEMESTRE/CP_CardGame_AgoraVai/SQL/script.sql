create table cp_card(
    cod_carta VARCHAR2(2) PRIMARY KEY NOT NULL,
    nome VARCHAR2(255) NOT NULL,
    velocidade NUMBER NOT NULL,
    cilindradas NUMBER NOT NULL,
    zeroCem NUMBER NOT NULL,
    potencia NUMBER NOT NULL,
    comprimento NUMBER NOT NULL,
    peso NUMBER NOT NULL,
    is_supertrunfo VARCHAR2(1) NOT NULL
);

commit;

