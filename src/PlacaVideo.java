import java.util.Scanner;

public class PlacaVideo extends Identificacao{
    public String padrao;

    public void setPadrao(String pa) {
        if (!pa.isEmpty()) {
            padrao = pa;
        }
    }

    public String getPadrao() {
        return padrao;
    }

    @Override
    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Padrão da Placa de Video: ");
        setPadrao(entrada.nextLine());
        super.entradaDados();

    }

    @Override
    public void imprimir() {
        System.out.println("Padrão da Placa de Video: " + getPadrao());
        super.imprimir();
    }

}
