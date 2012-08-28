package MultiCurrenciesExample;

/**
 * Created with IntelliJ IDEA.
 * User: andrew.chaa
 * Date: 21/08/12
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public interface Expression {
    Expression plus(Expression addend);
    Expression times(int multiplier);
    Money reduce(Bank bank, String to);
}
