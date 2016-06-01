package br.edu.ifpb.padroes.observer;

import java.util.Date;

/**
 * Created by jederson on 01/06/16.
 */
public class NotificationArea implements ObservadorApp{

    private int readMessage;

    public void atualizar(App app) {
        if (readMessage < app.getQtdMessages()){
            for(int i = readMessage-1;i < app.getQtdMessages();i++){
                System.out.println("Recebi do app " + app + " a mensagem " + app.getMessages().get(i)+ " as " + new Date());
            }
            readMessage = app.getQtdMessages();
        }

    }
}
