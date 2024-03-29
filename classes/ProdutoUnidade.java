public class ProdutoUnidade extends Produto {

    int quant;
    
    public ProdutoUnidade(String nome, String descricao, double preco) {
        super(nome, descricao, preco);
    }

    /** 
     * @return int quantidade do produto
     */
    public double getQuant(){return quant;}

    /** 
     * Editar quantidade do produto no estoque
     * @param quant int quantidade do produto
     */
    public void setQuant(int quant){this.quant = quant;}
    public void setQuant(double quant) throws Exception{
        try{
            this.quant = (int)quant;
        } catch (Exception e){
            throw new Exception ("o valor nao e inteiro");
        }
    }

    //verificar se n é negativo ou outracoisa invalida
    //fazer igual setQuant
    public double addQuant(double valor){
        return getQuant() + valor;
    }

    public double removeQuant(double valor){
        return getQuant() - valor;
    }
    
}
