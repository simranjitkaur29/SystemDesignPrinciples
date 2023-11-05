import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Attacker attacker=new Attacker();
        List<SuperHero> superHeroes=new ArrayList<>();
        superHeroes.add(SuperHero.CAPTAIN_AMERICA);
        superHeroes.add(SuperHero.SPIDER_MAN);
        superHeroes.add(SuperHero.BAT_MAN);
        attacker.attackWithSuperHeroes(superHeroes);
    }
}