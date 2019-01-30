package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Carta carta = new Carta(5, Naipe.COPAS);
        
        carta.imprimirCarta();
        
        
        Integer resultado = OperacaoAritmetica.ADICAO.operacao(7, 19);
        
        System.out.println("Resultado Adição: " + resultado);
        
        
        for(OperacaoAritmetica opa : OperacaoAritmetica.values()) {
            
            System.out.println("Resultado: " + opa.operacao(16, 9));            
        }       
    }    
}
