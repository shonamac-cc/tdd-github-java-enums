import java.util.HashMap;

public class GithubAccount {

    private String userName;
    private String name;
    private AccountType accountType;
    private HashMap<String, Repository> repositories;

    public GithubAccount(String userName, String name){
        this.userName = userName;
        this.name = name;
        this.accountType = AccountType.FREE;
        this.repositories = new HashMap<String, Repository>();
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public String getName() {
        return this.name;
    }

    public String getUserName() {
        return this.userName;
    }

    public void upgradeAccount() {
        this.accountType = AccountType.PRO;
    }

    public void downgradeAccount() {
        this.accountType = AccountType.FREE;
    }


//    public Repository getRepositoryName(String name){
//        return this.repositories.get(name);
//    }


//    public void addRepository(Repository repository) {
//        this.repositories.put(String, repository);
//    }
//
//    public int countRepositories() {
//        return this.repositories.size();
//    }
}
