package info.jackwade.weightconverter;

import javax.lang.model.type.UnionType;

public class WeightConversion {
    public String weight;
    public char unit;
    public float kilogramV;
    public float poundV;
    public float stoneV;
    public float gramV;

    public WeightConversion(String weight, char unit){
        this.weight = weight;
        this.unit = unit;
    }
}


