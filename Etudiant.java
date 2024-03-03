/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.sysremegestionetudiants;

/**
 *
 * @author MSI
 */
public class Etudiant {
    private String nom;
    private String prenom;
    int numero;
    String email;

    public Etudiant(String nom, String prenom, int numero, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.email = email;
    }

   public String getNom() {
           return this.nom;
   }
   public String getPrenom(){
       return this.prenom;
   }
   public int getnumero(){
       return this.numero;
   }
   public String getEmail(){
       return this.email ;
   }
   public void setNom(String nom){
       this.nom=nom;
   }
   public void setPrenom(String prenom){
       this.prenom=prenom;
   }
   public void setNumero(int numero){
       this.numero=numero;
   }
   public void setEmail(String email){
       this.email=email;
   }
   
    @Override
   public String toString(){
      return "nom "+this.nom+
        " prenom "+this.prenom+
        " numero "+this.numero+
        " email "+this.email;
       
       
   }

}
