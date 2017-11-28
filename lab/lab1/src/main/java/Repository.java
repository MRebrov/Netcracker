
public class Repository {
    private Person[] repository = new Person[10];

    public Person[] getRepository() {
        return repository;
    }

    public void setRepository(Person[] repository) {
        this.repository = repository;
    }

    public void addToRepository(Person person) {
        for (int i = repository.length - 10; i < repository.length; i++) {
            if (repository[repository.length - 1] != null) {
                Person[] repository = new Person[this.repository.length + 10];
                for (int j = 0; j < this.repository.length; j++) {
                    repository[j] = this.repository[j];
                }
                setRepository(repository);
            }
            if (repository[i] == null) {
                repository[i] = person;
                break;
            }
        }

    }
}
