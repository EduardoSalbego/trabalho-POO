public class Main {
    public static void main(String[] args){

        ListaNotasFiscais lnf = new ListaNotasFiscais();
        ListaProdutos lp = new ListaProdutos();
        Menu m1 = new Menu(lnf, lp);
        m1.show();
    }
}
