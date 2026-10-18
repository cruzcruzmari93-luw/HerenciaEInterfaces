package mccruz.test;

public class Profesor extends Persona{
    private int numEmpleado;

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }

    public Profesor(int numEmpleado) {
        super();
        this.numEmpleado = numEmpleado;
    }

}