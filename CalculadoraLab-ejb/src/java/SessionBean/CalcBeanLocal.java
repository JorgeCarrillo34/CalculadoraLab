/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface CalcBeanLocal {

    Integer suma(int val1, int val2);

    Integer resta(int val1, int val2);

    Integer multi(int val1, int val2);

    Integer div(int val1, int val2);

    Integer mod(int val1, int val2);

    Integer pot(int val1, int val2);
    
}
