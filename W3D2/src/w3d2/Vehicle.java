/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2;

import java.util.TreeSet;

/**
 *
 * @author mena
 */
public class Vehicle {

    private String VehicleName;
    private int VehiclePrice;
    private int VehicleModel;

    public Vehicle(String VN, int VP, int VM) {
        VehicleName = VN;
        VehiclePrice = VP;
        VehicleModel = VM;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public int getVehiclePrice() {
        return VehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        VehiclePrice = vehiclePrice;
    }

    public int getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(int vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public String toString() {
        return "VehicleName: " + " " + VehicleName + " VehiclePrice: " + " " + VehiclePrice + " Vehiclemodel:   " + "  " + VehicleModel;
    }

    public static void main(String a[]) {

        TreeSet<Vehicle> priceComp = new TreeSet<Vehicle>(new MyPriceComp());
        priceComp.add(new Vehicle("menna", 20, 1999));
        priceComp.add(new Vehicle("mena", 30, 1973));
        priceComp.add(new Vehicle("men", 30, 2000));
        priceComp.add(new Vehicle("me",40, 1975));

        for (Vehicle e : priceComp) {
            System.out.println(e);
        }
    }
}
