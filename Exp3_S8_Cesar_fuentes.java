
package exp3_s8_cesar_fuentes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exp3_S8_Cesar_fuentes {
    
    //ahora procedo a agregar el menu de venta
    ArrayList<Double> entradasTeatro;
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       List<String>nombres=new ArrayList<>();
       List<String>apellidos=new ArrayList<>();
       List<String>rut=new ArrayList<>();
       List<String>correo=new ArrayList<>();
       String n1,ap1,r1,c1;
       
      //recolección de información personal y diferenciadora de la persona que compra la entrada.
        System.out.println("Bienvenido a la pagina web del Teatro Moro");
        System.out.println("Por favor ingrese sus datos personales para poder enviar un comprobante posterior a efectuada su compra: ");
        System.out.println("1.-Ingrese su nombre: ");
        n1=teclado.nextLine();
        nombres.add(n1);
        System.out.println("2.-Ingrese sus apellidos:  ");
        ap1=teclado.nextLine();
        apellidos.add(ap1);
        System.out.println("3.-Ingrese su Rut: ");
        r1=teclado.nextLine();
        rut.add(r1);
        System.out.println("4.-Ingrese su correo: ");
        c1=teclado.nextLine();
        correo.add(c1);
        
        System.out.println("Su información personal es la siguiente y por consiguiente datos de verificación (ID): ");
        System.out.println(nombres);
        System.out.println(apellidos);
        System.out.println(rut);
        System.out.println(correo);
        
        System.out.println("Ahora proceda a seleccionar su alternativa correspondiente en el menu de venta====>");
        //creo mi lista para poder hacer el menu de venta.
        Exp3_S8_Cesar_fuentes miLista = new Exp3_S8_Cesar_fuentes();
        miLista.entradasTeatro = new ArrayList();
        miLista.leerOpcion();
    }
    private void leerOpcion() {
    Scanner teclado = new Scanner (System.in);
    int opcion;
    do {
            System.out.println("=====MENU DE VENTA DE ENTRADAS TEATRO MORO=====");
            System.out.println("1.-Compra de entradas.");
            System.out.println("2.-Eliminar venta.");
            System.out.println("3.-Imprimir boleta.");
            System.out.println("4.-Salir.");
            System.out.println("Ingrese su opción: =====>");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                   compraDeEntradas();
                   break;
                case 2:
                   eliminarVenta();
                   break;
                case 3:
                   imprimirBoleta();
                   break; 
            }
    } while (opcion != 4);   
                System.out.println("Muchas gracias por su visita al Teatro Moro");
                System.out.println("Hastra pronto.");
    }
    public void compraDeEntradas(){
    Scanner teclado = new Scanner(System.in);
    int alternativa, edad;
    double valor=0;
    do{
            System.out.println("Has seleccionado compra de entradas.");
            System.out.println("El teatro moro cuenta con cuatro tipo de ansientos.");
            System.out.println("1.-VIP = $20.000 pesos.");
            System.out.println("2.-Platea alta = $15.000 pesos.");
            System.out.println("3.-Platea baja = $13.000 pesos.");
            System.out.println("4.-Palcos = $10.000 pesos.");
            System.out.println("5.-Salir."); 
            System.out.println("Ingrese su opción: =====>");
            alternativa=teclado.nextInt();
            switch (alternativa){
                case 1:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.vip;
                         asientos.tipoDeAsiento=asientos.A1; 
                         valor=tarifas.tarifa;
                         entradasTeatro.add(valor);
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce1-1);
                         System.out.println("Has seleccionado asientos VIP.");
                         System.out.println("El teatro Moro cuenta con 140 asientos totales de los cuales 20 son asientos en VIP.");
                         System.out.println("El precio a pagar es: $"  +tarifas.vip + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=teclado.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.vip -(tarifas.vip*descuentos.descuento)) + " pesos.");
                         System.out.println("la actual disponibilidad de asientos en VIP es de: " +(disponibilidades.ce1-1) + " asientos.");
                         
                        break;
                       }
                       case 2:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.pa;
                         asientos.tipoDeAsiento=asientos.A2;
                         valor=tarifas.tarifa;
                         entradasTeatro.add(valor);
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce2-1);
                         System.out.println("Has seleccionado asientos Platea Alta.");
                         System.out.println("El teatro Moro cuenta con 140 asientos totales de los cuales 30 son asientos en Platea Alta.");
                         System.out.println("El precio a pagar es: $"  +tarifas.pa + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=teclado.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.pa -(tarifas.pa*descuentos.descuento)) + " pesos.");
                         System.out.println("la actual disponibilidad actual de asientos en platea alta es de: "+(disponibilidades.ce2-1) +" asientos.");
                       
                       break;
                       }
                       case 3:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.pb;
                         asientos.tipoDeAsiento=asientos.A3;  
                         valor=tarifas.tarifa;
                         entradasTeatro.add(valor);
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce3-1);
                         System.out.println("Has seleccionado asientos Platea Baja.");
                         System.out.println("El teatro cuenta con 140 asientos totales de los cuales 40 son asientos en Platea Baja.");
                         System.out.println("El precio a pagar es: $"  +tarifas.pb + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=teclado.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.pb -(tarifas.pb*descuentos.descuento)) + " pesos.");
                         System.out.println("la disponibilidad actual de asientos en platea baja es de: "+(disponibilidades.ce3-1) + " asientos.");
                         break;
                       }
                       case 4:{
                         tarifas.tarifa=tarifas.tarifa+tarifas.p;
                         asientos.tipoDeAsiento=asientos.A4;
                         valor=tarifas.tarifa;
                         entradasTeatro.add(valor);
                         disponibilidades.disponibilidad=disponibilidades.disponibilidad+(disponibilidades.ce4-1);
                         System.out.println("Has seleccionado asientos Palcos.");
                         System.out.println("El teatro Moro cuenta con 140 asientos totales de los cuales 50 son asientos en Palcos.");
                         System.out.println("El precio a pagar es: $"  +tarifas.p + " pesos.");
                         System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
                         edad=teclado.nextInt();
                           if (edad >= 1 && edad <= 18) {
                           System.out.println("Su entrada tiene un descuento del 10%.");
                           descuentos.descuento = descuentos.de;
                           } else if (edad > 18 && edad < 60) {
                           System.out.println("Su entrada no tiene un descuento.");
                           descuentos.descuento = descuentos.sd;
                           } else if (edad >= 60) {
                           System.out.println("Su entrada tiene un descuento del 15%.");
                           descuentos.descuento = descuentos.dam;
                           }
                         System.out.println("Su monto a pagar es: $ "+ (tarifas.p -(tarifas.p*descuentos.descuento)) + " pesos.");
                         System.out.println("la disponibilidad actual de asientos en palco es de: "+(disponibilidades.ce4-1)+" asientos.");
                         break;
                       }
                       default:
                           System.out.println("Por favor ingrese una opción valida====>");
                         break;
                         } 
            } while (alternativa!=5);
            
    }
    public void eliminarVenta(){
    Scanner teclado=new Scanner (System.in);
    double valor;
    int indice = 0;
    System.out.println("Ingrese valor sin descuento de la entrada a eliminar:    ");
    valor = teclado.nextInt();
    indice = entradasTeatro.indexOf(valor);
    if (indice != -1){
        entradasTeatro.remove(indice);
        System.out.println("Valor de entrada eliminado");
    } else {
        System.out.println("Valor de entrada no encontrado");
    }
    }
    public void imprimirBoleta(){
        if(!entradasTeatro.isEmpty()){
            System.out.println("Has seleccionado imprimir boleta.");
            for(int i=0;i<entradasTeatro.size();i++){
                System.out.println("El resumen de tu compra es el siguiente =====> ");
                System.out.println("El precio de la entrada es: $"+entradasTeatro.get(i)+"pesos");
                System.out.println(".-Ubicación del asiento: " +asientos.tipoDeAsiento);
                System.out.println(".-Total de asientos " +asientos.tipoDeAsiento + "actual es de: " + disponibilidades.disponibilidad + " asientos.");
                System.out.println(".-Precio inicial de la entrada: " +tarifas.tarifa + " pesos");
                System.out.println(".-Descuento aplicado: " +(descuentos.descuento*100)+ "%");
                System.out.println(".-precio final a pagar: "+ (tarifas.tarifa-(tarifas.tarifa*descuentos.descuento))+ " pesos");
            }
        } else {
            System.out.println("No existen entradas en la lista.");
        }
    }
    class tarifas{
          static int tarifa = 0;
          static int vip=20000; //precio vip.
          static int pa=15000; //precio platea alta.
          static int pb=13000; //precio platea baja.
          static int p=10000; //precio palcos.
        }
        class descuentos{
          static double descuento=0;
          static double de=0.10; //descuento escolar del 10%.
          static double dam=0.15; //descuento adulto mayor del 15%.
          static double sd=0; //sin descuento.
        }
        class asientos{
            static String tipoDeAsiento;
            static String A1="V.I.P.";
            static String A2="Platea Alta.";
            static String A3="platea Baja.";
            static String A4="Palcos";
        }
        class disponibilidades{
            static int disponibilidad=0;
            static int ce1=20; //20 asientos disponibles vip.
            static int ce2=30; //30 asientos disponibles platea alta.
            static int ce3=40; //40 asientos di1sponibles platea baja.
            static int ce4=50; //50 asientos disponibles palcos
        }   
    
    }
    

