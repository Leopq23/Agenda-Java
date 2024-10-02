package aed;

public class Fecha {
    int dia;
    int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        dia = fecha.dia;
        mes = fecha.mes;
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }

    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(dia + "/" + mes);

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otra) {
        
        boolean oen = (otra == null);

        boolean cd = otra.getClass() != this.getClass();

        if (oen || cd) {
            return false;
        }

        Fecha otraFecha = (Fecha) otra;

        return dia == otraFecha.dia && mes == otraFecha.mes;
    }

    public void incrementarDia() {
        if(mes == 2 && dia == 28){
            mes = 3;
            dia = 1;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30){
            mes++;
            dia = 1;
        } else if(mes == 12 && dia == 31) {
            mes = 1;
            dia = 1;
        } else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 31){
            mes++;
            dia = 1;
        } else{
            dia++;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
