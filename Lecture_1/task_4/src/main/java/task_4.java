import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task_4 {
    public static void main(String[] args) throws IOException {
        String[] names = new String[]{"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = new int[]{341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        int n = names.length;
        Runner[] runners = new Runner[n];

        for(int i = 0; i < n; i++) {
            runners[i] = new Runner(names[i], times[i]);
        }

        Arrays.sort(runners);

        for (int i = 0; i < runners.length; i++) {
            System.out.println(runners[i].name + " " + runners[i].time);
        }

        int placeFromMethod = getPlace();
        placeFromMethod = placeFromMethod - 1;
        System.out.println(runners[placeFromMethod].name + " " + runners[placeFromMethod].time);

        System.out.println("\n" + "This runner was first:");
        System.out.println(runners[0].name + " " + runners[0].time);

        System.out.println("\n" + "This runner was second:");
        System.out.println(runners[1].name + " " + runners[1].time);


    }

    static int getPlace() throws IOException {
        System.out.println("\n" + "Please, enter the place:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int place = Integer.parseInt(reader.readLine());
        return place;
    }
}