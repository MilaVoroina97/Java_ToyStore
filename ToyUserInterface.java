import java.util.Scanner;

public class ToyUserInterface implements ChoiceToy{

    private Scanner scanner;

    private ToyCollection toyCollection;

    public ToyUserInterface(){
        toyCollection = new ToyCollection();
        scanner = new Scanner(System.in);
    }

    public ToyCollection getToyCollection(){
        return this.toyCollection;
    }

    @Override
    public void choiceANewToy() {

        System.out.println("Это режим добавления игрушки в розыгрыш");
        int id = generateId();
        System.out.println("Введите название игрушки : ");
        String name = this.scanner.next();
        System.out.println("Введите количество игрушки : ");
        int amount = this.scanner.nextInt();
        System.out.println("Введите вес игрушки : ");
        double weight = scanner.nextDouble();
        Toy newToy = new Toy(id, name, amount, weight);
        toyCollection.addToy(newToy);
        System.out.println("Toy has been added");
    }

    //     private double generateToyWeight(){

        
    //     double sum = 0;
    //     if(!toyCollection.getToyList().isEmpty()){
    //     for(Toy toy : toyCollection.getToyList()){

    //         sum += toy.getWeight();
            
    //     }
    //         return Math.random() * 100 / sum;
    //   }
    // else{
    //     System.out.println("В списке пока нет игрушек,введите вес игрушки в ручную : ");
    //     int newWeight = scanner.nextInt();
    //     return newWeight;

    //   }


    // }

    private int generateId(){

        if(!toyCollection.getToyList().isEmpty()){
            int lastId = toyCollection.getToyListSize() + 1;
            return lastId;
        }

        else{
            System.out.println("В списке пока нет игрушек,введите id игрушки в ручную : ");
            int newId = scanner.nextInt();
            return newId;
        }
    }


    public void findToyInterface(){
        System.out.println("Это режим поиска игрушки по ее названию, для того чтобы посмотреть участвует ли данная игрушка в розыгрыше.");
        System.out.println("Введите, пожалуйста, название игрушки, для проверки ее наличия в розыгрыше : ");
        String name = scanner.next();
        if(name != null && !toyCollection.getToyList().isEmpty()){
                Toy findToy = toyCollection.getToy(name);
                        if(findToy != null) {
                            System.out.format("Игрушка найдена - %s\n", findToy.toString());
                        }else{
                            System.out.println("Данная игрушка не участвует в розыгрыше");
                        }
        }else{
            System.out.println("В списке нет пока игрушек.");
        }
    }
    public void getUsercommand(){

        boolean end = false;
        do {
            System.out.println("Введите,пожалуйста,номер команды -> 1. Добавить игрушку в розыгрыш\n2. Найти игрушку в розыгрыше\nЕсли Вы хотите начать розыгрыш нажмите 0\n");
            if(scanner.hasNextInt()){
                int command = scanner.nextInt();
                switch(command){
                    case 1:
                        choiceANewToy();
                        break;
                    case 2:
                        findToyInterface();
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        System.out.println("Такой команды нет, попробуйте еще раз пожалуйста : \n");
                }
            }
        }while(!end);

    }

    public void receiveAllToys(){
        System.out.println("Перед началом розыгрыша доступен режим просмотра всех игрушек : ");
        toyCollection.getAllToys();
    }

}



