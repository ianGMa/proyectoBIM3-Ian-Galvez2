/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

 
public class contacto {
    String Telefono, Nombre, Domicilio;

    public contacto(String Telefono, String Nombre, String Domicilio) {

        this.Telefono = Telefono;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
    }

    public String verTelefono() {
        return Telefono;
    }

    public String verNombre() {
        return Nombre;
    }

    public String verDomicilio() {
        return Domicilio;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

}


