package CafeBusiness;

import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal (){
        int sum = 0;
        for(int weeks = 1; weeks <=10; weeks ++){
            sum += weeks;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for(double price: lineItems){
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){

        for(int id = 0; id < menuItems.size(); id++){
            System.out.printf("%s %s \n",id, menuItems.get(id));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!",userName);
        System.out.printf("There are %s people infront of you.", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
    
}
