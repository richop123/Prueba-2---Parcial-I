
package cuenta;

import java.util.ArrayList;
import java.util.Calendar;


public class cuentaAhorro extends cuentaBancaria{
    private Calendar ultModificacion;
    private int cantRetiros=0;
    private static final int max_retiros_mes=3; 
    
    //public cuentaAhorro(int cuenta, String cliente) {
      //  final double tasa=0.03;
        //super(cuenta,cliente,tasa);
    //}

    public cuentaAhorro(int numero, String cliente, double saldo, Calendar creacion, ArrayList<String> historial) {
        final double tasa=0.03;
        super(numero, cliente, saldo, tasa,creacion, historial);
        this.ultModificacion=Calendar.getInstance();
    }
    
    public boolean status(){
        Calendar fechaAct=Calendar.getInstance();
        fechaAct.add(Calendar.MONTH ,-6);
        return ultModificacion.after(fechaAct);
    }
    
    public void aplicarIntereses(){
        if (status()) {
            double interes=saldo*tasa;
            depositar(interes);
            historial.add("Interes solicitaods: +"+interes);
        }
    }
    
    public void retirar(){
        
    }
    
    
}
