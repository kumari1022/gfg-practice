import java.util.*;

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        int first = findFirst(arr, x);
        int last = findLast(arr, x);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return result;
    }

    private int findFirst(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                index = mid;
                high = mid - 1; // move left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                index = mid;
                low = mid + 1; // move right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
