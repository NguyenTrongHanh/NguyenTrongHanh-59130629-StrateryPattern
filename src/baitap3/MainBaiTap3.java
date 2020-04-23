/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;

/**
 *
 * @author TrongHanh
 */
public class MainBaiTap3 {
    public static void main(String[] args){

        ArrayList<SinhVien> ds = new ArrayList<>();
        ds.add(new SinhVien("Nguyen Trong Hanh", "6/6/1999", (float) 6.6));
        ds.add(new SinhVien("Nguyen Trong Khanh", "22/1/1999", (float) 9.8));
        ds.add(new SinhVien("Truong Thi Thoa", "25/4/1999", (float) 10.0));
        
        QLSV ql = new QLSV(ds);
        
        ql.setSoSanh(new SoSanhTheoTen());
        ql.sapXep();
        ql.inDsSV();

        ql.setSoSanh(new SoSanhTheoDiem());
        ql.sapXep();
        ql.inDsSV();
    }
}
