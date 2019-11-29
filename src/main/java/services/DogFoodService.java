package services;


import models.DogFood;

import java.util.ArrayList;
import java.util.List;

public class DogFoodService {

    //    private static int nextId = 1;
    private int nextId = 1;

    private List<DogFood> inventory = new ArrayList<>();

    public DogFoodService() {
    }

    // create DogFood
    public DogFood createDogFood(String name, String brand, float weight, int qty, float price) {
        DogFood createdDogFood = new DogFood(nextId++, name, brand, weight, qty, price);
        this.inventory.add(createdDogFood);
        return createdDogFood;
    }

    //read
    public DogFood findDogFood(int id) {
//         should take an int and return an object with that id, if exists
        for (DogFood dogFood : inventory) {
            if (dogFood.getId() == id)
                return dogFood;
        }
        return null;
//        return inventory.stream()
//                .filter(dogFood -> dogFood.getId() == id)
//                .findFirst().orElse(null);
    }

    //read all
    public DogFood[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new DogFood[inventory.size()]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        if (inventory.contains(findDogFood(id))) {
            inventory.remove(findDogFood(id));
            return true;
        } else
            return false;
    }

}
