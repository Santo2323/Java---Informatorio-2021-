import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "{" +
                " apellido='" + getApellido() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", fechaDeNacimiento='" + getFechaDeNacimiento() + "'" +
                "}";
    }

    private LocalDate fechaDeNacimiento;

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
