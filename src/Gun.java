import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int capacityOfBullets = 1000;
    public void fire_use_bulletPool(){
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < capacityOfBullets ; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size() ; j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if(pp.getPosition() == 10) {
                    pool.free_item(pp);
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }
    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < capacityOfBullets; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
