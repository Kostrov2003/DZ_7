public class Main {
    public static void main(String[] args) {
    Cat[] catArray = new Cat[5];
    catArray[0] = new Cat("Barsik", 25, false);
    catArray[1] = new Cat("Asy", 64, false);
    catArray[2] = new Cat("Goul", 75, false);
    catArray[3] = new Cat("Pudg", 10, false);
    catArray[4] = new Cat("Silvestor", 99, false);
    for (int i = 0; i < catArray.length; i++){
        Plate plate = new Plate(100);
        int a = plate.setFood(plate.getFood() - catArray[i].getAppetite());
        if(a>0){
            catArray[i].eat(plate);
            catArray[i].satiety();
    }
        catArray[i].info();
    }
    }
}
class Plate {
    private int food;
    
    public Plate(int food) {
    this.food = food;
}
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
    System.out.println("plate: " + food);
}
    public int getFood(){
        return food;
    }
    public int setFood(int n){
        return n;
    }
    public void increaseFood(int n) {
        food +=n;
    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
    this.name = name;
    this.appetite = appetite;
    this.satiety = satiety;
 }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        
    }
    public int getAppetite(){
        return appetite;
    }
    public void satiety(){
        satiety = true;
    }
    public void info(){
        System.out.println(name + ": " + satiety);
    }
}
