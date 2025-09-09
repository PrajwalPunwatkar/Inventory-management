import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{" + "name='" + name + '\'' + ", priority=" + priority + '}';
    }
}

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.add(new Task("Complete report", 2));
        taskQueue.add(new Task("Fix bugs", 1));
        taskQueue.add(new Task("Write documentation", 3));
        taskQueue.add(new Task("Attend meeting", 2));

        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}