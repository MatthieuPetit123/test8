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
public abstract class Mobile extends Occupant{

    public Mobile(Cellule c) 
    {
        super(c);
    }
    public void deplacerCellule(Cellule cell)
    {
        cellOccup = cell;
    }
    public void deplacerVers(Cellule cell) throws ObstacleException
    {
            if(cell.estLibre() == true)
            {
                deplacerCellule(cell);
            }
            else
            {
                throw new ObstacleException();
            }
    }  
    
}
