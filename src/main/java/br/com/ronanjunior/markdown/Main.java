package br.com.ronanjunior.markdown;

public class Main {
    public static void main(String[] args) {
        Markdown titulo = new Titulo(new Texto("Título"));
        Markdown linha = new Texto("Uma simples linha, com");
        Markdown negrito = new Negrito(new Texto("negrito"));
        Markdown italico = new Italico(new Texto("itálico"));
        Markdown item = new Item(new Italico(new Texto("Primeiro item da linha com itálico.")));

        Markdown resultado = new Concatena(titulo, new Concatena(linha, new Concatena(negrito, new Concatena(italico, item))));

        resultado.exibe();
    }
}
1