package testingDriller;

public class TestDrillerApplication {

    private int amount;

    public void calcAmount(int quantity) {
        if(quantity>0 && quantity<=4){
            amount = (quantity * 2000);
        }
    }

    public int getAmount() {
        return amount;
    }
}
