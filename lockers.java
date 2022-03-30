public class lockers{

     public static void main(String args[]) {
      int[] lockers = new int[100];
    //   -1 open, 1 locked
      for (int i=0; i<lockers.length; i++){
          lockers[i]=1;
      }
      for (int i=1; i<101; i++){
          for (int j = i; j<101; j+= i){
              
              lockers[(j%100)]*= -1;
          }
      }
      int count = 0;
      for (int i:lockers){
        //   System.out.println(i);
          if (i==-1){count++;}
      }
      
      System.out.print(count);
    
    }
}
