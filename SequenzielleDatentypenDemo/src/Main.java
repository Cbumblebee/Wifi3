import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] produkte = new String[10];
        produkte[0] = "Notebook";
        produkte[1] = "Smartphone";

        String[] months = {"Jänner", "Feb", "usw"}; //fix 3 Elemente
        String[] allMonths = Arrays.copyOf(months, months.length + 6); //Neue Länge des Arrays
        System.out.println(allMonths.length);
        allMonths[6] = "Juli"; //bei allen neuen Indexen so weitermachen

        List<String> inventar = new ArrayList<>();
        inventar.add("Schwert");
        inventar.add("Schild");
        inventar.add("Erste Hilfe Set");
        for (String gegenstand : inventar) {
            System.out.println(gegenstand);
        }

        System.out.println(inventar.get(1)); //arr[1]
        System.out.println(inventar.size()); //arr.length
        inventar.add(1, "Metallschild"); //erweitert es, innerhalb der arr shifted es - set würde es überschreiben
        System.out.println(inventar.toString());

        //SET - enthält keine Duplikate, wird alphabetisch ausgegeben
        Set<String> nutzernamen = new HashSet<>();
        nutzernamen.add("Markus");
        nutzernamen.add("Moritz");
        nutzernamen.add("Leo");
        nutzernamen.add("Markus");
        System.out.println(nutzernamen.toString());

        //Mengefunktionen
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println(set1);
        System.out.println(set2);

        set1.addAll(set2);
        System.out.println(set1);

        /*set1.removeAll(set2);
        System.out.println(set1);*/

        set1.retainAll((set2));
        System.out.println(set1);

        System.out.println(set1.containsAll(set2));

        //Map
        Map<String, String> woerterbuch = new HashMap<>();
        woerterbuch.put("Java", "Programmiersprache");
        woerterbuch.put("Python", "Programmiersprache & Teil des Namens einer brit. Comedy-Gruppe");

        System.out.println(woerterbuch.get("Java"));
        System.out.println(woerterbuch.containsKey("Java"));
        System.out.println(woerterbuch.containsValue("lol"));
        System.out.println(woerterbuch.size());
        woerterbuch.clear();
        System.out.println(woerterbuch.size());

        //Stack - Stapel - last in first out
        Stack<String> webseitenHistorie = new Stack<>();
        webseitenHistorie.push("Startseite");
        webseitenHistorie.push("Artikel");
        System.out.println(webseitenHistorie);
        System.out.println(webseitenHistorie.peek());
         //anschaun
        webseitenHistorie.pop(); //entfernt obersten Eintrag
        System.out.println(webseitenHistorie);


        //Queue - first in first out
        Queue<String> druckerWarteschlange = new LinkedList<>();
        druckerWarteschlange.add("Dok1");
        druckerWarteschlange.add("Dok2");
        druckerWarteschlange.add("Dok3");
        System.out.println(druckerWarteschlange);
        System.out.println(druckerWarteschlange.peek());
        druckerWarteschlange.poll();
        druckerWarteschlange.remove(); //das gleiche wie poll
        System.out.println(druckerWarteschlange);
    }
}