package br.com.ronanjunior.anotacao;

import java.util.HashMap;
import java.util.Map;

public class Observable {
    private final String identificador;
    private final Map<String, ObserverInterface> observers = new HashMap<>();

    public Observable(String identificador) {
        this.identificador = identificador;
    }

    public void adicionarObserver(Object observer) {
        Class<?> observerClass = observer.getClass();

        if (observerClass.isAnnotationPresent(Observer.class)) {
            Observer annotation = observerClass.getAnnotation(Observer.class);
            String observado = annotation.observado();

            if (observado.equals(identificador)) {
                observers.put(observerClass.getName(), () -> {
                    try {
                        observerClass.getMethod("update").invoke(observer);
                    } catch (Exception e) {
                        System.err.println("Erro: Ocorreu um erro ao atualizar o observador");
                        e.printStackTrace();
                    }
                });
            }
        }
    }


    public void notificarObservadores() {
        observers.values().forEach(ObserverInterface::update);
    }
}

