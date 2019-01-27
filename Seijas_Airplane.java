/*
Author Name: Kennedy Seijas
//Date: 01/10/2019
//Program Name: Seijas_Seats
//Purpose: This is a Call Simulator for 5 Seats
  Each seat has 3 Status, 
OFF : Default, 
  WAITING FOR AN ATTENDANT : Once the Seat Call for an Attendant, 
  ATTENDANT IS COMMING : Once the Attendant responded the call
  From the Seats' Screen the Control Panel of the attendants is udated.

Seijas_Attendant.java
//Purpose: This is a Attendant Simulator for 5 Seats
  Each respond have 3 status, 
  * OFF, Default
  * REQUESTING FOR AN ATTENDANT : When the Seat is asking for an attendant, 
  * AN ATTENDANT IS ON THE WAY COMMING: Once The Attendant respond the call 
  From the Attendant' Screen the Control Panel of the Seats is updated.

*/

package seijas_airplane;

import Call_Simulator.Seijas_Attendants;
import Call_Simulator.Seijas_Seats;

/**
 *
 * @author Master1
 */
public class Seijas_Airplane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Seijas_Attendants attendant = new Seijas_Attendants();
        attendant.setVisible(true);
        
        Seijas_Seats seats = new Seijas_Seats();
        seats.setVisible(true);
         
    
    }
    
}
