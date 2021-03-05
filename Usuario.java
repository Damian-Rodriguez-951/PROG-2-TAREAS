package com.company;

public class Usuario {
    //atributos
     private String usu;
     private String contra;
     String dire;
     String tele;

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

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    // Métodos especiales
    public String registro() {
        return this.usu + this.contra;
    }
    public String cambio() {
        return this.usu + this.contra;
    }
    public String dire(String direccion){
        return this.dire;
    }
}
