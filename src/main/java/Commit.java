public class Commit {

    private String description;
    private int uniqueId;
    private CommitType commit;

    public Commit(String description, int uniqueId, CommitType commit){
        this.description = description;
        this.uniqueId = uniqueId;
        this.commit = commit;

    }

}
