/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uelbosque.testjgamegrid;

import ch.aplu.jgamegrid.Actor;

/**
 *
 * @author aleon
 */
public class Pescado extends Actor
{
  public Pescado()
  {
    super("sprites/nemo.gif");
  }

  public void act()
  {
    move();
    if (!isMoveValid())
      turn(180);
  }
}
