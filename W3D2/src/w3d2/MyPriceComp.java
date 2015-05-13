/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2;

import java.util.Comparator;

/**
 *
 * @author mena
 */
public class MyPriceComp implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if(o1.getVehiclePrice() > o2.getVehiclePrice()){
            return 1;
        } else {
            return -1;
        }

    }
    
}
