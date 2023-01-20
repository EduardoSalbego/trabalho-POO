import java.util.InputMismatchException;
import java.util.Scanner;


public class MenuCompras {
    
    Scanner entrada = new Scanner(System.in);

    private static int aux = 0;
    private int op1; 
    private ListaProdutos lp;
    private ListaNotasFiscais lnf;
    NotaFiscal nf = new NotaFiscal();

    public MenuCompras(ListaProdutos lp, ListaNotasFiscais lnf){
        this.lp = lp;
        this.lnf = lnf;
        lp = new ListaProdutos();
        lnf = new ListaNotasFiscais();
    }

    public void show() {
        do{
            System.out.println("|-------------------------------|");
            System.out.println("|       DELÍCIAS VEGANAS        | ");
            System.out.println("|         MENU COMPRAS          | ");
            System.out.println("|-------------------------------|");
            System.out.println("|1- Efetuar Compra              |");
            System.out.println("|2- Voltar                      |");
            System.out.println("|-------------------------------|");
            System.out.print("O que você deseja comprar? ");
            op1 = entrada.nextInt();
            entrada.nextLine();
            switch (op1){    
                case 1:
                    Efetuar();
                break;
                case 2:
                break;
                default:
                    System.out.print("Opção inválida!");
                break;
            }
        } while (op1!=2);
    }

    private void Efetuar() {
        int codigoProduto = 0;
        int quant = 0;
        boolean ok = false;

        do{
            try{
                System.out.print("Qual o código do produto que deseja?");
                codigoProduto = entrada.nextInt();
                try{
                    lp.getProduto(codigoProduto);
                    ok = true;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    ok = false;
                }
            }catch(InputMismatchException e){
                System.out.println("Digite apenas números");
                ok = false;
            }finally {
                entrada.nextLine();
            }
        } while (ok == false);

        try{
            System.out.print("Qual a quantidade?");
            quant = entrada.nextInt();
        }catch (InputMismatchException e){
            System.out.print(e.getMessage());
        }finally {
            entrada.nextLine();
        }

        try{
            Item item = new Item(lp.getProduto(codigoProduto), quant);
            nf.addItem(item);
            aux++;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        do{
            System.out.println("|-------------------------------------|");
            System.out.println("|1- Adicionar mais um produto na venda");
            System.out.println("|2- Verificar carrinho atual");
            System.out.println("|3- Finalizar compra");
            System.out.println("|4- Cancelar compra");
            System.out.println("|-------------------------------------|");
            System.out.print("O que você deseja fazer? ");
            op1 = entrada.nextInt();
            entrada.nextLine();
            switch (op1){    
                case 1:
                    Efetuar();
                break;
                case 2:
                    Mostrar();
                break;
                case 3:
                    Finalizar();
                break;
                default:
                    System.out.print("Opção inválida!");
                break;
            }
        } while (op1!=4);
        
    }

    public void Mostrar(){
        for(int i = 0; i<aux; i++){
            System.out.print(nf.getItem(i).toString());
        }
    }

    public void Finalizar(){
        
    }
}