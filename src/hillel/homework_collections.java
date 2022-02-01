package hillel;

import java.util.*;

public class homework_collections {
    public static ArrayList generateUsersList(int quantity, UserTypes type, ArrayList list) {
        for (int i = 0; i < quantity; i++) {
            String login = "login" + type + i;
            String password = "pass" + type + i;
            Object newUser = new User(login, password, type);
            list.add(newUser);
        }
        return list;
    }

    public static void printHashCodes(ArrayList listForPrint) {
        for (int i = 0; i < listForPrint.size(); i++) {
            Object elem = listForPrint.get(i);
            System.out.print("Element hashCode: " + elem.hashCode() + "\n");
        }
    }

    public static TreeMap convertListToTreeMap(ArrayList <User> startList, TreeMap map) {
        for (int i = 0; i < startList.size(); i++) {
            User list = startList.get(i);
            map.put(list.getLogin(), list.type.getPriority());
        }
        return map;
    }
    static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> sortByPriorityDesc(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = -e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    public static void main(String[] args) {
        ArrayList <User> users = new ArrayList <> ();
        generateUsersList(2, UserTypes.ADMIN, users);
        generateUsersList(3, UserTypes.AUTHORIZED, users);
        generateUsersList(3, UserTypes.PREMIUM, users);
        generateUsersList(5, UserTypes.GUEST, users);
        printHashCodes(users);

        Map<String, Integer> userInfo = new TreeMap<>();
        convertListToTreeMap(users, (TreeMap) userInfo);
        System.out.println(sortByPriorityDesc(userInfo));
    }


}