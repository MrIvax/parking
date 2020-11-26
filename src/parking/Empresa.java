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
  String [] plazas;

    public Empresa() {
        plazas=new String[]{"libre","libre"};
    }
   public Empresa(int numeroPlazas) {
        plazas=new String[numeroPlazas];
    }
   
  public void inicializarPlazas(){
      for (int nplaza=0; nplaza<plazas.length;nplaza++)
      {
          plazas[nplaza]="LIBRE";
      }
  }  
  public void visualizar(){
      int total=0;
      System.out.println("NPLAZA \t SITUACIÓN");
      for ( int nplaza=0; nplaza< plazas.length; nplaza++)
      {
          
          System.out.println(nplaza+"\t"+ plazas[nplaza]);
          if ( plazas[nplaza].equalsIgnoreCase("libre"))
              total++;
      }
      System.out.println("TOTAL DE PLAZAS ES "+ total);
  }
}
