public class Toy {
    private int toyId;           // id игрушки
    private String toyName;      // название игрушки
    private int amount;          // количество 
    private double weight;          // частота выпадения

    public Toy(int toyId, String toyName,int amount,double weight) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.amount = amount;
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

        public double getWeight() {
        return this.weight;
    }

        public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("ID : %d , name : %s, amount : %d, weight : %f",toyId, toyName, amount, weight);
    }
}