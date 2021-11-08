import module.Kotik;

public class Application {

    public static void main(String[] args) {
       Kotik kotik = new Kotik(10, "Гуччи", 3, "Гав мяу аригатоо");
       Kotik kotikTwo = new Kotik();
       kotikTwo.setKotik(10, "Салем", 2, "САБРИНААА");
       kotik.liveAnotherDay();
       System.out.println("Котика зовут "+kotik.getName()+"."+" Его вес "+kotik.getWeight()+"кг.");
       if (kotik.getMeow().equals(kotikTwo.getMeow())){
           System.out.println("Котики разговаривают одинаково");
       } else{
           System.out.println("Котики разговаривают по-разному");
       }
        System.out.println("Было создано котиков: "+Kotik.count);
    }
}
