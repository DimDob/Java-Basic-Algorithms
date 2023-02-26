import java.util.*;
import java.util.Map.Entry;

public class Algorithm {

    public static Collector shortestPathFromOrigin(Collector nodesCollector, Node origin) {

        origin.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();
        unsettledNodes.add(origin);

        while (unsettledNodes.size() != 0) {
            Node currentNode = closestNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode)) {
                    minDistanceBetweenNodes(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return nodesCollector;
    }

    private static void minDistanceBetweenNodes(Node evaluationNode, Integer edgeWeigh, Node originNode) {
        Integer originDistance = originNode.getDistance(); //getting the distance from the origin node
        if (originDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(originDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(originNode.getShortestPath());
            shortestPath.add(originNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    private static Node closestNode(Set<Node> unsettledNodes) {
        Node closestNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                closestNode = node;
            }
        }
        return closestNode;
    }

}
