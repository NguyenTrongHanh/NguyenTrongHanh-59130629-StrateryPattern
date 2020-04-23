/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author TrongHanh
 */
public class GioHang 
{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH;

    public GioHang() {
        dsHH = new ArrayList<>();
    }

    public GioHang(ArrayList<HangHoa> dsHH) {
        this.dsHH = dsHH;
    }
    
    
    public void sethinhThucTT(IThanhToan hinhThucTT)
    {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void them(HangHoa hh)
    {
        dsHH.add(hh);
    }
     
    public double thanhToan()
    {
        int Tien = 0;
        for (int i = 0; i < dsHH.size(); i++ )
        {
            Tien += dsHH.get(i).getGia();
        }
        return hinhThucTT.thanhToan(Tien);
    }
    
    public void inDS()
    {
        for (int i = 0; i < dsHH.size(); i++ )
        {
            System.out.println(dsHH.get(i).toString());
        }
    }
}
