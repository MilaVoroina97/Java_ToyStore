import java.util.ArrayList;


public class ToyCollection implements GetToy{

    private ArrayList<Toy> toyList;

    public ToyCollection(){
        this.toyList = new ArrayList<Toy>();
    }

    public ArrayList<Toy> getToyList(){
        return this.toyList;
    }

    public int getToyListSize(){
        return this.toyList.size();
    }

    public void addToy(Toy newToy){
        this.toyList.add(newToy);

    }

    @Override
    public Toy getToy(String name) {

        int findIndex = 0;
        
        if(!this.toyList.isEmpty()){

            for(Toy findToy : toyList){
                
                if(name.equals(findToy.getToyName())){
                    findIndex = this.toyList.indexOf(findToy);
                }
            }
        }else{
            System.out.println("В списке пока нет игрушек, готовых к розыгрышу");
            return null;
        }
     return this.toyList.get(findIndex);
    
    } 

    public void getAllToys(){
        for(Toy toy : toyList){
            System.out.println(toy.toString() + "\n");
        }
    }
}
