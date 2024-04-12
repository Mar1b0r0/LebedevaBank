package bank;

public class Card {


    private final String CARD_NUMBER;
    private String pinCode;

    public Card (){
        this.CARD_NUMBER= generateNumbers(16);
         this.pinCode = generateNumbers(4);
        }

    private String generateNumbers(int amount) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            number.append(rnd(0, 9));

        }
        return number.toString();
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public String getPinCode(){
        return pinCode;

    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public static int rnd (int min,int max){
        max-= min;
        return (int) (Math.random() *++ max) + min;

    }



}

