package br.com.ronanjunior.anotacao;

@Observer(observado = "carro")
public class CarroObserver {
    public void update() {
        System.out.println("CarroObserver foi notificado e está respondendo a mudanças no carro.");
    }
}
