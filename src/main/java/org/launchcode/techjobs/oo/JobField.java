package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String aValue) {
        this ();
        this.value = aValue;
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (this.value.equals("")){
            return "Data not available";
        }else
            return value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



}
