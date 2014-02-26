/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import compteENTITIES.Clients;
import compteutil.MyConnection;

/**
 *
 * @author hamdi
 */
public class ClientDAO {
    
 public void insertClients(Clients c){

        String requete = "insert into Client values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,c.getId_client());
            ps.setString(2, c.getNom_client());
            ps.setString(3, c.getMail_client());
            ps.setString(4, c.getPwd_client());
            ps.setString(5, c.getStaut_client());
            ps.setDate(6, (Date) c.getDateDeNaissance());
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     
     public void updateClient(Clients c){
        String requete = "update depot set nom_Client=?,mail_Client=?,pwd_Client=?,statut_Client=?,DateDeNaissance=? where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,c.getId_client());
            ps.setString(2, c.getNom_client());
            ps.setString(3, c.getMail_client());
            ps.setString(4, c.getPwd_client());
            ps.setString(5, c.getStaut_client());
            ps.setDate(6, (Date) c.getDateDeNaissance());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     
     public void deleteClient(int id_client){
         String requete="delete from Client where id_client=?";
         try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_client);
            ps.executeUpdate();
            System.out.println("Client supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
     }
    
}

