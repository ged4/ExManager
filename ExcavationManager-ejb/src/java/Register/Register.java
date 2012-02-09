/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Register;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Ged
 */
public abstract class Register {

    protected List  reg= new ArrayList();

    public abstract void addNewElement(Object x);

    public abstract void removeElement(Integer x);

    public abstract List showAll();

    public abstract List show(Integer from, Integer to);

    public abstract Object show(Integer x);
}
