
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
        int raffle = (int) (Math.random()*100);
        toyUserInterface.getToyCollection().getToyList().remove(0);
        return toyUserInterface.getToyCollection().getToyList().get(raffle);

    }



}
