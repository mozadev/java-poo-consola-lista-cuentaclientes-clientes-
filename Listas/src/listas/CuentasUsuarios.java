




package listas;

import java.util.HashSet;

import java.util.Set;

public class CuentasUsuarios {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cl1 = new Cliente("cesar", "001", 100);
        Cliente cl2 = new Cliente("maria", "002", 200);
        Cliente cl3 = new Cliente("julio", "003", 300);
        Cliente cl4 = new Cliente("jose", "004", 400);
        
        Set<Cliente>clientesBanco=new HashSet <Cliente> ();
        
        //AGREGANDO CLIENTES
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
         clientesBanco.add(cl3);
          clientesBanco.add(cl4);
          
          
          //RECORRE LA COLECCION
          
          for (Cliente cliente : clientesBanco) {
              System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo());
        }
          

    }

}
