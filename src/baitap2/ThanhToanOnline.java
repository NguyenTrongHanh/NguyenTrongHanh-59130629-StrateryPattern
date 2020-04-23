/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author TrongHanh
 */
public class ThanhToanOnline implements IThanhToan{
    @Override
    public double thanhToan(int tienHang)
    {
        double tien = 0;
        if( tienHang < 1000000)
            tien = tienHang * 0.95;
        else tien = tienHang * 0.97;
        return tien;
    }
}
