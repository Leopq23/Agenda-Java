package aed;

import java.util.Arrays;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    private Recordatorio[] arreglo;
    private int longitud;

    public ArregloRedimensionableDeRecordatorios() {
        arreglo = new Recordatorio[10];
        longitud = 0;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.longitud = vector.longitud;
        this.arreglo = Arrays.copyOf(vector.arreglo, vector.arreglo.length);
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAtras(Recordatorio i) {
        arreglo[longitud] = i;
        longitud++;
    }

    public Recordatorio obtener(int i) {
        return arreglo[i];
    }

    public void quitarAtras() {
        arreglo[longitud - 1] = null;
        longitud--;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        arreglo[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios vectorNuevo = new ArregloRedimensionableDeRecordatorios();

        for(int i=0; i < longitud; i++){
            vectorNuevo.agregarAtras(arreglo[i]);
        }

        return vectorNuevo;
    }

}
