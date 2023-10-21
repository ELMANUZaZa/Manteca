/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.manteca.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manub
 */
public class Post {
     private String Titulo;
private String Respuesta;
    private Date Fecha;
    private List<String> Categorias = new ArrayList<>();
    private int Rpositivas = 0;
    private int Rnegativas = 0;
    private List<Usuario> usuarios = new ArrayList<>();
    private String URL;

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Categorias
     */
    public List<String> getCategorias() {
        return Categorias;
    }

    /**
     * @param Categorias the Categorias to set
     */
    public void setCategorias(List<String> Categorias) {
        this.Categorias = Categorias;
    }

    /**
     * @return the Rpositivas
     */
    public int getRpositivas() {
        return Rpositivas;
    }

    /**
     * @param Rpositivas the Rpositivas to set
     */
    public void setRpositivas(int Rpositivas) {
        this.Rpositivas = Rpositivas;
    }

    /**
     * @return the Rnegativas
     */
    public int getRnegativas() {
        return Rnegativas;
    }

    /**
     * @param Rnegativas the Rnegativas to set
     */
    public void setRnegativas(int Rnegativas) {
        this.Rnegativas = Rnegativas;
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the URL
     */
    public String getURL() {
        return URL;
    }

    /**
     * @param URL the URL to set
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

}
