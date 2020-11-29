
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Create tavuni.
 * 
 * @author Mithat Konar
 * @author Jacob Wesolowski
 */
public class TavunuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /**
        var t1 = new Tavunu();
        var t2 = new Tavunu("Trast", 1988, 24);
        System.out.println(t1);
        System.out.println(t2);
        **/
        
        Scanner scan = new Scanner(System.in);
        
        boolean loop1;
        loop1 = true;
        String input;
        
        int totalPava = 0;
            
        while (loop1 == true)
        {
            System.out.println("[a] Add a member");
            System.out.println("[r] Remove a member");   
            System.out.println("[d] Display the tribe");           
            System.out.println("[s] Save the tribe");           
            System.out.println("[o] Open the tribe");           
            System.out.println("[q] quit");
            
            System.out.println("");
            
            System.out.println("What would you like to do?:");
            input = scan.next();
            
            ArrayList<Tavunu> list = new ArrayList<>();
            
            if (input.equals("a") || input.equals("A") )
            {
                String tuvName1;
                int pava1;
                int yearOfBirth1;
                

                
                System.out.println("Enter tavunu name:");
                tuvName1 = scan.next();
                
                System.out.println("Enter pava for tavunu:");
                pava1 = scan.nextInt();
                
                System.out.println("Enter year of birth for tavunu:");
                yearOfBirth1 = scan.nextInt();
               
                totalPava = totalPava + pava1;
                
                Tavunu tuvA = new Tavunu(tuvName1, yearOfBirth1, pava1);

                list.add(tuvA);
                
                
                System.out.println("added member");
                
                
                tuvA.printOutput();
                
            }
            
            if (input.equals("r") || input.equals("R") )
            {
                System.out.println(list);
                
                System.out.println("Enter index of removed member");
                int index = scan.nextInt();
                
            }           
            
            if (input.equals("d") || input.equals("D") )
            {
           
                System.out.println(list);
                
                System.out.println("displayed tribe");
                
            }
            
            if (input.equals("s") || input.equals("S") )
            {
                System.out.println("added member");
                
            }            
            
            if (input.equals("o") || input.equals("O") )
            {
                System.out.println("added member");
                
            }            
            
            if (input.equals("q") || input.equals("Q") )
            {
                System.exit(0);
                
            }        
            
            System.out.println("");
        }
        
        
        
        
    }

    public String toString()
    {
        return "what";
    }
    
}
