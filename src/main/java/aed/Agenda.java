package aed;

public class Agenda {
    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
            this.recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(fechaActual + "\n");
        sbuffer.append("=====\n");
        for(int i = 0; i < recordatorios.longitud(); i++){
            if (this.fechaActual.equals(recordatorios.obtener(i).fecha())) {
                sbuffer.append(recordatorios.obtener(i)+ "\n");
            }
        }

        return sbuffer.toString();
    }

    public void incrementarDia() {
        if(this.fechaActual.mes == 2 && this.fechaActual.dia == 28){
            this.fechaActual.mes = 3;
            this.fechaActual.dia = 1;
        } else if ((this.fechaActual.mes == 4 || this.fechaActual.mes == 6 || this.fechaActual.mes == 7 || this.fechaActual.mes == 11) && this.fechaActual.dia == 30){
            this.fechaActual.mes++;
            this.fechaActual.dia = 1;
        } else if(this.fechaActual.mes == 12 && this.fechaActual.dia == 31) {
            this.fechaActual.mes = 1;
            this.fechaActual.dia = 1;
        } else if((this.fechaActual.mes == 1 || this.fechaActual.mes == 3 || this.fechaActual.mes == 5 || this.fechaActual.mes == 7 || this.fechaActual.mes == 8 || this.fechaActual.mes == 10) && this.fechaActual.dia == 31){
            this.fechaActual.mes++;
            this.fechaActual.dia = 1;
        } else{
            this.fechaActual.dia++;
        }

    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}
