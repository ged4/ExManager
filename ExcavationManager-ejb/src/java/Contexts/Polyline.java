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
public class Polyline {

    List<Line> lines = new ArrayList();

    public Polyline(Line x)
    {
        this.lines.add(x);
    }

    public Polyline(List<Line> x)
    {
        this.lines = x;
    }

}
