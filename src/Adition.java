public class Adition {
    private String aditionAdded = "";
    private double aditionPrice = 0;
    public void price()
    {
        System.out.println("1. Tomato  1$");
        System.out.println("2. Chesse  3$");
        System.out.println("3. Lettuce 1$");
        System.out.println("4. Souce 2$");
        System.out.println("5. Pickle 1$");
        System.out.println("6. Onion 1$");
    }
    public void make(int each) //adauga aditii
    {
        boolean more = true;
        while(more && each > 0) // daca mia vrea aditii si mai are
        {
            each--;
            price(); // afiseaza lista de preturi
            int numbe = NumberSelect.get(1, 6); // primeste numarul pe care il vrea
            switch(numbe) // in functie de numar adauga la lista si la pret
            {
                case 1:
                    aditionAdded += " Tomato";
                    aditionPrice += 1;
                    break;
                case 2:
                    aditionAdded += " Chesse";
                    aditionPrice += 3;
                    break;
                case 3:
                    aditionAdded += " Lettuce";
                    aditionPrice += 1;
                    break;
                case 4:
                    aditionAdded += " Souce";
                    aditionPrice += 2;
                    break;
                case 5:
                    aditionAdded += " Pickle";
                    aditionPrice += 1;
                    break;
                case 6:
                    aditionAdded += " Onion";
                    aditionPrice += 1;
                    break;
                default:
                    aditionPrice += 0;
            }
            System.out.println("You have " + each + " more");
            if(each > 0){
                System.out.println("Do you want more?");
                System.out.println("1. YES");
                System.out.println("2. NO");
                int numberOfMore = NumberSelect.get(1, 2);
                if(numberOfMore == 2)
                    more = false;
            }
        }
        new Burger().increesPrice(aditionPrice);
    }
    public void specialAdition() // adition for Delux burger
    {
        System.out.println("Do you want Chips for 5$?");
        System.out.println("1. YES");
        System.out.println("2. NO");

        int numbe = NumberSelect.get(1, 2);
        if(numbe == 1)
        {
            aditionAdded += "Chips";
            aditionPrice += 5;
        }

        System.out.println("Do you want Juice for 4$?");
        System.out.println("1. YES");
        System.out.println("2. NO");

        numbe = NumberSelect.get(1, 2);
        if(numbe == 1)
        {
            aditionAdded += " Drink";
            aditionPrice += 4;
        }
    }
    public double getAditionPrice()
    {
        return aditionPrice;
    }
    public String getAditionAdded()
    {
        return aditionAdded;
    }
}
