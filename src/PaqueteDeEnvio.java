public class PaqueteDeEnvio {
    private Persona remitente;
    private Persona destinatario;
    private String tipoEnvio;
    private String contenido;
    private double pesoPaquete;

    public PaqueteDeEnvio(String nombresRem, String apellidosRem, int numIdentidadRem, String direccionRem, int telefonoRem,
                          String nombresDest, String apellidosDest, int numIdentidadDest, String direccionDest, int telefonoDest,
                          String tipoEnvio, String contenido, double pesoPaquete){
        this.remitente = new Persona(nombresRem, apellidosRem, numIdentidadRem, direccionRem, telefonoRem);
        this.destinatario = new Persona(nombresDest, apellidosDest, numIdentidadDest, direccionDest, telefonoDest);
        this.tipoEnvio=tipoEnvio;
        this.contenido=contenido;
        this.pesoPaquete=pesoPaquete;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public String getContenido() {
        return contenido;
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }
    private  class Persona{
        private String nombre;
        private String apellidos;
        private int numIdentidad;
        private String direccion;
        private  int telefono;

        private Persona(String nombre, String apellidos,int numIdentidad,String direccion, int telefono){
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.numIdentidad=numIdentidad;
            this.direccion=direccion;
            this.telefono=telefono;
        }
        public String getNombre() {
            return nombre;
        }
        public String getApellidos() {
            return apellidos;
        }
        public int getNumIdentidad() {
            return numIdentidad;
        }
        public String getDireccion() {
            return direccion;
        }
        public int getTelefono() {
            return telefono;
        }
    }
    public double calcularValorEnvio() {
        double valor = 0;
        if (tipoEnvio.equals("nacional")) {
            if (contenido.equals("documento")) {
                if (pesoPaquete <= 2) {
                    valor = 400 * pesoPaquete;
                } else {
                    valor = 600 * pesoPaquete;
                }
            } else {
                if (pesoPaquete <= 5) {
                    valor = 800 * pesoPaquete;
                } else {
                    valor = 1000 * pesoPaquete;
                }
            }
        } else {
            if (contenido.equals("documento")) {
                if (pesoPaquete <= 2) {
                    valor = 4000 * pesoPaquete;
                } else {
                    valor = 6000 * pesoPaquete;
                }
            } else {
                if (pesoPaquete <= 5) {
                    valor = 9000 * pesoPaquete;
                } else {
                    valor = 12000 * pesoPaquete;
                }
            }
        }
        return valor;
    }

}

