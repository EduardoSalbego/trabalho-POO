/**
 * A classe Produto representa o produto global que é extendido por outras categorias
 * @author Bianca, Eduardo, Gian, Maria Luiza
 * @since jan 2023
 * @version 1.0
 */
public abstract class Produto{

    private static int codigoProduto = 1;
    private int codigo;
    private String nome;
    private double quant;
    private String descricao;
    private double preco;

    /**
     * Construtor da classe Produto
     * @param nome String que representa o nome do produto
     * @param descricao String descrição do produto
     * @param preco double preço do produto 
     */
    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigoProduto++;
    }

    /** 
     * @return int codigo do produto
     */
    public int getCodigo(){return codigo;}
    
    /** 
     * @return String nome do produto
     */
    public String getNome(){return nome;}

    /** 
     * Editar nome do produto
     * @param nome String nome do produto
     */
    public void setNome(String nome){this.nome = nome;}

    /** 
     * @return String descrição do produto
     */
    public String getDescricao(){return descricao;}

    /** 
     * Editar descrição do produto
     * @param descricao String descrição do produto
     */
    public void setDescricao(String descricao){this.descricao=descricao;}

     /** 
     * @return int quantidade do produto
     */

    public double getQuant(){return quant;}

    /** 
     * Editar quantidade do produto no estoque
     * @param quant int quantidade do produto
     */
    public void setQuant(double quant) throws Exception {this.quant = quant;}

    /** 
     * @return double preço do produto
     */
    public double getPreco(){return preco;}

    /** 
     * Editar preço do produto
     * @param preco double preço do produto
     */
    public void setPreco(double preco){this.preco=preco;}

    /** 
     * @return String que identifica as informacoes do produto
     */
    public String toString(){
        return "Código: "+codigo+" | Produto: "+nome+
        " | Descrição: "+descricao+" | Preço: "+preco;
    }
}
