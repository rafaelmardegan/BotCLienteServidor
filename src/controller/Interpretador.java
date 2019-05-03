/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

public class Interpretador {
    
    
    

    public Interpretador() {
       

    }

    public void interpreta(String mensagem) {
        int resposta;
        String resp;
        if (mensagem.contains("autor")) {
            System.out.println("Devo exibir os nomes dos meus criadores? ");
            if (1 == 1) {                                                               // implementar 
                System.out.println("\nRafael Mardegan\nRafael Torres\nVagner Ereno");
                
            }
            
        }

}
    
    public int isComando(String msg){
        int resposta;
        
        if (msg.equalsIgnoreCase("/autores")) {
            resposta = 1;
        }
        else if(msg.equalsIgnoreCase("/noticias")){
            resposta = 2;
        }
        else if (msg.contains("/previsao")) {
            resposta = 3;
        }
        else if (msg.contains("/comandos")) {
            resposta = 4;
        }
       
        else{
            resposta = 0;
        }
        return resposta;
    }
    
}
