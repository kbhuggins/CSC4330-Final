public class Q8_answer_b {
    public static void main(String[] args){
        int j = -3;

        for(int i=0; i<3;i++){
            if(i == 3){
                j=0;
            } if (i == 2){
                j--;
            } if (i == 0){
                j +=2;
            } else {
              if(j>0){
                  j = 3-i;
              }

            }
        }
    }

