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
