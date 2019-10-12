import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repo;
    private Commit commit;

    @Before
    public void before(){
        repo = new Repository("diveinventory", "stock inventory", RepositoryType.PUBLIC);
        commit = new Commit("initial commit", 1, CommitType.FEATURE);
    }

    @Test
    public void repositoryHasName(){
        assertEquals("diveinventory", repo.getName());
    }

    @Test
    public void repositoryHasDescription(){
        assertEquals("stock inventory", repo.getDescription());
    }

    @Test
    public void repositoryHasType(){
        assertEquals(RepositoryType.PUBLIC, repo.getType());
    }
}
