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
public abstract class Occupant {
    
    protected Cellule cellOccup;
    
    public Occupant(Cellule c)
    {
        cellOccup = c;
    }
    public Cellule getCel()
    {
        return cellOccup;
    }
    public void setCel(Cellule cel)
    {
        cellOccup = cel;
    }
    
    @Override
    public String toString()
    {
        return(super.toString());
    }

}
