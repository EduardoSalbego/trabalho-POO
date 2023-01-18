/**
 * Interface que especifica os métodos míninos para manipular uma coleção de notas fiscais.
 * @author Aline
 */
public interface INotasFiscais {
            
    /**
     * Adiciona uma nota fiscal. rsrsrs
     * @param nf Nota fiscal a ser adicionada.
     * @throws java.lang.Exception Lança exceção quando a nota fiscal não pode ser adicionada.
     */
    public abstract void addNotaFiscal(NotaFiscal nf) throws Exception;
    
    /**
     * Remove a nota fiscal com código informado.
     * @param codigo Código da nota fiscal a ser removida.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public abstract void removeNotaFiscal(int codigo) throws Exception;
    
    /**
     * Captura a nota fiscal com o código informado.
     * @param codigo Código da nota fiscal a ser capturada.
     * @return NotaFiscal Nota fiscal com o código informado.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public abstract NotaFiscal getNotaFiscal(int codigo) throws Exception;
    
	/**
     * Captura o total da nota fiscal informada.
     * @param codigo Código da nota fiscal.
     * @return O total (soma do valor de todos os items) da nota fiscal com o código informado.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public abstract double getTotal(int codigo) throws Exception;

    /**
     * Adiciona um item a nota fiscal com o código informado.
     * @param codigo Código da nota fiscal na qual o item deve ser adicionado.
     * @param item Item a ser adicionado.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public abstract void addItem(int codigo, Item item) throws Exception;
    
    /**
     * Remove um item da nota fiscal com o código informado.
     * @param codigo Código da nota fiscal na qual o item deve ser removido.
     * @param item Item a ser removido.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado ou 
     * quando o Item informado não existir.
     */
    public abstract void removeItem(int codigo, Item item) throws Exception;
}
