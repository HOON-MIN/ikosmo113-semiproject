/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 *BOARDNUM  NOT NULL NUMBER        
MEMBERNUM NOT NULL NUMBER        
SUBJECT   NOT NULL VARCHAR2(100) 
CONTENT   NOT NULL VARCHAR2(100) 
GROUPNUM  NOT NULL NUMBER        
BDATE              DATE    
 */
public class Board {
    private int boardnum,membernum,groupnum;
    private String subject,content,bdate;
    private AMember amember;

   

    public AMember getAmember() {
        return amember;
    }

    public void setAmember(AMember amember) {
        this.amember = amember;
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

    public int getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(int groupnum) {
        this.groupnum = groupnum;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }
    
}
