j = -3;
        for(int i=0; i<3;i++){
            if(i == 3){
                j=0;
            } if (i == 2){
                j--;
                goto jumpto;
            } if (i == 0){
                j +=2;
                goto jumpto;
            } 
            jumpto :
              if(j>0){
                  j = 3-i;
              }

            }
        
    
