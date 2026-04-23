package br.com.riink.builder;
import br.com.riink.model.Boleto;

public interface BoletoBuilder {
    void buildBeneficiario(String nome, String documento);
    void buildSacado(String nome, String documento);
    void buildTitulo(String valor, String vencimento, String nossoNumero);
    void buildBanco(String agencia, String conta, String carteira);
    void calcularLinhaDigitavel(); // Aqui entra a mágica da FEBRABAN
    Boleto getBoleto();
}