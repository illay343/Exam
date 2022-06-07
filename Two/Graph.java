package Two;

public class Graph {
    private int maxN = 10000;
    private int[][] mas;
    Vertex[] vertexList;
    private int curnN;
    private MyStack stack = new MyStack();

    public Graph() {
        vertexList = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curnN = 0;
    }

    public void addVertex(String name) {
        vertexList[curnN++] = new Vertex(name);
    }

    public void addEdge(int start, int end) {
        mas[start][end] = 1;
    }

    public int check(int v) {
        for (int i = 0; i < curnN; i++) {
            if (mas[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;

            }
        }
        return -1;
    }

    public void passInDeep(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()) {
            int neigh = check(stack.peek());

            if (neigh == -1) {
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }
        for (int i = 0; i<curnN; i ++) {
            vertexList[i].isVisited = false;
        }

    }

    public void minPath(int index) {
        vertexList[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()) {
            int curVertex = stack.peek();
            int neigh = check(curVertex);

            if (neigh == -1) {
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[curVertex].name + "->");
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }
        for (int i = 0; i<curnN; i ++) {
            vertexList[i].isVisited = false;
        }

    }
}

