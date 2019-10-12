public class Commit {

    private String description;
    private int uniqueId;
    private CommitType commitType;

    public Commit(String description, int uniqueId, CommitType commitType){
        this.description = description;
        this.uniqueId = uniqueId;
        this.commitType = commitType;

    }

    public int getId() {
        return this.uniqueId;
    }

    public String getDescription() {
        return this.description;
    }

    public CommitType getCommitType() {
        return this.commitType;
    }
}
