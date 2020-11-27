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
public class ObstacleException extends Exception{
    
    public ObstacleException()
    {
        super("La cellule de destination est occupée, veuillez en choisir une autre");
    }
}

