/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author jorge_j3qr4sd
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public Integer suma(int val1, int val2) {
        return (val1+val2);
    }
    
    @Override
    public Integer resta(int val1, int val2) {
        return (val1-val2);
    }
    
    @Override
    public Integer multi(int val1, int val2) {
        return (val1*val2);
    }

    @Override
    public Integer div(int val1, int val2) {
        return (val1/val2);
    }
    
    @Override
    public Integer mod(int val1, int val2) {
        return (val1%val2);
    }

    @Override
    public Integer pot(int val1, int val2) {
        int a=(int)Math.pow(val1, val2);
        return a;
    }

    

    
    
    
}
