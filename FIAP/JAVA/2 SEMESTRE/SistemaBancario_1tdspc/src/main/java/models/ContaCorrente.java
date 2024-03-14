package models;

import java.util.StringJoiner;

public class ContaCorrente extends Conta{
    private boolean chequeEspecial;

    public ContaCorrente(){}
    public ContaCorrente(int id, String numero, double saldo, boolean chequeEspecial) {
        super(id, numero, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public boolean isChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ContaCorrente.class.getSimpleName() + "[", "]")
                .add("chequeEspecial=" + chequeEspecial)
                .toString();
    }
}
