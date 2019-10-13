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

    @Test
    public void canAddCommit(){
        repo.addCommit(commit);
        assertEquals(1, repo.countCommits());
    }

    @Test
    public void canGetCommitById(){
        repo.addCommit(commit);
        assertEquals(commit, repo.getCommitById(1));
    }

    @Test
    public void canGetCommitDescriptionById(){
        repo.addCommit(commit);
        assertEquals(commit.getDescription(), repo.getCommitDescriptionById(1));
    }

    @Test
    public void canGetCommitByType(){
        repo.addCommit(commit);
        assertEquals(commit, repo.getCommitByType(CommitType.FEATURE));
    }
}
