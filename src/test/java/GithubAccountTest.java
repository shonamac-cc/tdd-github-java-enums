import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GithubAccountTest {

    private GithubAccount account;
    private Repository repo;

    @Before
    public void before(){
        account = new GithubAccount("shonamac", "shona mckenzie");
        repo = new Repository("diveinventory", "stock inventory", RepositoryType.PUBLIC);

        account.addRepository(repo);
    }

    @Test
    public void getAccountType(){
        assertEquals(AccountType.FREE, account.getAccountType());
    }

    @Test
    public void getAccountName(){
        assertEquals("shona mckenzie", account.getName());
    }

    @Test
    public void getAccountUserName(){
        assertEquals("shonamac", account.getUserName());
    }

    @Test
    public void upgradeAccount(){
        account.upgradeAccount();
        assertEquals(AccountType.PRO, account.getAccountType());
    }

    @Test
    public void downgradeAccount(){
        account.upgradeAccount();
        account.downgradeAccount();
        assertEquals(AccountType.FREE, account.getAccountType());
    }

//    @Test
//    public void canAddRepository(){
//        account.addRepository(repo);
//        assertEquals(repo, account.getRepositoryName("diveinventory"));
//    }

    @Test
    public void getRepositoryName(){
        assertEquals(repo, account.getRepositoryName("diveinventory"));
    }

//    @Test
//    public void getRepositoryDescription(){
//        assertEquals(repo, account.getRepositoryDescription());
//    }

    @Test
    public void canGetNumberOfRepositories(){
        assertEquals(1, account.countRepositories());
    }




}
