package exercises.technology.main;

public abstract class AbstractEntity {
    //create ID
    private int id;
    //create static counter
    private static int nextId = 1;
    //create constructor that creates id for us
   public AbstractEntity() {
       this.id = nextId;
       nextId++;
   }
   public int getId() { return this.id; }
}
