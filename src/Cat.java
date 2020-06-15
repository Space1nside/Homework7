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
