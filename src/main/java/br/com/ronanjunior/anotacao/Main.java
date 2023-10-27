package br.com.ronanjunior.anotacao;

public class Main {
    public static void main(String[] args) {
        Observable carroObservable = new Observable("carro");

        CarroObserver observer1 = new CarroObserver();
        CarroObserver observer2 = new CarroObserver();

        carroObservable.adicionarObserver(observer1);
        carroObservable.adicionarObserver(observer2);

        carroObservable.notificarObservadores();
    }
}
