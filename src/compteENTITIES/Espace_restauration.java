/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteENTITIES;

/**
 *
 * @author hamdi
 */
public class Espace_restauration {
    private int id_restaurant;
    private String nom_restaurant;
    private String addresse_restaurant;
    private int telephone_restaurant;
    private String type_restaurant;
    private int note;
    private String etat;
    private String description;

    public Espace_restauration() {
    }
    
    
     public Espace_restauration(int id_restaurant, String nom_restaurant, String addresse_restaurant, int telephone_restaurant, String type_restaurant, int note, String etat, String description) {
        this.id_restaurant = id_restaurant;
        this.nom_restaurant = nom_restaurant;
        this.addresse_restaurant = addresse_restaurant;
        this.telephone_restaurant = telephone_restaurant;
        this.type_restaurant = type_restaurant;
        this.note = note;
        this.etat = etat;
        this.description = description;
    }

    public int getId_restaurant() {
        return id_restaurant;
    }

    
    public void setId_restaurant(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    
    
    public String getNom_restaurant() {
        return nom_restaurant;
    }
    
     public void setNom_restaurant(String nom_restaurant) {
        this.nom_restaurant = nom_restaurant;
    }

    

    public String getAddresse_restaurant() {
        return addresse_restaurant;
    }
    
    public void setAddresse_restaurant(String addresse_restaurant) {
        this.addresse_restaurant = addresse_restaurant;
    }

    public int getTelephone_restaurant() {
        return telephone_restaurant;
    }
    
     public void setTelephone_restaurant(int telephone_restaurant) {
        this.telephone_restaurant = telephone_restaurant;
    }


    public String getType_restaurant() {
        return type_restaurant;
    }
    
    public void setType_restaurant(String type_restaurant) {
        this.type_restaurant = type_restaurant;
    }

    

    public int getNote() {
        return note;
    }
    
    public void setNote(int note) {
        this.note = note;
    }

    public String getEtat() {
        return etat;
    }
    
    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDescription() {
        return description;
    }  

    public void setDescription(String description) {
        this.description = description;
    }
    
    
     
    
}
