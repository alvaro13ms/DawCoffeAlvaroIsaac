/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.coffee;

/**
 *
 * @author Álvaro
 */
public class UsuarioAdministrador {

    //Declaración de variables
    private String usuario;
    private String contrasenia;

    //Constructor parametrizado
    public UsuarioAdministrador(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    //Constructor por defecto
    public UsuarioAdministrador() {
        this.usuario = "daw";
        this.contrasenia = "daw";
    }

//Métodos getters y setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //Método toString
    @Override
    public String toString() {
        return "UsuarioAdministrador{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }

}
