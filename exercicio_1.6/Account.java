public class Account {
    private String id;
    private String name;
    private Integer balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, Integer balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer credit(Integer amount) {
        setBalance(amount + balance);
        return balance;
    }
    
    public Integer debit(Integer amount) {
        if (amount <= balance) {
            setBalance(balance - amount);
        } else {
            System.err.println("Amount exceeded balance");
        } 
        return balance;
    }

    public Integer transferTo(Account other, Integer amount) {
        if (amount <= balance) {
            other.debit(amount);
            setBalance(balance - amount);
        } else {
            System.err.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=%d]", id, name, balance);
    }

}
