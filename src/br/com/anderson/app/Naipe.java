package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public enum Naipe {

    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Preto"),
    COPAS("Vermelho");
    
    private String cor;
    
    /**
     * 
     * @param cor 
     */
    Naipe(String cor) {
        this.cor = cor;
    }  

    public String getCor() {
        return cor;
    }
}
