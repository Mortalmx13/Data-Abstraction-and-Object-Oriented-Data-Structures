package activity14;


import java.util.LinkedList;
import java.util.Scanner;

public class vertex {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the vertices (separated by comma): ");
       
        String verticesS = scan.next();

        System.out.print("Enter the edges (separated by comma): ");
        
        String edgesS = scan.next();

        LinkedList<LinkedList<Character>> list = new LinkedList<>();

       
        int num, comma = 0;
        for(int i=0; i<verticesS.length(); i++){
            if(verticesS.charAt(i) == ',')
                comma++;
        }
        
        num = verticesS.length()-comma;

        
        for(int i=0;i<num;i++){
        	list.add(new LinkedList<Character>());
        }

        
        for(int i=0;i<edgesS.length();i+=3){
            int ind = edgesS.charAt(i)-65;
            list.get(ind).add(edgesS.charAt(i+1));
        }
        
       
        for(int i=0; i<list.size(); i++){
           
                Character vertex = (char) (i+65);
                System.out.print(vertex );
                
                for(Character edges  : list.get(i)){
                    System.out.print(" -> "+ edges  + "");
                }
         
            System.out.println();
        }
    }
}
