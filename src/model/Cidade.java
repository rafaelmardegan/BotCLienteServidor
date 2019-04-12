package model;

import java.util.ArrayList;
import org.json.simple.JSONArray;

public class  Cidade {
    //private ArrayList dados;
    private String dados;
    private String id;
    private String nome;
    private String estado;
    private String pais;
    private String data;
    private String temperaturaAtual;
    private String velocidadeDoVento;
    private String umidadeRelativa;
    private String condicaoTempo;
    private String sensacaoTermica;
    private ArrayList noticia;

    public Cidade() {
        this.noticia = new ArrayList();
    }
    
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the temperaturaAtual
     */
    public String getTemperaturaAtual() {
        return temperaturaAtual;
    }

    /**
     * @param temperaturaAtual the temperaturaAtual to set
     */
    public void setTemperaturaAtual(String temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    /**
     * @return the velocidadeDoVento
     */
    public String getVelocidadeDoVento() {
        return velocidadeDoVento;
    }

    /**
     * @param velocidadeDoVento the velocidadeDoVento to set
     */
    public void setVelocidadeDoVento(String velocidadeDoVento) {
        this.velocidadeDoVento = velocidadeDoVento;
    }

    /**
     * @return the umidadeRelativa
     */
    public String getUmidadeRelativa() {
        return umidadeRelativa;
    }

    /**
     * @param umidadeRelativa the umidadeRelativa to set
     */
    public void setUmidadeRelativa(String umidadeRelativa) {
        this.umidadeRelativa = umidadeRelativa;
    }

    /**
     * @return the condicaoTempo
     */
    public String getCondicaoTempo() {
        return condicaoTempo;
    }

    /**
     * @param condicaoTempo the condicaoTempo to set
     */
    public void setCondicaoTempo(String condicaoTempo) {
        this.condicaoTempo = condicaoTempo;
    }

    /**
     * @return the sensacaoTermica
     */
    public String getSensacaoTermica() {
        return sensacaoTermica;
    }

    /**
     * @param sensacaoTermica the sensacaoTermica to set
     */
    public void setSensacaoTermica(String sensacaoTermica) {
        this.sensacaoTermica = sensacaoTermica;
    }

    /**
     * @return the dados
     */
    public String getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(String dados) {
        this.dados=dados;
    }

    /**
     * @return the noticia
     */
    public ArrayList getNoticia() {
        return noticia;
    }

    /**
     * @param noticia the noticia to set
     */
    public void setNoticia(ArrayList noticia) {
        this.noticia = noticia;
    }

    /**
     * @param dados the dados to set
     */
    //public void setDados(String dados) {
    //    this.dados = dados;
   // }
    
}
