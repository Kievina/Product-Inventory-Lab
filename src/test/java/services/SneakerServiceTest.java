package services;

import models.Sneaker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SneakerServiceTest {
    List<Sneaker> sneakerInventory;
    SneakerService ss;

    @Before
    public void setUp() {
        this.sneakerInventory = new ArrayList<>();
        this.ss = new SneakerService();
        Sneaker s1 = ss.createSneaker("Abby J", "Adidas", "Tennis", 8f, 22, 54.99f);
        Sneaker s2 = ss.createSneaker("Bobby K", "Nike", "Basketball", 9f, 20, 89.99f);
        Sneaker s3 = ss.createSneaker("Cathy L", "Adidas", "Tennis", 7.5f, 15, 60.00f);
        Sneaker s4 = ss.createSneaker("Donny M", "Nike", "Track", 10f, 7, 56.99f);
        Sneaker s5 = ss.createSneaker("Eddie N", "Adidas", "Tennis", 11f, 10, 70.00f);
        Sneaker s6 = ss.createSneaker("Floyd O", "Nike", "Basketball", 8f, 12, 99.99f);
        sneakerInventory.add(s1);
        sneakerInventory.add(s2);
        sneakerInventory.add(s3);
        sneakerInventory.add(s4);
        sneakerInventory.add(s5);
        sneakerInventory.add(s6);
    }

    @After
    public void tearDown() {
//        sneakerInventory.clear();
    }

    @Test
    public void createTest() {

        // Given
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // When
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.createSneaker(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        float actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // Then
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize, 0.0);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice, 0.00);
    }

    @Test
    public void findSneakerTest() {
//        SneakerService ss = new SneakerService();
        Sneaker expectedSneaker = new Sneaker(1, "Abby J", "Adidas", "Tennis", 8f, 22, 54.99f);
        Sneaker actualSneaker1 = ss.findSneaker(10);
//        Sneaker actualSneaker2 = ss.findSneaker(9);


        Assert.assertEquals(expectedSneaker, actualSneaker1);
//        Assert.assertNull(actualSneaker2);

    }

    @Test
    public void findAllTest() {
        Sneaker[] expected = sneakerInventory.toArray(new Sneaker[0]);
        Sneaker[] actual = ss.findAll();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteTest() {
        Sneaker deletedSneaker = ss.findSneaker(1);
        ss.delete(1);
        Assert.assertFalse(sneakerInventory.contains(deletedSneaker));

    }
}