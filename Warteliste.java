
public class Warteliste
{
    private Patient[] liste;
    private int maxAnzahl = 5;
    private int anzahl = 0;

    public Warteliste()
    {
        liste = new Patient[maxAnzahl];
    }

    public Patient[] getListe()
    {
        return liste;
    }

    public void einfuegen(Patient pat)
    {
        // Hier gibt es etwas zu tun!
    }

    public Patient aufrufen()
    {
        if (anzahl > 0)
        {
            Patient pat = liste[0];
            for (int i = 0; i < anzahl-1; i++)
            {
                liste[i] = liste[i+1];
            }
            liste[anzahl-1] = null;
            anzahl--;
            return pat;
        }
        else 
        {
            return null;
        }
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public boolean istVoll()
    {
        // Hier gibt es etwas zu tun
    }

    public boolean istLeer()
    {
        // Hier gibt es etwas zu tun
    }

}
