/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alejo-PC
 */
public class Persona {
    
    private String nombreP;
    private String telefonoP;
    private String correoP;

    public Persona() {
    }

    public Persona(String nombreP, String telefonoP, String correoP) {
        this.nombreP = nombreP;
        this.telefonoP = telefonoP;
        this.correoP = correoP;
    }
    
    

    /**
     * Get the value of correoP
     *
     * @return the value of correoP
     */
    public String getCorreoP() {
        return correoP;
    }

    /**
     * Set the value of correoP
     *
     * @param correoP new value of correoP
     */
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }


    /**
     * Get the value of telefonoP
     *
     * @return the value of telefonoP
     */
    public String getTelefonoP() {
        return telefonoP;
    }

    /**
     * Set the value of telefonoP
     *
     * @param telefonoP new value of telefonoP
     */
    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }


    /**
     * Get the value of nombreP
     *
     * @return the value of nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Set the value of nombreP
     *
     * @param nombreP new value of nombreP
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreP=" + nombreP + ", telefonoP=" + telefonoP + ", correoP=" + correoP + '}';
    }

}
