
package domyslnemetodyinterfejsow;
/**
 * 
 * @author pawelstradomski
 */

public class DomyslneMetodyInterfejsow {

    
    public static void main(String[] args) {
        
        Formula test = (int a) -> {
            return a;
        };
        A przyklad = new A();
        double wynik = przyklad.calculate(9);
        System.out.println(wynik);
    }
    
}
interface Formula
{
    double calculate(int a);
    
    default double sqrt(int a) // dodatkowa domyslna operacja. Zazwyczaj interfejs moze miec tylko 1 metode!
    {
        return Math.sqrt(a); // domyslna interpretacja
    }
    
}
class A implements Formula
{

    @Override
    public double calculate(int a) {
        return this.sqrt(a);
        
    }
    
}