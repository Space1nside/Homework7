public class Cat {
    private final String name;
    private final int appetite;
    private boolean fullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("There is not enough food in the plate for " + name);
            System.out.println("Fullness of the cat " + name + " = " + fullness);
            System.out.println();
            p.foodIncrease(appetite);
        }

        if(p.getFood() >= appetite) {
            p.foodDecrease(appetite);
            fullness = true;
            System.out.println("Fullness of the cat " + name + " = " + fullness);
            System.out.println();
        }
    }

    public void appetiteInfo() {
        System.out.println("Appetite of the cat " + name + ": " + appetite);
    }
}

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void foodDecrease(int n) {
        food = food - n;
        System.out.println("Food on the plate have been decreased" + "(-" + n + ")");
    }

    public void foodIncrease(int n) {
        n -= food;
        food = food + n;
        System.out.println("Food on the plate have been increased" + "(+" + n + ")");
    }

    public void plateInfo() {
        System.out.println("Plate: " + food);
    }
}

public class Homework7 {
    public static void main(String[] args) {
        Cat venus = new Cat("Venus", 23);
        Plate plate = new Plate(100);

        plate.plateInfo();
        venus.eat(plate);
        plate.plateInfo();

        System.out.println();

        Plate plateForCats = new Plate(100);
        plateForCats.plateInfo();
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Uranus", 16);
        cats[1] = new Cat("Mars", 6);
        cats[2] = new Cat("Mercury", 38);
        cats[3] = new Cat("Saturn", 46);

        for (Cat cat : cats) {
            cat.appetiteInfo();
            cat.eat(plateForCats);
            plateForCats.plateInfo();
        }

    }
}
