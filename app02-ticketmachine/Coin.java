
/**
 * Enumeration class Coins - Here we have a enumeration class and here we have all the coins which can be inserted into the ticket machine.
 *
 * @author (Amir Mohamed)
 * @version (27/10/2020)
 */

public enum Coin
{
    P10 (10),
    P20 (20),
    P100 (100),
    P200 (200);

    public final int value;

    private Coin(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
