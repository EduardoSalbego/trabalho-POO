import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuProdutos {
    
    Scanner entrada = new Scanner(System.in);

    ListaProdutos lp;
    private int op1;
    private int op2;

    public MenuProdutos(ListaProdutos lp){
        this.lp = lp;
        lp = new ListaProdutos();
    }

    public void show(){
        do{
            System.out.println("");
            System.out.println("MENU PRODUTOS");
            System.out.println("1 - Cadastrar um produto");
            System.out.println("2 - Verificar o cadastro de um produto");
            System.out.println("3 - Alterar dados de um produto já cadastrado");
            System.out.println("4 - Excluir um produto cadastrado");
            System.out.println("5 - Retornar ao menu principal");
            System.out.println("");
            System.out.print("O que você deseja fazer? ");

            try {
                op1 = entrada.nextInt();
            } catch (InputMismatchException e) {
                op1 = 7;
            } finally {
                entrada.nextLine();
            }

            switch (op1){
            case 1:
                Cadastrar();
            break;
            case 2:
                Verificar();
            break;
            case 3:
                //Alterar(); 
            break;
            case 4:
                //Excluir(); 
            break;
            case 5:
            break;
            default:
                System.out.println("Opção inválida!");
            break;
            }
        } while (op1!=5);
    }

    public void Cadastrar() {
        boolean ok = false;
        System.out.print("Digite o nome do produto que deseja cadastrar: ");
        String nome = entrada.nextLine();
        System.out.print("Insira uma descrição para o produto: ");
        String descricao = entrada.nextLine();
        do{
            try{
                System.out.print("Insira o precço do produto: ");
                double preco = entrada.nextDouble();
                ok = true;
                Produto cadastro = new Produto(nome, descricao, preco);
                lp.addProduto(cadastro);
                System.out.println("Produto cadastrado.");
                System.out.println(cadastro.toString());
            }catch(InputMismatchException e) {
                System.out.println("Insira um valor válido!");
                ok = false;
            } finally {
                entrada.nextLine();
            }
        } while (ok == false);
    }

    public void Verificar(){
        boolean ok = false;
        int cod = 0;
        do {
            System.out.println("");
            System.out.print("Informe o código: ");
            ok = true;
            try {
                cod = entrada.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                ok = false; 
                System.out.println("Valor inválido!");
            } finally {
                entrada.nextLine();
            }
        } while (ok == false);
        try{
            lp.getProduto(cod);
            System.out.println("Produto encontrado: ");
            System.out.println(lp.getProduto(cod).toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
