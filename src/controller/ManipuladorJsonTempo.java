package controller;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.ParserException;
import model.Cidade;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ManipuladorJsonTempo {

   final Cidade encontrada = new Cidade();
   
    
    
   //Utilizada para fazer a busca de uma determinada cidade e retornar os dados como temperatura maxima e minima... etc
    public String buscaCidade(String cidade, String estado) {
        ServidorTempo executa = ServidorTempo.getInstancia();
        JSONObject jSONObject;
        JSONArray jSONArray;
        
        
        JSONParser parser = new JSONParser();

        try {
            jSONArray = (JSONArray) parser.parse(executa.doBuscadorCidadeHTTP(cidade, estado));
            jSONObject = (JSONObject) jSONArray.get(0);
            encontrada.setId((String) jSONObject.get("id").toString());
            encontrada.setNome((String) jSONObject.get("name").toString());
            encontrada.setEstado((String) jSONObject.get("state").toString());
            encontrada.setPais((String) jSONObject.get("country").toString());

            return encontrada.getId();

        } catch (Exception e) {
            System.out.println("");
            System.out.println("####################################################");
            System.out.println("#           !!!Cidade não encontrada!!!            #");
            System.out.println("####################################################");
            System.out.println("");
        }

        return null;

    }

    //Preenche os dados do objeto cidade com os dados recolhidos do JSON e retorna o ID da cidade
    public Cidade preenchendoDadosCidadeEscolhida(String id) {
        ServidorTempo executa = ServidorTempo.getInstancia();
        JSONObject jSONObject;
        JSONArray jSONArray;
        ArrayList <String> lista = new ArrayList();
        String vetor[] = new String[9];
        JSONParser parser = new JSONParser();
        try {
            //jSONArray = (JSONArray) parser.parse(executa.doTempoAgora(encontrada.getId()));
            jSONObject = (JSONObject) parser.parse(executa.doTempoAgora(id));        
            encontrada.setId((String) jSONObject.get("id").toString());
            encontrada.setNome((String) jSONObject.get("name").toString());
            encontrada.setEstado((String) jSONObject.get("state").toString());
            encontrada.setPais((String) jSONObject.get("country").toString());
            encontrada.setDados((String) jSONObject.get("data").toString());
            Object ob = new Object();
            ob = jSONObject.get("data");
            
          
            vetor = ob.toString().split(",");
            encontrada.setVelocidadeDoVento(vetor[1].substring(16));
            encontrada.setCondicaoTempo(vetor[2].substring(13));
            encontrada.setTemperaturaAtual(vetor[4].substring(14));
            encontrada.setSensacaoTermica(vetor[3].substring(12));
            encontrada.setUmidadeRelativa(vetor[6].substring(11)+ ".");
                    
//{"0date":"2019-03-31 22:11:54","19.9,"2Muitas nuvens","3sensation":22,"422.3,"5icon":"2rn","6humidity":75.1,"7wind_direction":"E","8pressure":999.3}
           
           // JSONArray arr. (JSONArray) jSONObject.get("data");
          //  encontrada.setTemperaturaAtual((String)arr.get(0));
            
            //lista.add((String) jSONObject.get("data").toString().split(","));
            //encontrada.setTemperaturaAtual((String)jSONArray.get(0).toString());
            //encontrada.setTemperaturaAtual((String) jSONArray.get(0));
            //encontrada.setVelocidadeDoVento((String) jSONObject.get("wind_velocity").toString());
            //encontrada.setUmidadeRelativa((String) jSONObjectDuplo.get("humidity").toString());
            //encontrada.setCondicaoTempo((String) jSONObject.get("condition").toString());
            //encontrada.setSensacaoTermica((String) jSONObject.get("sensation").toString());

           
            return encontrada;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possivel preencher os dados climaticos!");
        }

        return null;

    }


    
    
    
    
   
}
