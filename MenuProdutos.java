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
                Alterar(); 
            break;
            case 4:
                Excluir(); 
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
                System.out.print("Insira o preço do produto: ");
                double preco = entrada.nextDouble();
                System.out.print("Digite a quantidade em estoque: ");
                double quant = entrada.nextDouble();
                ok = true;
                Produto cadastro = new Produto(nome, descricao, preco, quant);
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Alterar(){
        boolean ok = false;
        int cod = 0;
        do {
            System.out.println("");
            System.out.print("Informe o código do produto: ");
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
            System.out.println("Produto encontrado!");
            System.out.println(lp.getProduto(cod).toString());
            do{
                System.out.println("");
                System.out.println("1 - Nome");
                System.out.println("2 - Descrição");
                System.out.println("3 - Preço");
                System.out.println("4 - Quantidade em estoque");
                System.out.println("");
                System.out.print("Qual dado você gostaria de alterar/cadastrar? ");
                try{
                    op2 = entrada.nextInt();
                } catch (InputMismatchException e){
                } finally {
                    entrada.nextLine();
                }
                switch(op2){
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String nome = entrada.nextLine();
                        lp.getProduto(cod).setNome(nome);
                        System.out.println("Nome alterado com sucesso.");
                    break;
                    case 2:
                        System.out.println("Digite a nova descrição: ");
                        String desc = entrada.nextLine();
                        lp.getProduto(cod).setDescricao(desc);
                        System.out.println("Descrição alterada com sucesso.");
                    break;
                    case 3:
                        boolean ok2;
                        do{
                            System.out.println("");
                            System.out.print("Digite o novo preço: ");
                            double preco = 0;
                            try {
                                preco = entrada.nextInt();
                                lp.getProduto(cod).setPreco(preco);
                                System.out.println("Preço alterado com sucesso.");
                                ok2 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Número inválido!");
                                ok2 = false;
                            } finally {
                                entrada.nextLine();
                            }
                        } while(ok2 == false);
                    break;
                    case 4:
                        boolean ok3;
                        do{
                            System.out.println("");
                            System.out.print("Digite a nova quantidade em estoque: ");
                            double quant = 0;
                            try {
                                quant = entrada.nextDouble();
                                lp.getProduto(cod).setQuant(quant);;
                                System.out.println("Quantidade alterada com sucesso.");
                                ok3 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Número inválido!");
                                ok3 = false;
                            } finally {
                                entrada.nextLine();
                            }
                        } while(ok3 == false);
                    break;
                }
            }while((op2!=1)&&(op2!=2)&&(op2!=3)&&(op2!=4));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Excluir(){
        boolean ok;
        int cod;
        do{
            try{
            System.out.print("Informe o Codigo do produto: ");
                cod = entrada.nextInt();
                try {
                    lp.getProduto(cod);
                    lp.removeProduto(cod);
                    System.out.println("Produto excluído com sucesso.");
                    ok = true;
                } catch(Exception e) {  
                    System.out.println(e.getMessage());
                    ok = false;
                }
            } catch (InputMismatchException e) {
                ok = false;
                System.out.println("Codigo inválido!");
            } finally { 
                entrada.nextLine();
            }
        } while (ok == false);
      }
}
