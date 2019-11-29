package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;
    private List<Sneaker> inventory = new ArrayList<>();

    public SneakerService() {
    }

    // create sneakers
    public Sneaker createSneaker(String name, String brand, String sport, float size, int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        this.inventory.add(createdSneaker);
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        for (Sneaker sneaker : inventory) {
            if (sneaker.getId() == id)
                return sneaker;
        }
        return null;
//        return inventory.stream()
//                .filter(sneaker -> sneaker.getId() == id)
//                .findFirst().orElse(null);
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new Sneaker[inventory.size()]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        if (inventory.contains(findSneaker(id))) {
            inventory.remove(findSneaker(id));
            return true;
        } else
            return false;
    }

}
