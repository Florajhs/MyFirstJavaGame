import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdventureGame {
    public static void main(String... args) {
        String[] array = {"Skeleton", "Zombie", "Warrior", "Assassin" };
        System.out.println("Printing Array: " + Arrays.toString(array));

        List<String> list = new ArrayList<String>();
        for (String lang : array) {
            list.add(lang);
        }

        System.out.println("Printing list:" + list);

        String enemy=("Skeleton,Zombie,Warrior,Assassin");
        int i=(int)(match.random()*4);
        this.enemyName=enemy[i];
        return this.enemyName;


    }

}
