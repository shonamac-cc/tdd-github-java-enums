import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repository;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repository){
        this.name = name;
        this.description = description;
        this.repository = repository;
        this.commits = new ArrayList<Commit>();
    }
}
