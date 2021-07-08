import java.util.Scanner;

public class Armazenamento extends Identificacao {
    public String tipo;
    public int capacidade;

    public void setTipo(String ti) {
        if (!ti.isEmpty()) {
            tipo = ti;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setCapacidade(int cap) {
        if (cap > 0) {
            capacidade = cap;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void cadastrar(String ma, String mo , String ti, double pr , int ca) {
        super.cadastrar(ma , mo , pr);
        setTipo(ti);
        setCapacidade(ca);
    }

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tipo: ");
        setTipo(entrada.nextLine());
        System.out.println("Capacidade: ");
        setCapacidade(Integer.parseInt(entrada.nextLine()));
        super.entradaDados();
    }

    public void imprimir() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Capacidade: " + getCapacidade());
        super.imprimir();
    }

}
