import java.util.Objects;

public class Account {
    private final int id;
    private int goldenCoinsCount;

    Account(int id,int goldenCoinsCount) {
        this.id=id;
        this.goldenCoinsCount = goldenCoinsCount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id==account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
