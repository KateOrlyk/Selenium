package Util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvider {
    static List<String> listname = Arrays.asList("Kate", "Pasha", "Arthur");
    static List<String> listage = Arrays.asList("18", "24", "27");

    public static String getRandomName() {
        return listname.get(new Random().nextInt(listname.size()));
    }

    public static CharSequence getRandomAge() {
        return listage.get(new Random().nextInt(listage.size()));
    }
}
