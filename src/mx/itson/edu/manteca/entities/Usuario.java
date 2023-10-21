/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.manteca.entities;

/**
 *
 * @author manub
 */
public class Usuario {
    private String Nombre;
    private String Descripcion;
    private String Correo;
    private String Password;
    private boolean Crear = false;
    private boolean Editar = false;
    private boolean Eliminar = false;

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Crear
     */
    public boolean isCrear() {
        return Crear;
    }

    /**
     * @param Crear the Crear to set
     */
    public void setCrear(boolean Crear) {
        this.Crear = Crear;
    }

    /**
     * @return the Editar
     */
    public boolean isEditar() {
        return Editar;
    }

    /**
     * @param Editar the Editar to set
     */
    public void setEditar(boolean Editar) {
        this.Editar = Editar;
    }

    /**
     * @return the Eliminar
     */
    public boolean isEliminar() {
        return Eliminar;
    }

    /**
     * @param Eliminar the Eliminar to set
     */
    public void setEliminar(boolean Eliminar) {
        this.Eliminar = Eliminar;
    }
}
