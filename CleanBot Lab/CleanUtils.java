public class CleanUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel <= 10 && cleanlinessLevel >= 0) {
            return cleanlinessLevel;
        } else if (cleanlinessLevel < 0) {
            return 0;
        }
        return 10;
    }

    public static String generateUsername(String name) {
        int firstSpace = name.indexOf(" ");
        int randNum = (int) (Math.random() * (100) + 1950);
        return "@" + name.substring(0, firstSpace) 
            + "_" + name.substring(firstSpace + 1) + "_" + randNum;
    }

    public static void cleanHome(Home home) {
        home.setCleanlinessLevel(home.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String text = name;
        String trimmedTextBegin = text.trim();
        String trimmedTextMiddle = trimmedTextBegin.substring(trimmedTextBegin.indexOf(" ")).trim();
        trimmedTextMiddle.substring(0, trimmedTextMiddle.indexOf(" "));
        return trimmedTextBegin + " " + trimmedTextMiddle.substring(0, trimmedTextMiddle.indexOf(" "));
    }
}
