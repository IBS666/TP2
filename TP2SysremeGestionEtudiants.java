/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.sysremegestionetudiants;
public class TP2SysremeGestionEtudiants {
    
    public static void main(String[] args) {
        
    //exercice 1
        SystemeGestionEtudiant s = new SystemeGestionEtudiant();
        s.ajouterEtudiant("ben saad", "ismail",24666, "ismail@gmail.com");
        s.ajouterEtudiant("ben salem", "Taha",24667, "taha@gmail.com");
        s.ajouterEtudiant("eladel", "Najd",24668, "najd@gmail.com");
        s.afficherEtudiant();
        s.modifierEmailEtudiant(24666,"ismail05@gmail.com" );
        s.supprimerEtudiant(24668);
        s.afficherEtudiant();
        
    //exercice 2
        Livre A =new Livre();
        Livre B =new Livre("l'Alchimiste");
        Livre C =new Livre("Les Misérables","Victor Hugo");
        Livre D =new Livre("L'étranger","Albert Camus",1972);
        Livre E =new Livre("Le Mur","Jean-Paul Sartre",1972,978207036);
        A.affichage();
        B.affichage();
        C.affichage();
        D.affichage();
        E.affichage();
        
    }
}
