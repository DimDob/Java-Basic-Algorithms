public class Exceptions extends Exception{
    public void checkForNegativeDistance(int distance, String node1, String node2) throws Exception {
        if (distance < 0) {
            throw new Exception("Distance between node %s and node %s could not be negative, but value of %d is calculated".formatted(node1, node2, distance));
        }
    }

}
