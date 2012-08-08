package MultiCurrenciesExample;

/**
 * Created with IntelliJ IDEA.
 * User: andrew.chaa
 * Date: 07/08/12
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object) {

        Money money =  (Money)object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
