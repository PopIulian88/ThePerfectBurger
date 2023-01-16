public class Manu {
    public static void main(String[] args) {
        System.out.println("Welcome to our Burger Shop");
        System.out.println("Wath burger do you want:");

        Burger burger = new Burger();
        Adition adition = new Adition();

        burger.type(); // select your burger

        int numberGet = NumberSelect.get(1, 3); //3 types of burgers

        switch (numberGet) // After chosing the burger
        {
            case 1: // Basic burger
                break;
            case 2: // Healty burger
                HealthyBurger healthyBurger = new HealthyBurger();
                burger = healthyBurger;
                break;
            case 3: //Delux Burger
                Deluxburger deluxburger = new Deluxburger();
                burger = deluxburger;
                break;
        }
        burger.increesPrice(burger.getPrice());// pretul burgerului fara aditii

        if(burger.getNumberOfAdition() == -1) { // daca are aditii speciale
            adition.specialAdition();
            burger.increesPrice(adition.getAditionPrice());
        }
        else { //aditiile simple
            System.out.println("Do you want adittion?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            numberGet = NumberSelect.get(1, 2);
            if (numberGet == 1) {
                adition.make(burger.getNumberOfAdition());
                burger.increesPrice(adition.getAditionPrice());
            }
        }
        //afisazele de final
        System.out.println("Your comand is done: ");
        System.out.println("Base: " + burger.getName() + " of price: " + burger.getPrice() + "$");
        System.out.println("Aditional: " + adition.getAditionAdded());
        System.out.println("Of price: " + adition.getAditionPrice() + "$");
        System.out.println("Your Total = " + burger.getTotalPrice() + "$");
    }
}
