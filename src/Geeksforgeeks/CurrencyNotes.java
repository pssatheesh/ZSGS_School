package Geeksforgeeks;

public class CurrencyNotes {

    static private void countCurrency(int amount){
        int []currency={2000,500,200,100,50,20,10,5,1};
        int ans=0;
        System.out.println("Currency - Count");
        for(int i=0;i<currency.length;i++){
            if(amount>=currency[i]){
                ans=amount/currency[i];
                amount%=currency[i];
                System.out.println(currency[i]+" - "+ans);
            }
        }
    }

    public static void main(String[] args) {
        int amount=4868;
        countCurrency(amount);
    }
}
