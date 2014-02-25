/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteTESTS;

import compteDAO.PersonneDAO;
import compteENTITIES.client;
// import compteENTITIES.client;
import compteENTITIES.restaurateur;




/*
 *
 * @author Nour
 */
public class TestajouPersonne {
    private static client x;
    public static void main(String[] args) {
       client cl = new client();
        PersonneDAO pDAO = new PersonneDAO();
      /*  cl.setNom("yosra");
       cl.setPrenom("eeeS");
        cl.setMail("xxxxx");
        cl.setPwd("nRRRRRRRRRRii");
      cl.setDate_naissance("2012-02-12");
       
        cl.setStatut("uYYYYser");
        cl.setRole("roole");
         
        
      
       
         pDAO.ajouterclient(cl);
        System.out.println("succée"); */
       x= pDAO.findPersonneByLogin("aaaaa","aa");
        System.out.println("le role"+x);
        
       
        
        
       
    }
}
