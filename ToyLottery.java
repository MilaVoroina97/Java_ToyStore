
public class ToyLottery{



    private ToyUserInterface toyUserInterface;

    public ToyLottery(){

        toyUserInterface = new ToyUserInterface();
    }



    public ToyUserInterface getToyUserInterface(){
        return this.toyUserInterface;
    }

    public Toy toyLottery(){

        getToyUserInterface().getUsercommand();
        if(!toyUserInterface.getToyCollection().getToyList().isEmpty()){
            int raffle = (int)(Math.random());
            toyUserInterface.getToyCollection().getToyList().remove(0);
            return toyUserInterface.getToyCollection().getToyList().get(raffle);
        }else{
            System.out.println("В списке нет ни одной игрушки для розыгрыша,нужно сначала их добавить");
            return null;
        }

    }



}
