/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author jinah
 */
public class AMember {

    private int membernum , mhobby;
    private String mid, mpwd, mname, mloc, mjumin, mgender,mdate;
    
    
    public int getMembernum() {
        return membernum;
    }

    public void setMembernum(int membernum) {
        this.membernum = membernum;
    }

    public int getMhobby() {
        return mhobby;
    }

    public void setMhobby(int mhobby) {
        this.mhobby = mhobby;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMloc() {
        return mloc;
    }

    public void setMloc(String mloc) {
        this.mloc = mloc;
    }

    public String getMjumin() {
        return mjumin;
    }

    public void setMjumin(String mjumin) {
        this.mjumin = mjumin;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }
}
