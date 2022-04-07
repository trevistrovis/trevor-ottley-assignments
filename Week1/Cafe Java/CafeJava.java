public class CafeJava {

    public static void main(String[] args){

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 5;
        double cappuccinoPrice = 6.5;
        double totalPrice1 = lattePrice - dripCoffeePrice;

        String customer1 = "Cindy Hurley";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        
        
        System.out.println(generalGreeting + customer1);
        System.out.println(generalGreeting + customer2);
        if(isReadyOrder1){
            System.out.println(customer1 + readyMessage);
        }
        else{
            System.out.println(customer1 + pendingMessage);
        }
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + lattePrice*2);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }
        if(isReadyOrder3){
            System.out.println(customer3 + readyMessage + displayTotalMessage + totalPrice1);
        }
        
    }
    
}
