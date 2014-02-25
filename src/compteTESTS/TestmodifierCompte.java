/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteTESTS;

import compteDAO.personneDAO;
import compteENTITIES.client;


/**
 *
 * @author Nour
 */
public class TestmodifierCompte {
    public static void main(String[] args) {
    
     client p = new client();
        personneDAO pDAO = new personneDAO();
      
       
        p.setNom("mounira");
        
        p.setPrenom("san");
        p.setMail("zSS");
        p.setPwd("nouriii");
        p.setStatut("user");
      
        p.setDate_naissance("2040-02-12");
       
        
        pDAO.updateClient(p,2);
        
        System.out.println("succée");
    }
    
}
