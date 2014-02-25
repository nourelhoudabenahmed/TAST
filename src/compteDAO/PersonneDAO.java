/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteDAO;

import com.sun.security.ntlm.Client;
import compteENTITIES.client;
import compteutil.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nour
 */
public class PersonneDAO {
    
    
    public void ajouterclient(client cl){

         String requete = "insert into client (`id_client`,`nom`,`prenom`,`mail`,`pwd`,`date_naissance` ,`statut`,`role`) values (?,?,?,?,?,?,?,?)";
   int i=1;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(i++, cl.getId_client());
            ps.setString(i++, cl.getNom());
             ps.setString(i++, cl.getPrenom());
              ps.setString(i++, cl.getMail());
               ps.setString(i++, cl.getPwd());
                ps.setString(i++, cl.getDate_naissance());
                 ps.setString(i++, cl.getStatut());
                  ps.setString(i++, cl.getRole());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


  public ArrayList<client> GetAllClient(){

       ArrayList<client> listeclient = new ArrayList<client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                client cl =new client();
                cl.setMail(resultat.getString(4));
                cl.setPwd(resultat.getString(5));

                listeclient.add(cl);
            }
            
            return listeclient;
            
        } catch (SQLException ex) {

            System.out.println("erreur  "+ex.getMessage());
            return null;
        }
    }
   public client findPersonneByLogin(String mail,String pwd) {
        client cl = new client();
        String requete = "select role from client where mail=? and pwd=?";
        int i=1;
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(i++,mail);
            ps.setString(i++,pwd);
            
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                cl.setRole(resultat.getString(1));
               
              
            }
            return cl;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du role " + ex.getMessage());
            return null;
        }
    }
   
   public List<client> DisplayClient(){


        List<client> listeclient = new ArrayList<client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
           ResultSet resultat = statement.executeQuery(requete);
           PersonneDAO DAO = new PersonneDAO();
         
            while(resultat.next()){
                client c =new client();
               c.setId_client(resultat.getInt(1));
               c.setNom(resultat.getString(2));
               c.setPrenom(resultat.getString(3));
               c.setMail(resultat.getString(4));
               c.setRole(resultat.getString(5));
               c.setStatut(resultat.getString(7));
               c.setDate_naissance(resultat.getString(6));
              c.setPwd(resultat.getString(8));
               
               listeclient.add(c);
               
               
              

                
            }
            return listeclient;
        } catch (SQLException ex) {
           
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }

  
}
    
       
    