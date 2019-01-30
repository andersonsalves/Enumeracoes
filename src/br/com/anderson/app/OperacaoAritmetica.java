package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public enum OperacaoAritmetica {

    ADICAO {
        
        @Override
        public int operacao(int x, int y) {
            return x + y;
        }
    },
    SUBTRACAO {
        
        @Override
        public int operacao(int x, int y) {
            return x - y;
        }
    };

    public abstract int operacao(int x, int y);
}
