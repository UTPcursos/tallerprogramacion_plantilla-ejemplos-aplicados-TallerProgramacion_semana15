package Modelo;

public class CuentaBancaria {
    private String numero_cuenta;
    private String fecha_apertura;
    private float saldo_actual;

    public CuentaBancaria(String numero_cuenta, 
    String fecha_apertura, float saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.saldo_actual = saldo_actual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numero_cuenta='" + numero_cuenta + '\'' +
                ", saldo_actual=" + saldo_actual +
                '}';
    }
    
    public String getNumeroCuenta() {
        return numero_cuenta;
    }

    public String getFechaApertura() {
        return fecha_apertura;
    }

    public float getSaldoActual() {
        return saldo_actual;
    }
}
