/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteTESTS;

import compteDAO.EspaceRestaurantDAO;import compteENTITIES.Espace_restauration;
;
import compteENTITIES.Espace_restauration;

/**
 *
 * @author hamdi
 */
public class TestAddEspaceRestaurant {
    
    public static void main(String[] args) {
        
        Espace_restauration e=new  Espace_restauration();
        EspaceRestaurantDAO eDAO=new  EspaceRestaurantDAO();
        e.setNom_restaurant("Le guépard");
        e.setAddresse_restaurant("La goulette");
        e.setType_restaurant("Restaurant");
        e.setTelephone_restaurant(123);
        e.setNote(10);
        e.setDescription("bien");
        e.setEtat("Ouvert");
        eDAO.insertEspaceRestaurant(e);
        
        
    }
    
}
