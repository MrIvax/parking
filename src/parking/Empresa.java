/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/**
 *
 * @author ADMINMJ
 */
public class Empresa {
/**
 * Conjunto de plazas del parking
 */
    String[] plazas;
/**
 * Constructor
 */
    public Empresa() {
        plazas = new String[]{"libre", "libre"};
    }
/**
 * Constructor
 * @param numeroPlazas  que tiene el parking
 */
    public Empresa(int numeroPlazas) {
        plazas = new String[numeroPlazas];
    }
/**
 * Apertura parking. Se inicializan todas las plazas a libres.
 */
    public void inicializarPlazas() {
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE";
        }
    }
/**
 * Estado del parking.
 */
    public void visualizar() {
        int total = 0;
        System.out.println("NPLAZA \t SITUACIÓN");
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {

            System.out.println(nplaza + "\t" + plazas[nplaza]);
            if (plazas[nplaza].equalsIgnoreCase("libre")) {
                total++;
            }
        }
        System.out.println("TOTAL DE PLAZAS ES " + total);
    }
/**
 * Busqueda de la primera plaza libre
 * @return devuelve el número de plaza libre o el numero de plazas en el caso de
 * que no haya plazas libres
 */
    public int busqueda() {
        int nplaza;
        boolean encontrado;
        encontrado= false;
        nplaza = 0;
        while (!encontrado && nplaza < plazas.length) {
            if (plazas[nplaza].equalsIgnoreCase("libre")) {
                encontrado = true;
            } else {
                nplaza++;
            }

        }
        return nplaza;
    }
/**
 * Entrada de vehiculos en el parking
 * les asigna la primera plaza libre.
 */
    public void entrada() {
        int nplaza;
        nplaza = busqueda();
        if (nplaza < plazas.length) {
            System.out.println("La plaza asignada es " + nplaza);
            plazas[nplaza] = "ocupada";
        } else {
            System.out.println("Parking completo");
        }

    }
}
