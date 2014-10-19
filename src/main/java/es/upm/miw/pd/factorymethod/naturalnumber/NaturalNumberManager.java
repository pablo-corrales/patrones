package es.upm.miw.pd.factorymethod.naturalnumber;

public class NaturalNumberManager {

	private NaturalNumber naturalNumber;
    private NaturalNumberCreator creator;
    
    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public NaturalNumberCreator getCreator() {
        return creator;
    }

    public void createNaturalNumber(int num) {
    	this.naturalNumber = this.creator.createNaturalNumber(num);
    }

	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}

	
}
