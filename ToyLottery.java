import java.util.PriorityQueue;
import java.util.Scanner;

public class ToyLottery implements ChoiceToy,GetToy{

    private PriorityQueue<Toy> toyList = new PriorityQueue<>();

    public Scanner scanner;

    public PriorityQueue<Toy> getToyList(){
        return this.toyList;
    }

    public int getToyAmount(){
        return this.toyList.size();
    }

    public void addToy(Toy newToy){
        this.toyList.add(newToy);
    }

    public void deleteToy(Toy toy){

        this.toyList.remove(toy);

    }
    @Override
    public Toy getToy(PriorityQueue<Toy> toyList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getToy'");
    }

    @Override
    public void choiceANewToy() {

        System.out.println("Введите название ");
    }
    
}
