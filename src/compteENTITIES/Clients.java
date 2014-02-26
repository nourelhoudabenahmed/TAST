/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteENTITIES;

import java.util.Date;

/**
 *
 * @author hamdi
 */
public class Clients {
    private int id_client;
    private String nom_client;
    private String prenom_client;
    private String mail_client;
    private String pwd_client;
    private String staut_client;
    private Date DateDeNaissance;

    public Clients() {
    }

    public Clients(int id_client, String nom_client, String mail_client, String pwd_client, String staut_client, Date DateDeNaissance) {
        this.id_client = id_client;
        this.nom_client = nom_client;
        this.mail_client = mail_client;
        this.pwd_client = pwd_client;
        this.staut_client = staut_client;
        this.DateDeNaissance = DateDeNaissance;
    }

    public int getId_client() {
        return id_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public String getMail_client() {
        return mail_client;
    }

    public String getPwd_client() {
        return pwd_client;
    }

    public String getStaut_client() {
        return staut_client;
    }

    public Date getDateDeNaissance() {
        return DateDeNaissance;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public void setMail_client(String mail_client) {
        this.mail_client = mail_client;
    }

    public void setPwd_client(String pwd_client) {
        this.pwd_client = pwd_client;
    }

    public void setStaut_client(String staut_client) {
        this.staut_client = staut_client;
    }

    public void setDateDeNaissance(Date DateDeNaissance) {
        this.DateDeNaissance = DateDeNaissance;
    }
    
    
}
