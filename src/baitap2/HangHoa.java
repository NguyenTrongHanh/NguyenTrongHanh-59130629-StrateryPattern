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
public class HangHoa {
    String tenHH;
    int Gia;
    String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
       this.tenHH = tenHH;
       this.Gia = gia;
       this.moTa = moTa;
    } 

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


    @Override
    public String toString() {
        return "HangHoa{" + "tenHH=" + tenHH + ", Gia=" + Gia + ", moTa=" + moTa + '}';
    }
    
    
}
