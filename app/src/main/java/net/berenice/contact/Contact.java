package net.berenice.contact;

import java.io.Serializable;

public class Contact implements Serializable {
    private String nombre;
    private String email;
    private String twitter;
    private String tel;
    private String fechanac;

    public Contact(String nombre, String email, String twitter, String tel, String fechanac) {
        this.nombre = nombre;
        this.email = email;
        this.twitter = twitter;
        this.tel = tel;
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return nombre +"\n"+email;
    }
}
