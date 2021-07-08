import java.util.Scanner;

public class Identificacao {
    public String marca , modelo;
    public double preco;


    public void setMarca( String ma ) {
        if (!ma.isEmpty()) {
            marca = ma;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo( String mo ) {
        if (!mo.isEmpty()) {
            modelo = mo;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setPreco( double prc ) {
        if (prc > 0) {
            preco = prc;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Marca: ");
        setMarca(entrada.nextLine());
        System.out.println("Modelo: ");
        setModelo(entrada.nextLine());
        System.out.println("Preço: ");
        setPreco(Double.parseDouble(entrada.nextLine()));

    }

    public void cadastrar(String ma , String mo , double prc) {
        setMarca(ma);
        setModelo(mo);
        setPreco(prc);

    }

    public void imprimir() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: " + getPreco());
    }


}
