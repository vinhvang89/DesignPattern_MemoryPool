public class Demo {
    public static void main(String[] args) {
//        Gun gun1=new Gun();
//        System.out.println("Start");
//        gun1.fire();
//        System.out.println("Game over");
//        System.out.println("Total bullet created: " + Bullet.count);
        Gun gun=new Gun();
        System.out.println("Start");
        gun.fire_use_bulletPool();
        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count);
    }
}
