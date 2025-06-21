import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList; // For Queue implementation
import java.util.Queue;     // For Queue interface

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // Corrected instantiation

        Queue<Integer> queue = new LinkedList<>(); // Use Queue interface with LinkedList implementation
        int n = Integer.parseInt(br.readLine()); // Number of commands

        for (int i = 0; i < n; i++) { // Loop `n` times, starting from 0
            String command = br.readLine(); // Read the command

            if (command.startsWith("push")) {
                String[] parts = command.split(" ");
                int x = Integer.parseInt(parts[1]);
                queue.offer(x); // Add to the back of the queue
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n"); // Remove from the front of the queue
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peek()).append("\n"); // Peek at the front of the queue
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    // To get the last element of a Queue (specifically LinkedList/ArrayDeque)
                    // you need to cast or use a Deque interface.
                    // For LinkedList, peekLast() is available.
                    sb.append(((LinkedList<Integer>) queue).peekLast()).append("\n");
                }
            }
        }
        System.out.print(sb.toString()); // Print all results at once
    }
}