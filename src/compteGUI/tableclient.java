/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compteGUI;



import compteDAO.PersonneDAO;
import compteENTITIES.client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nour
 */
public class tableclient   extends AbstractTableModel{
    List<client> ListeClient= new ArrayList<client>();

    String []header = {"role","id","Nom","Prénom","date de naissance","Mail","Statut","pwd"};

    public tableclient() { //remplissage de la liste des stocks
        ListeClient=new PersonneDAO().DisplayClient();
    }
    
    @Override
    public int getRowCount() { //nombre de lignes de la table
        return ListeClient.size();
    }

    @Override
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
      
        switch (columnIndex) {// parcour par colonne
             case 0:
                return ListeClient.get(rowIndex).getRole();
            case 1:
                return ListeClient.get(rowIndex).getId_client();
            case 2:
                return ListeClient.get(rowIndex).getNom();
            case 3:
                return ListeClient.get(rowIndex).getPrenom();
                 case 4:
                return ListeClient.get(rowIndex).getDate_naissance();
                      case 5:
                return ListeClient.get(rowIndex).getMail();
                     case 6:
                return ListeClient.get(rowIndex).getStatut();
                         case 7:
                return ListeClient.get(rowIndex).getPwd();
            
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }  
    
    
    
    
}
