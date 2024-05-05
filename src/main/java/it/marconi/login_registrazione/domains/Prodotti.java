package it.marconi.login_registrazione.domains;

public class Prodotti {
    private String codice;
    private String nome;
    private String categoria;
    private int annoProduzione;
    private int quantita;

    public Prodotti(String codice, String nome, String categoria, int annoProduzione, int quantita) {
        this.codice = codice;
        this.nome = nome;
        this.categoria = categoria;
        this.annoProduzione = annoProduzione;
        this.quantita = quantita;
    }
}