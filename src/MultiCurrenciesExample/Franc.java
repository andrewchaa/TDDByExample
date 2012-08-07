package MultiCurrenciesExample;

/**
 * Created with IntelliJ IDEA.
 * User: andrew.chaa
 * Date: 07/08/12
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
