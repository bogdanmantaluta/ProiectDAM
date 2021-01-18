package com.example.proiectandroid;

public class IntrebariAuto {
    public String vectIntreb[] = {
            "In ce oras se uzina Dacia?",
            "Ce culori are sigla BMW?",
            "Pentru ce tip de motor e renumit Porsche",
            "Care a fost cea mai rapida masina din lume in 2016?",
            "Cu ce este atassat pistonul de arborele cotit?",
            "Care este cea mai rapida acceleratie 0-100, pentru o masina de fabrica?",
            "In ce an a fost DACIA SA cumparata de Renault?",
            "Ce tip de motor au modelele Rolls-Royce?"
    };
    public String vectRasp[][] = {
            {"Mioveni","Pitesti","Timisoara","Ciocanesti"},
            {"Albastru-Verde","Rosu-Galben","Alb-Albastru","Gri"},
            {"V6","Boxer","Linie-6","V12"},
            {"Dacia", "Bugatti", "Ford", "Koenigsegg"},
            {"Cardan", "Bascula", "Cuzineti", "Biela"},
            {"Dodge Demon", "Dacia Logan", "Nissan Patrol", "Suzuki Samurai"},
            {"1999", "1989", "1991", "1995"},
            {"0.9L", "3.0L", "3.7L", "6.2L"}
    };
    public String raspCorecte[]={
            "Mioveni",
            "Alb-Albastru",
            "Boxer",
            "Koenigsegg",
            "Biela",
            "Dodge Demon",
            "1999",
            "6.2L"
    };
    public String getIntrebare(int i) {
        return vectIntreb[i];
    }
    public String getRaspA(int i) {
        return vectRasp[i][0];
    }
    public String getRaspB(int i) {
        return vectRasp[i][1];
    }
    public String getRaspC(int i) {
        return vectRasp[i][2];
    }
    public String getRaspD(int i) {
        return vectRasp[i][3];
    }
    public String getRaspCorect(int i) {
        return raspCorecte[i];
    }
}
