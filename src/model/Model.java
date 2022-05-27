
package model;

import dao.ADao;
import dto.AGroup;
import dto.AJoin;
import dto.AMember;
import dto.Board;
import dto.BoardComm;
import java.util.ArrayList;



public class Model {

     // 회원가입 
    public void joinMemberMd(AMember vo) {
        ADao.getDao().joinMember(vo);
    }
     //로그인
    public AMember loginMd( AMember vo,String id) {
       return ADao.getDao().login(vo,id);
    }
    //로그인id - pwd 체크
    public int checkIdMd(String id, String pwd){
        return ADao.getDao().checkId(id, pwd);
    }
    //그룹만들기
     public void addGroupMd(AMember ref , AGroup ref2){
         ADao.getDao().addGroup(ref, ref2);
     }
     // 메인페이지 그룹 리스트
      public ArrayList<AGroup> groupListMd(AMember ref) {
          return ADao.getDao().groupList(ref);
      }
       //모임 이름검색하기
    public ArrayList<AGroup> detailGroup(String gname){
        return ADao.getDao().detailGroup(gname);
    }
    //모임 가입하기
    public void joinMd(AMember lUInfo,AGroup conGroup){// loginUserInfo - iuinInfo // contected Group - conGroup
        ADao.getDao().join(lUInfo, conGroup);
    }
    //모임 번호 입력후 버튼 클릭 후 모임페이지에 대한 
    //상세 정보를  가져오는 Dao 
    public AGroup enterGroupMd(AGroup group){
        return ADao.getDao().EnterGroup(group);
    }
    
    //모임 상세페이지에서 모임에 가입한 맴버를 표시하는 테이블
     public ArrayList<AJoin> listGroupMd(int num){
         return ADao.getDao().listGroup(num);
     }
     // 내 정보 변경 (@author 현진)
     public void updateMyInfoMd(AMember ref, String mloc, int mhobby){
         ADao.getDao().updateMyInfo(ref, mloc, mhobby);
     }
     
     // 내가 가입한 모임 리스트 불러오기 (@author 현진)
     public ArrayList<AJoin> listMyGroupMd(int num) {
         return ADao.getDao().listMyGroup(num);
     }
     // 게시글 입력
     public void addBoardMd(Board b,AJoin aj){
         ADao.getDao().addBoard(b,aj);
     }
     // 게시판 글 목록 출력
     public ArrayList<Board> listBoardMd(AGroup num){
         return ADao.getDao().listBoard(num);
     }
     // 게시글 상세내용 출력
     public Board getDetail(Board a) {
         return ADao.getDao().getDetailBoard(a);
     }
     
     //댓글 달기
       public void addCommMd(BoardComm bc,AJoin aj){
         ADao.getDao().addComment(bc,aj);
     }
     //댓글 출력
       public ArrayList<BoardComm> getDetailBoardCommMd(BoardComm bc){
           return ADao.getDao().getDetailBoardComm(bc);
       }
}
