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
public class Main {
    public static void main(String[] args) {
 

        GioHang gh = new GioHang();
        gh.sethinhThucTT(new ThanhToanOnline());
        gh.them(new HangHoa("Bánh hẹ", 1000000, "Dài"));
        gh.them(new HangHoa("Bánh bò", 451000, "Vuông"));
        gh.them(new HangHoa("Bánh phu thê", 510000, "Vuông"));
        gh.them(new HangHoa("Bánh mì", 120000, "Dài"));
        gh.inDS();
        System.out.println("Tổng tiền phải thanh toán: " + gh.thanhToan());
        
        GioHang gh2 = new GioHang();
        gh2.sethinhThucTT(new ThanhToanCOD());
        gh2.them(new HangHoa("Kẹo kéo", 127000, "dài"));
        gh2.them(new HangHoa("Kẹo dẻo", 127000, "tam giác"));
        gh2.them(new HangHoa("Kẹo me", 127000, "tròn"));
        gh2.inDS();
        System.out.println("Tổng tiền thanh toán: " + gh2.thanhToan());
    }
}
