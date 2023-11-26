
public class Main {

    static long scoreBook = 0X10101; //2 variant
    static long phone = 380933602025L;
    static long phone2 = 0B11001;
    static long phone8 = 06225;
    static long scaryNum = (21 - 1) % 26 + 1;
    static char engLetter = (char) (scaryNum + 64);

    //for simplicity, we use an array of numbers given above
    static long[] arr = new long[]{scoreBook, phone, phone2, phone8, scaryNum, engLetter};

    //the method prints the number of even and odd numbers to the console
    private static void countEvenAndOdd() {
        int even = 0;
        int odd = 0;
        //loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                //Write down an even number
                even++;
            } else {
                //Write an odd number
                odd++;
            }
        }
        System.out.println("Even numbers:" + even);
        System.out.println("Odd numbers:" + odd);
    }//output the result

    //the method prints to the console the number of units in the given numbers
    private static void numberOfOne() {
        int count = 0;
        //loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            //create a variable for subtracting units in the array element numbered [i] To do this, we use the Long.toBinaryString() method, which will return a string that consists of 2 form numbers on this line we use the replaceAll () method, the input parameters of which are regEx and the value to be replaced as a string at the end, we get a string consisting of only 1; we call the length () method and find the length of the string
            int oneCount = Long.toBinaryString(arr[i]).replaceAll("0", "").length();
            //sum the total number of units (count) and the number of units of the given element (oneCount)
            count += oneCount;
        }
        System.out.println("Number of units:" + count);
    }

    public static void main(String[] args) {
        countEvenAndOdd();
        numberOfOne();
    }
}//run method
