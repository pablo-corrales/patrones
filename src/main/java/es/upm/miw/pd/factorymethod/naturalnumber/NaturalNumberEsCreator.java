package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int num) {
        return new NaturalNumberEs(num);
        
    }

}
