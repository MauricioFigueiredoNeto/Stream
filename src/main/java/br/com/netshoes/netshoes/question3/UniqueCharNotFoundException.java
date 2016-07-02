package br.com.netshoes.netshoes.question3;

/**
 * Exceção lançada quando não for identificado caracter repetido.
 * 
 * @author mauriciofigueiredoneto@hotmail.com
 */
@SuppressWarnings("serial")
public class UniqueCharNotFoundException extends Exception {

    /**
     * Construtor padrão.
     */
    public UniqueCharNotFoundException() {
    	super("Durante a análise não foi encontrato caracter com apenas uma ocorrência.");
    }
    
}
