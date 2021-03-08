package com.company;

public class Usuario {
    //atributos
     private String usu;
     private String contra;
     String dire;
     String tele;
     String dni;
     String naci;

    // Constructor
    public Usuario(String usu, String contra) {
      this.usu= usu;
       this.contra = contra;
    }

    // Getters y setters
    public String getUsu() {
        return usu;
    }
    public void setUsu(String usu) {
        this.usu = usu;
    }
    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDire(String dire) {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getTele(String tele) {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getDni(String dni) {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNaci(String naci) {
        return naci;
    }

    public void setNaci(String naci) {
        this.naci = naci;
    }

    // Métodos especiales
    public String registro() {
        return this.usu + this.contra;
    }


}
