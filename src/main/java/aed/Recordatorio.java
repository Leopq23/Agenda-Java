package aed;

public class Recordatorio {
    private Fecha fecha;
    private Horario horario;
    private String mensaje;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha);
        this.horario = horario;
    }

    public Horario horario() {
        return horario;
    }

    public Fecha fecha() {
        return new Fecha(fecha);
    }

    public String mensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(mensaje + " @ " + fecha + " " + horario);

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean oen = (otro == null);

        boolean cd = otro.getClass() != this.getClass();

        if (oen || cd) {
            return false;
        }

        Recordatorio otroRecordatorio = (Recordatorio) otro;

        return mensaje.equals(otroRecordatorio.mensaje) && fecha.equals(otroRecordatorio.fecha) && horario.equals(otroRecordatorio.horario);
    }

}
