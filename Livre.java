/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.sysremegestionetudiants;

/**
 *
 * @author MSI
 */
public class Livre {
    private String title;
    private String author;
    public int anneePublication;
    public int isbn;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Livre() {
    }

    public Livre(String title) {
        this.title = title;
    }

    public Livre(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Livre(String title, String author, int anneePublication) {
        this.title = title;
        this.author = author;
        this.anneePublication = anneePublication;
    }
    public Livre(String title, String author, int anneePublication, int isbn) {
        this.title = title;
        this.author = author;
        this.anneePublication = anneePublication;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livre{" + "title=" + title + ", author=" + author + ", anneePublication=" + anneePublication + ", isbn=" + isbn + '}';
    }
    public void affichage(){
        System.out.println(this.toString());
    }
    
    
}
