import java.sql.SQLOutput;

public class WicketKeeper implements Player{
    @Override
    public void bat() {
        System.out.println("WicketKeeper is batting...");

    }

    @Override
    public void bowl() {
        throw new RuntimeException("WicketKeeper can't Bowl");

    }

    @Override
    public void field() {
        throw new RuntimeException("WicketKeeper can't bowl");

    }

    @Override
    public void keepWicket() {
        System.out.println("wicketKeeper is keeping ..");

    }
}
