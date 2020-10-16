
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Jacob Wesolowski 
 */
public class Tavunu {
    /* See readme.md for what to do. */
    
    String tuvName;
    int pava;
    int yearOfBirth;
    
    Tavunu()
    {
        tuvName = null;
        pava = 0;
        yearOfBirth = 0;
    }
    
    Tavunu(String name, int yob, int amount)
    {
        tuvName = name;
        yearOfBirth = yob;
        pava = amount;

    }
    
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
    
    public String getName()
    {
        return tuvName;
        
        
    }
    
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
    
    public int getPava()
    {
        return pava;
        
    }
    
    public int getBirthYear()
    {
        return yearOfBirth;
    }
    
    public void setBirthYear(int yob)
    {
        yearOfBirth = yob;
    }
    
    public String toString()
    {
        return tuvName + " born in " + yearOfBirth + " has " + pava + " pava.";
    }
}