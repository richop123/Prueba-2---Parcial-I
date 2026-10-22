
package cuenta;

import java.util.Calendar;
public class testCalendar {
    
    
    
    static void main (String[] args){
        Calendar fecha=Calendar.getInstance();
        System.out.print(fecha);
        
        int year=fecha.get(Calendar.YEAR);
        System.out.println();
        System.out.println(year);
    }
}
