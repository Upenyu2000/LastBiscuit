import java.util.Scanner;
public class LastBiscuit 
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        final int barrel1=6;
        final int barrel2=8;
        int x=barrel1;
        int y=barrel2;
        int[] player={1, 2};
       int z=1;
        int count=1;
        
        //user input
        String barrel;
        int biscuit;
        //loop starts here
        System.out.println("Biscuits Left - Barrel 1: "+x);
        System.out.println("Biscuits Left - Barrel 2: "+y);
     do
     { 
        
        System.out.println("Player Turn: "+z);
        z=player[count%2];
        count++;
        
        
        System.out.print("Choose a barrel: barrel1 (one), barrel2 (two), "
                + "or both (both), or skip turn (skip)? ");
        barrel=in.next();
        
        
        if (barrel.equals("one")) 
        {
        System.out.print("How many biscuits are you taking? ");
        while (!in.hasNextInt())
        {
            System.out.print("Please input an integer: ");
            String str = in.next();
        }
        biscuit=in.nextInt();
        x=x-biscuit;
        System.out.println("Biscuits Left - Barrel 1: "+x);
        System.out.println("Biscuits Left - Barrel 2: "+y);
            
    }       
        
            else if (barrel.equals("two")) 
        {
        System.out.print("How many biscuits are you taking? ");
        while (!in.hasNextInt())
        {
            System.out.print("Please input an integer: ");
            String str = in.next();
        }
        biscuit=in.nextInt();
        y=y-biscuit;
        System.out.println("Biscuits Left - Barrel 1: "+x);
        System.out.println("Biscuits Left - Barrel 2: "+y);
            
    }       
            
     
        
        else if (barrel.equals("both")) 
        {
        System.out.print("How many biscuits are you taking? ");
        while (!in.hasNextInt())
        {
            System.out.print("Please input an integer: ");
            String str = in.next();
        }
        biscuit=in.nextInt();
        x=x-biscuit;
        y=y-biscuit;
        System.out.println("Biscuits Left - Barrel 1: "+x);
        System.out.println("Biscuits Left - Barrel 2: "+y);
            
    }       
     }
     
     while (!(x==0 && y==0));
     
     z=player[count%2];
        count++;
        System.out.println("Winner is player "+ z);
     
    }
    
}
