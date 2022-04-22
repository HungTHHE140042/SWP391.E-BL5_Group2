/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author trinh
 */
public class Calculate {

    public static double calculateSellPrice(double originalPrice, double salePercent) {
        if (salePercent != 0) {
            originalPrice = (originalPrice / 100) * (100 - salePercent);
        } else if (salePercent > 100) {
            return 0;
        } else {
            return originalPrice;
        }
        return originalPrice;
    }
}
