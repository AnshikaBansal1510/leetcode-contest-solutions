package BiweeklyContest_163;

public class A_minimumSensorsToCoverGrid {

	public int minSensors(int n, int m, int k) {

        int coveredArea = (2 * k + 1);

        int rows = (n + coveredArea - 1)/ coveredArea;
        int cols = (m + coveredArea - 1) / coveredArea;

        return (rows * cols);
    }
}
