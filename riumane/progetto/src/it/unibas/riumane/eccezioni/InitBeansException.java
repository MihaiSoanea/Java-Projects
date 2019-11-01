package it.unibas.riumane.eccezioni;

public class InitBeansException extends RuntimeException {

    public InitBeansException(String m) {
        super(m);
    }
    
    public InitBeansException(Exception ex) {
        super(ex);
    }
}
