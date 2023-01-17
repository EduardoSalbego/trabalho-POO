public class Item {
    
    private double quantidade;
    private double preco;
    private Produto produto;

    public Item (Produto produto, double quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
    }
    
    public double getTotal(){
        return preco*quantidade;
    }

    public double getQuantidade(){return quantidade;}
    public String getProduto(){return produto.getNome();}
}
