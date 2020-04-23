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
public class ThanhToanCOD implements IThanhToan
{
    @Override
    public double thanhToan(int tienHang)
    {
        double tien = 0;
        if ( tienHang > 2000000) tien =  tienHang * 0.98;
        else tien = tienHang;
        return tien;
    }
}