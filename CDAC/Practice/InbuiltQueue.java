import java.util.Queue;
import java.util.LinkedList;

public class InbuiltQueue {
    public static void main(String[] args) {
        
        Queue<Integer> demo_data = new LinkedList<>(); 

        demo_data.add(10);
        demo_data.add(20);
        demo_data.add(30);
        demo_data.add(40);
        demo_data.add(50);

        System.out.println(demo_data.remove());
        System.out.println(demo_data.remove());

        demo_data.remove();
        demo_data.remove();
        demo_data.remove();

        System.out.println("Error: ");
        demo_data.remove();
    }
}
