package test;


public class RoomNoApp {

    public static int getRoomCountForCourses(  int [] courseStartTimeArray, int [] courseDurationArray, int roomCount){

        int [] courseCompletion = new int[roomCount];
        int [] countArray = new int[roomCount];
        for(int i = 0; i < roomCount; i++){
            courseCompletion[i] = 0;
            countArray[i] = 0;
        }

        for(int i = 0; i < courseStartTimeArray.length; i++){
            if( i < 3 && courseCompletion[i] == 0){
                courseCompletion[i] = courseStartTimeArray[i] + courseDurationArray[i];
                countArray[i] += 1;
            }
            else {
                for(int j = 0; j < roomCount; j++){
                    if(courseCompletion[j] <= courseStartTimeArray[i]){
                        courseCompletion[j] = courseStartTimeArray[i] + courseDurationArray[i];
                        countArray[j] += 1;
                    }
                }
            }
        }

        int max = 0;
        int room = 0;
        for(int i = 0; i < roomCount; i++){
            if(countArray[i] > max){
                max = countArray[i];
                room = i;
            }
        }
        return room+1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        int roomCount= 3;
        int[] courseStartTimeArray = {1, 2, 5, 6, 14, 15};
        int[] courseDurationArray =  {15, 14, 1, 1, 1, 1};

        int room = getRoomCountForCourses(courseStartTimeArray, courseDurationArray, roomCount);
        System.out.println(room);
    }
}
