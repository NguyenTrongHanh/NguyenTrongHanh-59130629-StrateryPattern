/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author TrongHanh
 */
public class Context {
    ITinh tinhToan;
    public void settinhtoan(ITinh tinhToan)
    {
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b)
    {
        return tinhToan.tinh(a, b);
    }
    public static void main(String[] args) {
        Context ct = new Context();
        ct.settinhtoan(new Cong());
        System.out.println("75 + 12 = " + ct.tinh(75, 12));
        ct.settinhtoan(new Tru());
        System.out.println("54 - 78 = " + ct.tinh(54, 78));
    }
            
}
