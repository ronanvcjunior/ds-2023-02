package br.com.ronanjunior.markdown;

class Negrito extends Decorator {
    public Negrito(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("**");
        super.exibe();
        System.out.print("**");
    }
}