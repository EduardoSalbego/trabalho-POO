/**
 * Interface que especifica os métodos míninos para manipular uma coleção de produtos
 * @author Aline
 */
public interface IProdutos {
    /**
     * Adiciona um produto ao estoque.
     * @param p Produto
     * @throws java.lang.Exception Lança exceção quando o produto não pode ser adicionado.
     */
    public abstract void addProduto(Produto p) throws Exception;
    
    /**
     * Remove o produto com código informado.
     * @param codigo Código do produto a ser removido.
     * @throws java.lang.Exception Lança exceção quando o produto não pode ser removido, por exemplo, 
     * porque não existe produto cadastrado com o código informado.
     */
    public abstract void removeProduto(int codigo) throws Exception;
    
    /**
     * Captura o produto com o código informado.
     * @param codigo Código do produto a ser capturado.
     * @return Produto Produto capturado.
     * @throws java.lang.Exception Lança exceção quando não existe produto 
     * com o código informado.
     */
    public abstract Produto getProduto(int codigo) throws Exception;
    
    /**
     * Altera a quantidade do produto com o código informado.
     * @param codigo Código do produto a ser alterado.
     * @param nova Nova quantidade do produto.
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando a nova quantidade é inválida.
     */
    public abstract void updateQuantidade(int codigo, double nova) throws Exception;
    
	
    /**
     * Altera o preço do produto com o código informado.
     * @param codigo Código do produto a ser alterado.
     * @param novo Novo preço do produto.
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando o novo preço é inválido.
     */
    public abstract void updatePreco(int codigo, double novo) throws Exception;
    
    /**
     * Adiciona a quantidade ao produto com código informado.
     * @param codigo Código do produto a ser alterado.
     * @param quantidade Quantidade a ser acrescentada. 
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando a quantidade é inválida.
     */
    public abstract void addQuantidade(int codigo, double quantidade) throws Exception;

    /**
     * Subtrai a quantidade do produto com código informado.
     * @param codigo Código do produto a ser alterado.
     * @param quantidade Quantidade a ser subtraída.
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando quantidade informada é inválida.
     */
    public abstract void subQuantidade(int codigo, double quantidade) throws Exception;

}
