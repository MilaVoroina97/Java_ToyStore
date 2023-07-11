import java.util.ArrayList;


public class ToyCollection implements GetToy{

    private ArrayList<Toy> toyList;

    private int toyCount;

    public ToyCollection(){
        this.toyList = new ArrayList<>();
    }

    public ArrayList<Toy> getToyList(){
        return this.toyList;
    }

    public int getToyListSize(){
        return this.toyList.size();
    }

    public int getToyCount(){
        return this.toyCount;
    }
    
    public void addToy(Toy newToy){
        this.toyList.add(newToy);

    }

    public void deleteToy(Toy toy){
        this.toyList.remove(toy);
    }


    @Override
    public Toy getToy(String name) {

        int findIndex = 0;
        for(Toy findToy : toyList){
            if(name.equals(findToy.getToyName())){
                findIndex = this.toyList.indexOf(findToy);
            }
        }

        return this.toyList.get(findIndex);

    }
    
}
