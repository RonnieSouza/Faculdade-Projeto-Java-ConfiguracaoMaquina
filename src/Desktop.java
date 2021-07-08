
import java.util.Scanner;

public class Desktop {
    public String tipoCooler;

    public void setTipoCooler(String tc) {
        if (!tc.isEmpty()) {
            tipoCooler = tc;
        }
    }

    public String getTipoCooler() {
        return tipoCooler;
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
        System.out.println("Tipo Cooler: " );
        setTipoCooler(entrada.nextLine());
    }

    public void imprimir() {
        System.out.println("Tipo Cooler: " + getTipoCooler());
    }

}
