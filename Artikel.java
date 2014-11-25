
/**
 * Write a description of class Artikel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private int prijs;
    private String naam;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(int prijs, String naam)
    {
        this.prijs = prijs;
        this.naam = naam;
        
    }
    
        /**
     * Constructor for objects of class Artikel
     */
    public Artikel()
    {

    }
    
    /**

     * @return prijs
     */
    public int getPrijs()
    {
       return prijs;
    }
    
    
    /**
     * Returns naam
     */
    public String getNaam()
    {
       return naam;
    }
    
    /**
     * Stel prijs in
     */
    public void setPrijs(int prijs){
        this.prijs = prijs;
    }
    
        /**
     * Stel naam in
     */
    public void setNaam(String naam){
        this.naam = naam;
    }
    
        public void drukAf(){
        System.out.print(naam+"\n");
        System.out.print(prijs+"\n");;
    }
}

