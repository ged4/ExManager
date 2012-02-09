/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Contexts;

/**
 *
 * @author Ged
 */
public class Fill extends Context {

    Enum colorIntensity;
    String shade;
    String color;
    Enum composition;
    String fractions;
    String inclusions;

    public Fill(Integer x, Integer y, String name)
    {
        super(x,y,name);
    }
}
