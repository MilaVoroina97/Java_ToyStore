import java.util.Scanner;

public class ToyUserInterface implements ChoiceToy{

    private Scanner scanner;

    private ToyCollection toyCollection;

    public ToyUserInterface(){
        scanner = new Scanner(System.in);
    }

    @Override
    public void choiceANewToy() {

        System.out.println("Это режим добавления игрушки в розыгрыш");
        int id = generateId();
        System.out.println("Введите название игрушки : ");
        String name = this.scanner.nextLine();
        System.out.println("Введите количество игрушки : ");
        int amount = this.scanner.nextInt();
        double weight = generateToyWeight();
        toyCollection.addToy(new Toy(id, name, amount, weight));
    }

        private double generateToyWeight(){

        double sum = 0;
        for(Toy toy : toyCollection.getToyList()){

            sum += toy.getWeight();
        }

        return Math.random() * 100 / sum;

    }

    private int generateId(){

        int lastId = toyCollection.getToyListSize() + 1;
        lastId++;
        return lastId;
    }


    public void findToyInterface(){
        System.out.println("Это режим поиска игрушки по ее названию, для того чтобы посмотреть участвует ли данная игрушка в розыгрыше.");
        System.out.println("Введите, пожалуйста, название игрушки, для проверки ее наличия в розыгрыше : ");
        String name = scanner.nextLine();
        Toy findToy = toyCollection.getToy(name);
        if(findToy != null) {
            System.out.format("Игрушка найдена - %s", findToy.toString());
        }else{
            System.out.println("Данная игрушка не участвует в розыгрыше");
        }

    }

    public void getUsercommand(){

        while(true){
            System.out.println("Введите,пожалуйста,номер команды -> 1. Добавить игрушку в розыгрыш\n 2. Найти игрушку в розыгрыше\nЕсли Вы хотите начать розыгрыш нажмите 0");
            if(scanner.hasNextInt()){
                int command = scanner.nextInt();
                switch(command){
                    case 1:
                        choiceANewToy();
                    case 2:
                        findToyInterface();
                    case 0:
                        break;
                }
            }
        }

    }

}



