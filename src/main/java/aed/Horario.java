package aed;

public class Horario {
    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();

        sbuffer.append(hora + ":" + minutos);

        return sbuffer.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean oen = (otro == null);

        boolean cd = otro.getClass() != this.getClass();

        if (oen || cd) {
            return false;
        }

        Horario otroHorario = (Horario) otro;

        return hora == otroHorario.hora && minutos == otroHorario.minutos;
    }

}
