import java.util.List;

public class Attacker {
    public void AttackWithSuperHeroes(List<SuperHero> superHeroes) {
        for (int i = 0; i <superHeroes.size();i++)
        {
            superHeroes.get(i).attack();
        }
    }
}
