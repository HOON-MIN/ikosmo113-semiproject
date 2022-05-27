/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * COMMNUM   NOT NULL NUMBER        
BOARDNUM  NOT NULL NUMBER        
MEMBERNUM NOT NULL NUMBER        
CONTENT   NOT NULL VARCHAR2(100) 
CDATE              DATE
 */
public class BoardComm {
    private int commnum,boardnum,membernum;
    private String content,cdate;
    private Board bo;
    private AMember amember;

    public AMember getAmember() {
        return amember;
    }

    public void setAmember(AMember amember) {
        this.amember = amember;
    }

    public Board getBo() {
        return bo;
    }

    public void setBo(Board bo) {
        this.bo = bo;
    }
    
    public int getCommnum() {
        return commnum;
    }

    public void setCommnum(int commnum) {
        this.commnum = commnum;
    }

    public int getBoardnum() {
        return boardnum;
    }

    public void setBoardnum(int boardnum) {
        this.boardnum = boardnum;
    }

    public int getMembernum() {
        return membernum;
    }

    public void setMembernum(int membernum) {
        this.membernum = membernum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }
    
}
