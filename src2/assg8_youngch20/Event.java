package assg8_youngch20;
//Charles Young YOUNGCH20
public class Event implements Comparable<Event>{
    private int time;
    private int transactionT;
    private int arrivalT;
    private int departT;
    
    private char event;
/**
 * Gets event and depart time and changes event to uppercase
 * @param evant
 * @param departT
 */
    public Event(char evant, int departT){
        this.event = Character.toUpperCase(evant);
        this.departT = departT;
        time = departT;
    }
/**
 * Gets the character and changes event to uppercase
 * @param event
 * @param arrivalT
 * @param transactionT
 */
    public Event(char event, int arrivalT, int transactionT)
    {
        this.event = Character.toUpperCase(event);
        this.arrivalT = arrivalT;
        this.transactionT = transactionT;
        time = arrivalT;
        
        
    }
/**
 * returns the time
 * @return
 */
    public int getTime(){
        return time;
    }
/**
 * returns Transaction Time
 * @return
 */
    public int getTransactionTime(){
        return transactionT;
    }
/**
 * returns event
 * @return
 */
    public char getEvent(){
        return event;
    }
    /**
     * returns Arrival Time
     * @return
     */
    public int getArrivalTime() {
    	return arrivalT;
    }
    /**
     * returns Depart Time
     * @return
     */
    public int getDepartTime() {
    	return departT;
    }

    
/**
 * returns event and time of the specific times
 */
    public String toString(){
        if (eventType() == 0)
        {
            return  + event+": "+departT;
        }

        else
        {
        	return  + event+": "+arrivalT+": "+ transactionT ;
        }
    }

    @Override
    public int compareTo(Event type)
    {
        if (this.time > type.time) 
        {
            return 1;
        }
        else if (this.time == type.time) 
        {
            return 0;
        }
        else 
        {
            return -1;
        }
    }
    /**
     * returns the specific event types Arrival/departure
     * @return
     */
    
    public int eventType() {
    	if(event =='D') {
    		return 0;
    	}else if(event =='A'){
    		return 1;
    	}else {
    		return 2;
    	}
    }
}