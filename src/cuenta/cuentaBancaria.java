
package cuenta;
import java.util.ArrayList;
import java.util.Calendar;

public class cuentaBancaria {
    protected int numero;
    protected String cliente;
    protected double saldo;
    protected double tasa;
    protected Calendar creacion;
    protected ArrayList<String> historial;

    public cuentaBancaria(int numero, String cliente, double saldo, double tasa, Calendar creacion, ArrayList<String> historial) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 500;
        this.tasa = tasa;
        this.creacion =Calendar.getInstance();
        this.historial=new ArrayList<>();
        this.historial.add("Cuenta creada con saldo inicial de 500 Lps.");
        
    }
    
    public void depositar(double monto){
        try{
            if (monto<=0) {
                System.out.println("Insuficiente saldo"); 
            }else{
                saldo+=monto;
                historial.add("deposito: "+monto);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public boolean retirar(double monto){
        if(monto>0 && saldo>=monto){
            saldo-=monto;
            historial.add("Retiro: - "+monto);
            return true;
        }
        historial.add("Intento de retiro fallido: "+monto);
        return false;
    }
    
    public void mostrarHistorial(){
        System.out.println("==== HISTORIAL DE "+cliente.toUpperCase()+ "====");
        for(String registro:historial){
            System.out.println(registro);
        }
    }
    
    public double getSaldo(){
       return saldo; 
    }

    @Override
    public String toString() {
        return String.format("Cuenta #%d | %s | $%.2f", numero,cliente,saldo);
    }
    
    public void transferir(double monto, cuentaBancaria destino){
        if(this.retirar(monto)){
            destino.depositar(monto);
            this.historial.add("Transferencia enviada a # "+destino.numero+" : "+monto);
        }else{
            System.out.println("Transferencia fallida!");
        }
        
    }
    
    
    
    
    
    
    
    
}
