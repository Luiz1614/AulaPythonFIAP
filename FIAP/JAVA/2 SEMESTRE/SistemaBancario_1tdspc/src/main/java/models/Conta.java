package models;

import java.util.StringJoiner;

public abstract class Conta {
    private int id;
    private String numero;
    private double saldo;

    public Conta(){}
    public Conta(int id, String numero, double saldo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Conta.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("numero='" + numero + "'")
                .add("saldo=" + saldo)
                .toString();
    }
}
