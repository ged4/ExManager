/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Contexts;

import java.util.List;
import java.util.ArrayList;
import Enums.*;

/**
 *
 * @author Ged
 */

public class Feature extends Context{

    Shape shape;
    Profile profile;
    Base base;
    String orientation;
    List<Context> elements = new ArrayList();

    public Feature(Integer x, Integer y, String name)
    {
        super(x,y,name);
    }

}
