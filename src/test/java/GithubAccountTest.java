import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GithubAccountTest {

    private GithubAccount githubAccount;
    private Repository repository;

    @Before
    public void before(){
        githubAccount = new GithubAccount("shonamac", "shona mckenzie", AccountType.FREE);
        repository = new Repository("github-java", "java enums", RepositoryType.PUBLIC);
    }

    @Test
    public void getAccountType(){
        assertEquals(AccountType.FREE, githubAccount.getAccountType());
    }




}
