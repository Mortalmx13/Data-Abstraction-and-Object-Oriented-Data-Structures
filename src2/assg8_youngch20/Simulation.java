package assg8_youngch20;
//Charles Young YOUNGCH20
/**
 * This prints out the list of processes and grabs the txt file
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Simulation {

	private static Scanner scan = null;
	private static int time, i;
	private static int [] wait = new int [20];
	private static double customers;
	
	public static void main(String [] args) {
	int total = 0;
	Queue<Event> bankQueue = new LinkedList<Event>();
	EventList list = new EventList();
	File fileN = new File("assg8_input.txt");
	try {
		
		scan = new Scanner (fileN);
	}
	catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
	if(scan.hasNextLine()){
		StringTokenizer s1 = new StringTokenizer(scan.nextLine(), "\t") ;
		
			if (s1.hasMoreTokens ()) {
				try
				{
					int temp = (Integer.valueOf(s1. nextToken()));
					int temp1 = (Integer.valueOf(s1.nextToken()));
					list.insert(new Event ('A', temp, temp1));
				}
				catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				}
			}
	}
	while(!list.isEmpty()) {
		
	if(list.retrieve().eventType() == 1) {
		
	
	processArrival(list.retrieve(), list, bankQueue);
	}
	else {
	processDeparture(list.retrieve(), list, bankQueue);
	}
	}
	
	System.out.println("Simulation Ends \n");
	System.out.println("Final Statistics") ;
	System.out.print ("Total number of people processed: ");
	System.out.println(customers);
	System.out.print("Average of time spent waiting: ");
	for(int j = 0; j<i;j++) {
		total = total +wait[j];
	}
	
	double avg = total/customers;
	System.out.println(avg);

}
/**
 * sets up the process time and sends it to the main method
 * @param arrival
 * @param list
 * @param bankQueue
 */
	public static void processArrival(Event arrival, EventList list, Queue<Event> bankQueue) {

        System.out.print("Processing Arrival Event at time: ");
        System.out.println(arrival.getArrivalTime());
        customers++;
        time = arrival.getArrivalTime();
        bankQueue.add(arrival);
        list.remove();
        if(bankQueue.peek() == arrival) 
        {
            list.insert(new Event ('D', time + arrival.getTransactionTime()));
            i++;
        }
        if(scan.hasNextLine())
        {
            StringTokenizer s1 = new StringTokenizer(scan.nextLine(), "\t");
            if(s1.hasMoreTokens ()) 
            {
                try
                {
                    int temp2 = (Integer.valueOf(s1.nextToken())); 
                    int temp3 = (Integer.valueOf(s1.nextToken()));
                    list.insert(new Event('A', temp2, temp3));
                }
                    catch (NumberFormatException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
	

/**
 * sets up the departure time and sends it to the main method
 * @param depart
 * @param list
 * @param bankQueue
 */
    public static void processDeparture(Event depart, EventList list, Queue<Event> bankQueue) {
        System.out.print ("Processing departure event at: ");
        System.out.println(depart.getTime());
        time = depart.getTime();
        bankQueue. remove();
        list.remove();
        if(!bankQueue.isEmpty())
        {
            list.insert(new Event( 'D', time + bankQueue.peek().getTransactionTime()));
            wait[i] = time - bankQueue.peek().getTime();
            i++;
            time = time + bankQueue.peek().getTransactionTime();
        }
    }
	}

	