import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GithubAccountTest {

    private GithubAccount githubAccount;
    private Repository repo;

    @Before
    public void before(){
        githubAccount = new GithubAccount("shonamac", "shona mckenzie");
        repo = new Repository("diveinventory", "stock inventory", RepositoryType.PUBLIC);
    }

    @Test
    public void getAccountType(){
        assertEquals(AccountType.FREE, githubAccount.getAccountType());
    }

    @Test
    public void getAccountName(){
        assertEquals("shona mckenzie", githubAccount.getName());
    }

    @Test
    public void getAccountUserName(){
        assertEquals("shonamac", githubAccount.getUserName());
    }

    @Test
    public void upgradeAccount(){
        githubAccount.upgradeAccount();
        assertEquals(AccountType.PRO, githubAccount.getAccountType());
    }

    @Test
    public void downgradeAccount(){
        githubAccount.upgradeAccount();
        githubAccount.downgradeAccount();
        assertEquals(AccountType.FREE, githubAccount.getAccountType());
    }


//    @Test
//    public void getRepositoryName(){
//        assertEquals(repo, githubAccount.getRepositoryName("diveinventory"));
//    }





}
