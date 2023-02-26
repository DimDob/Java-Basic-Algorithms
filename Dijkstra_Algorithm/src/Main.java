//Dijkstra's Algorithm is used in GPS systems to track the shortest distance from point A to point B etc.
//Really intriguing video showing how the algorithm works can be found on youtube: https://www.youtube.com/watch?v=EFg3u_E6eHU


import java.util.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args) {

        Collector collector = new Collector();
        Exceptions validator = new Exceptions(); //validates distance

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        Node nodeG = new Node("G");


        nodeA.addDestination(nodeB, 5);
        nodeA.addDestination(nodeC, 1);
        nodeA.addDestination(nodeA, 1);

        nodeB.addDestination(nodeD, 3);
        nodeB.addDestination(nodeF, 13);

        nodeC.addDestination(nodeE, 4);

        nodeD.addDestination(nodeE, 22);
        nodeD.addDestination(nodeF, 11);

        nodeF.addDestination(nodeE, 55);
        nodeA.addDestination(nodeG, -1231231);

        collector.addNode(nodeA);
        collector.addNode(nodeB);
        collector.addNode(nodeC);
        collector.addNode(nodeD);
        collector.addNode(nodeE);
        collector.addNode(nodeF);
        collector.addNode(nodeG);

        Collector result = Algorithm.shortestPathFromOrigin(collector, nodeA);

        for (Node nodes : result.getNodes()) {
            String origin = nodes.getShortestPath().stream().map(Node::getNodeName).map(Objects::toString).collect(Collectors.joining(""));
            String goalNode = nodes.getNodeName();
            Integer distance = nodes.getDistance();
            try {
                validator.checkForNegativeDistance(nodes.getDistance(), origin, goalNode);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            String message = origin.length() > 1 ? String.format("Distance from %s to %s to %s is %s", origin.charAt(0), origin.charAt(1), goalNode, distance)
                    : origin.equals("") ? String.format("Distance between point %s and point %s is %s", goalNode, goalNode, distance)
                    : String.format("Distance between point %s and point %s is %s", origin, goalNode, distance);

            System.out.println(message);



        }


    }
}

