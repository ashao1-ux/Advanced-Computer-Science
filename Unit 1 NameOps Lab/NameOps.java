public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        String lastname = name.substring(indexOfFirstSpace(name) + 1);
        if (lastname.indexOf(" ") > -1) {
            return lastname.indexOf(" ") + indexOfFirstSpace(name) + 1;
        }
        return -1;
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) > -1) {
            return name.substring(0, indexOfFirstSpace(name));
        }
        return name;
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) > -1 && indexOfSecondSpace(name) > -1) {
            return name.substring(indexOfSecondSpace(name) + 1);
        } else if (indexOfFirstSpace(name) > -1) {
            return name.substring(indexOfFirstSpace(name) + 1);
        }
        return "";
    }

    public static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) > indexOfFirstSpace(name)) {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
        return "";
    }

    public static String generateLastFirstMidInitial(String name) {
        if (findMiddleName(name).length() > 0 && findLastName(name).length() > 0) {
            return findLastName(name) + ", " + findFirstName(name) + " " 
                + findMiddleName(name).substring(0, 1) + ".";
        } else if (findMiddleName(name).length() == 0 && findLastName(name).length() > 0) {
            return findLastName(name) + ", " + findFirstName(name);
        }
        return findFirstName(name);
    }
}




