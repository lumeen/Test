/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author prezes
 */
@Named(value = "carService")
@Dependent
public class CarService {

    /**
     * Creates a new instance of CarService
     */
    public CarService() {
    }
    
}
