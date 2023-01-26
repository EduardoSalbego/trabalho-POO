import java.util.ArrayList;

/**
 * A classe ListaNotaFiscais representa uma lista de notas fiscais e suas manipulações.
 * @author Bianca, Eduardo, Gian, Maria Luiza
 * @since jan 2023
 * @version 1.0
 */
public class ListaProdutos implements IProdutos {


    /**
     * Arraylist do tipo Produto para armazenar produtos
     */
    private ArrayList<Produto> produtos;


    /**
     * Construtor default da classe
     */
    public ListaProdutos() {
        produtos = new ArrayList<Produto>();
    }

    /**
     * Adiciona um produto ao estoque.
     * @param p Produto
     * @throws java.lang.Exception Lança exceção quando o produto não pode ser adicionado.
     */
    public void addProduto(Produto p){
        produtos.add(p);
    }
    
    /**
     * Remove o produto com código informado.
     * @param codigo Código do produto a ser removido.
     * @throws java.lang.Exception Lança exceção quando o produto não pode ser removido, por exemplo, 
     * porque não existe produto cadastrado com o código informado.
     */
    public void removeProduto(int codigo) throws Exception{
        produtos.remove(getProduto(codigo));
    }
    
    /**
     * Captura o produto com o código informado.
     * @param codigo Código do produto a ser capturado.
     * @return Produto Produto capturado.
     * @throws java.lang.Exception Lança exceção quando não existe produto 
     * com o código informado.
     */
    public Produto getProduto(int codigo) throws Exception{
        for(Produto produto : produtos) {
            if(produto.getCodigo() == codigo) {
                return produto;
            }
        }
        throw new Exception("Produto não cadastrado.");
    }
    
    /**
     * Altera a quantidade do produto com o código informado.
     * @param codigo Código do produto a ser alterado.
     * @param nova Nova quantidade do produto.
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando a nova quantidade é inválida.
     */
    public void updateQuantidade(int codigo, double nova) throws Exception{
        getProduto(codigo).setQuant(nova);
    }
	
    /**
     * Altera o preço do produto com o código informado.
     * @param codigo Código do produto a ser alterado.
     * @param novo Novo preço do produto.
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando o novo preço é inválido.
     */
    public void updatePreco(int codigo, double novo) throws Exception{
        getProduto(codigo).setPreco(novo);
    }
    
    /**
     * Adiciona a quantidade ao produto com código informado.
     * @param codigo Código do produto a ser alterado.
     * @param quantidade Quantidade a ser acrescentada. 
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando a quantidade é inválida.
     */
    public void addQuantidade(int codigo, double quantidade) throws Exception{
        getProduto(codigo).addQuant(quantidade);
    }

    /**
     * Subtrai a quantidade do produto com código informado.
     * @param codigo Código do produto a ser alterado.
     * @param quantidade Quantidade a ser subtraída.
     * @throws java.lang.Exception Lança exceção quando não existe produto com o 
     * código informado ou quando quantidade informada é inválida.
     */
    public void subQuantidade(int codigo, double quantidade) throws Exception{
        getProduto(codigo).removeQuant(quantidade);
    }

}
