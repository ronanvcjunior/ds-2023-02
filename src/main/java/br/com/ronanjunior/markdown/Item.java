package br.com.ronanjunior.markdown;

class Item extends Decorator {
    public Item(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("\n- ");
        super.exibe();
    }
}