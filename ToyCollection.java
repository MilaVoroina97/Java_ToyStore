import java.util.PriorityQueue;
import java.util.Queue;
public class ToyCollection {
    Queue<Toy> toyCollection = new PriorityQueue<>();

    public void addToy(Toy toy){
        toyCollection.add(toy);
    }

}