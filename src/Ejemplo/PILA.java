/*
Estructura de datos pila para elementos de tipo String
 */
package Ejemplo;

import javax.swing.JOptionPane;

public class PILA {

    private final int MAX = 25;
    private String v[] = new String[MAX];
    private int Tope;

    PILA() {
        Tope = 0;
    }

    boolean llena() {
        if (Tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    void poner(String elem) {
        if (llena()) {
            JOptionPane.showMessageDialog(null, "pila llena");
            System.exit(0);
        } else {
            Tope = Tope + 1;
            v[Tope] = elem;
        }
    }

    boolean vacia() {
        if (Tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    String Quitar() {

        String e = " ";
        if (vacia()) {
            JOptionPane.showMessageDialog(null, "Pila Vacia");
            System.exit(0);
        } else {
            e = v[Tope];
            Tope = Tope - 1;
        }
        return e;
    }

    void imprimir() {
        int i = Tope;
        String cade = "";
        while (i > 0) {
            cade = cade + v[i] + "\n";
            i = i - 1;
        }
        JOptionPane.showMessageDialog(null, cade);
    }

    void cargarpi() {
        int N;
        String dato;
        dato = JOptionPane.showInputDialog("Cuantos datos desea ingresar");
        N = Integer.parseInt(dato);

        for (int i = 1; i <= N; i++) {
            dato = JOptionPane.showInputDialog("Dame un elemento");
            poner(dato);
        }
    }

    int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
