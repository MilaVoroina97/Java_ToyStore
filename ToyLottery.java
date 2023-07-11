
public class ToyLottery{

    private ToyCollection toyCollection;

    private ToyUserInterface toyUserInterface;

    public ToyLottery(){
        toyCollection = new ToyCollection();
        toyUserInterface = new ToyUserInterface();
    }

    public ToyCollection getToyCollection(){
        return this.toyCollection;
    }

    public ToyUserInterface getToyUserInterface(){
        return this.toyUserInterface;
    }

    public Toy toyLottery(){

        getToyUserInterface().choiceANewToy();
        int raffle = (int) (Math.random()*100);
        toyCollection.getToyList().remove(0);
        return toyCollection.getToyList().get(raffle);

    }



}
