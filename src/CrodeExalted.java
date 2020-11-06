
/**
 * 
 * @author Mithat Konar
 * @author Jacob Wesolowski 
 * 
 */
public class CrodeExalted extends Tavunu {
    /* See readme.md for what to do. */
    
    String tuvName;
    int pava;
    int yearOfBirth;
    
    boolean isCrodeExalted;
    
    
    CrodeExalted()
    {
        //super();
        
        tuvName = null;
        pava = 0;
        yearOfBirth = 0;
       
    }
    
    CrodeExalted(String name, int yob, int amount)
    {
        //super();
        
        tuvName = name;
        yearOfBirth = yob;
        pava = amount;

    }
    
    
    
    @Override
    public boolean setName(String name)
    {   
        if (name.startsWith("D") || name.startsWith("T"))
        {
            tuvName = name;            
            return true;
 
        }
        else
        {
            tuvName = null;
            return false;
        }
    }
    
    
    
    @Override
    public String getName()
    {
        
        return tuvName;
        
        
    }
    

    
    @Override
    public boolean spendPava(int amount)
    {
        if (amount < 0)
        {
            return false;
        }
        else
        {
            pava  = pava - amount;
            return true;
        } 
    }
    
    @Override
    public boolean receivePava(int amount)
    {
        if (amount < 0)
        {
            return false;
        }
        else
        {
            pava = pava + amount;
            return true;
        }

    }
    
    @Override
    public int getPava()
    {   
        return pava;
        
    }
    
    @Override
    public int getBirthYear()
    {
        return yearOfBirth;
    }
    
    @Override
    public void setBirthYear(int yob)
    {
        yearOfBirth = yob;
    }
    
    @Override
    public String toString()
    {
        if (pava > 80)
        {
            if(yearOfBirth % 2 == 0)
            {
                isCrodeExalted = true;
                
            }
            else
            {
                isCrodeExalted = false;
            }
        }
        else
        {
            isCrodeExalted = false;
        }
        
        if (isCrodeExalted == true)
        {
            return tuvName + " born in " + yearOfBirth + " is an Exalted Crode with " + pava + " pava.";
        }
        
        return null;
    }
}