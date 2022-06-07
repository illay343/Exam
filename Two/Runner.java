package Two;

public class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("torun");

        graph.addVertex("bydgoszcz");
        graph.addVertex("gdansk");
        graph.addVertex("warszawa");


        graph.addEdge(2, 1);
        graph.addEdge(1, 1);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.minPath(2);
    }
}
