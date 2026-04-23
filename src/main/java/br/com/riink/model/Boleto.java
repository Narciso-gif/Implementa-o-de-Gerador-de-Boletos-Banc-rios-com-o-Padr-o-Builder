package br.com.riink.model;

public class Boleto {
    // Dados essenciais
    public String beneficiario, sacado, vencimento, valor;
    public String agencia, conta, carteira, nossoNumero;
    public String linhaDigitavel, codigoBarras;

    @Override
    public String toString() {
        return "Boleto Gerado: " + linhaDigitavel;
    }
}