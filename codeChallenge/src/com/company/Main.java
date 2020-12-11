package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nom du reine ? ");
        String nom = sc.next();

        System.out.println("vitesse du reine ? ");
        int vitesse = sc.nextInt();

        System.out.println("temps de vol du reine ? ");
        int tempsdevol = sc.nextInt();

        System.out.println("temps de repos du reine ? ");
        int tempsderepos = sc.nextInt();


        Reinders reinders = new Reinders(nom, vitesse, tempsdevol,tempsderepos);
        // reinders.setTempsAvantChangementEtat(tempsderepos);

        for(int i=0; i<2503 ;i++) {
            reinders.calcul_distance_par_seconde();
        }
        System.out.println("**********************************************************************");
        reinders.toString();
    }
}
