/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

import Contexts.Context;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ged
 */
public class ContextRegister extends Register {

    public ContextRegister()
    {

    }

    public ContextRegister(List<Context> x)
    {
        this.reg = x;
    }

    public void addNewElement(Object x)
    {
        if (x instanceof Context)
        this.reg.add(x);
    }

    public void removeElement(Integer x)
    {
        Context remove;
        Integer index = 0;
        Iterator iter = reg.listIterator();
        while (iter.hasNext())
        {
            remove = (Context)iter.next();
            if (remove.getNumber() == x)
            break;
            index++;
        }
        this.reg.remove(index);
    }

    public List showAll()
    {
            return reg;
    }

    public List show(Integer x, Integer y)
    {
        List ret = new ArrayList();
        if(x > y)
        ret = reg.subList(x, y);
        else
        ret = reg.subList(y,x);
        return ret;
    }

    public Object show(Integer x)
    {
        Object ret = new Object();
        ret = reg.get(x);
        return ret;
    }

}
