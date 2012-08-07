package MultiCurrenciesExample;

/**
 * Created with IntelliJ IDEA.
 * User: andrew.chaa
 * Date: 07/08/12
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
