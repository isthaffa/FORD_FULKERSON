import java.util.ArrayList;
import java.util.List;

public class Graph {

        private int numOfVertices;
        private int[][] adjMatrix; //stores the graph edges to two dimensional array

        //constructor
        Graph(int nodes) {
            this.numOfVertices = nodes;

            adjMatrix = new int[nodes][nodes];
        }



        public int getNumOfVertices() {
            return numOfVertices;
        }

        public void setNumOfVertices(int numOfVertices) {
            this.numOfVertices = numOfVertices;
        }

        public int[][] getAdjMatrix() {
            return adjMatrix;
        }

        public void setAdjMatrix(int[][] adjMatrix) {
            this.adjMatrix = adjMatrix;
        }

        void addEdge(int i, int j, int capacity) {
            adjMatrix[i][j] = capacity;
        }

        public int getCapacityValue(int startingEdge,int endingEdge){
            return adjMatrix[startingEdge][endingEdge];
        }
        void removeEdge(int i,int j){
            adjMatrix[i][j]=0;
        }


        //returns boolean if has an edge between given edges
        private boolean hasEdge(int i, int j) {
            return adjMatrix[i][j] != 0;
        }

        //return neighbour vertices of the given node
        public List<Integer> neighbourVertices(int vertex) {
            List<Integer> edges = new ArrayList<>();
            for (int i = 0; i < numOfVertices; i++)
                if (hasEdge(vertex, i))
                    edges.add(i);
            return edges;
        }

        void printGraph() {
            for (int i = 0; i < numOfVertices; i++) {
                List<Integer> edges = neighbourVertices(i);
                System.out.print(i + " => ");
                for (Integer edge : edges) {
                    System.out.print(edge + " ");
                }
                System.out.println();
            }
        }





    }


