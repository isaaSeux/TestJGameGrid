/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uelbosque.testjgamegrid;

import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;

/**
 *
 * @author aleon
 */
public class Controlador extends GameGrid
{
  public Controlador()
  {
    super(10, 10, 60, java.awt.Color.red, "sprites/images.jpg");
    Pescado nemo = new Pescado();
    addActor(nemo, new Location(2, 4));
    show();
  }

  public static void main(String[] args)
  {
    new Controlador();
  }
}
