package Controlador;

public class controladorCuentas {
    

    public void CrearCuenta(String numero_cuenta, String fecha_apertura, float saldo_actual) {
        Modelo.CuentaBancaria cuenta = new Modelo.CuentaBancaria(numero_cuenta, fecha_apertura, saldo_actual);
        Modelo.Cliente cliente = new Modelo.Cliente();
        try {
            cliente.AgregarCuenta(cuenta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void MostrarCuentas() {
        Modelo.Cliente cliente = new Modelo.Cliente();
        System.out.println(cliente.MostrarCuentas());
    }

    public static void main(String[] args) {
        controladorCuentas controlador = new controladorCuentas();
        controlador.CrearCuenta("123456789", "01/01/2021", 1000);
        controlador.MostrarCuentas();
    }
}
