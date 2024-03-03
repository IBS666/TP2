/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.sysremegestionetudiants;

import java.util.ArrayList;

public class SystemeGestionEtudiant {
   ArrayList<Etudiant> list; 
   

    public SystemeGestionEtudiant() {
        this.list = new ArrayList();
    }
    public void ajouterEtudiant(String nom,String prenom,int numero,String email){
        Etudiant ET=new Etudiant(nom,prenom,numero,email);
        this.list.add(ET);
    }
    public void afficherEtudiant(){
         for(Etudiant ET:list){
            System.out.println( ET.toString());}
       
    }
    public void modifierEmailEtudiant(int numeroInscription, String nouvelEmail){
        for(Etudiant ET:list){
            if (ET.getnumero() == numeroInscription)
               ET.setEmail(nouvelEmail); 
        }
    }
    public void supprimerEtudiant(int numeroInscription){
        for(int i=0;i<list.size();i++){
            if (this.list.get(i).getnumero()== numeroInscription){
              list.remove(i);
        }
    }
}
}