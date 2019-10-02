package net.berenice.contact;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Contact implements Parcelable {
    public String nombre;
    public String email;
    public String twitter;
    public String tel;
    public String fechanac;


    public Contact(Parcel in) {
        nombre = in.readString();
        email = in.readString();
        twitter = in.readString();
        tel = in.readString();
        fechanac = in.readString();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(email);
        dest.writeString(twitter);
        dest.writeString(tel);
        dest.writeString(fechanac);
    }

    public Contact(String nombre, String email, String twitter, String tel, String fechanac) {
        this.nombre = nombre;
        this.email = email;
        this.twitter = twitter;
        this.tel = tel;
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }
}
