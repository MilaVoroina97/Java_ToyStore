public class Toy {
    private int toyId;
    private String toyName;
    private int amount;
    private int weight;

    public Toy(int toyId, String toyName,int weight) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.weight = weight;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }


    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }


    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }

        public int getWeight() {
        return this.weight;
    }

        public void setWeight(int weight) {
        this.weight = weight;
    }

        @Override
    public String toString() {
        return String.format("%s ,ID : %d , вес : %d", toyName, toyId, weight);
    }
}