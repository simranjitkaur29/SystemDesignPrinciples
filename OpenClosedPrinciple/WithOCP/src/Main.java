import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Attacker attacker=new Attacker();
        List<SuperHero>list=new ArrayList<>();
        list.add(new BatMan());
        list.add(new CaptainAmerica());
        list.add(new SpiderMan());
        attacker.AttackWithSuperHeroes(list);

    }
}