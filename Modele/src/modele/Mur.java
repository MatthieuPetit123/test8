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
public class Mur extends Fixe{

    public Mur(Cellule c) {
        super(c);
    }
    
    @Override
    public String toString()
    {
        return ("X");
    }
}
