package assg8_youngch20;
//Charles Young YOUNGCH20
import java.util.*;

public class EventList {

  private  LinkedList<Event> eventL;
    public EventList(){
    	eventL = new LinkedList<Event>();
    }
/**
 * insert function that inserts the object
 * @param obj
 */
    public void insert(Event obj){
        if (eventL.size() > 0){
            if (eventL.peek().getTime() > obj.getTime()) {
                Event temp = eventL.poll();
                eventL.add(obj);
                eventL.add(temp);
            }
            else if (eventL.peek().getTime() == obj.getTime()){
            	if(eventL.peek().getEvent() ==1) {
            		eventL.add(obj);
            	}else {
            		Event temp = eventL.poll();
            		eventL.add(obj);
            		eventL.add(temp);
            		
            	}
            	
            }
            else{
            	eventL.add(obj);
            }
        }
        else{
        	eventL.add(obj);
        }
    }
/**
 * Remove function
 */
    public void remove(){
    	eventL.remove();
    }

    public Event retrieve(){
       return eventL.peek();
    }
    /**
     * Helps check if the list is empty
     * @return
     */
    public boolean isEmpty() {
    	if(eventL.size()>0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
}
