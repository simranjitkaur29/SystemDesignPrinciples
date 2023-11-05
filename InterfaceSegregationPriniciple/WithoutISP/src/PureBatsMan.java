public class PureBatsMan implements Player{
    @Override
    public void bat() {
        System.out.println("PureBatsMan is batting ...");
    }

    @Override
    public void bowl() {
        throw new RuntimeException("PureBatsman can't bowl");

    }

    @Override
    public void field() {
        System.out.println("PureBatsMan is fielding");

    }

    @Override
    public void keepWicket() {
        throw new RuntimeException("PureBatsman Can't keep wicket");

    }
}
