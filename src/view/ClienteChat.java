/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import controller.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cidade;
import model.Noticia;


public class ClienteChat extends javax.swing.JFrame {

    
    Interpretador interpretador = new Interpretador();
    boolean isPrevisao = true;
    String nome = "brow";
    int cont = 0;
   

    public ClienteChat() throws InterruptedException {
        initComponents();
        
        jTextAreaChat.setText(modeloResposta() + cumprimento()+ ", seja bem-vindo ao iBot. ☻\n");
        jTextAreaChat.setText(modeloResposta() + "Meu nome é Francisquinho, qual é o seu?\n");
        btEnviar.setEnabled(false);

       



        

    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jTextFieldMensagem = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        jTextAreaChat.setEditable(false);
        jTextAreaChat.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaChat.setColumns(20);
        jTextAreaChat.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jTextAreaChat.setForeground(new java.awt.Color(0, 255, 102));
        jTextAreaChat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaChat);

        jTextFieldMensagem.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldMensagem.setForeground(new java.awt.Color(0, 153, 0));
        jTextFieldMensagem.setText("Escreva aqui sua mensagem...");
        jTextFieldMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldMensagemMouseClicked(evt);
            }
        });
        jTextFieldMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMensagemActionPerformed(evt);
            }
        });
        jTextFieldMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMensagemKeyPressed(evt);
            }
        });

        btEnviar.setBackground(new java.awt.Color(0, 0, 255));
        btEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/chatbot.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("by francisquinho");

        btLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/uni2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/uni3.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Vrinda", 1, 52)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("iBot");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/sobre.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1021, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(567, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private String cumprimento(){
       String aux = "";
       LocalTime inicioManha = LocalTime.of(06, 00);
       LocalTime fimManha = LocalTime.of(11, 59);
       
       LocalTime inicioTarde = LocalTime.of(12, 00);
       LocalTime fimTarde = LocalTime.of(18, 30);
       
       LocalTime inicioNoite = LocalTime.of(18, 31);
       LocalTime fimNoite = LocalTime.of(23, 59);

       LocalTime agora = LocalTime.now();
       if(agora.isAfter(inicioManha) && agora.isBefore(fimManha)){
           aux = "Bom dia";
       }
       else if (agora.isAfter(inicioTarde) && agora.isBefore(fimTarde)) {
           aux = "Boa tarde";
       }
       else if(agora.isAfter(inicioNoite) && agora.isBefore(fimNoite)){
           aux = "Boa noite";
       }
       else{
           aux = "Olá";
       }
       
       return aux;
   }
    
    private String horaMsg() {
        String min;
        if (LocalTime.now().getMinute() < 10) {
            min = "0" + String.valueOf(LocalTime.now().getMinute());
        } else {
            min = String.valueOf(LocalTime.now().getMinute());
        }
        String hora = String.valueOf(LocalTime.now().getHour());
        String horario = hora + ":" + min;
        return horario;
    }

    public  String modeloResposta() {

        return jTextAreaChat.getText() + "(" + horaMsg() + ") Francisquinho: ";
    }

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        cont++;
        jTextAreaChat.setText(jTextAreaChat.getText() + "(" + horaMsg() + ") Eu: " + jTextFieldMensagem.getText() + "\n\n"); // atualiza a text area com a nova mensagem.
        
        if (cont == 1) {
            
                nome = jTextFieldMensagem.getText();
            
            
            
            jTextAreaChat.setText(modeloResposta() + "Ok " + nome + ", muito prazer!\n");
            jTextAreaChat.setText(modeloResposta() + "eu posso te oferecer alguns serviços como previsão do tempo, notícias, etc.\n");
            jTextAreaChat.setText(modeloResposta() + "esses serviços funcionam através de comandos, quer que eu te liste esses comandos?\n");
        }   
        if (cont == 2) {
            if(jTextFieldMensagem.getText().equalsIgnoreCase("sim") || jTextFieldMensagem.getText().equalsIgnoreCase("quero") || jTextFieldMensagem.getText().equalsIgnoreCase("aham") || jTextFieldMensagem.getText().equalsIgnoreCase("s")){
                jTextAreaChat.setText(modeloResposta() + "/comandos - esse te lista os comandos disponíveis.\n");                
                jTextAreaChat.setText(modeloResposta() + "/autores - esse comando vai te dizer os nomes dos meus desenvolvedores.\n");
                jTextAreaChat.setText(modeloResposta() + "/noticias - se tu digitar esse eu vou buscar as notícias recém saídas do forno pra ti.\n");
                jTextAreaChat.setText(modeloResposta() + "/previsao(nome_da_cidade, sigla_do_estado) - Exemplo: /previsao(alegrete, rs)\n");
                jTextAreaChat.setText(modeloResposta() + "com esse eu pesquiso a previsão do tempo da cidade que tu quiser.\n");

            }
            else if (jTextFieldMensagem.getText().equalsIgnoreCase("não") || jTextFieldMensagem.getText().equalsIgnoreCase("nao") || jTextFieldMensagem.getText().equalsIgnoreCase("n") ) {
            jTextAreaChat.setText(modeloResposta() + "Beleza, " + nome +  ".\n");

            }
            else{
            jTextAreaChat.setText(modeloResposta() + "olokinho meu, não entendi o que tu quis dizer " + nome + ". :(\n");

            }
            
        }
            
        

        int retorno = interpretador.isComando(jTextFieldMensagem.getText());
        String comando = jTextFieldMensagem.getText();
        jTextFieldMensagem.setText("");
        if (retorno == 1) {
            jTextAreaChat.setText(modeloResposta() + "Fui desenvolvido pelo trio Rafael Mardegan, Rafael Torres e Vagner Ereno.\n");
            jTextAreaChat.setText(modeloResposta() + "Como resultado de um trabalho da disciplina de Redes e Sistemas Distribuídos.\n");


        } else if (retorno == 2) {

            ServidorNoticias executa = ServidorNoticias.getInstancia();
            ManipuladorJsonNoticia json = new ManipuladorJsonNoticia(0);
            ManipuladorJsonNoticia json2 = new ManipuladorJsonNoticia(2);
            ManipuladorJsonNoticia json3 = new ManipuladorJsonNoticia(4);

            Noticia selecionada = json.preenchendoDadosNoticia();
            Noticia selecionada2 = json2.preenchendoDadosNoticia();
            Noticia selecionada3 = json3.preenchendoDadosNoticia();

            jTextAreaChat.setText(modeloResposta() + "Autor: " + selecionada.getAutor() + "\n");
            jTextAreaChat.setText(modeloResposta() + "Título: " + selecionada.getTitulo() + "\n");

            jTextAreaChat.setText(modeloResposta() + "Resumo: " + selecionada.getTitulo() + "\n");
            for (int i = 0; i < selecionada.getResumo().size(); i++) {
                jTextAreaChat.setText(modeloResposta() + selecionada.getResumo().get(i).toString() + "\n");
                //System.out.println(selecionada.getResumo().get(i).toString());
            }

            jTextAreaChat.setText(modeloResposta() + "Veja a notícia completa em: \n" + selecionada.getSensacaoTermica() + "\n\n=============================\n\n");

            jTextAreaChat.setText(modeloResposta() + "Autor: " + selecionada2.getAutor() + "\n");
            jTextAreaChat.setText(modeloResposta() + "Título: " + selecionada2.getTitulo() + "\n");

            jTextAreaChat.setText(modeloResposta() + "Resumo: " + selecionada2.getTitulo() + "\n");
            for (int i = 0; i < selecionada2.getResumo().size(); i++) {
                jTextAreaChat.setText(modeloResposta() + selecionada2.getResumo().get(i).toString() + "\n");

            }

            jTextAreaChat.setText(modeloResposta() + "Veja a notícia completa em: \n" + selecionada2.getSensacaoTermica() + "\n\n=============================\n\n");

            jTextAreaChat.setText(modeloResposta() + "Autor: " + selecionada3.getAutor() + "\n");
            jTextAreaChat.setText(modeloResposta() + "Título: " + selecionada3.getTitulo() + "\n");

            jTextAreaChat.setText(modeloResposta() + "Resumo: " + selecionada3.getTitulo() + "\n");
            for (int i = 0; i < selecionada3.getResumo().size(); i++) {
                jTextAreaChat.setText(modeloResposta() + selecionada3.getResumo().get(i).toString() + "\n");
                //System.out.println(selecionada.getResumo().get(i).toString());
            }

            jTextAreaChat.setText(modeloResposta() + "Veja a notícia completa em: \n" + selecionada3.getSensacaoTermica() + "\n\n=============================\n\n");

        } else if (retorno == 3) {

            // /previsao(porto alegre, rs)
            String aux = comando.replaceAll("/previsao", "");
            aux = aux.replace("(", "");
            aux = aux.replace(")", "");
            String vet[] = new String[2];
            vet = aux.split(",");
            try{
            for (int i = 0; i < 2; i++) {
                vet[i] = vet[i].trim();
                vet[i] = vet[i].replaceAll(" ", "+");

                //jTextAreaChat.setText(modeloResposta() +"linha "+ i +  vet[i]+".");
            }
            ServidorTempo executa = ServidorTempo.getInstancia();
            ManipuladorJsonTempo json = new ManipuladorJsonTempo();
            String id = json.buscaCidade(vet[0], vet[1]);
            

            while (id == null) {
               
            jTextAreaChat.setText(modeloResposta() + "Ops, parace que algo deu errado.\n");
            jTextAreaChat.setText(modeloResposta() + "Faz assim "+ nome +", verifica se o nome da cidade e sigla do estado que tu digitou estão corretos e tenta outra vez.\n");


                isPrevisao = false;
                break;
            }

            if (isPrevisao) {
                //Preenche com o restante de dados climaticos
                Cidade selecionada = json.preenchendoDadosCidadeEscolhida(id);

                //System.out.println("O nome da cidade selecionada é " + selecionada.getNome() + ", Seu Estado " + selecionada.getEstado() + " e seu País " + selecionada.getPais());
                jTextAreaChat.setText(modeloResposta() + "Cidade: " + selecionada.getNome() + "\n");
                jTextAreaChat.setText(modeloResposta() + "Estado: " + selecionada.getEstado() + "\n");
                jTextAreaChat.setText(modeloResposta() + "País: " + selecionada.getPais() + "\n");
                jTextAreaChat.setText(modeloResposta() + "Temperatura: " + selecionada.getTemperaturaAtual() + "° C\n");
                jTextAreaChat.setText(modeloResposta() + "Sensação térmica: " + selecionada.getSensacaoTermica() + "° C\n");
                jTextAreaChat.setText(modeloResposta() + "Umidade relativa do ar: " + selecionada.getUmidadeRelativa() + "%\n");
                jTextAreaChat.setText(modeloResposta() + "Velocidade do vento: " + selecionada.getVelocidadeDoVento() + " km/h\n");
                jTextAreaChat.setText(modeloResposta() + "Condição do tempo: " + selecionada.getCondicaoTempo().replaceAll("\"", "") + "\n\n=============================\n\n");

            }
            }catch(Exception e){
                jTextAreaChat.setText(modeloResposta() + "Ops, parace que algo deu errado.\n");
                jTextAreaChat.setText(modeloResposta() + "O comando de previsão deve seguir o seguinte formato: /previsao(Nome da Cidade, sigla do estado)\n");
                jTextAreaChat.setText(modeloResposta() + "Exemplo: /previsao(porto alegre, rs)\n");
 
            }

        }
        else if(retorno == 4){
            jTextAreaChat.setText(modeloResposta() + "/comandos - esse te lista os comandos disponíveis.\n");                
            jTextAreaChat.setText(modeloResposta() + "/autores - esse comando vai te dizer os nomes dos meus desenvolvedores.\n");
            jTextAreaChat.setText(modeloResposta() + "/noticias - se tu digitar esse eu vou buscar as notícias recém saídas do forno pra ti.\n");
            jTextAreaChat.setText(modeloResposta() + "/previsao(nome_da_cidade, sigla_do_estado) - Exemplo: /previsao(alegrete, rs)\n");
            jTextAreaChat.setText(modeloResposta() + "com esse eu pesquiso a previsão do tempo da cidade que tu quiser.\n");    
        }
        jTextFieldMensagem.grabFocus();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void jTextFieldMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMensagemActionPerformed

    }//GEN-LAST:event_jTextFieldMensagemActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        jTextAreaChat.setText("");
    }//GEN-LAST:event_btLimparActionPerformed
    int clics = 0;
    private void jTextFieldMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMensagemMouseClicked
        clics++;
        if (clics == 1) {
            jTextFieldMensagem.setText("");
            btEnviar.setEnabled(true);
        }

    }//GEN-LAST:event_jTextFieldMensagemMouseClicked

    private void jTextFieldMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMensagemKeyPressed

    }//GEN-LAST:event_jTextFieldMensagemKeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       new Sobre().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ClienteChat().setVisible(true);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClienteChat.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldMensagem;
    // End of variables declaration//GEN-END:variables
}
