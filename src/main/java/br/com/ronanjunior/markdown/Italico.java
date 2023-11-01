package br.com.ronanjunior.markdown;

class Italico extends Decorator {
    public Italico(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("_");
        super.exibe();
        System.out.print("_");
    }
}