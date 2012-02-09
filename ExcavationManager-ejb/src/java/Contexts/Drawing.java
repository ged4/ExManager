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
public abstract class Drawing {

    List<Polyline> lines = new ArrayList();
    List<Section> sections = new ArrayList();
    List<Point> points = new ArrayList();

    public Drawing()
    {

    }

    public Drawing(Point x)
    {
        this();
        points.add(x);
    }

    public Drawing(Section x)
    {
        this();
        sections.add(x);
    }

    public Drawing(Polyline x)
    {
        this();
        lines.add(x);
    }

    public Drawing(List x)
    {
        this();
        if (x instanceof Point)
            points.addAll(x);
        if (x instanceof Section)
            sections.addAll(x);
        if (x instanceof Polyline)
            lines.addAll(x);
    }

    abstract public void draw();

}
