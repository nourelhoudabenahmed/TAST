/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteENTITIES;





/**
 *
 * @author Nour
 */
public class client {
    private int id_client;
    private String nom;
    private String prenom;
    private String mail;
    private String pwd;
     private String role;
    

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
private String statut;
private String Date_naissance;

    public client(int id_client, String nom, String prenom, String mail, String pwd, String statut, String Date_naissance, String role) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.pwd = pwd;
        this.statut = statut;
        this.Date_naissance = Date_naissance;
         this.role = role;
    }

    public client() {
       }
    


    public int getId_client() {
        return id_client;
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

    public String getPwd() {
        return pwd;
    }

    public String getStatut() {
        return statut;
    }

    public String getDate_naissance() {
        return Date_naissance;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
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

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setDate_naissance(String Date_naissance) {
        this.Date_naissance = Date_naissance;
    }

    
}
