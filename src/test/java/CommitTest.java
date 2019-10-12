import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("initial commit", 1, CommitType.FEATURE);
    }

    @Test
    public void commitHasID(){
        assertEquals(1, commit.getId());
    }

    @Test
    public void commitHasDescription(){
        assertEquals("initial commit", commit.getDescription());
    }

    @Test
    public void commitHasCommitType(){
        assertEquals(CommitType.FEATURE, commit.getCommitType());
    }


}
