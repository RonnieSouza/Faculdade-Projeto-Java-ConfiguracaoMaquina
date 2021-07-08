import java.util.Scanner;

public class PlacaMae extends Identificacao{
    public String TipoProcessador;

    public void setTipoProcessador(String tp) {
        if (!tp.isEmpty()) {
            TipoProcessador = tp;
        }
    }

    public String getTipoProcessador() {
        return TipoProcessador;
    }

    public void cadastrar ( String ma, String mo, String tp, double pr ) {
        super.cadastrar( ma, mo, pr );
        setTipoProcessador( tp );
    }

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tipo do Processador: ");
        setTipoProcessador(entrada.nextLine());
        super.entradaDados();
    }

    public void imprimir() {
        System.out.println("Tipo de Processador: " + getTipoProcessador());
        super.imprimir();
    }

}
