package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberENCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int num) {
        return new NaturalNumberEN(num);
        
    }

}