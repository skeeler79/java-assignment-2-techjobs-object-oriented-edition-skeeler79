package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//    @Override
//    public String toString(){
//        if (this.value.equals("")){
//            return "Data not available";
//        }else
//            return value;
//    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }


    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
