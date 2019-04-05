package previsaotempo;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
  
        Scanner e = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo!");
        System.out.println("Qual o seu nome?");
        String nome = e.nextLine();
        System.out.println("");
        System.out.println("Muito bem " + nome + ", vamos começar!");
        System.out.println("");
        System.out.println("Digite o nome da cidade que deseja fazer a busca");
        String cidade = e.nextLine().replaceAll(" ", "+");
        System.out.println("Para melhorar a pesquisa, digite também a sigla do seu estado");
        String estado = e.next();
        
        
        //Chama o executor
        ExecutorAPI executa = ExecutorAPI.getInstancia();
        LerJson json = new LerJson();

        //Busca o id da cidade 
        String id = json.buscaCidade(cidade, estado);

        
       while (id == null) {      
            System.out.println("Por favor, digite novamente a cidade");
            cidade = e.next();
            System.out.println("Não podemos esquecer o estado");
            estado = e.next();
            id = json.buscaCidade(cidade, estado);
        }
        //Preenche com o restante de dados climaticos
       Cidade selecionada = json.preenchendoDadosCidadeEscolhida(id);

        //Imprime o resultado
        System.out.println("");
        //System.out.println("O nome da cidade selecionada é " + selecionada.getNome() + ", Seu Estado " + selecionada.getEstado() + " e seu País " + selecionada.getPais());
        System.out.println("Cidade: " + selecionada.getNome());
        System.out.println("Estado: " + selecionada.getEstado());
        System.out.println("País: " + selecionada.getPais());

        //Imprime dados que estão dentro da Array do JSON
        //System.out.println(selecionada.getDados().toString());
        System.out.println("Temperatura: " + selecionada.getTemperaturaAtual()+ "° C");
        System.out.println("Sensação térmica: " + selecionada.getSensacaoTermica()+ "° C");
        System.out.println("Umidade relativa do ar: " + selecionada.getUmidadeRelativa()+ "%") ;
        System.out.println("Velocidade do vento: " + selecionada.getVelocidadeDoVento() + " km/h");
        System.out.println("Condição do tempo: " + selecionada.getCondicaoTempo().replaceAll("\"", ""));
        // selecionada.getTemperaturaAtual();
        
        
    }
}
