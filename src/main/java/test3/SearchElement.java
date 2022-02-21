package test3;

public class SearchElement {
    public static void main(String[] args) {
        int [] data = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target = 15;

        int [] data1 = { 4, 4, 4 };
        int target1 = 4;

        int [] data2 = {6,7,7,7,7,8};
        int target2 = 7;

        int [] data3 = {10,10,10,10,11};
        int target3 = 10;

        int ans = getNumberOfOccurrences(data2, target2);

        System.out.println(ans);
    }

    public static int binarySearchEndPoint(int [] numbers, int start, int end, int target){
        if(start < end) {
            int mid = ((end - start) / 2) + start;
            if(end == numbers.length - 1 && numbers[end] == target){
                return end;
            }
            else if (numbers[mid] == target) {
                if (mid < numbers.length - 1 && numbers[mid + 1] > numbers[mid]) {
                    return mid;
                }
            } else if (target > numbers[mid]) {
                return binarySearchEndPoint(numbers, mid + 1, end, target);
            }
            return binarySearchEndPoint(numbers, start, mid - 1, target);
        }
        return 0;
    }

    public static int binarySearchStartPoint(int [] numbers, int start, int end, int target){
        if(start < end) {
            int mid = ((end - start) / 2) + start;
            if(start == 0 && numbers[0] == target){
                return start;
            }
            else if (numbers[mid] == target) {
                if (mid - 1 >= 0 && numbers[mid - 1] < numbers[mid]) {
                    return mid;
                }
            } else if (target > numbers[mid]) {
                return binarySearchStartPoint(numbers, mid + 1, end, target);
            }
            return binarySearchStartPoint(numbers, start, mid - 1, target);
        }
        return 0;
    }

    public static int getNumberOfOccurrences( int [] elements, int target){

        int start = 0;
        int end = elements.length - 1;

        int leftIndex = binarySearchStartPoint(elements, start, end, target);
        int rightIndex = binarySearchEndPoint(elements, start, end, target);
        return rightIndex - leftIndex + 1;
    }
}
