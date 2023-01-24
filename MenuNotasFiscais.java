import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuNotasFiscais {
    Scanner entrada = new Scanner(System.in);

    private ListaNotasFiscais lnf;

    public MenuNotasFiscais(ListaNotasFiscais lnf){
        this.lnf = lnf;
        lnf = new ListaNotasFiscais();
    }

    public void show(){
        int op;
        do{
            System.out.println("|-------------------------------|");
            System.out.println("|       DELÍCIAS VEGANAS        | ");
            System.out.println("|      MENU NOTAS FISCAIS       | ");
            System.out.println("|-------------------------------|");
            System.out.println("|1- Exibir nota fiscal          |");
            System.out.println("|2- Exibir todas as notas ficais|");
            System.out.println("|3- Excluir nota fiscal         |");
            System.out.println("|4- Voltar                      |");
            System.out.println("|-------------------------------|");
            System.out.print("O que você deseja comprar? ");
            op = entrada.nextInt();
            entrada.nextLine();
            switch (op){    
                case 1:
                    Exibir();
                break;
                case 2:
                    ExibirTodas();
                break;
                default:
                    System.out.print("Opção inválida!");
                break;
            }
        } while (op!=4);
    }   

    public void Exibir(){
        int cod;
        boolean ok;
        do{
            try{
                System.out.print("Qual o código da Nota Fiscal que deseja exibir? ");
                cod = entrada.nextInt();
                try{
                    lnf.getNotaFiscal(cod);
                    ok = true;
                    System.out.print(lnf.getNotaFiscal(cod));
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
    }

    public void ExibirTodas(){
        lnf.toString();
    }

    public void Excluir(){
        int cod;
        boolean ok;
        do{
            try{
                System.out.print("Qual o código da Nota Fiscal que deseja excluir? ");
                cod = entrada.nextInt();
                try{
                    lnf.getNotaFiscal(cod);
                    ok = true;
                    lnf.removeNotaFiscal(cod);
                    System.out.print("Nota Fiscal removida com êxito!");
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
    }
}
