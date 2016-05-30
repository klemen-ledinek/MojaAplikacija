package com.example;

import java.sql.Time;
import java.util.Date;

public class Dogodek {
    private String ime;
    private String datum;
    private String ura;
    private Student student;

    public Dogodek(String ime, String datum, String ura, Student student) {
        this.ime = ime;
        this.datum = datum;
        this.ura = ura;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Dogodek{" +
                "ime='" + ime + '\'' +
                ", datum=" + datum +
                ", ura=" + ura +
                ", student=" + student +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getIme() {
        return ime;
    }

    public String getDatum() {
        return datum;
    }

    public String getUra() {
        return ura;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setUra(String ura) {
        this.ura = ura;
    }
}

