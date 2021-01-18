package com.example.proiectandroid;

public class IntrebariMuzica {
    public String vectIntreb[] = {
            "Gen de muzica academica de forma ampla destinat unui colectiv mare de interpreti la diferite instrumente:",
            "Un gen de muzică instrumentală întemeiat pe teme de proveniență populară, de cele mai multe ori cu caracter contrastant:",
            "Tempourile repezi:",
            "Intensitatea cu care răsună o compoziție muzicală:",
            "Elementul de bază al lucrărilor muzicale, care constă dintr-o expunere de sunete la o singură voce:",
            "Cuprinde muzica instrumentală ce conține piese de estradă, prelucrări de folclor și piese vocal-instrumentale.",
            "Modificarea unei structuri muzicale sub aspect ritmic, melodic, armonic:",
            "Partea de încheiere a unei compoziții muzicale.?"
    };
    public String vectRasp[][] = {
            {"Jazz","Pop","Simfonia","HipHop"},
            {"Rapsodia", "Serenada", "Simfonia", "Doina"},
            {"Largo, lento, adagio", "Andante, andantino, moderato, allegretto", "Allegro, vivace, allegretto, presto", "Allegro, presto, vivace, prestissimo"},
            {"Dinamica", "Tempo", "Pauza", "Timbru"},
            {"Melodia", "Ritmul", "Tempoul", "Armonia"},
            {"Muzica de audiție", "Opera", "Muzica clasica", "Muzica de dans"},
            {"Variațiunea", "Repriza", "Constrastul", "Tempoul"},
            {"Codă", "Accent", "Acord", "Blues"}
    };
    public String raspCorecte[]={
            "Simfonia",
            "Rapsodia",
            "Allegro, presto, vivace, prestissimo",
            "Dinamica",
            "Melodia",
            "Muzica de audiție",
            "Variațiunea",
            "Codă"
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