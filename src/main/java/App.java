import services.DogFoodService;
import services.SneakerService;

import java.util.Scanner;

public class App {

    // Create the services needed to manage inventory
    private SneakerService sneakerService = new SneakerService();
    private DogFoodService dogFoodService = new DogFoodService();


    public static void main(String[] args) {
        App application = new App(); // (2) Instantiate the application
        application.init();  // (3) Call a method to initialize the application
    }

    public void init(){
        // (4)
        // application logic here
        // call methods to take user input and interface with services
        Console.printWelcome();
    }

}
