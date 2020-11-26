/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import utilidades.Utilidad;

/**
 *
 * @author ADMINMJ
 */
public class Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa miEmpresa;
        int opcion;
          int numero= Utilidad.pedirNumeroEntero
        ("Introduce el numero de plazas", 1, 100);
        miEmpresa=new Empresa(numero);
        miEmpresa.inicializarPlazas();
        //miEmpresa = new Empresa();

        menu();
        opcion = Utilidad.pedirNumeroEntero("Opcion : ", 1, 4);
        while (opcion != 4) {

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:miEmpresa.visualizar();
                    break;
            }
            menu();
            opcion = Utilidad.pedirNumeroEntero("Opcion : ", 1, 4);
        }

    }

    public static void menu() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1. LLegada");
        System.out.println("2. Salida");
        System.out.println("3. Visualizar");
        System.out.println("4. fin");

    }

}
