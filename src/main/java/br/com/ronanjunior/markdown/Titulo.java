package br.com.ronanjunior.markdown;

public class Titulo extends Decorator {
    public Titulo(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("# ");
        super.exibe();
        System.out.print("\n");
    }
}