/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Matthieu Petit
 */
public class Cellule {
    private Cellule nord;
    private Cellule sud;
    private Cellule est;
    private Cellule ouest;
    
    private Occupant occup;
    
    private boolean visite;
    
    public Cellule()
        {
            nord = null;
            sud = null;
            est = null;
            ouest = null;
            occup = null;
            visite = false;
        }

    public boolean estLibre()
    {
        boolean retour;
        if(occup == null)
        {
            retour = true;
        }
        else
        {
            retour = false;
        }
        return retour;
    }
    
    public void prendreOccupant(Occupant o)
    {
        occup = o;
        if(o != null)
        {
            o.setCel(this);
        }
        
    }
    
    public String toString()
        {
            if(estLibre() == true)
            {
                return "-";
            }
            else
            {
                return occup.toString();
            }
        }

}
