/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        // System.out.println(str);  // Prints the string
        // println(arr1);            // Prints an array of characters
        //System.out.println(charAt(arr1,2));      
        //System.out.println(indexOf(arr1,'l'));  
        //System.out.println(indexOf(arr1,'l',3)); 
        //System.out.println(lastIndexOf(arr1, 'l'));
        //System.out.println(concat(arr1, arr2));
        //System.out.println(subArray(arr2, 2, 9));
        // System.out.println(compareTo("abcd", "abcd"));
        // System.out.println(compareTo("abc", "abcd"));
        // System.out.println(compareTo("abw", "abcd"));
        // System.out.println(compareTo("Abcd", "a"));
        // System.out.println(compareTo("apple", "banana"));
        // System.out.println(compareTo("apple", "applepie"));
        //System.out.println(compareTo("Zoo", "zoo"));
        //System.out.println(hashCode(arr1));
        //System.out.println(hashCode(arr2));
        // System.out.println(equals(arr1, arr2)) ; // for equal 

    }

    /** Prints the given array of characters, and moves the cursor to the next line.
     */
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /** Returns the char value at the specified index. Assume that the array is non-empty.
     */
    public static char charAt(char[] arr, int index) {
        int the_length = arr.length ; 
        char the_char = 'o' ; 
        if (index < the_length) {
            the_char = arr[index] ; 
        }
        return the_char;
    }

    /** If the two arrays have the same value in every index, 
     *  returns true; Otherwise returns false.
     */
    public static boolean equals(char[] arr1, char[] arr2) {
        boolean the_ans = false ; //the variable that check if the arr is equal or not 
        int the_length1 = arr1.length ; //the length of the first arr
        int the_length2 = arr2.length ; //the length of the second arr
        if (the_length1 != the_length2) {
            return the_ans ;
        }
        else {
            for(int i = 0 ; i < the_length1; i ++){ //check if the char in arr1 is equal to the cahr in arr2 in the same index
                if (arr1[i] == arr2[i]){
                    the_ans = true ; 
                }
                    else{
                        the_ans = false ;
                        return the_ans ;
                    }                
        }
    } 
        return the_ans;
    }

    /** Returns the index within the given array of the first occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int indexOf(char[] arr, char ch) {
        int the_length = arr.length ;
          int the_index = -1 ;

        if (the_length == 0){ // the arr is empty 
            return the_index;
        }

        for (int i = 0; i < the_length; i++){
            if (arr[i] == ch){
                the_index = i ;
                break;
            }
            else{
                continue;
            }
        }
            return the_index ;
    }
        
    /** Same as indexOf(char[], char), but starts the search in the given index.
     */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        int the_length = arr.length ;
        int the_index = -1 ;
        for (int i = fromIndex; i < the_length; i++){
            if (arr[i] == ch){
                the_index = i ;
                break;
            }
            else{
                continue;
            }
        }
            return the_index ;
    }

    /** Returns the index within the given arr of the last occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int lastIndexOf(char[] arr, char ch) {
        int the_length = arr.length ;
        int the_index = -1;
        for(int i= the_length-1; i >= 0; i--){
               if (arr[i] == ch){
                the_index = i ;
                break;
            }
            else{
                continue;
            }
        }
            return the_index ;
    }

    /* Returns an array which is the concatanation of the two given arrays.
    */
    public static char[] concat(char[] arr1, char[] arr2) {
        int the_length1 = arr1.length ;
        int the_length2 = arr2.length ; 
        int both = the_length1 + the_length2 ; 
        char[] new_arr = new char[both] ;  //new empty arr
        for(int i = 0 ; i < the_length1; i++){
            new_arr[i] = arr1[i] ; 
        }

        int the_index = 0; //the index for arr2 

        for(int j = the_length1 ; j < both ; j++){
            new_arr[j] = arr2[the_index];
            the_index++ ; 
        }

        return new_arr;
    }

    /** Returns a new array that can be described as a sub-array of this array.
     *  The sub-array begins at the specified beginIndex and extends to the character at index endIndex - 1.
     *  For example, if arr contains the characters "hamburger", then subArray(4, 8) returns an array of
     *  characters containing the characters "urge".
     */     
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
       int the_length = arr.length ; 
       int new_arr_length = endIndex - beginIndex ; 
       char[] new_arr = new char[new_arr_length] ;
       int the_new_arr_index = 0;

       for(int i = beginIndex ; i < endIndex; i++){
            new_arr[the_new_arr_index] = arr[i];
            the_new_arr_index ++;    
       }

        return new_arr;
    }

     /** Returns a single integer that represents the given array. This integer is sometimes 
     *  referred to as the array's "hash code". Later in the course we'll explain what these 
     *  hash codes are used for. For now, simply implement the specification given below.
     *  The hash code is computed as: arr[0]*7^(n-1) + arr[1]*7^(n-2) + ... + arr[n-2]*7 + arr[n-1]
     *  where arr[i] is the i'th character of the array, and n is the array's length.
     *  The hash value of an empty array is zero.
     */
    public static long hashCode(char[] arr) {
        int the_length = arr.length ; 
        int the_sum = 0 ; 
        int the_length_check = the_length -1 ;

        for(int i= 0; i < the_length; i++){
             the_sum += (int) arr[i] * Math.pow(7, the_length_check);
             the_length_check -- ; 

        }

        return the_sum;
    }


    /**
     * Compares the two strings lexicographically.
     * Assume that both strings are not empty.
     * 
     * Characters are compared one by one from left to right, using their numeric Unicode values,
        as follows:
     * 1. If two characters at the same position in both strings are different,
     *    the string with the smaller character is considered lexicographically smaller.
     * 2. If all characters in the shorter string match the corresponding characters
     *    in the longer string, the shorter string is considered lexicographically smaller.
     * 3. If both strings have the same characters and the same length, they are considered equal.
     * 
     * Examples:
     * - "apple" is less than "banana" because 'a' comes before 'b'.
     * - "abc" is less than "abcd" because it is shorter.
     * - "hello" is equal to "hello".
     * - "date" is greater than "dark" because 't' comes after 'k'.
     * 
     * @param str1 the first string to compare
     * @param str2 the second string to compare
     * @return -1 if str1 is lexicographically less than str2,
     *         zero if they are equal, and 1 if str1 is
     *         lexicographically greater than str2.
     *         return -2 if there is an error with the input.
     */


    public static int compareTo(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int the_length_str1 = str1.length() ; 
        int the_length_str2 = str2.length() ;

        int answer = 0 ;

        if (the_length_str1 == the_length_str2){
            for(int i = 0; i < the_length_str1; i ++){

                if (str1.charAt(i) == str2.charAt(i)){ //delete this code 
                    continue;
                }
                else if (str1.charAt(i) > str2.charAt(i)) {
                    answer = 1 ;
                    return answer ;  
                }
                else if (str1.charAt(i) < str2.charAt(i)) {
                    answer = -1;
                    return answer;
                    
                }
                }
            }
        else if(the_length_str1 < the_length_str2){
            for (int j = 0; j < the_length_str1; j ++){
                if (str1.charAt(j) == str2.charAt(j)){
                    answer = -1 ;
                    continue;
                }
                else if (str1.charAt(j) > str2.charAt(j)) {
                    answer = 1 ;
                    return answer ;  
                }
                else if (str1.charAt(j) < str2.charAt(j)) {
                    answer = -1;
                    return answer;
                    
                }
            }
        }
        else if (the_length_str1 > the_length_str2) {
                   for (int n = 0; n < the_length_str2; n ++){
                if (str1.charAt(n) == str2.charAt(n)){
                    answer = 1 ;
                    continue;
                }
                  else if (str1.charAt(n) > str2.charAt(n)) {
                    answer = 1 ;
                    return answer ;  
                }
                else if (str1.charAt(n) < str2.charAt(n)) {
                    answer = -1;
                    return answer;
                    
                }
                
            }
            }

       
            return answer;
        }
    }

  
