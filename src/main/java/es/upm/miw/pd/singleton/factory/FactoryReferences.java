package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
	private static FactoryReferences factoryReferences;
    private Map<String, Integer> references;

    private int reference;

    public FactoryReferences() {
        this.references = new HashMap<>();
        this.reference = 0;
    }

    public static FactoryReferences getFactory(){
    	if (factoryReferences == null){
    		factoryReferences = new FactoryReferences(); 
    	}
    	return factoryReferences;
    	
    }
    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }
    
    

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
