package br.com.ronanjunior.markdown;

public class Concatena implements Markdown {
    private Markdown markdown1;
    private Markdown markdown2;

    public Concatena(Markdown markdown1, Markdown markdown2) {
        this.markdown1 = markdown1;
        this.markdown2 = markdown2;
    }

    public void exibe() {
        markdown1.exibe();
        System.out.print(" "); // Adiciona uma quebra de linha
        markdown2.exibe();
    }
}