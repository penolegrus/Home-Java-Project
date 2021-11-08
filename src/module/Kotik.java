package module;

public class Kotik {
    private int satiety;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    public static int count;


    public Kotik() {
        count++;
        satiety = 10;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        count++;
        satiety = 10;
    }

    private void eat(){
        System.out.print("Котик ест ");
        eat("ролки",5);
    }

    private void eat(int unitsSatiety){
        satiety = satiety+unitsSatiety;
    }

    private void eat(String nameFood,int unitsSatiety){
        eat(unitsSatiety);
        System.out.println(nameFood+" = "+unitsSatiety+" к сытости. Уровень сытости сейчас: "+satiety);
    }

    private boolean sleep(){
        if (isHungry()){
            return false;
        }
        System.out.println("Котик спит");
        satiety = satiety-1;
        return true;
    }

    private boolean play(){
        if (isHungry()){
            return false;
        }
        System.out.println("Котик играет");
        satiety = satiety-2;
        return true;
    }

    private boolean isHungry(){
        return satiety<=0;
    }

    private boolean chaseMouse(){
        if (isHungry()){
            return false;
        }
        System.out.println("Котик преследует мышь");
        satiety = satiety-3;
        return true;
    }

    private boolean posing(){
        if (isHungry()){
            return false;
        }
        System.out.println("Котик позирует для фото");
        satiety = satiety-1;
        return true;
    }

    private boolean walk(){
        if (isHungry()){
            return false;
        }
        System.out.println("Котик гуляет");
        satiety = satiety-5;
        return true;
    }

    public void liveAnotherDay(){
        for(int i=0; i<24; i++){

            switch ((int) (Math.random()*5+1)){
                case 1:
                    if (!sleep()){
                        eat();
                    }
                    break;
                case 2:
                    if(!play()){
                        eat();
                    }
                    break;
                case 3:
                    if(!chaseMouse()){
                        eat();
                    }
                    break;
                case 4:
                    if(!posing()){
                        eat();
                    }
                    break;
                case 5:
                    if(!walk()){
                        eat();
                    }
                    break;
            }
        }
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }
}
