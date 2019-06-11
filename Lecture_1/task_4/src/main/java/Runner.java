public class Runner implements Comparable {
    String name;
    int time;

    Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public int compareTo(Object obj) {
        Runner tmp = (Runner)obj;
        if(this.time < tmp.time)
            {/* текущее меньше полученного */
                return -1;
            }
        else if(this.time > tmp.time)
            {/* текущее больше полученного */
                return 1;
            }
            /* текущее равно полученному */
            return 0;
    }

}
