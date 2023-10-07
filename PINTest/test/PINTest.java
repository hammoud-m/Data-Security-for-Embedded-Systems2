/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pintest.PIN;

/**
 *
 * @author Mohammad
 */        
        
public class PINTest {

    @Test
    public void test_PIN() {
        int sec_pin = 1297;
        PIN pin = new PIN(sec_pin);
	
        
        
        //Situation 1 (000):
        pin = new PIN(sec_pin);
        for(int i = 0; i < 3; i++)
            pin.checkPin(3333);
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            if(i == 1297);
            else
                pin.checkPin(i);
            assertSame(pin.isVerified(), false);
        }
        
        
        //Situation 2(001):
        pin = new PIN(sec_pin);
        for(int i = 0; i < 3; i++)
            pin.checkPin(3333);
        for(int i = 0; i < Integer.MAX_VALUE-3; i++) {
            pin.checkPin(1297);
            assertSame(pin.isVerified(), false);
        }
        
        
        //Situation 3(010):
        pin = new PIN(sec_pin);
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            pin = new PIN(1297);
            if(i == 1297);
            else
                pin.checkPin(i);
            assertSame(pin.isVerified(), false);
        }
        
        
        //Situation 4(011):
        pin = new PIN(sec_pin);
        assertSame(pin.isVerified(), false);
        pin.checkPin(1297);
        assertSame(pin.isVerified(), true);
        
        
        //Situation 7(110):
        pin = new PIN(sec_pin);
        pin.checkPin(1297);
        for(int i = 0; i < 3; i++)
            pin.checkPin(3333);
        assertSame(pin.isVerified(), true);

        /*
        //Situation 8(111):
        pin = new PIN(sec_pin);
        pin.checkPin(1297);
        for(int i = 0; i < 3; i++)
            pin.checkPin(1297);
        assertSame(pin.isVerified(), true);
        */
    }
}
