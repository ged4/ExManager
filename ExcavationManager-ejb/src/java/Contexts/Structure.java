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
public class Structure extends Context {

    List<Context> elements = new ArrayList();

    public Structure(Integer x, Integer y, String name)
    {
        super(x,y,name);
    }

}
