import java.util.ArrayList;
import java.util.Calendar;

/**
 * A classe Produto representa o produto global que é extendido por outras categorias
 * @author Bianca, Eduardo, Gian, Maria Luiza
 * @since jan 2023
 * @version 1.0
 */
public class NotaFiscal{

    private static int codigoNotaFiscal = 1;
    private int codigo;
    private Calendar data = Calendar.getInstance();
    private ArrayList<Item> itens;

    /**
     * Construtor da classe NotaFiscal
     * @param data Calendar data da emissão da nota
     */
    public NotaFiscal(Calendar data){
        itens = new ArrayList<Item>();
        this.data = data;
        codigo = codigoNotaFiscal++;
    }

    /** 
     * @return int codigo do produto
     */
    public int getCodigo(){return codigo;}

    /**
     * @return Calendar data da emissão da nota
     */
    public Calendar data(){return data;}

    /**
     * Editar data da emissão da nota
     * @param data Calendar data nova da emissão da nota
     */
    public void setData(Calendar data){this.data = data;}

    public Item getItens(int indice){
        return this.itens.get(indice);
    }
    /**
     * @return
     */
    public double somaTudo(){
        double total = 0;
        for(int i=0; i<itens.size(); i++){
            total = total + itens.get(i).getTotal();
        }
        return total;
    }

    public void addItem(Item item){
        itens.add(item);
    }
    public void removeItem(Item item){
        itens.remove(item);
    }


}
