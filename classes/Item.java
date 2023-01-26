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

    public void setQuantidade(double quantidade){this.quantidade = quantidade;}
    public double getQuantidade(){return quantidade;}
    public Produto getProduto(){return produto;}
    public String toString(){
        return "Produto : "+getProduto().getNome()+" | Quantidade: "+quantidade+" | Valor: "+getTotal()+"/n ";
    }
}
