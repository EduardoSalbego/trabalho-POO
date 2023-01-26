import java.util.ArrayList;

/**
 * A classe ListaNotaFiscais representa uma lista de notas fiscais e suas manipulações.
 * @author Bianca, Eduardo, Gian, Maria Luiza
 * @since jan 2023
 * @version 1.0
 */
public class ListaNotasFiscais implements INotasFiscais {

    
    
     /**
     * Arraylist do tipo NotaFiscal para armazenar notas
     */
    private ArrayList<NotaFiscal> notas;


    /**
     * Construtor default da classe
     */
    public ListaNotasFiscais() {
        notas = new ArrayList();
    }


    /**
     * Adiciona uma nota fiscal.
     * @param nf Nota fiscal a ser adicionada.
     * @throws java.lang.Exception Lança exceção quando a nota fiscal não pode ser adicionada.
     */
    public void addNotaFiscal(NotaFiscal nf) throws Exception{
        notas.add(nf);
    }
    
    /**
     * Remove a nota fiscal com código informado.
     * @param codigo Código da nota fiscal a ser removida.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public void removeNotaFiscal(int codigo) throws Exception{
        notas.remove(getNotaFiscal(codigo));     
    }
    
    /**
     * Captura a nota fiscal com o código informado.
     * @param codigo Código da nota fiscal a ser capturada.
     * @return NotaFiscal Nota fiscal com o código informado.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public NotaFiscal getNotaFiscal(int codigo) throws Exception{
        for(NotaFiscal nota : notas) {
            if(nota.getCodigo() == codigo) {
                return nota;
            }
        }
        throw new Exception("Nota Fiscal não cadastrada.");
    }
    
	/**
     * Captura o total da nota fiscal informada.
     * @param codigo Código da nota fiscal.
     * @return O total (soma do valor de todos os items) da nota fiscal com o código informado.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public double getTotal(int codigo) throws Exception{
        return getNotaFiscal(codigo).somaTudo();
    }

    /**
     * Adiciona um item a nota fiscal com o código informado.
     * @param codigo Código da nota fiscal na qual o item deve ser adicionado.
     * @param item Item a ser adicionado.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    public void addItem(int codigo, Item item) throws Exception{
        for(NotaFiscal nota : notas) {
            if(nota.getCodigo() == codigo) {
                nota.addItem(item);
            }
        }
        throw new Exception ("Código inválido!");
    }
    
    /**
     * Remove um item da nota fiscal com o código informado.
     * @param codigo Código da nota fiscal na qual o item deve ser removido.
     * @param item Item a ser removido.
     * @throws java.lang.Exception Lança exceção quando não existir nota fiscal com o código informado ou 
     * quando o Item informado não existir.
     */
    public void removeItem(int codigo, Item item) throws Exception{
        for(NotaFiscal nota : notas) {
            if(nota.getCodigo() == codigo) {
                nota.removeItem(item);
            }
        }
        throw new Exception ("Código inválido!");
    }

    public String toString(){
        String dados = "";
        for(int i = 0; i<notas.size(); i++){
            dados += notas.get(i).toString() + " \n";
        }
        return dados;
    }
}
