import java.util.Scanner;

public class Notebook {
    public String peso;

    public void setPeso(String p) {
        if (!p.isEmpty()) {
            peso = p;
        }
    }

    public String getPeso() {
        return peso;
    }


    public PlacaMae pm = new PlacaMae();
    public PlacaVideo pv = new PlacaVideo();
    public HD hd = new HD();
    public Memoria slot0 = new Memoria();
    public Memoria slot1 = new Memoria();
    public Memoria slot2 = new Memoria();
    public Memoria slot3 = new Memoria();

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Peso : " );
        setPeso(entrada.nextLine());
    }

    public void imprimir() {
        System.out.println("Tipo Cooler: " + getPeso());
    }

}
