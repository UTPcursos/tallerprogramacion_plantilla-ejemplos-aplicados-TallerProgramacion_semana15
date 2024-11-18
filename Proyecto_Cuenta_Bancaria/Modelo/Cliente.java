package Modelo;

public class Cliente {
    private String dni;
    private String apellidos;
    private String correo_electronico;
    private String direccion;
    private String fecha_nacimiento;
    private CuentaBancaria[] cuentas= new CuentaBancaria[5];

    public Cliente(){

    }
    public Cliente(String dni, String apellidos) {
        this.dni = dni;
        this.apellidos = apellidos;
    }
    public Cliente(String dni, String apellidos,
    String correo_electronico, String direccion, 
    String fecha_nacimiento, CuentaBancaria[] cuentas) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cuentas = cuentas;
    }

    public void 
    AgregarCuenta(CuentaBancaria nuevaCuenta) throws Exception{
        for (int i = 0; i < cuentas.length; i++) {
            if(cuentas[i]==null){
                cuentas[i]=nuevaCuenta;
                return;
            }
        }
        throw new Exception("No se pueden agregar mas cuentas");
    }

    public String MostrarCuentas(){
        String resultado="";
        for (int i = 0; i < cuentas.length; i++) {
            if(cuentas[i]!=null){
                resultado+=cuentas[i].toString()+"\n";
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo_electronico='" + correo_electronico + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", cuentas=" + MostrarCuentas() +
                '}';
    }




    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreoElectronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }

    public String getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoElectronico() {
        return correo_electronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }


}
