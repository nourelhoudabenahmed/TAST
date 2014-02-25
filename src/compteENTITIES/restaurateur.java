/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteENTITIES;

import java.util.Date;

/**
 *
 * @author Nour
 */
public class restaurateur {
    private int id_restaurateur;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
private String statut;
private String Date_naissance;

    public restaurateur(int id_restaurateur, String nom, String prenom, String mail, String password, String statut, String Date_naissance) {
        this.id_restaurateur = id_restaurateur;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.password = password;
        this.statut = statut;
        this.Date_naissance = Date_naissance;
    }

    public restaurateur() {
        
    }

    public int getId_restaurateur() {
        return id_restaurateur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getStatut() {
        return statut;
    }

    public String getDate_naissance() {
        return Date_naissance;
    }

    public void setId_restaurateur(int id_restaurateur) {
        this.id_restaurateur = id_restaurateur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setDate_naissance(String Date_naissance) {
        this.Date_naissance = Date_naissance;
    }
    
    
}
