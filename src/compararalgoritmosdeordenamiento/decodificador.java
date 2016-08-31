/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararalgoritmosdeordenamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Nelson Cardenas
 */
public class decodificador {

    public static void main(String[] args) throws IOException {
        String str = "";
        for (int i = 1; i <= 10; i++) {

            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File("./Resultados_" + i);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    str += linea + "\n";
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println(str);
        String[] arr = str.split("\\*");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
        System.out.println("");
        ArrayList<String[]> datos = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            String[] arr2 = arr[i].split("/");
            datos.add(arr2);
        }

        ArrayList<String[]> datos2 = new ArrayList();
        for (int i = 0; i < datos.size(); i++) {
            for (int j = 0; j < datos.get(i).length; j++) {
                System.out.println(datos.get(i)[j]);
                String[] arr3 = datos.get(i)[j].split("-");
                datos2.add(arr3);
            }
        }
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                System.out.println(datos2.get(i)[j]);
            }
        }
        System.out.println("");
        System.out.println("");

        ArrayList<String> resulBubble = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("BUBBLESORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulBubble.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
        ArrayList<String> resulIns = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("INSERTSORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulIns.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
        ArrayList<String> resulSel = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("SELECTIONSORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulSel.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
        ArrayList<String> resulMer = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("MERGESORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulMer.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
        ArrayList<String> resulHea = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("HEAPSORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulHea.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
        ArrayList<String> resulQui = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("QUICKSORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulQui.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
          ArrayList<String> resulRad = new ArrayList();
        for (int i = 0; i < datos2.size(); i++) {
            for (int j = 0; j < datos2.get(i).length; j++) {
                if (datos2.get(i)[j].equals("RADIXSORT")) {
                    System.out.println(datos2.get(i)[j + 1]);
                    resulQui.add(datos2.get(i)[j + 1]);
                }
                //System.out.println(datos2.get(i)[j]);
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("BUBBLESORT");
        imprimirEnOrden(resulBubble);
        System.out.println("----------------------------------------------------------------");
        System.out.println("INSERTIONSORT");
        imprimirEnOrden(resulIns);
        System.out.println("----------------------------------------------------------------");
        System.out.println("SELECTIONSORT");
        imprimirEnOrden(resulSel);
        System.out.println("----------------------------------------------------------------");
        System.out.println("MERGESORT");
        imprimirEnOrden(resulMer);
        System.out.println("----------------------------------------------------------------");
        System.out.println("HEAPSORT");
        imprimirEnOrden(resulHea);
        System.out.println("----------------------------------------------------------------");
        System.out.println("QUICKSORT");
        imprimirEnOrden(resulQui);
        System.out.println("----------------------------------------------------------------");
        System.out.println("RADIXSORT");
        imprimirEnOrden(resulRad);
    }

    public static void imprimirEnOrden(ArrayList<String> lista) {
        System.out.println("10 INPUT");
        System.out.println(lista.get(0));
        System.out.println(lista.get(6));
        System.out.println(lista.get(12));
        System.out.println(lista.get(18));
        System.out.println(lista.get(24));
        System.out.println(lista.get(30));
        System.out.println(lista.get(36));
        System.out.println(lista.get(42));
        System.out.println(lista.get(48));
        System.out.println(lista.get(54));

        System.out.println("100 INPUT");
        System.out.println(lista.get(1));
        System.out.println(lista.get(7));
        System.out.println(lista.get(13));
        System.out.println(lista.get(19));
        System.out.println(lista.get(25));
        System.out.println(lista.get(31));
        System.out.println(lista.get(37));
        System.out.println(lista.get(43));
        System.out.println(lista.get(49));
        System.out.println(lista.get(55));

        System.out.println("1,000 INPUT");
        System.out.println(lista.get(2));
        System.out.println(lista.get(8));
        System.out.println(lista.get(14));
        System.out.println(lista.get(20));
        System.out.println(lista.get(26));
        System.out.println(lista.get(32));
        System.out.println(lista.get(38));
        System.out.println(lista.get(44));
        System.out.println(lista.get(50));
        System.out.println(lista.get(56));

        System.out.println("10,000 INPUT");
        System.out.println(lista.get(3));
        System.out.println(lista.get(9));
        System.out.println(lista.get(15));
        System.out.println(lista.get(21));
        System.out.println(lista.get(27));
        System.out.println(lista.get(33));
        System.out.println(lista.get(39));
        System.out.println(lista.get(45));
        System.out.println(lista.get(51));
        System.out.println(lista.get(57));

        System.out.println("100,000 INPUT");
        System.out.println(lista.get(4));
        System.out.println(lista.get(10));
        System.out.println(lista.get(16));
        System.out.println(lista.get(22));
        System.out.println(lista.get(28));
        System.out.println(lista.get(34));
        System.out.println(lista.get(40));
        System.out.println(lista.get(46));
        System.out.println(lista.get(52));
        System.out.println(lista.get(58));

        System.out.println("1,000,000 INPUT");
        System.out.println(lista.get(5));
        System.out.println(lista.get(11));
        System.out.println(lista.get(17));
        System.out.println(lista.get(23));
        System.out.println(lista.get(29));
        System.out.println(lista.get(35));
        System.out.println(lista.get(41));
        System.out.println(lista.get(47));
        System.out.println(lista.get(53));
        System.out.println(lista.get(59));

    }
}
