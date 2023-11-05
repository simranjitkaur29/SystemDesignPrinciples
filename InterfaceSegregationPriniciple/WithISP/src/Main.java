import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

public class Main {
    public final List<PureBatsMan>pureBatsMEN;
    public final List<AllRounder>allRounders;
    public final WicketKeeper wicketKeeper;
    public final CricketGameHelper cricketGameHelper;

    public Main(List<PureBatsMan> pureBatsMEN, List<AllRounder> allRounders, WicketKeeper wicketKeeper, CricketGameHelper cricketGameHelper) {
        this.pureBatsMEN = pureBatsMEN;
        this.allRounders = allRounders;
        this.wicketKeeper = wicketKeeper;
        this.cricketGameHelper = cricketGameHelper;
    }
    public void simulate()
    {
        System.out.println("Simulator Started");
        startBatting();
        startBowling();
        startFielding();
        startKeeping();
        System.out.println("simulation ended");
    }

    public void startKeeping() {
        cricketGameHelper.keep(wicketKeeper);
    }

    public void startFielding() {
        for(int i=0;i<pureBatsMEN.size();i++)
        {
            cricketGameHelper.field(pureBatsMEN.get(i));
        }
        for(int i=0;i<allRounders.size();i++)
        {
            cricketGameHelper.field(allRounders.get(i));
        }
    }

    public void startBowling() {
        for(int i=0;i<allRounders.size();i++)
        {
            cricketGameHelper.bat(allRounders.get(i));
        }
    }

    public void startBatting() {
        for(int i=0;i<pureBatsMEN.size();i++)
        {
            cricketGameHelper.bat(pureBatsMEN.get(i));
        }
        cricketGameHelper.bat(wicketKeeper);
        for(int i=0;i<allRounders.size();i++)
        {
            cricketGameHelper.bat(allRounders.get(i));
        }
    }



    public static void main(String[] args) {
        List<PureBatsMan>pureBatsMEN1= Arrays.asList(new PureBatsMan(),new PureBatsMan(),new PureBatsMan(),new PureBatsMan());
        List<AllRounder>allRounders1=Arrays.asList(new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder());
        WicketKeeper wicketKeeper1=new WicketKeeper();
        Main main=new Main(pureBatsMEN1,allRounders1,wicketKeeper1,new CricketGameHelper());
        main.simulate();
    }
    
}