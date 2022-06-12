public class Empleado {
        private String NombreYApellido;
        private String dni;
        private Integer horasTrabajadas;
        private Integer ValorPorHora;

    public String getNombreYApellido() {
        return this.NombreYApellido;
    }

    public void setNombreYApellido(String NombreYApellido) {
        this.NombreYApellido = NombreYApellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getValorPorHora() {
        return this.ValorPorHora;
    }

    public void setValorPorHora(Integer ValorPorHora) {
        this.ValorPorHora = ValorPorHora;
    }

    public Empleado(String NombreYApellido, String dni, Integer horasTrabajadas, Integer ValorPorHora) {
        this.NombreYApellido = NombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.ValorPorHora = ValorPorHora;
    }
    
        @Override
        public String toString() {
            return "{" +
                    " nombre y apellido = " + getNombreYApellido() + " " +
                    " dni =" + getDni() + " " +
                    " Horas Trabajadas =" + getHorasTrabajadas() + " " +
                    " Valor Por Hora =" + getValorPorHora() + " " +
                    "}";
        }
    }
    
    

