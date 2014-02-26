/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import compteENTITIES.Espace_restauration;
import compteutil.MyConnection;

/**
 *
 * @author hamdi
 */
public class EspaceRestaurantDAO {
    
    
     public void insertEspaceRestaurant(Espace_restauration r){

        String requete = "insert into Espace_restauration (id_restaurant,nom_restaurant,adresse_restaurant,type_restaurant,telephone_restaurant,note,description,etat) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r.getId_restaurant());
            ps.setString(2, r.getNom_restaurant());
            ps.setString(3, r.getAddresse_restaurant());
            ps.setString(4, r.getType_restaurant());
            ps.setInt(5, r.getTelephone_restaurant());
            ps.setInt(6, r.getNote());
            ps.setString(7, r.getDescription());
            ps.setString(8, r.getEtat());
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     
     public void updateEspaceRestaurant(Espace_restauration r){
        String requete = "update depot set nom_restaurant=?,addresse_restaurant=?,type_restaurant=?,telephone_restaurant=?,note_restaurant=?,description_restaurant=?,etat_restaurant=? where id_restaurant=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,r.getId_restaurant());
            ps.setString(2, r.getNom_restaurant());
            ps.setString(3, r.getAddresse_restaurant());
            ps.setString(4, r.getType_restaurant());
            ps.setInt(5, r.getTelephone_restaurant());
            ps.setInt(6, r.getNote());
            ps.setString(7, r.getDescription());
            ps.setString(8, r.getEtat());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     
     public void deleteEspaceRestaurant(int id_restaurant){
         String requete="delete from EspaceRestaurant where id_restaurant=?";
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_restaurant);
            ps.executeUpdate();
            System.out.println("Espace Restaurant supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
     }
    
}
