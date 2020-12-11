package com.company;

public class Reinders {
    public String nom;
    public int vitesse;
    public int tempsVol;
    public int tempsRepos;

    public boolean etat;
    public int tempsRestant;
    public int tempsAvantChangementEtat;
    public int distance;

    public Reinders(String nom, int vitesse, int tempsVol, int tempsRepos) {
        this.nom = nom;
        this.vitesse = vitesse;
        this.tempsVol = tempsVol;
        this.tempsRepos = tempsRepos;
    }

    public int getTempsAvantChangementEtat() {
        return tempsAvantChangementEtat;
    }

    public void setTempsAvantChangementEtat(int tempsAvantChangementEtat) {
        this.tempsAvantChangementEtat = tempsAvantChangementEtat;
    }

    public void calcul_distance_par_seconde() {

        if (tempsAvantChangementEtat == 0) {
            etat = !etat;
            tempsAvantChangementEtat = etat ? tempsVol : tempsRestant;
        }
        if(etat){
            distance = vitesse + distance;
            System.out.println(distance);
        }
        tempsAvantChangementEtat = tempsAvantChangementEtat - 1;
        System.out.println(tempsAvantChangementEtat);

    }

    @Override
    public String toString() {
        return "Reinders{" +
                "nom='" + nom + '\'' +
                ", vitesse=" + vitesse +
                ", tempsVol=" + tempsVol +
                ", tempsRepos=" + tempsRepos +
                ", distance=" + distance +
                '}';
    }
}