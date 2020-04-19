package com.emu.tests.java8.stream;

public class Data  {
    int id;

    int montant;

    public Data() {
    }

    public Data(int id, int montant) {
        this.id = id;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Data{" +
                "montant=" + montant +
                '}';
    }

    static public Data sum(Data data, Data data2) {
        return new Data(0, data.montant + data2.montant);
    }


}
