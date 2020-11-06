
/**
 * 
 * @author Mithat Konar
 * @author Jacob Wesolowski 
 * 
 */
public class Crode extends Tavunu {
    /* See readme.md for what to do. */
    
    String tuvName;
    int pava;
    int yearOfBirth;
    
    boolean isCrode;
    
    
    Crode()
    {
        //super();
        
        tuvName = null;
        pava = 0;
        yearOfBirth = 0;
       
    }
    
    Crode(String name, int yob, int amount)
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
            isCrode = true;
            
        }
        else
        {
            isCrode = false;
        }
        
        if (isCrode == true)
        {
            return tuvName + " born in " + yearOfBirth + " is an Crode with " + pava + " pava.";
        }
        
        return null;
    }
}