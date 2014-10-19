package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberEN extends NaturalNumber {

    public static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEN(int value) {
        super(value,textValue);
    }

}