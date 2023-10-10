public class Account {
    int cash;

    public Account() {
        this.cash = 1000;
    }

    public boolean addCash(int cash) {
        if (this.cash + cash >= 3000) {
            this.cash += cash;
            return false;
        }

        if (this.cash + cash < 0)
            this.cash = 0;
        else
            this.cash += cash;

        return true;
    }

    public int getCash() {
        return this.cash;
    }
}