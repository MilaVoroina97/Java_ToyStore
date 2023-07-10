import java.util.ArrayList;
import java.util.Scanner;

public class ToyCollection implements GetToy,ChoiceToy{

    private ArrayList<Toy> toyList;

    private int toyCount;

    private Scanner scanner;

    public ToyCollection(){
        toyList = new ArrayList<>();
    }

    public ArrayList<Toy> getToyList(){
        return this.toyList;
    }

    public int getToyCount(){
        return this.toyList.size();
    }

    public void addToy(Toy newToy){
        this.toyList.add(newToy);

    }

    public void deleteToy(Toy toy){
        this.toyList.remove(toy);
    }

    @Override
    public void choiceANewToy() {

        int id = generateId();
        System.out.println("Введите название игрушки : ");
        String name = this.scanner.nextLine();
        System.out.println("Введите количество игрушки : ");
        int amount = this.scanner.nextInt();
        double weight = generateToyWeight();
        this.toyList.add(new Toy(id, name, amount, weight));

    }

    public double generateToyWeight(){

        double sum = 0;
        for(Toy toy : toyList){

            sum += toy.getWeight();
        }

        return Math.random() * 100 / sum;

    }

    public int generateId(){

        int lastId = getToyCount() + 1;
        lastId++;
        return lastId;
    }

    @Override
    public Toy getToy() {

        int findIndex = 0;
        System.out.println("Введите название игрушки,которую хотите найти : ");
        String name = this.scanner.nextLine();
        for(Toy findToy : toyList){
            if(name.equals(findToy.getToyName())){
                findIndex = this.toyList.indexOf(findToy);
            }
        }

        return this.toyList.get(findIndex);

    }
    
}
