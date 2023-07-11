import java.io.FileWriter;
import java.io.IOException;

public class FileWork {
    private ToyLottery toyLottery;
    private String pathToFile;


    public FileWork(){
        toyLottery = new ToyLottery();
        this.pathToFile = "results.txt";
    }

    public ToyLottery getToyLottery(){
        return this.toyLottery;
    }

    public void writeToFile() throws IOException {
            try {
                FileWriter writer = new FileWriter(pathToFile, true);
                Toy winToy = getToyLottery().toyLottery();
                writer.write(winToy.toString() + "\n");
                System.out.println("Note has been added");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }

    }
    
}
