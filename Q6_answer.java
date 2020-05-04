//Kahrin Huggins CSC4330 FINAL Q6
//Consider the following programming problem: The values of three integer variables—first,
//second, and third—must be placed in the three variables max, mid, and min, with the obvious meanings,
//without using arrays or user-defined or predefined subprograms. Write two solutions to this problem,
//one that uses nested selections and one that does not.

public class Q6_answer {
    public static void main(String[] args){
        int first, second, third, min, max, mid;
        first = 10;
        second = 7;
        third = 3;

    }


    public static void nestedSol(int first, int second, int third,int min, int mid, int max){
        if (first>second) {
            if (first > third) {
                first = max;
                if (first < third) {
                    first = mid;
                    second = min;
                }
            }
        }if (first<second) {
            if (third < second) {
                first = mid;
                if (third < first) {
                    second = max;
                    third = min;
                }
            }
        }if (first>second){
            if(first>third){
                if (third<second){
                    first = max;
                    second = mid;
                    third = min;
                }
            }
        }

    }

    public static void nonNestedSol(int first, int second, int third, int min, int mid, int max){
        if (first > second && first > third && third < second){
            first = max;
            second = mid;
            third = min;

        }else if (first > second && first < third ){
            first = mid;
            second = min;
            third = max;

        } else if(first < second && third < second && third < first){
            first = mid;
            second = max;
            third = min;
        }
    }
}
