import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Gruppe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gruppe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public ArrayList<Mensch> mensch;

    /**
     * Konstruktor für Objekte der Klasse Gruppe
     */
    public Gruppe()
    {
        // Instanzvariable initialisieren
        mensch = new ArrayList<Mensch>();
        
    }
    
    //Setter und Getter
    public void setMensch(ArrayList<Mensch> mensch)
    {
        this.mensch = mensch;
    }
    
    public ArrayList<Mensch> getMensch()
    {
        return this.mensch;
    }
    
    public void addMensch(Mensch mensch)
    {
        getMensch().add(mensch);
    }
}
