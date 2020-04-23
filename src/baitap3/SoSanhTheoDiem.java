/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author TrongHanh
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int kq = 0;
        if (o1.getDiemTB() > o2.getDiemTB())kq = 1;
        else if (o1.getDiemTB() < o2.getDiemTB()) kq = -1;
        return kq;
    }
}
