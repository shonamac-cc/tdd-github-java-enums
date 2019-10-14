import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repositoryType;

//    give repository an ArrayList "commits" that hold instances of the Commit objects
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repositoryType){
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepositoryType getType() {
        return this.repositoryType;
    }
//  as Commit is a class with it's own properties so we have to pass in the entire object
    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public int countCommits() {
        return this.commits.size();
    }

    public Commit getCommitById(int uniqueId) {
        Commit foundCommit = null;
//        need to loop through the commits
        for (Commit commit : this.commits){
//            if the commit id = unique id you pass through add it to variable foundCommit
            if (commit.getId() == uniqueId){
                foundCommit = commit;
            }
        }return foundCommit;
    }


    public String getCommitDescriptionById(int uniqueId){
        return getCommitById(uniqueId).getDescription();


    }


//    no longer needed
//    public Commit getCommitByType(CommitType feature) {
//        Commit foundCommit = null;
//        for (Commit commit : this.commits){
//            if (commit.getCommitType() == feature){
//                foundCommit = commit;
//            }
//        }return foundCommit;
//    }

    public ArrayList<Commit> getAllCommitsByType(CommitType feature) {
        ArrayList<Commit> foundAllCommits = new ArrayList<Commit>();
        for (Commit commit : this.commits){
            if (commit.getCommitType() == feature){
                foundAllCommits.add(commit);
            }
        }return foundAllCommits;
    }
}
