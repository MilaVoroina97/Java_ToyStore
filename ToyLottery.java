import java.util.ArrayList;

public class ToyLottery{



    private ToyUserInterface toyUserInterface;

    public ToyLottery(){

        toyUserInterface = new ToyUserInterface();
    }



    public ToyUserInterface getToyUserInterface(){
        return this.toyUserInterface;
    }

    // public Toy toyLottery(){

    //     getToyUserInterface().getUsercommand();
    //     if(!toyUserInterface.getToyCollection().getToyList().isEmpty()){
    //         toyUserInterface.getToyCollection().getToyList().remove(0);
    //         toyUserInterface.receiveAllToys();
    //         int raffle = (int)(Math.random() * (toyUserInterface.getToyCollection().getToyList().size()));
    //         // System.out.printf("index : %d\n" ,raffle);
    //         return toyUserInterface.getToyCollection().getToyList().get(raffle);
    //     }else{
    //         System.out.println("В списке нет ни одной игрушки для розыгрыша,нужно сначала их добавить");
    //         return null;
    //     }

    // }

    public Toy toyLottery(){
        getToyUserInterface().getUsercommand();
        ArrayList<Toy> winToys = new ArrayList<>();
        if(!toyUserInterface.getToyCollection().getToyList().isEmpty()){
            toyUserInterface.getToyCollection().getToyList().remove(0);
            toyUserInterface.receiveAllToys();
            for(Toy toy : toyUserInterface.getToyCollection().getToyList()){
                double random = Math.random() * 100;
                if(random < toy.getWeight()){
                    winToys.add(toy);
                }
            }
            int index = winToys.size();
            System.out.println("index : " + index + "\n");
            return winToys.get((int)(Math.random()*winToys.size()));
        }else{
            System.out.println("В списке нет ни одной игрушки для розыгрыша,нужно сначала их добавить");
            return null;
        }
    }

 

}
