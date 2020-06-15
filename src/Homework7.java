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
