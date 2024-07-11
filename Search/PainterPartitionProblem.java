package Search;

import java.util.ArrayList;

public class PainterPartitionProblem 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
        int n = boards.size();
        int totalLength = 0;
        int maxLength = 0;

        for (int board : boards) 
        {
            totalLength += board;
            if (board > maxLength) 
            {
                maxLength = board;
            }
        }

        int low = maxLength;
        int high = totalLength;
        int result = high;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if (canPaint(boards, k, mid)) 
            {
                result = mid;
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean canPaint(ArrayList<Integer> boards, int k, int maxLoad) {
        int painters = 1;
        int currentLoad = 0;

        for (int board : boards) 
        {
            if (currentLoad + board <= maxLoad) 
            {
                currentLoad += board;
            } 
            else 
            {
                painters++;
                currentLoad = board;
                if (painters > k) 
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        ArrayList<Integer> boards = new ArrayList<>();
        boards.add(2);
        boards.add(1);
        boards.add(5);
        boards.add(6);
        boards.add(2);
        boards.add(3);
        
        int k = 2;
        
        int largestMinDistance = findLargestMinDistance(boards, k);
        System.out.println("Largest minimum distance: " + largestMinDistance);
    }
}
