package front;

import dto.AGroup;
import dto.AJoin;
import model.Model;
import dto.AMember;
import dto.Board;
import dto.BoardComm;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Asemi_ui_1 extends javax.swing.JFrame {
    private CardLayout card;
    private Model md;
    private AMember ref;
    private AGroup conntectedmoim;
    private Board board;
    /**
     * Creates new form Asemi_ui
     */
    public Asemi_ui_1() {
        initComponents();
        card = (CardLayout) pp.getLayout();
        md = new Model();
        //amember = new AMember();
    }
    //메인페이지 그룹 리스트 jtable 메서드
    public void groupList(ArrayList<AGroup> b) {
        ArrayList<AGroup> a = b;
        String[] columnNames = {"모임번호", "이름","취미","지역"};
        Object[][] data = new Object[a.size()][];
        int i = 0;
        for(AGroup e : a){
            data[i] = new Object[4];
            data[i][0] = e.getGroupnum();
            data[i][1] = e.getGname();
            data[i][2] = e.getGhobby();
            data[i][3] = e.getGloc();
            i++;
        }
        MyTable mt = new MyTable(columnNames, data);
        mainPrintTable.setModel(mt);
    }
    //모임에 가입된 회원 모임 내 리스트 jtable 메서드
         public void groupdetailList(ArrayList<AJoin> b) {
        ArrayList<AJoin> a = b;
        String[] columnNames = {"이름", "성별"};
        Object[][] data = new Object[a.size()][];
        int i = 0;
        for(AJoin e : a){
            data[i] = new Object[2];
            data[i][0] = e.getAmember().getMname();
            data[i][1] = e.getAgroup().getGdate();
           
            i++;
        }
        MyTable mt = new MyTable(columnNames, data);
        moimlist.setModel(mt);
    }
         
         // 내가 가입한 모임 리스트 표에 출력
        public void myGroupList(ArrayList<AJoin> b) {
        ArrayList<AJoin> a = b;
        String[] columnNames = {"모임 이름", "모임 지역", "취미 번호", "가입 일자"};
        Object[][] data = new Object[a.size()][];
        int i = 0;
        for(AJoin e : a){
            data[i] = new Object[4];
            data[i][0] = e.getAgroup().getGname();
            data[i][1] = e.getAgroup().getGloc();
            data[i][2] = e.getAgroup().getGhobby();
            data[i][3] = e.getJdate();
            i++;
        }
        MyTable mt = new MyTable(columnNames, data);
        mymoimList_table.setModel(mt);
    }
        
        // 게시판 글 목록 테이블
        public void listContent(){
            // 게시판 메인 페이지로 가는 버튼
        ArrayList<Board> list = md.listBoardMd(conntectedmoim);
        String[] cname = {"게시글번호","제목","작성자","날짜"};
        Object[][] data = new Object[list.size()][];
        int i =0;
        for(Board e : list){
            data[i] = new Object[4];
            data[i][0] = e.getBoardnum();
            data[i][1] = e.getSubject();
            data[i][2] = e.getAmember().getMname();
            data[i][3] = e.getBdate();
            i++;
        }
        MyTable mt = new MyTable(cname, data);
        board_Table.setModel(mt);
        }
        
        //댓글 목록 출력
        public void printCommentlist(BoardComm bc){
            
            ArrayList<BoardComm> alist = md.getDetailBoardCommMd(bc);
            StringBuilder sb = new StringBuilder();
            String res = "";
            for (BoardComm e : alist) {
                 sb.append(e.getAmember().getMname()).append(":").append(e.getContent()).append("\n");  
        
           }
        res = sb.toString();
        comment_area.setText(res);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        p1_login = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        log_id = new javax.swing.JTextField();
        log_pwd = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        joinBtn = new javax.swing.JButton();
        p2_adduser = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        join_pwd = new javax.swing.JTextField();
        join_id = new javax.swing.JTextField();
        join_locCom = new javax.swing.JComboBox<>();
        join_hobbyCom = new javax.swing.JComboBox<>();
        join_name1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jumin_front = new javax.swing.JTextField();
        jumin_behind = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        p3_createmoim = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmoim_name = new javax.swing.JTextField();
        cmoim_info = new javax.swing.JTextField();
        cmoimBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        main_page_Btn2 = new javax.swing.JButton();
        p4_mainpanal = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        searchword = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        moim_crea_Btn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        mainPrintTable = new javax.swing.JTable();
        tomainPanalBtn = new javax.swing.JButton();
        tomymoimPanalBtn = new javax.swing.JButton();
        hobby1Btn = new javax.swing.JButton();
        hobby2Btn = new javax.swing.JButton();
        hobby3Btn = new javax.swing.JButton();
        hobby4Byn = new javax.swing.JButton();
        hobby5Btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        searchnum = new javax.swing.JTextField();
        moim_detail_Btn = new javax.swing.JButton();
        p5_moimpage = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        moim_join_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        moim_info = new javax.swing.JTextArea();
        mainpageBtn = new javax.swing.JButton();
        moimTitle = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        moimlist = new javax.swing.JTable();
        tochatingPanalBtn = new javax.swing.JButton();
        tomoiminfoBtn = new javax.swing.JButton();
        toboardpanalBtn = new javax.swing.JButton();
        p6_boardPanal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        board_Table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        search_detail_board = new javax.swing.JTextField();
        detail_board_show_Btn = new javax.swing.JButton();
        create_board_Btn = new javax.swing.JButton();
        board_pageBtn1 = new javax.swing.JButton();
        tochatingPanalBtn1 = new javax.swing.JButton();
        tomoiminfoBtn1 = new javax.swing.JButton();
        toboardpanalBtn1 = new javax.swing.JButton();
        p7_chatingPanal = new javax.swing.JPanel();
        tochatingPanalBtn2 = new javax.swing.JButton();
        tomoiminfoBtn2 = new javax.swing.JButton();
        toboardpanalBtn2 = new javax.swing.JButton();
        search_detail_board1 = new javax.swing.JTextField();
        send_Btn = new javax.swing.JButton();
        chating_pageBtn2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        p8_createdocument_Panal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        addBoardBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        glename = new javax.swing.JTextField();
        gle = new javax.swing.JTextField();
        p9_detailGlePanal = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        board_content = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        content_name = new javax.swing.JLabel();
        board_writer_name = new javax.swing.JLabel();
        to_moimBtn = new javax.swing.JButton();
        comment_v = new javax.swing.JTextField();
        comment_addBtn = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        comment_area = new javax.swing.JTextArea();
        p10_mypagePanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        myname_v = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        myloc_v = new javax.swing.JLabel();
        update_loc_combobox = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        myhobby_v = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        update_hobby_combobox = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        mymoimList_table = new javax.swing.JTable();
        update_mypage_Btn = new javax.swing.JButton();
        tomainPanalBtn1 = new javax.swing.JButton();
        tomymoimPanalBtn1 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setLayout(new java.awt.CardLayout());

        p1_login.setBackground(new java.awt.Color(247, 228, 228));

        jLabel11.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel11.setText("LOGIN");

        jLabel1.setText("ID : ");

        jLabel2.setText("PWD : ");

        log_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_idActionPerformed(evt);
            }
        });

        loginBtn.setText("로그인");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        joinBtn.setText("회원가입");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1_loginLayout = new javax.swing.GroupLayout(p1_login);
        p1_login.setLayout(p1_loginLayout);
        p1_loginLayout.setHorizontalGroup(
            p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1_loginLayout.createSequentialGroup()
                .addGroup(p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1_loginLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p1_loginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(log_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p1_loginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(log_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p1_loginLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(loginBtn)
                        .addGap(18, 18, 18)
                        .addComponent(joinBtn))
                    .addGroup(p1_loginLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel11)))
                .addContainerGap(740, Short.MAX_VALUE))
        );
        p1_loginLayout.setVerticalGroup(
            p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1_loginLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addGap(67, 67, 67)
                .addGroup(p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(log_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(log_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(p1_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(joinBtn))
                .addContainerGap(451, Short.MAX_VALUE))
        );

        pp.add(p1_login, "c1");

        p2_adduser.setBackground(new java.awt.Color(255, 243, 253));

        jLabel3.setText("ID : ");

        jLabel4.setText("password : ");

        jLabel8.setText("지역 : ");

        jLabel10.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel10.setText("회원가입 패널");

        jLabel20.setText("취미 :");

        prevBtn.setText("< 이전 화면");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("회원가입완료");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        join_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                join_idActionPerformed(evt);
            }
        });

        join_locCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "서울", "경기", "인천", "그외" }));

        join_hobbyCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "취미1", "취미2", "취미3", "취미4", "취미5" }));

        jLabel22.setText(" 이름 : ");

        jLabel23.setText("주민번호 : ");

        jLabel24.setText("-");

        javax.swing.GroupLayout p2_adduserLayout = new javax.swing.GroupLayout(p2_adduser);
        p2_adduser.setLayout(p2_adduserLayout);
        p2_adduserLayout.setHorizontalGroup(
            p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2_adduserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prevBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextBtn)
                .addGap(40, 40, 40))
            .addGroup(p2_adduserLayout.createSequentialGroup()
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p2_adduserLayout.createSequentialGroup()
                        .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p2_adduserLayout.createSequentialGroup()
                                .addComponent(jumin_front, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addGap(7, 7, 7)
                                .addComponent(jumin_behind))
                            .addComponent(join_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(p2_adduserLayout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(join_id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(p2_adduserLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2_adduserLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(join_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(199, 199, 199)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel20))
                .addGap(24, 24, 24)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(join_hobbyCom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(join_locCom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(383, Short.MAX_VALUE))
        );
        p2_adduserLayout.setVerticalGroup(
            p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2_adduserLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(join_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(join_locCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(join_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(join_hobbyCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(join_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jumin_front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumin_behind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn)
                    .addComponent(prevBtn))
                .addGap(101, 101, 101))
        );

        pp.add(p2_adduser, "c2");

        p3_createmoim.setBackground(new java.awt.Color(255, 254, 237));

        jLabel14.setBackground(new java.awt.Color(251, 248, 212));
        jLabel14.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel14.setText("모임 개설");

        jLabel16.setText("모임 이름 : ");

        jLabel15.setText("소개글 :");

        cmoimBtn.setText("모임 만들기");
        cmoimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoimBtnActionPerformed(evt);
            }
        });

        jLabel17.setText("관심사 설정 : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "취미1", "취미2", "취미3", "취미4", "취미5" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "서울", "경기", "인천", "그 외" }));

        jLabel21.setText("지역 설정 : ");

        main_page_Btn2.setText("이전 화면으로");
        main_page_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_page_Btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3_createmoimLayout = new javax.swing.GroupLayout(p3_createmoim);
        p3_createmoim.setLayout(p3_createmoimLayout);
        p3_createmoimLayout.setHorizontalGroup(
            p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3_createmoimLayout.createSequentialGroup()
                .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p3_createmoimLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(main_page_Btn2))
                    .addGroup(p3_createmoimLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p3_createmoimLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cmoim_info, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p3_createmoimLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmoim_name))
                            .addGroup(p3_createmoimLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                        .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p3_createmoimLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p3_createmoimLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addComponent(cmoimBtn)
                .addGap(60, 60, 60))
        );
        p3_createmoimLayout.setVerticalGroup(
            p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3_createmoimLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3_createmoimLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cmoim_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmoim_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p3_createmoimLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(137, 137, 137)
                .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmoimBtn)
                    .addComponent(main_page_Btn2))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        pp.add(p3_createmoim, "c3");

        p4_mainpanal.setBackground(new java.awt.Color(225, 229, 251));

        jLabel18.setText("검색단어 :");

        searchword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchwordActionPerformed(evt);
            }
        });

        searchBtn.setText("검색");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        moim_crea_Btn.setText("+모임개설");
        moim_crea_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moim_crea_BtnActionPerformed(evt);
            }
        });

        mainPrintTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(mainPrintTable);

        tomainPanalBtn.setText("소모임");

        tomymoimPanalBtn.setText("내 모임");
        tomymoimPanalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomymoimPanalBtnActionPerformed(evt);
            }
        });

        hobby1Btn.setText("취미1");

        hobby2Btn.setText("취미2");

        hobby3Btn.setText("취미3");

        hobby4Byn.setText("취미4");

        hobby5Btn.setText("취미5");

        logout_btn.setText("로그아웃");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        jLabel6.setText("모임 번호 : ");

        moim_detail_Btn.setText("모임 상세보기");
        moim_detail_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moim_detail_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p4_mainpanalLayout = new javax.swing.GroupLayout(p4_mainpanal);
        p4_mainpanal.setLayout(p4_mainpanalLayout);
        p4_mainpanalLayout.setHorizontalGroup(
            p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4_mainpanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4_mainpanalLayout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addComponent(hobby1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(hobby2Btn)
                        .addGap(18, 18, 18)
                        .addComponent(hobby3Btn)
                        .addGap(29, 29, 29)
                        .addComponent(hobby4Byn)
                        .addGap(18, 18, 18)
                        .addComponent(hobby5Btn)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(searchword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moim_crea_Btn))
                    .addComponent(jScrollPane3)))
            .addGroup(p4_mainpanalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tomainPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(tomymoimPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(logout_btn)
                .addGap(41, 41, 41))
            .addGroup(p4_mainpanalLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchnum, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(moim_detail_Btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4_mainpanalLayout.setVerticalGroup(
            p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4_mainpanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(searchBtn)
                    .addComponent(moim_crea_Btn)
                    .addComponent(hobby1Btn)
                    .addComponent(hobby2Btn)
                    .addComponent(hobby3Btn)
                    .addComponent(hobby4Byn)
                    .addComponent(hobby5Btn))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(searchnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moim_detail_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4_mainpanalLayout.createSequentialGroup()
                        .addGroup(p4_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tomymoimPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tomainPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4_mainpanalLayout.createSequentialGroup()
                        .addComponent(logout_btn)
                        .addGap(41, 41, 41))))
        );

        pp.add(p4_mainpanal, "c4");

        p5_moimpage.setBackground(new java.awt.Color(229, 252, 249));

        jLabel12.setText("모임명 : ");

        jLabel13.setText("멤버리스트");

        moim_join_Btn.setText("모임 가입하기");
        moim_join_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moim_join_BtnActionPerformed(evt);
            }
        });

        moim_info.setColumns(20);
        moim_info.setRows(5);
        moim_info.setText("여기는 모임 설명이 쓰여있는 자리 ");
        jScrollPane1.setViewportView(moim_info);

        mainpageBtn.setText("메인 페이지로 돌아가기");
        mainpageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainpageBtnActionPerformed(evt);
            }
        });

        moimTitle.setText("모임명 출력자리");

        moimlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(moimlist);

        tochatingPanalBtn.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        tochatingPanalBtn.setText("회원다중채팅");

        tomoiminfoBtn.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        tomoiminfoBtn.setText("정보");
        tomoiminfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomoiminfoBtnActionPerformed(evt);
            }
        });

        toboardpanalBtn.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        toboardpanalBtn.setText("게시판");
        toboardpanalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toboardpanalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p5_moimpageLayout = new javax.swing.GroupLayout(p5_moimpage);
        p5_moimpage.setLayout(p5_moimpageLayout);
        p5_moimpageLayout.setHorizontalGroup(
            p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5_moimpageLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p5_moimpageLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5_moimpageLayout.createSequentialGroup()
                        .addGroup(p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(p5_moimpageLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p5_moimpageLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(moim_join_Btn))
                                    .addGroup(p5_moimpageLayout.createSequentialGroup()
                                        .addComponent(moimTitle)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(45, 45, 45))
                    .addGroup(p5_moimpageLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5_moimpageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainpageBtn)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5_moimpageLayout.createSequentialGroup()
                .addComponent(tomoiminfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toboardpanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tochatingPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p5_moimpageLayout.setVerticalGroup(
            p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5_moimpageLayout.createSequentialGroup()
                .addGroup(p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tomoiminfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toboardpanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tochatingPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 102, Short.MAX_VALUE)
                .addGroup(p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moim_join_Btn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5_moimpageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(p5_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(moimTitle))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(mainpageBtn)
                .addGap(91, 91, 91))
        );

        pp.add(p5_moimpage, "c5");

        board_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(board_Table);

        jLabel5.setText("상세 게시글 선택 창 :");

        detail_board_show_Btn.setText("상세게시글보기");
        detail_board_show_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detail_board_show_BtnActionPerformed(evt);
            }
        });

        create_board_Btn.setText("+게시글작성");
        create_board_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_board_BtnActionPerformed(evt);
            }
        });

        board_pageBtn1.setText("메인 페이지로 돌아가기");
        board_pageBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board_pageBtn1ActionPerformed(evt);
            }
        });

        tochatingPanalBtn1.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        tochatingPanalBtn1.setText("회원다중채팅");

        tomoiminfoBtn1.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        tomoiminfoBtn1.setText("정보");
        tomoiminfoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomoiminfoBtn1ActionPerformed(evt);
            }
        });

        toboardpanalBtn1.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        toboardpanalBtn1.setText("게시판");

        javax.swing.GroupLayout p6_boardPanalLayout = new javax.swing.GroupLayout(p6_boardPanal);
        p6_boardPanal.setLayout(p6_boardPanalLayout);
        p6_boardPanalLayout.setHorizontalGroup(
            p6_boardPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6_boardPanalLayout.createSequentialGroup()
                .addGroup(p6_boardPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p6_boardPanalLayout.createSequentialGroup()
                        .addComponent(tomoiminfoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toboardpanalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tochatingPanalBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p6_boardPanalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p6_boardPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p6_boardPanalLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(search_detail_board, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(detail_board_show_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(create_board_Btn)
                                .addGap(3, 3, 3))
                            .addComponent(board_pageBtn1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        p6_boardPanalLayout.setVerticalGroup(
            p6_boardPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6_boardPanalLayout.createSequentialGroup()
                .addGroup(p6_boardPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomoiminfoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toboardpanalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tochatingPanalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(p6_boardPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(search_detail_board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detail_board_show_Btn)
                    .addComponent(create_board_Btn))
                .addGap(18, 18, 18)
                .addComponent(board_pageBtn1)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pp.add(p6_boardPanal, "c6");

        tochatingPanalBtn2.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        tochatingPanalBtn2.setText("회원다중채팅");

        tomoiminfoBtn2.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        tomoiminfoBtn2.setText("정보");
        tomoiminfoBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomoiminfoBtn2ActionPerformed(evt);
            }
        });

        toboardpanalBtn2.setFont(new java.awt.Font("굴림", 0, 48)); // NOI18N
        toboardpanalBtn2.setText("게시판");

        send_Btn.setText("전송");

        chating_pageBtn2.setText("메인 페이지로 돌아가기");
        chating_pageBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chating_pageBtn2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout p7_chatingPanalLayout = new javax.swing.GroupLayout(p7_chatingPanal);
        p7_chatingPanal.setLayout(p7_chatingPanalLayout);
        p7_chatingPanalLayout.setHorizontalGroup(
            p7_chatingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7_chatingPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p7_chatingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p7_chatingPanalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chating_pageBtn2)
                        .addGap(25, 25, 25))
                    .addGroup(p7_chatingPanalLayout.createSequentialGroup()
                        .addGroup(p7_chatingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p7_chatingPanalLayout.createSequentialGroup()
                                .addComponent(search_detail_board1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(send_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jScrollPane5)
                            .addGroup(p7_chatingPanalLayout.createSequentialGroup()
                                .addComponent(tomoiminfoBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toboardpanalBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tochatingPanalBtn2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        p7_chatingPanalLayout.setVerticalGroup(
            p7_chatingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7_chatingPanalLayout.createSequentialGroup()
                .addGroup(p7_chatingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomoiminfoBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toboardpanalBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tochatingPanalBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(p7_chatingPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_detail_board1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send_Btn))
                .addGap(18, 18, 18)
                .addComponent(chating_pageBtn2)
                .addGap(22, 22, 22))
        );

        pp.add(p7_chatingPanal, "c7");

        jButton1.setText("<게시판으로");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addBoardBtn.setText("등록");
        addBoardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoardBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("제목 :");

        jLabel19.setText("내용 :");

        javax.swing.GroupLayout p8_createdocument_PanalLayout = new javax.swing.GroupLayout(p8_createdocument_Panal);
        p8_createdocument_Panal.setLayout(p8_createdocument_PanalLayout);
        p8_createdocument_PanalLayout.setHorizontalGroup(
            p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8_createdocument_PanalLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p8_createdocument_PanalLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(330, 330, 330)
                        .addComponent(addBoardBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p8_createdocument_PanalLayout.createSequentialGroup()
                        .addGroup(p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel19))
                        .addGap(27, 27, 27)
                        .addGroup(p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gle, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(glename))))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        p8_createdocument_PanalLayout.setVerticalGroup(
            p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8_createdocument_PanalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(addBoardBtn))
                .addGap(58, 58, 58)
                .addGroup(p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(glename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(p8_createdocument_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(gle, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pp.add(p8_createdocument_Panal, "c8");

        board_content.setColumns(20);
        board_content.setRows(5);
        jScrollPane6.setViewportView(board_content);

        jLabel25.setText("작성자 : ");

        jLabel26.setText("게시글 제목 : ");

        content_name.setText("게시글 제목이 들어가는 곳");

        board_writer_name.setText("작성자 이름");

        to_moimBtn.setText("< 뒤로가기");
        to_moimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_moimBtnActionPerformed(evt);
            }
        });

        comment_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comment_vActionPerformed(evt);
            }
        });

        comment_addBtn.setText("댓글 등록");
        comment_addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comment_addBtnActionPerformed(evt);
            }
        });

        jLabel27.setText("댓글창");

        comment_area.setColumns(20);
        comment_area.setRows(5);
        jScrollPane9.setViewportView(comment_area);

        javax.swing.GroupLayout p9_detailGlePanalLayout = new javax.swing.GroupLayout(p9_detailGlePanal);
        p9_detailGlePanal.setLayout(p9_detailGlePanalLayout);
        p9_detailGlePanalLayout.setHorizontalGroup(
            p9_detailGlePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9_detailGlePanalLayout.createSequentialGroup()
                .addGroup(p9_detailGlePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p9_detailGlePanalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(board_writer_name)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(content_name))
                    .addGroup(p9_detailGlePanalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(p9_detailGlePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27)
                            .addGroup(p9_detailGlePanalLayout.createSequentialGroup()
                                .addComponent(comment_v, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(comment_addBtn)
                                .addGap(11, 11, 11))
                            .addComponent(to_moimBtn)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane9))))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        p9_detailGlePanalLayout.setVerticalGroup(
            p9_detailGlePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9_detailGlePanalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(to_moimBtn)
                .addGap(89, 89, 89)
                .addGroup(p9_detailGlePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(content_name)
                    .addComponent(board_writer_name))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p9_detailGlePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comment_addBtn)
                    .addComponent(comment_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pp.add(p9_detailGlePanal, "c9");

        jLabel28.setFont(new java.awt.Font("굴림", 0, 36)); // NOI18N
        jLabel28.setText("나의 정보");

        jLabel29.setText("내 이름 : ");

        myname_v.setText("[ 이 름 ]");

        jLabel31.setText("내가 선택한 지역 : ");

        myloc_v.setText("[ 지 역 ]");

        update_loc_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "서울", "경기", "인천", "그 외" }));

        jLabel33.setText("변경 할 지역 : ");

        jLabel34.setText("내가 선택한 취미 : ");

        myhobby_v.setText("[ 취 미 ]");

        jLabel36.setText("변경 할 취미 : ");

        update_hobby_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "취미1", "취미2", "취미3", "취미4", "취미5" }));

        jLabel37.setText("내가 가입한 모임");

        mymoimList_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(mymoimList_table);

        update_mypage_Btn.setText("변경 내용 저장");
        update_mypage_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_mypage_BtnActionPerformed(evt);
            }
        });

        tomainPanalBtn1.setFont(new java.awt.Font("굴림", 0, 36)); // NOI18N
        tomainPanalBtn1.setText("소모임");
        tomainPanalBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomainPanalBtn1ActionPerformed(evt);
            }
        });

        tomymoimPanalBtn1.setFont(new java.awt.Font("굴림", 0, 36)); // NOI18N
        tomymoimPanalBtn1.setText("내 정보 보기");
        tomymoimPanalBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomymoimPanalBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p10_mypagePanelLayout = new javax.swing.GroupLayout(p10_mypagePanel);
        p10_mypagePanel.setLayout(p10_mypagePanelLayout);
        p10_mypagePanelLayout.setHorizontalGroup(
            p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_mypage_Btn))
                    .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p10_mypagePanelLayout.createSequentialGroup()
                                .addComponent(tomainPanalBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tomymoimPanalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(myloc_v))
                                    .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(18, 18, 18)
                                        .addComponent(myhobby_v))
                                    .addComponent(jLabel37))
                                .addGap(143, 143, 143)
                                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(update_hobby_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(update_loc_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(myname_v)))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        p10_mypagePanelLayout.setVerticalGroup(
            p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10_mypagePanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(update_mypage_Btn))
                .addGap(38, 38, 38)
                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(myname_v))
                .addGap(31, 31, 31)
                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(myloc_v)
                    .addComponent(update_loc_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(35, 35, 35)
                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(myhobby_v)
                    .addComponent(jLabel36)
                    .addComponent(update_hobby_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(p10_mypagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomymoimPanalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tomainPanalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pp.add(p10_mypagePanel, "c10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_idActionPerformed
    //회원가입 페이지 이동버튼
    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
        card.show(pp, "c2");
    }//GEN-LAST:event_joinBtnActionPerformed

    private void join_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_join_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_join_idActionPerformed

    private void searchwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchwordActionPerformed
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // 모임 검색하기
        String res = searchword.getText();
        groupList(md.detailGroup(res));

    }//GEN-LAST:event_searchBtnActionPerformed
    //모임 개설 페이지로 이동 버튼
    private void moim_crea_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moim_crea_BtnActionPerformed
        card.show(pp, "c3");
    }//GEN-LAST:event_moim_crea_BtnActionPerformed
    //id, pwd 입력 후 로그인하는 버튼
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
       ref = new AMember();
       String id = log_id.getText();
       String pwd = log_pwd.getText();
       //checkIdMd ( id,pwd 체크 true = return 1 , false = return 0 , 체크할 값이 없다면 -1)
        int a = md.checkIdMd(id, pwd);        
        if(a==1){
            //checkIdMd -> return 1일경우
        ref = md.loginMd(ref,id); //loginMd (memberdto에 id에 해당하는 유저의 정보를 받아 저장합니다) 
        JOptionPane.showMessageDialog(this, "환영합니다","로그인 성공!" , JOptionPane.INFORMATION_MESSAGE);
        groupList(md.groupListMd(ref));//groupListMd -> 유저의 정보 중 취미에 해당하는 번호를 우선순위로 메인페이지에 출력하는 메서드입니다
        card.show(pp, "c4");
        }else if(a ==0){
            JOptionPane.showMessageDialog(this, "아이디와 비밀번호가 불일치합니다.","로그인 실패!",JOptionPane.ERROR_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this, "아이디가 없습니다.","???",JOptionPane.ERROR_MESSAGE);
        }
  
    }//GEN-LAST:event_loginBtnActionPerformed
    //회원가입 페이지에서 로그인 화면으로 이동하는 화면 버튼
    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        card.show(pp, "c1");
        log_id.setText("");
        log_pwd.setText("");
    }//GEN-LAST:event_prevBtnActionPerformed

    
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
       //회원가입완료 버튼
        try {        
        if(join_id.getText().trim().split(" ").length !=1 || join_pwd.getText().trim().split(" ").length !=1
           || join_name1.getText().split(" ").length !=1 || jumin_front.getText().split(" ").length !=1
           || jumin_behind.getText().split(" ").length !=1
                ){
            throw new NotSpace();
        }
        Integer.parseInt(jumin_front.getText());
        Integer.parseInt(jumin_behind.getText());
        if(jumin_front.getText().length()!=6 || jumin_behind.getText().length()!=7){
        throw new Jumin();
        }
        AMember mem = new AMember();
        mem.setMid(join_id.getText().trim());
        mem.setMpwd(join_pwd.getText().trim());
        mem.setMname(join_name1.getText().trim());
        mem.setMloc((String) join_locCom.getSelectedItem());
        mem.setMjumin(jumin_front.getText().trim()+ jLabel24.getText()+jumin_behind.getText().trim());
        mem.setMhobby(join_hobbyCom.getSelectedIndex()+1);
        md.joinMemberMd(mem);
        JOptionPane.showMessageDialog(rootPane, "회원가입이 완료되었습니다!","환영합니다",JOptionPane.INFORMATION_MESSAGE);
        card.show(pp,"c1");
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(rootPane, "주민번호를 제대로 입력하세요","경고!!",JOptionPane.ERROR_MESSAGE);
        } catch(Jumin e){
           JOptionPane.showMessageDialog(rootPane, "주민번호자릿수가 맞지 않습니다","경고!!",JOptionPane.ERROR_MESSAGE);
        } catch(NotSpace e){
           JOptionPane.showMessageDialog(rootPane, "공백을 입력할수 없습니다","경고!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nextBtnActionPerformed
   
    private void mainpageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainpageBtnActionPerformed
        //모임상세페이지에서 메인페이지로 이동하는 버튼
        card.show(pp, "c4");
    }//GEN-LAST:event_mainpageBtnActionPerformed

    private void cmoimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoimBtnActionPerformed
       //모임 개설하기 버튼
        AGroup a = new AGroup();

        a.setGname(cmoim_name.getText());
        a.setGinfo(cmoim_info.getText());

        md.addGroupMd(ref, a);
        //addGroupMd -> 모임 개설하기 메서드(ref = 모임을 만드는 회원의 정보를 가지고 )
        
        groupList(md.groupListMd(ref));

        card.show(pp,"c4");
    }//GEN-LAST:event_cmoimBtnActionPerformed
   
    private void moim_join_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moim_join_BtnActionPerformed
         //회원이 모임을 가입할 수 있는 버튼
        md.joinMd(ref,conntectedmoim );
        
        groupdetailList(md.listGroupMd(Integer.parseInt(searchnum.getText())));
        System.out.println(conntectedmoim.getGroupnum());
    }//GEN-LAST:event_moim_join_BtnActionPerformed
    // 내 정보 확인 페이지 이동 버튼(mypage)
    private void tomymoimPanalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomymoimPanalBtnActionPerformed
        myname_v.setText(ref.getMname());
        myloc_v.setText(ref.getMloc());
        myhobby_v.setText(String.valueOf(ref.getMhobby()));
        
        myGroupList(md.listMyGroupMd(ref.getMembernum()));
        card.show(pp, "c10");
    }//GEN-LAST:event_tomymoimPanalBtnActionPerformed
    //메인페이지에서 로그아웃 버튼
    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        
        card.show(pp, "c1");
    }//GEN-LAST:event_logout_btnActionPerformed
    private void moim_detail_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moim_detail_BtnActionPerformed
            //모임 번호로 search한 모임 상세페이지 이동버튼
        int moimnum = Integer.parseInt(searchnum.getText().trim()) ;
        conntectedmoim = new AGroup();
        conntectedmoim.setGroupnum(moimnum);
        conntectedmoim = md.enterGroupMd(conntectedmoim);
        moimTitle.setText(conntectedmoim.getGname());
        moim_info.setText(conntectedmoim.getGinfo());
        groupdetailList(md.listGroupMd(Integer.parseInt(searchnum.getText())));
        
        
        card.show(pp, "c5");
    }//GEN-LAST:event_moim_detail_BtnActionPerformed

    private void main_page_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_page_Btn2ActionPerformed
        card.show(pp, "c4");
    }//GEN-LAST:event_main_page_Btn2ActionPerformed

    private void tomoiminfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomoiminfoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tomoiminfoBtnActionPerformed
// 모임페이지에서 메인메이지로
    private void board_pageBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board_pageBtn1ActionPerformed
        card.show(pp, "c4");
    }//GEN-LAST:event_board_pageBtn1ActionPerformed

    private void tomoiminfoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomoiminfoBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tomoiminfoBtn1ActionPerformed

    private void tomoiminfoBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomoiminfoBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tomoiminfoBtn2ActionPerformed

    private void chating_pageBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chating_pageBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chating_pageBtn2ActionPerformed

    private void tomymoimPanalBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomymoimPanalBtn1ActionPerformed
        card.show(pp, "c10");
    }//GEN-LAST:event_tomymoimPanalBtn1ActionPerformed
    // 내 정보 변경 버튼
    private void update_mypage_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_mypage_BtnActionPerformed
        String mloc = (String) update_loc_combobox.getSelectedItem();
        int mhobby = update_hobby_combobox.getSelectedIndex()+1;       
        md.updateMyInfoMd(ref, mloc, mhobby);
        
        myname_v.setText(ref.getMname());
        myloc_v.setText(ref.getMloc());
        myhobby_v.setText(String.valueOf(ref.getMhobby()));
        JOptionPane.showMessageDialog(rootPane, "회원 정보가 변경되었습니다.");
    }//GEN-LAST:event_update_mypage_BtnActionPerformed

    private void tomainPanalBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomainPanalBtn1ActionPerformed
        card.show(pp, "c4");
    }//GEN-LAST:event_tomainPanalBtn1ActionPerformed

    private void create_board_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_board_BtnActionPerformed
       // 게시글 작성 페이지 이동
       card.show(pp, "c8");
    }//GEN-LAST:event_create_board_BtnActionPerformed

    private void addBoardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoardBtnActionPerformed
        // 게시글 작성 버튼
        AJoin aj = new AJoin();
        aj.setAmember(ref);
        aj.setAgroup(conntectedmoim);
        Board b = new Board();
        b.setSubject(glename.getText());
        b.setContent(gle.getText());
        md.addBoardMd(b,aj);
        JOptionPane.showMessageDialog(rootPane, "게시글이 작성되었습니다.");
        listContent();
        card.show(pp, "c6");
    }//GEN-LAST:event_addBoardBtnActionPerformed
    // 게시판 목록으로 이동하는 버튼
    private void toboardpanalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toboardpanalBtnActionPerformed
        listContent();
        card.show(pp, "c6");
    }//GEN-LAST:event_toboardpanalBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 게시판 메인 페이지로 가는 버튼
        card.show(pp, "c6");
    }//GEN-LAST:event_jButton1ActionPerformed
    // 상세 게시글 보기
    private void detail_board_show_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detail_board_show_BtnActionPerformed
        board = new Board();
        board.setBoardnum(Integer.parseInt(search_detail_board.getText()));
        board = md.getDetail(board);
        board_writer_name.setText(board.getAmember().getMname());
        content_name.setText(board.getSubject());
        board_content.setText(board.getContent());
        
        
        card.show(pp, "c9");
        
    }//GEN-LAST:event_detail_board_show_BtnActionPerformed
 // 게시글 상세보기에서 게시글 목록으로 뒤로가는 버튼
    private void to_moimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_moimBtnActionPerformed
        card.show(pp, "c6");
    }//GEN-LAST:event_to_moimBtnActionPerformed

    private void comment_addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comment_addBtnActionPerformed
       //댓글 등록,출력버튼 
        AJoin aj = new AJoin();
        aj.setAmember(ref);
        aj.setAgroup(conntectedmoim);
        BoardComm bc = new BoardComm();
        bc.setBo(board);
        bc.setContent(comment_v.getText());
        md.addCommMd(bc, aj);
        JOptionPane.showMessageDialog(rootPane, "댓글이 작성되었습니다.");
    }//GEN-LAST:event_comment_addBtnActionPerformed

    private void comment_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comment_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comment_vActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Asemi_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asemi_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asemi_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asemi_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asemi_ui_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoardBtn;
    private javax.swing.JTable board_Table;
    private javax.swing.JTextArea board_content;
    private javax.swing.JButton board_pageBtn1;
    private javax.swing.JLabel board_writer_name;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chating_pageBtn2;
    private javax.swing.JButton cmoimBtn;
    private javax.swing.JTextField cmoim_info;
    private javax.swing.JTextField cmoim_name;
    private javax.swing.JButton comment_addBtn;
    private javax.swing.JTextArea comment_area;
    private javax.swing.JTextField comment_v;
    private javax.swing.JLabel content_name;
    private javax.swing.JButton create_board_Btn;
    private javax.swing.JButton detail_board_show_Btn;
    private javax.swing.JTextField gle;
    private javax.swing.JTextField glename;
    private javax.swing.JButton hobby1Btn;
    private javax.swing.JButton hobby2Btn;
    private javax.swing.JButton hobby3Btn;
    private javax.swing.JButton hobby4Byn;
    private javax.swing.JButton hobby5Btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton joinBtn;
    private javax.swing.JComboBox<String> join_hobbyCom;
    private javax.swing.JTextField join_id;
    private javax.swing.JComboBox<String> join_locCom;
    private javax.swing.JTextField join_name1;
    private javax.swing.JTextField join_pwd;
    private javax.swing.JTextField jumin_behind;
    private javax.swing.JTextField jumin_front;
    private javax.swing.JTextField log_id;
    private javax.swing.JTextField log_pwd;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logout_btn;
    private javax.swing.JTable mainPrintTable;
    private javax.swing.JButton main_page_Btn2;
    private javax.swing.JButton mainpageBtn;
    private javax.swing.JLabel moimTitle;
    private javax.swing.JButton moim_crea_Btn;
    private javax.swing.JButton moim_detail_Btn;
    private javax.swing.JTextArea moim_info;
    private javax.swing.JButton moim_join_Btn;
    private javax.swing.JTable moimlist;
    private javax.swing.JLabel myhobby_v;
    private javax.swing.JLabel myloc_v;
    private javax.swing.JTable mymoimList_table;
    private javax.swing.JLabel myname_v;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel p10_mypagePanel;
    private javax.swing.JPanel p1_login;
    private javax.swing.JPanel p2_adduser;
    private javax.swing.JPanel p3_createmoim;
    private javax.swing.JPanel p4_mainpanal;
    private javax.swing.JPanel p5_moimpage;
    private javax.swing.JPanel p6_boardPanal;
    private javax.swing.JPanel p7_chatingPanal;
    private javax.swing.JPanel p8_createdocument_Panal;
    private javax.swing.JPanel p9_detailGlePanal;
    private javax.swing.JPanel pp;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField search_detail_board;
    private javax.swing.JTextField search_detail_board1;
    private javax.swing.JTextField searchnum;
    private javax.swing.JTextField searchword;
    private javax.swing.JButton send_Btn;
    private javax.swing.JButton to_moimBtn;
    private javax.swing.JButton toboardpanalBtn;
    private javax.swing.JButton toboardpanalBtn1;
    private javax.swing.JButton toboardpanalBtn2;
    private javax.swing.JButton tochatingPanalBtn;
    private javax.swing.JButton tochatingPanalBtn1;
    private javax.swing.JButton tochatingPanalBtn2;
    private javax.swing.JButton tomainPanalBtn;
    private javax.swing.JButton tomainPanalBtn1;
    private javax.swing.JButton tomoiminfoBtn;
    private javax.swing.JButton tomoiminfoBtn1;
    private javax.swing.JButton tomoiminfoBtn2;
    private javax.swing.JButton tomymoimPanalBtn;
    private javax.swing.JButton tomymoimPanalBtn1;
    private javax.swing.JComboBox<String> update_hobby_combobox;
    private javax.swing.JComboBox<String> update_loc_combobox;
    private javax.swing.JButton update_mypage_Btn;
    // End of variables declaration//GEN-END:variables
}
