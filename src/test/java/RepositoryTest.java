import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repo;
    private Commit commit;
    private Commit commit2;
    private Commit commit3;
    private Commit commit4;

    @Before
    public void before(){
        repo = new Repository("diveinventory", "stock inventory", RepositoryType.PUBLIC);
        commit = new Commit("initial commit", 1, CommitType.FEATURE);
        commit2 = new Commit("added getters and setters", 2, CommitType.FEATURE);
        commit3 = new Commit("fix getName test", 3, CommitType.BUGFIX);
        commit4 = new Commit("refactored repo tests and methods", 4, CommitType.REFACTOR);
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

    @Test
    public void canGetAllCommitsForType(){
        repo.addCommit(commit);
        repo.addCommit(commit2);
        repo.addCommit(commit3);
        repo.addCommit(commit4);
//        assertEquals(commit, repo.getAllCommitsByType(CommitType.FEATURE));
        assertEquals(2, repo.getAllCommitsByType(CommitType.FEATURE).size());
    }
}
