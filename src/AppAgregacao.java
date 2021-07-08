import java.util.Scanner;

public class AppAgregacao {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        Desktop desk = new Desktop();
        desk.entradaDados();
        desk.hd.entradaDados();
        desk.pm.entradaDados();
        desk.pv.entradaDados();
        desk.slot0.entradaDados();
        desk.slot1.entradaDados();
        desk.slot2.entradaDados();
        desk.slot3.entradaDados();
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        Notebook note = new Notebook();
        note.entradaDados();
        note.hd.entradaDados();
        note.pm.entradaDados();
        note.pv.entradaDados();
        note.slot0.entradaDados();
        note.slot1.entradaDados();
        note.slot2.entradaDados();
        note.slot3.entradaDados();
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");
        System.out.println("-------Mostrando o resultado--------");
        System.out.println("------------------------------------");

        desk.imprimir();
        desk.hd.imprimir();
        desk.pm.imprimir();
        desk.pv.imprimir();
        desk.slot0.imprimir();
        desk.slot1.imprimir();
        desk.slot2.imprimir();
        desk.slot3.imprimir();

        System.out.println("------------------------------------");
        System.out.println("-------Mostrando o resultado--------");
        System.out.println("------------------------------------");

        note.imprimir();
        note.hd.imprimir();
        note.pm.imprimir();
        note.pv.imprimir();
        note.slot0.imprimir();
        note.slot1.imprimir();
        note.slot2.imprimir();
        note.slot3.imprimir();
    }
}
