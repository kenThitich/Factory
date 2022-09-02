/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {
    
    public String generateMail(Customer app) {
        return app.createMail();
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        Customer app = CustomerFactory.getCustomerTypeFromUser(type);
        System.out.println(CustomerFactory.generateMail(app));        
    }
    
}