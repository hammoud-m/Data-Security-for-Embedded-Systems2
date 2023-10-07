/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author Mohammad
 */ 
public class Main {

    public static void main(String[] args) {
        Secret s = new Secret();

        /* 
		I tried to figure out the password using the for loop that are commented  below, 
		but it didn't work as I was an anticipating for some reason, 
		so I was forced to try it by hand, Starting from the first number from the left, 
		it usually took 0-2 for wrong number but when I chossed the right integer it jumped to 11, 
		that is because that delay have been applied from the d() function, I moved to the second integer and keep doing the same process, 
		when I get a big increase around 10+ I knew that I choosed the right  number.
		*/

        String password = "4596246940568173";
        s.verifyPassword(password);
        System.out.println(s.getSecret());

       /* long start = System.currentTimeMillis();
        s.verifyPassword(password);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);*/

       /* for (int i = 0; i <16; i++){
            for (int j = 0; j < 10; j++){
                long start = System.currentTimeMillis();
                s.verifyPassword(password);
                long end = System.currentTimeMillis();
                long time = end - start;
                if(time > (i+1)*10) {
                    System.out.println(password.charAt(i));
                    break;
                }
                StringBuilder rightPassword = new StringBuilder(password);

                // replace character at the specified position
                rightPassword.setCharAt(i, (char) j);
                password = rightPassword.toString();

            }
    	}*/
	}
}