import java.io.IOException;
import java.util.*;

/**
 * Created by DENIS on 09.09.2016.
 */
class SortingStrings {
    public static void sortText(){
        try {
            List<String> list = new ArrayList<String>();
            String string = new String(" ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text(End of text is empty string: double tap on Enter):");
            string = sc.nextLine();
            while (!string.equals("")) {
                StringTokenizer st = new StringTokenizer(string, " \r\t\n,.");
                while (st.hasMoreTokens()) {
                    list.add(st.nextToken());
                }
                string = sc.nextLine();
            }
            System.out.println("Words before sorting:");
            output(list);
            sortStringsInList(list);
            System.out.println("Words after sorting:");
            output(list);
        }
        catch (InputMismatchException e){
            System.out.println("Input exception");
        }
        catch (NoSuchElementException e){
            System.out.println("Error when searching for an element in the container");
        }
    }
    public static void output(List<String> list){
        Iterator<String> it = list.iterator();
        int i = 0;
        while(it.hasNext()){
            System.out.print(it.next() + " ");
            i++;
            if(i == 7){
                i = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void sortStringsInList(List<String> list){
        Collections.sort(list);
    }
}
