package pintest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mohammad
 */
public class PIN {
    
    private static final int MAX_TRIES = 3;

    private int tryCounter = MAX_TRIES; 

    private boolean access = false; 

    private int securePin;

    public PIN(int initPin) {
        securePin = initPin;
    }

    public void checkPin(int pin) {
      if(access || (tryCounter > 0 && pin == securePin)) {
        access = true;
        updateTryCounter(MAX_TRIES);
      }else{
        updateTryCounter(-1);
      }
    }

    private void updateTryCounter(int num) {
      if(num >= 0)
        tryCounter = num;
      else
        tryCounter += num;
    }

    public boolean isVerified() {
      return access;
    }

}
