import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner entrada = new Scanner(System.in);

    private ListaNotasFiscais lnf;
    private ListaProdutos lp;
    private int op;
    private MenuProdutos mp;
    private MenuNotasFiscais mnf;
    private MenuCompras mc;

    public Menu(ListaNotasFiscais lnf, ListaProdutos lp){
        this.lnf = lnf;
        this.lp = lp;
        mp = new MenuProdutos(lp);
        mnf = new MenuNotasFiscais(lnf);
        mc = new MenuCompras(lp, lnf);
    }

    public void show() {
        do {
            System.out.println("-------------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - Menu Produto");
            System.out.println("2 - Menu Compras");
            System.out.println("3 - Encerrar programa");
            System.out.println("-------------------------------");
            System.out.println("Qual lista você deseja acessar? ");
            try {
              op = entrada.nextInt();
            } catch (InputMismatchException e) {
              op = 7;
            } finally {
              entrada.nextLine();
            }
            switch (op) {
              case 1:
                mp.show();
                break;
              case 2:
                mc.show();
                break;
              case 3:
                break;
              default:
                System.out.println("Opção inválida");
                break;
            }
          } while (op != 3);
    }
}
