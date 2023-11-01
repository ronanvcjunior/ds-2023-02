package br.com.ronanjunior.markdown;

abstract class Decorator implements Markdown {
    private Markdown markdown;

    public Decorator(Markdown markdown) {
        this.markdown = markdown;
    }

    public void exibe() {
        markdown.exibe();
    }
}