/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Contexts;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Ged
 */
public abstract class Context {

    protected Integer number;
    protected Trench trench;
    protected Dating dating;
    protected Integer width;
    protected Integer length;
    protected Integer depth;
    protected String type;
    protected String interpretation;
    protected Date registrationDate;
    protected Date checkDate;
    protected String registrationInitial;
    protected String checkInitial;
    protected List<Drawing> drawings = new ArrayList();
    protected List<Photo> photos = new ArrayList();
    protected List<Material> materials = new ArrayList();
    protected List<Find> finds = new ArrayList();
    protected List<Sample> samples = new ArrayList();

    public Context ()
    {
        ;
    }

    public Context(Integer x, Integer y, String name)
    {
        trench = new Trench(x,y,name);
        dating = new Dating();
    }

    public Context (Trench tr, Dating dating)
    {
        number = 0;
        this.trench = tr;
        this.dating = dating;
    }

    public Context (Integer x, Trench tr, Dating dating)
    {
        this(tr, dating);
        this.number = x;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the drawings
     */
    public List<Drawing> getDrawings() {
        return drawings;
    }

    /**
     * @param drawings the drawings to set
     */
    public void setDrawings(List<Drawing> drawings) {
        this.drawings = drawings;
    }

    /**
     * @return the photos
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * @param photos the photos to set
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    /**
     * @return the materials
     */
    public List<Material> getMaterials() {
        return materials;
    }

    /**
     * @param materials the materials to set
     */
    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    /**
     * @return the exhibits
     */
    public List<Find> getFinds() {
        return finds;
    }

    /**
     * @param exhibits the exhibits to set
     */
    public void setFinds(List<Find> find) {
        this.finds = find;
    }

    /**
     * @return the samples
     */
    public List<Sample> getSamples() {
        return samples;
    }

    /**
     * @param samples the samples to set
     */
    public void setSamples(List<Sample> samples) {
        this.samples = samples;
    }

    /**
     * @return the trench
     */
    public Trench getTrench() {
        return trench;
    }

    /**
     * @param trench the trench to set
     */
    public void setTrench(Trench trench) {
        this.trench = trench;
    }

    /**
     * @return the dating
     */
    public Dating getDating() {
        return dating;
    }

    /**
     * @param dating the dating to set
     */
    public void setDating(Dating dating) {
        this.dating = dating;
    }
}
