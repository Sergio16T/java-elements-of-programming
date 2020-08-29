package LanguageBasics; 

class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numberOfPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numberOfPs++;
        }
        System.out.println("Found " + numberOfPs + " p's in the string.");
    }
}

class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                System.out.println(n);
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test; 
                    // i.e: searchMe[1] != subString[0] 
                    // o is not equal to s so continue a.k.a skip the current iteration of outerloop 
                    //with each iteration of outerloop n, j, k are reset
                }
                //when we hit searchMe[11] we hit s and this is equal to subString[0] so while loop continues to next iteration where 
                //n has been decremented and is now 2, j is 12 and k is 1, so we check is searchme[12] == subString[1] a.k.a u == u ? yes then while loop continues  
                // to next iteration and n is now 1 searchMe[13] is b and this is equal to subString[2] and while continues to next iteration where 
                // n is now 0 and 0-- is equal to 0 so the while loop ends and we assign foundIt to the boolean value true and break out of the for loop
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}