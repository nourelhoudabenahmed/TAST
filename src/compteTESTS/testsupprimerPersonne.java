/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteTESTS;

import compteDAO.personneDAO;
import compteENTITIES.personne;

/**
 *
 * @author Nour
 */
public class testsupprimerPersonne {
     public static void main(String[] args) {
        personne p = new personne();
        personneDAO pDAO = new personneDAO();
      
        
       pDAO.deletepersonne(4);
       System.out.println("succée");
       
         
    
}
}