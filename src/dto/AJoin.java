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
public class AJoin {

    private int membernum , groupnum;
    private String jdate;
    private AGroup agroup;
    private AMember amember; 

    public AGroup getAgroup() {
        return agroup;
    }

    public void setAgroup(AGroup agroup) {
        this.agroup = agroup;
    }

    public AMember getAmember() {
        return amember;
    }

    public void setAmember(AMember amember) {
        this.amember = amember;
    }
    
    
    public int getMembernum() {
        return membernum;
    }

    public void setMembernum(int membernum) {
        this.membernum = membernum;
    }

    public int getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(int groupnum) {
        this.groupnum = groupnum;
    }

    public String getJdate() {
        return jdate;
    }

    public void setJdate(String jdate) {
        this.jdate = jdate;
    }
}
