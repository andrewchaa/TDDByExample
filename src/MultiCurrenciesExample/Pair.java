package MultiCurrenciesExample;

/**
 * Created with IntelliJ IDEA.
 * User: andrew.chaa
 * Date: 28/08/12
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
public class Pair {
    private String from;
    private String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public boolean equals(Object object) {
        Pair pair = (Pair)object;

        return pair.from.equals(from) && pair.to.equals(to);
    }

    public int hashCode() {
        return 0;
    }
}
