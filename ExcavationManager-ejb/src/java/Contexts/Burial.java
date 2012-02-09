/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Contexts;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Ged
 */
public abstract class Burial extends Context {

    List<Context> elements = new ArrayList();
    List<Body> bodies = new ArrayList();

    public Burial(Integer x, Integer y, String name)
    {
        super(x,y,name);
    }
}
