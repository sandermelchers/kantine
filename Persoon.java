
/**
 * Write a description of class Persoon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private int burgerservicenummer;
    private String voornaam;
    private String achternaam;
    private int dag;
    private int maand;
    private int jaar;
    private char geslacht;
   

    /**
     * Constructor for objects of class Persoon
     */
    public Persoon(int dag, int maand, int jaar, String voornaam, String achternaam, char geslacht,int  burgerservicenummer)
    {
        setGeboortejaar(dag, maand, jaar);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeslacht(geslacht);
        setBurgerservicenummer(burgerservicenummer);
    }
   
     /**
     * Constructor for objects of class Persoon
     */
    public Persoon()
    {
        this.dag=0;
        this.maand=0;
        this.jaar=0;
        this.geslacht='x';
    }
    
    /**
     * Stel nieuwe voornaam in
     */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;  
    }
   
    /**
     * Stel nieuwe achternaam in
     */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;  
    }
   
       /**
     * Stel geslacht in in
     */
    public void setGeslacht(char geslacht)
    {
        if (geslacht=='m' || geslacht=='v')
        {
            this.geslacht=geslacht;
        } else{
            this.geslacht='o';
        }
    }
   
    /**
     * Stel nieuwe burgerservicenummer in
     */
    public void setBurgerservicenummer(int burgerservicenummer)
    {
        this.burgerservicenummer = burgerservicenummer;  
    }
   
     /**
     * Stel geboortejaar in
     */
    public void setGeboortejaar(int dag,int maand,int jaar)
    {
        boolean geldigeDatum=false;
        boolean schrikkeljaar=false;
       
        if ((dag & 3) == 0 && ((maand % 25) != 0 || (jaar & 15) == 0))
        {
            schrikkeljaar=true;
            System.out.print(schrikkeljaar + "  ");
        } else{
            schrikkeljaar=false;
            System.out.print(schrikkeljaar + "  ");
        }
       
        if (schrikkeljaar==false)
        { 
            if (maand<1||maand>12 || jaar <1900 || jaar>2100){
                geldigeDatum=false;
            }
   
            else if ((maand==1||maand==3||maand==5||maand==7||maand==8||maand==10||maand==12)&&(dag<1||dag>31)) {
                geldigeDatum=false;
            }
   
            else if ((maand==4||maand==6||maand==9||maand==11)&&(dag<1||dag>30)){
                geldigeDatum=false;
            }
   
            else if (maand==2 &&(dag<1||dag>28)) {
                geldigeDatum=false;
            }
   
            else {
                geldigeDatum=true;
                System.out.print("  test 1  ");
            }
        }
       
        if (schrikkeljaar==true)
        {
            if (maand<1||maand>12 ||jaar<1900 || jaar>2100){
                geldigeDatum=false;
            }
   
            else if ((maand==1||maand==3||maand==5||maand==7||maand==8||maand==10||maand==12)&&(dag<1||dag>31)) {
                geldigeDatum=false;
            }
   
            else if ((maand==4||maand==6||maand==9||maand==11)&&(dag<1||dag>30)){
                geldigeDatum=false;
            }
   
            else if (maand==2 &&(dag<1||dag>29)) {
                geldigeDatum=false;
            }
   
            else {
                geldigeDatum=true;
                System.out.print("  test 2  ");
            }
        }
       
        if (geldigeDatum==true)
        {
            this.dag = dag;
            this.maand = maand;
            this.jaar = jaar;
            System.out.print("datum is geldig" + dag + maand + jaar); 
        } else{
            this.dag = 0;
            this. maand = 0;
            this.jaar = 0;
            System.out.print("datum niet geldig"); 
        }
    }
    
     /**
     * Vraag geboortedatum op
     */
    public String getGeboorteDatum() {
       String temp;
       
       if (dag==0 && maand==0 && jaar==0) {
           temp="Onbekend";
       }
       
       else{
           temp=dag+"/"+maand+"/"+jaar;
       }
       
       return temp;
    }
   
    
    /**
     * Vraag geslacht op
     */
    public String getGeslacht() {
        String temp;
        
        if (geslacht=='m') {
            temp="Man";
        }
        
        else if (geslacht=='v'){
            temp="Vrouw";;
        } 
        
        else{
            temp="Onbekend";
        }
        
        return temp;
    }
    
     /**
     * Vraag naam op
     */
    public String getNaam() {
        String temp;
        
        if (voornaam!=null && achternaam!=null) {
            temp=voornaam+" "+achternaam;
        }
        
        else if (voornaam!=null && achternaam==null){
            temp=voornaam+" achternaam onbekend";
        } 
        
        else if (voornaam==null && achternaam!=null){
            temp="voornaamonbekend "+achternaam;
        } 
        
        else{
            temp="Naam onbekend";
        }
        
        return temp;
    }
    
    
    /**
     * Vraag burgerservicenummer op
     */
    public String getBurgerservicenummer() {
       String temp;
       
       if (burgerservicenummer==0) {
           temp="Burgerservicenummer onbekend";
       }
       
       else{
           temp="Burgerservicenummer is "+burgerservicenummer;
       }
       
       return temp;
    }
    
    public void drukAf(){
        System.out.print(voornaam+"\n");
        System.out.print(achternaam+"\n");
        System.out.print(geslacht+"\n");
        System.out.print(dag+"/"+maand+"/"+jaar+"\n");
        System.out.print(burgerservicenummer+"\n");
    }
        
    
}   
