

public class Primes {
    public static void main(String[] args) {
        //int num = Integer.parseInt(args[0]);
        int num = 30 ; 

        boolean[] new_arr = new boolean[num+1] ; //new bolean arr

        int arr_length = new_arr.length ;
        for(int b = 0; b < arr_length -1; b++){
            new_arr[b] = true ;
        }

        new_arr[0] = false ;
        new_arr[1] = false ; 

        for(int i= 2; i < arr_length -1; i++){
            for(int j = 2 ; j < arr_length -1; j++){
               if ((i*j) < num+1) {
               new_arr[i * j] = false; 
               }
               else {
                break; 
               }
            }  
        }
        int count = 0 ;
        for(int n = 0; n < arr_length; n++){
            if (new_arr[n] == true){
                System.err.println(n);
                count ++;
            }
        }

        int persent = (int) (((double)count / num) * 100); 
        //System.err.println(persent);

    System.out.println("There are " + count + " primes between 2 and " + num + " (" + persent + "%" + " are primes)");

    }
}