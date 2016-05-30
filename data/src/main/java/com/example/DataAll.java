package com.example;

import java.util.ArrayList;

/**
 * Created by Ledo on 25. 05. 2016.
 */
public class DataAll {
    private ArrayList<Dogodek> dogodki;
    private ArrayList<Student> studenti;


    public DataAll() {
        dogodki = new ArrayList<Dogodek>();
        studenti = new ArrayList<Student>();
    }



    @Override
    public String toString() {
        return "DataAll{" +
                "dogodki=" + dogodki +
                ", studenti=" + studenti +
                '}';
    }


    public void add(Student s){studenti.add(s);}
    public void add(Dogodek d){dogodki.add(d);}

    public ArrayList<Dogodek> getDogodki() {
        return dogodki;
    }

    public void setDogodki(ArrayList<Dogodek> dogodki) {
        this.dogodki = dogodki;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }


    public static DataAll getScenarijData(){
        DataAll allData = new DataAll();
        allData.add(new Student("klemen.ledinek@gmail.com","Klemen","Ledinek"));
        allData.add(new Student("zan.gabersek@gmail.com","Zan","Gabersek"));
        allData.add(new Dogodek("Menjava posteljnine","24/5/2016","13:15", allData.studenti.get(0)));
        allData.add(new Dogodek("Oddaja PJ","10/6/2016","23:55",allData.studenti.get(0)));
        allData.add(new Dogodek("Zagovor Algoritmi","28/5/2016","14:00",allData.studenti.get(1)));
        allData.add(new Dogodek("Oddaja PJ","10/6/2016","23:55",allData.studenti.get(1)));

        return allData;
    }

}
