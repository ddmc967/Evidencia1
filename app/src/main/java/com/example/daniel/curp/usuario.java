package com.example.daniel.curp;

import android.os.Parcel;
import android.os.Parcelable;

public class usuario implements Parcelable {
    String nombre;
    String primerapellido;
    String segundoapellido;
    String fechanacimiento;
    String entidad;
    String sexo;

    public usuario(){
        this.nombre = "";
        this.primerapellido = "";
        this.segundoapellido = "";
        this.fechanacimiento = "";
        this.entidad = "";
        this.sexo = "";
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(primerapellido);
        dest.writeString(segundoapellido);
        dest.writeString(fechanacimiento);
        dest.writeString(entidad);
        dest.writeString(sexo);
    }

    public static final Creator<usuario> CREATOR
            = new Creator<usuario>(){
        public usuario createFromParcel(Parcel in){
            return new usuario(in);
        }

        @Override
        public usuario[] newArray(int size) {
            return new usuario[size];
        }
    };

    public usuario(Parcel in){
        nombre = in.readString();
        primerapellido = in.readString();
        segundoapellido = in.readString();
        fechanacimiento = in.readString();
        entidad = in.readString();
        sexo = in.readString();
    }
}