import java.util.HashMap;

public class GithubAccount {

    private String userName;
    private String name;
    private AccountType account;
    private HashMap<String, Repository> repositories;

    public GithubAccount(String userName, String name, AccountType account){
        this.userName = userName;
        this.name = name;
        this.account = account;
        this.repositories = new HashMap<String, Repository>();
    }
}
