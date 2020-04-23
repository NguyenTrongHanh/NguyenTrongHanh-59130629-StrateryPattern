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
public class QLSV 
{
    ArrayList<SinhVien> dsSV;
    ISoSanh ss;

    public QLSV() {
        dsSV = new ArrayList<>();
    }

    public QLSV(ArrayList<SinhVien> dsSinhVien) {
        this.dsSV = dsSinhVien;
    }
    

    public void setSoSanh(ISoSanh soSanh) {
        this.ss = soSanh;
    }

    public void sapXep() {
        dsSV.sort((sv1, sv2) -> ss.soSanh(sv1, sv2));
    }

    public void inDsSV() {
        for (int i = 0; i < dsSV.size(); i++) {
            System.out.println(dsSV.get(i).toString());
        }
    }
}
