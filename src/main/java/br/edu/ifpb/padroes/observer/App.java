package br.edu.ifpb.padroes.observer;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jederson on 01/06/16.
 */
public class App {

    private String nome;
    private List<String> messages;
    private List<ObservadorApp> observadores;

    public App(String nome) {
        this.nome = nome;
        this.messages = new LinkedList<String>();
        this.observadores = new LinkedList<ObservadorApp>();
    }

    public void receiverNewMessage(String message){
        messages.add(message);
        notifyObservers();

    }

    public void addObserver(ObservadorApp observador){
        this.observadores.add(observador);
    }

    public void remObservador(ObservadorApp observador){
        this.observadores.remove(observador);
    }

    public void notifyObservers(){
        for (ObservadorApp observer:this.observadores){
            observer.atualizar(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdMessages() {
        return this.messages.size();
    }

    public List<String> getMessages() {
        return Collection.unmodifiableList(messages);
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
