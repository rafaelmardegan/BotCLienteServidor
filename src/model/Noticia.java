package model;

import java.util.ArrayList;
import org.json.simple.JSONArray;

public class  Noticia {
    //private ArrayList dados;
    private String dados;
    private String id;
    private String autor;
    private String estado;
    private String titulo;
    private String data;
    private String temperaturaAtual;
    private String velocidadeDoVento;
    private String umidadeRelativa;
    private String condicaoTempo;
    private String sensacaoTermica;
    private ArrayList<String> resumo;

    public Noticia() {
        this.resumo = new ArrayList();
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the resumo
     */
    public ArrayList getResumo() {
        return resumo;
    }

    /**
     * @param noticias the resumo to set
     */
    public void setResumo(ArrayList resumo) {
        this.resumo = resumo;
    }

    /**
     * @param dados the dados to set
     */
    //public void setDados(String dados) {
    //    this.dados = dados;
   // }
    
    public void addResumo(String resumo){
        this.resumo.add(resumo);
    }
    
}
