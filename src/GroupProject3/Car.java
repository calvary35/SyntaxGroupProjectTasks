package GroupProjects.GroupProject3;

import java.util.Scanner;

/*
Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount

  */
class mains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Sedan obj = new Sedan();
        System.out.println("What is the length of the sedan?");
        obj.length = scan.nextInt();
        System.out.println("The price of the sedan is " + obj.calculateSalePrice(50000));
        System.out.println();
        Truck truck = new Truck();
        System.out.println("What is the weight of the truck?");
        truck.weight = scan.nextInt();
        System.out.println("The price of the truck is " + truck.calculateSalePrice(80000));
    }
}

public class Car {

    double carPrice;
    String color;

    double calculateSalePrice(double carPrice) {
        return carPrice;
    }
}

class Sedan extends Car {
    int length;

    @Override
    double calculateSalePrice(double carPrice) {
        if (length > 20) {
            carPrice = carPrice * .95;
        } else {
            carPrice = carPrice * .90;
        }
        return carPrice;
    }
}

class Truck extends Car {
    int weight;

    @Override
    double calculateSalePrice(double carPrice) {
        if (weight > 2000) {
            carPrice = carPrice * .90;
        } else {
            carPrice = carPrice * .80;
        }
        return carPrice;
    }
}

