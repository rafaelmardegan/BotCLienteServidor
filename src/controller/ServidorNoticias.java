package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class ServidorNoticias {

    //Url base da API e token para liberar o acesso por HTTP
    private static String URLBase = "http://apiadvisor.climatempo.com.br/";
    private static String token = "76a7d496043960edcbe022a610874be7";

    //Atributos com a instancia
    private static ServidorNoticias instancia;
    private CloseableHttpClient cliente;

    //Executa a chamada
    private ServidorNoticias() {
        this.cliente = HttpClients.createDefault();
    }

//Metodo para instanciar a chamada HTTP
    public static ServidorNoticias getInstancia() {

        //Verifica se ja tem algo instaciado, se sim retorna se não, cria
        if (instancia == null) {
            instancia = new ServidorNoticias();
        }
        return instancia;
    }

    //Faz a busca de cidade por nome e/ou estado
//    public String doBuscadorCidadeHTTP(String cidade, String estado) {
//        String retorno = null;
//        try {
//            HttpGet httpGet = new HttpGet("https://newsapi.org/v2/top-headlines?" +
//          "country=us&" +
//          "apiKey=c5844c7ea7ea4e59be8ac8dc0a154d4d");
//
//            //Aqui manipula o retorno recebido
//            ResponseHandler<String> respondeHandler = new ResponseHandler<String>() {
//                @Override
//                public String handleResponse(final HttpResponse resposta) throws ClientProtocolException, IOException {
//                    int status = resposta.getStatusLine().getStatusCode();
//                    //Verica se o retorno foi feito com sucesso ou deu erro
//                    if (status >= 200 && status < 300) {
//                        HttpEntity entity = resposta.getEntity();
//                        return entity != null ? EntityUtils.toString(entity) : null;
//                    } else {
//                        throw new ClientProtocolException("Erro inesperado ao receber resposta HTTP, código do erro:" + status);
//                    }
//                }
//
//            };
//            retorno = this.cliente.execute(httpGet, respondeHandler);
//            //System.out.println("------------------------------BUSCA----------------------------");
//        } catch (IOException ex) {
//            Logger.getLogger(ServidorNoticias.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return retorno;
//    }
    //Faz a requisição para o servidor mandando o codigo da cidade como parametro
    public String doTempoAgora() {
        String retorno = null;
        try {
            //HttpGet httpGet = new HttpGet(ServidorNoticias.URLBase+"/api/v1/weather/locale/363/current?token="+ServidorNoticias.token);
            HttpGet httpGet = new HttpGet("https://newsapi.org/v2/top-headlines?"
                    + "country=br&"
                    + "apiKey=c5844c7ea7ea4e59be8ac8dc0a154d4d");

            //Aqui manipula o retorno recebido
            ResponseHandler<String> respondeHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(final HttpResponse resposta) throws ClientProtocolException, IOException {
                    int status = resposta.getStatusLine().getStatusCode();
                    //Verica se o retorno foi feito com sucesso ou deu erro
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = resposta.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Erro inesperado ao receber resposta HTTP, código do erro:" + status);
                    }
                }

            };
            retorno = this.cliente.execute(httpGet, respondeHandler);
            //System.out.println("---------------------------------------------------------------");
        } catch (IOException ex) {
            Logger.getLogger(ServidorNoticias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    //Faz a requisição para o servidor mandando o codigo da cidade como parametro
    public String doTempoQuinzeDiAS(String idCidade) {
        String retorno = null;
        try {
            HttpGet httpGet = new HttpGet(ServidorNoticias.URLBase + idCidade + ServidorNoticias.token);

            //Aqui manipula o retorno recebido
            ResponseHandler<String> respondeHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(final HttpResponse resposta) throws ClientProtocolException, IOException {
                    int status = resposta.getStatusLine().getStatusCode();
                    //Verica se o retorno foi feito com sucesso ou deu erro
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = resposta.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Erro inesperado ao receber resposta HTTP, código do erro:" + status);
                    }
                }

            };
            retorno = this.cliente.execute(httpGet, respondeHandler);
            System.out.println("---------------------------------------------------------------");
        } catch (IOException ex) {
            Logger.getLogger(ServidorNoticias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

}
