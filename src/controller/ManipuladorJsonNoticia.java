package controller;

import java.util.ArrayList;
import java.util.Iterator;
import jdk.nashorn.internal.runtime.ParserException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import model.Noticia;

public class ManipuladorJsonNoticia {

    final Noticia encontrada = new Noticia();
    int numero;

    public ManipuladorJsonNoticia(int numero) {
        this.numero = numero;
    }

    //Preenche os dados do objeto Noticia com os dados recolhidos do JSON
    public Noticia preenchendoDadosCidadeEscolhida() {
        ServidorNoticias executa = ServidorNoticias.getInstancia();
        JSONObject jSONObject;
        JSONObject jo = new JSONObject();
        JSONArray jSONArray;
        ArrayList<String> lista = new ArrayList();
        String vetor[] = new String[50];
        JSONParser parser = new JSONParser();
        try {

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = " ";

            }

            jSONObject = (JSONObject) parser.parse(executa.doTempoAgora());
            JSONArray msg = (JSONArray) jSONObject.get("articles");
            JSONArray msg2 = (JSONArray) jSONObject.get("articles");
            int tam = msg.size();

            jo = (JSONObject) msg.get(numero);

            if (jo.get("author") == null) {

                encontrada.setAutor("Indisponível");
            } else {
                encontrada.setAutor((String) jo.get("author").toString());
            }

            if (jo.get("title") == null) {

                encontrada.setTitulo("Indisponível");
            } else {
                encontrada.setTitulo((String) jo.get("title").toString());
            }
            
            if (jo.get("content") == null) {

                encontrada.addResumo("Indisponível");
            } else {
                String aux = (String) jo.get("content").toString();

            vetor = aux.split("\\.");
            for (int i = 0; i < vetor.length; i++) {

                encontrada.addResumo(vetor[i]);
            }

            

            }
            if(jo.get("url") == null){
                 encontrada.setSensacaoTermica("Indisponível");
                
            }
            else{
                encontrada.setSensacaoTermica((String) jo.get("url").toString());
            }
            
//            for(int i = 0 ; i<4; i++){
//                jo = (JSONObject)msg.get(i);
//                encontrada.setNome((String)jo.get("author").toString());
//                encontrada.setPais((String)jo.get("title").toString());
//                encontrada.setDados((String)jo.get("description").toString());
//                encontrada.setSensacaoTermica((String)jo.get("url").toString());
//            }

//             Iterator<JSONObject> iterator = msg.iterator();
//             int i = 0;
//            while (iterator.hasNext()) {
//                if(i == 0){
//                    jo = iterator.next();
//                    encontrada.setDados((String) jo.get("id"));
//                }
//                
//                
            return encontrada;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possivel buscar as notícias!");
        }

        return null;

    }

}
