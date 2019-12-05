
/**
 * Beschreiben Sie hier die Klasse Mensch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mensch
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int alter;
    private String vorname;
    private String name;

    /**
     * Konstruktor für Objekte der Klasse Mensch
     */
    public Mensch(int alter, String name, String vorname)
    {
        // Instanzvariable initialisieren
        setAlter(alter);
        setName(name);
        setVorname(vorname);
        
    }
    
    //Setter und Getter    
    public void setAlter(int alter)
    {
        this.alter = alter;
    }
    
    public int getAlter()
    {
        return this.alter;
    }
    
    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
    
    public String getVorname()
    {
        return this.vorname;
    }
    
    public void setName(String vorname)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
}

