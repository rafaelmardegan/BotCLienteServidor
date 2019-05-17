package view;

import controller.ManipuladorJsonTempo;
import controller.ManipuladorJsonNoticia;
import model.Cidade;
import model.Noticia;
import controller.ServidorTempo;
import controller.ServidorNoticias;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        
        
        System.out.println("                                   ``.,,,............`                         \n" +
"                         `.,,.........................,                        \n" +
"                       ,..................,:;''';;;;...,                       \n" +
"                      .......,,:;;'';;;;;;;;''';;;;;;...                       \n" +
"                     ...,';;;;;;;;;;;;;;;;;.....;;;;;;..,                      \n" +
"                    ,..';;;;;;;,:';;;;;;;:.......:;;;;,..                      \n" +
"                    ..:;;;;;:......';;;;'..+++++..';;;'..                      \n" +
"                   `..;;;;;:..,';...;;;;..++++++;.,;;;'..                      \n" +
"                   ,..;;;;'..+++++,.,;;;..+++++++..;;;'..`                     \n" +
"                   ,..;;;;:.:++++++..;;;..+++++++..;;;;...                     \n" +
"           .,.`    ...;;;;,.+++++++..;;;,.;+++++,.:;;;;...                     \n" +
"           ...,    ...;;;;,.;++++++..;;;'..'+++;..;;;;;...                     \n" +
"  `.       ...,    `..';;;'..+++++;..;;;;;.......';;;;'..`         ,.`         \n" +
"  ..       ....     ..';;;;,..'++,..';;;;;'....,;;;;;;:..          ....        \n" +
" ....     ....`     ..:;;;;;,......';;;;;;;;;;;;;;;;;'..,          ...,     .  \n" +
" ..... `,.....      ...;;;;;;',..:;;;;;;;;;;;;;;;;;;:...          `...`    `.. \n" +
"  ...........`      `..:;;;;;;;;;;;;;;;;;;''';:,,......           ....    `....\n" +
"   .........         ,...';;;;''';::,................,            ....`  `....,\n" +
"    ......:;          ,..........................,,.              `....,...... \n" +
"      ```;;;;          ...............,,.,:;                       ,.........  \n" +
"         ;;;;            `....``        ,;;;,                      `.......,   \n" +
"         ';;;                            ;;;;                      ';;.....    \n" +
"         ,;;;:                           ;;;'                      ;;;;        \n" +
"          ;;;;                           ;;;;                      ;;;'        \n" +
"          ';;;`                         `;;;,                     ;;;;`        \n" +
"          `;;;'                         :;;;`                     ;;;;         \n" +
"           ;;;;.             ```````````::::``````````           .;;;'         \n" +
"           .;;;;            ..........................,          ;;;;          \n" +
"            ';;;;,          ...........................         ,;;;'          \n" +
"             ;;;;;;:        ....,''''''''''''''''':....        `;;;;`          \n" +
"              ;;;;;;;;',    ....;;;;;;;;;;;;;;;;;;'....       ';;;;'           \n" +
"               ';;;;;;;;;;;;....';............`..,'....  `:';;;;;;;            \n" +
"                `';;;;;;;;;:....',...  .......`...;....;;;;;;;;;;;             \n" +
"                   .';;;;;;,....;...`. ...........;....:;;;;;;;;:              \n" +
"                       .;';.....;`..`.`..```.`. ` ;....,;;;;;'`                \n" +
"                           ,....;.....`.....``....;.....;:`                    \n" +
"                           .....;......`..........;,...,                       \n" +
"                           ....,;.................':....                       \n" +
"                           ....,;;;;;;;;;;;;;;;;;;;:....                       \n" +
"                           .............................                       \n" +
"                           .............................                       \n" +
"                          `.....';..,;'.................                       \n" +
"                          .....:;;;.';;.................`                      \n" +
"                          ,.....;;..:;'..................                      \n" +
"                          ,..............................                      \n" +
"                          ..............................,                      \n" +
"                          ..............................,                      \n" +
"                          ...............................                      \n" +
"                          ...............................                      \n" +
"                          ...............................                      \n" +
"                         `...............................                      \n" +
"                         ................................`                     \n" +
"                         ,................................                     \n" +
"                         ,...............................,                     \n" +
"                         ................................,                     \n" +
"                         ................................,                     \n" +
"                                 ''''        ''''                              \n" +
"                                 ;;;'        ;;;;                              \n" +
"                                 ;;;'        ';;;                              \n" +
"                                 ;;;'        ;;;;                              \n" +
"                                 ;;;'        ;;;;                              \n" +
"                                 ;;;;        ,;;;`                             \n" +
"                                 ;';;        `;'',                             \n" +
"                                ....,         ...,                             \n" +
"                               ......`       ......                            \n" +
"                              ........      ........`                          \n" +
"                            `..........    ..........`                         \n" +
"                            ...........,  ,...........                         \n" +
"                           ............. `...........,  ");
        
        
        
        
        
        
        
        
        
        
        
//        int entrada;
//        Scanner e = new Scanner(System.in);
//        do{
//            
//        
//        System.out.println("===============================================================================\nSelecione a opção:\nPrevisão: 1\nNotícias: 2\nQualquer outra tecla para sair");
//        entrada = e.nextInt(); 
//        if (entrada == 1) {
//            e.nextLine();
//            // System.out.println("Olá, seja bem vindo!");
//            //System.out.println("Qual o seu nome?");
//            //String nome = e.nextLine();
//            //System.out.println("");
//            // System.out.println("Muito bem " + nome + ", vamos começar!");
//            //System.out.println("");
//            System.out.println("Cidade:");
//            String cidade = e.nextLine().replaceAll(" ", "+");
//            System.out.println("Sigla do estado");
//            String estado = e.next();
//
//            //Chama o executor
//            ServidorTempo executa = ServidorTempo.getInstancia();
//            ManipuladorJsonTempo json = new ManipuladorJsonTempo();
//
//            //Busca o id da cidade 
//            String id = json.buscaCidade(cidade, estado);
//
//            while (id == null) {
//                System.out.println("Por favor, digite novamente a cidade");
//                cidade = e.next();
//                System.out.println("Não podemos esquecer o estado");
//                estado = e.next();
//                id = json.buscaCidade(cidade, estado);
//            }
//            //Preenche com o restante de dados climaticos
//            Cidade selecionada = json.preenchendoDadosCidadeEscolhida(id);
//
//            //Imprime o resultado
//            System.out.println("");
//            //System.out.println("O nome da cidade selecionada é " + selecionada.getNome() + ", Seu Estado " + selecionada.getEstado() + " e seu País " + selecionada.getPais());
//            System.out.println("Cidade: " + selecionada.getNome());
//            System.out.println("Estado: " + selecionada.getEstado());
//            System.out.println("País: " + selecionada.getPais());
//
//            //Imprime dados que estão dentro da Array do JSON
//            //System.out.println(selecionada.getDados().toString());
//            System.out.println("Temperatura: " + selecionada.getTemperaturaAtual() + "° C");
//            System.out.println("Sensação térmica: " + selecionada.getSensacaoTermica() + "° C");
//            System.out.println("Umidade relativa do ar: " + selecionada.getUmidadeRelativa() + "%");
//            System.out.println("Velocidade do vento: " + selecionada.getVelocidadeDoVento() + " km/h");
//            System.out.println("Condição do tempo: " + selecionada.getCondicaoTempo().replaceAll("\"", ""));
//            // selecionada.getTemperaturaAtual();
//
//        } else if (entrada == 2) {
//             e.nextLine();
//             System.out.println("Buscando...");
//            ServidorNoticias executa = ServidorNoticias.getInstancia();
//            ManipuladorJsonNoticia json = new ManipuladorJsonNoticia(0);
//            ManipuladorJsonNoticia json2 = new ManipuladorJsonNoticia(2);
//            ManipuladorJsonNoticia json3 = new ManipuladorJsonNoticia(4);
//
//            Noticia selecionada = json.preenchendoDadosCidadeEscolhida();
//            Noticia selecionada2 = json2.preenchendoDadosCidadeEscolhida();
//            Noticia selecionada3 = json3.preenchendoDadosCidadeEscolhida();
//
//            System.out.println("");
//            System.out.println("Autor: \n" + selecionada.getAutor());
//            System.out.println("Título: \n" + selecionada.getTitulo());
//            System.out.println("");
//            System.out.println("Resumo: \n");
//            for (int i = 0; i < selecionada.getResumo().size(); i++) {
//                System.out.println(selecionada.getResumo().get(i).toString());
//            }
//            System.out.println("");
//            System.out.println("Veja a notícia completa em: \n" + selecionada.getSensacaoTermica());
//
//            System.out.println("----------------------------------------------------------------------");
//            System.out.println("");
//            System.out.println("Autor: \n" + selecionada2.getAutor());
//            System.out.println("Título: \n" + selecionada2.getTitulo());
//            System.out.println("");
//            System.out.println("Resumo: \n");
//            for (int i = 0; i < selecionada2.getResumo().size(); i++) {
//                System.out.println(selecionada2.getResumo().get(i).toString());
//            }
//            System.out.println("");
//            System.out.println("Veja a notícia completa em: \n" + selecionada2.getSensacaoTermica());
//
//            System.out.println("----------------------------------------------------------------------");
//            System.out.println("");
//            System.out.println("Autor: \n" + selecionada3.getAutor());
//            System.out.println("Título: \n" + selecionada3.getTitulo());
//            System.out.println("");
//            System.out.println("Resumo: \n");
//            for (int i = 0; i < selecionada3.getResumo().size(); i++) {
//                System.out.println(selecionada3.getResumo().get(i).toString());
//            }
//            System.out.println("");
//            System.out.println("Veja a notícia completa em: \n" + selecionada3.getSensacaoTermica());
//
//        } 
//        
//        }while(entrada == 1 || entrada == 2);
//        System.exit(0);
    }
}
