import java.util.Queue;
import java.util.LinkedList;


                                //Internally stack is a class 
                                //where as queue data structure is an Interface
                                //The linkedlist can be modified as the First node to Head and the end as the tail....
                                //and hence the queue is implemented with linkedklist

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
