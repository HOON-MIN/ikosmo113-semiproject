package front;

import dao.ADao;
import dto.AMember;
import java.awt.CardLayout;

public class Asemi_ui extends javax.swing.JFrame {
    private CardLayout card;
    /**
     * Creates new form Asemi_ui
     */
    public Asemi_ui() {
        initComponents();
        card = (CardLayout) pp.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        join_name = new javax.swing.JTextField();
        join_tel = new javax.swing.JTextField();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        join_id = new javax.swing.JTextField();
        join_pwd = new javax.swing.JTextField();
        join_locCom = new javax.swing.JComboBox<>();
        join_genderCom = new javax.swing.JComboBox<>();
        join_hobbyCom = new javax.swing.JComboBox<>();
        p3_createmoim = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmoim_name = new javax.swing.JTextField();
        cmoim_info = new javax.swing.JTextField();
        cmoimBtn = new javax.swing.JButton();
        p4_moimpage = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jmoimBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        moim_info = new javax.swing.JTextArea();
        logoutBtn = new javax.swing.JButton();
        moimTitle = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        moimlist = new javax.swing.JTable();
        p5_mainpanal = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setLayout(new java.awt.CardLayout());

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
                .addContainerGap(626, Short.MAX_VALUE))
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
                .addContainerGap(471, Short.MAX_VALUE))
        );

        pp.add(p1_login, "c1");

        jLabel3.setText("ID : ");

        jLabel4.setText("password : ");

        jLabel5.setText(" 이름 : ");

        jLabel8.setText("지역 : ");

        jLabel9.setText("전화번호 : ");

        jLabel10.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel10.setText("회원가입 패널");

        jLabel19.setText("성별 : ");

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

        join_genderCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "남자", "여자", " " }));

        join_hobbyCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "취미1", "취미2", "취미3", "취미4", "취미5" }));

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
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2_adduserLayout.createSequentialGroup()
                        .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p2_adduserLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(join_name))
                            .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(join_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(p2_adduserLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4))))
                        .addGap(199, 199, 199)
                        .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2_adduserLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(24, 24, 24)
                                .addComponent(join_hobbyCom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(p2_adduserLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(24, 24, 24)
                                    .addComponent(join_locCom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(p2_adduserLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(24, 24, 24)
                                    .addComponent(join_genderCom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(p2_adduserLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(join_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
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
                    .addComponent(jLabel19)
                    .addComponent(join_genderCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(join_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(join_hobbyCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(join_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(p2_adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn)
                    .addComponent(prevBtn))
                .addGap(101, 101, 101))
        );

        pp.add(p2_adduser, "c2");

        jLabel14.setText("모임 개설");

        jLabel16.setText("모임 이름 : ");

        jLabel15.setText("소개글 :");

        cmoimBtn.setText("모임 만들기");
        cmoimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoimBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3_createmoimLayout = new javax.swing.GroupLayout(p3_createmoim);
        p3_createmoim.setLayout(p3_createmoimLayout);
        p3_createmoimLayout.setHorizontalGroup(
            p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(643, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3_createmoimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmoimBtn)
                .addGap(60, 60, 60))
        );
        p3_createmoimLayout.setVerticalGroup(
            p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3_createmoimLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(59, 59, 59)
                .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmoim_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p3_createmoimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmoim_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addComponent(cmoimBtn)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        pp.add(p3_createmoim, "c3");

        jLabel12.setText("모임명 : ");

        jLabel13.setText("멤버리스트");

        jmoimBtn.setText("모임 가입하기");

        moim_info.setColumns(20);
        moim_info.setRows(5);
        moim_info.setText("여기는 모임 설명이 쓰여있는 자리 ");
        jScrollPane1.setViewportView(moim_info);

        logoutBtn.setText("로그아웃");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
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

        javax.swing.GroupLayout p4_moimpageLayout = new javax.swing.GroupLayout(p4_moimpage);
        p4_moimpage.setLayout(p4_moimpageLayout);
        p4_moimpageLayout.setHorizontalGroup(
            p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4_moimpageLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4_moimpageLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4_moimpageLayout.createSequentialGroup()
                        .addGroup(p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutBtn)
                            .addComponent(jScrollPane1)
                            .addGroup(p4_moimpageLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p4_moimpageLayout.createSequentialGroup()
                                        .addGap(0, 675, Short.MAX_VALUE)
                                        .addComponent(jmoimBtn))
                                    .addGroup(p4_moimpageLayout.createSequentialGroup()
                                        .addComponent(moimTitle)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(45, 45, 45))))
        );
        p4_moimpageLayout.setVerticalGroup(
            p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4_moimpageLayout.createSequentialGroup()
                .addGroup(p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p4_moimpageLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jmoimBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4_moimpageLayout.createSequentialGroup()
                        .addContainerGap(106, Short.MAX_VALUE)
                        .addGroup(p4_moimpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(moimTitle))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(logoutBtn)
                .addGap(33, 33, 33))
        );

        pp.add(p4_moimpage, "c4");

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

        hobby1Btn.setText("취미1");

        hobby2Btn.setText("취미2");

        hobby3Btn.setText("취미3");

        hobby4Byn.setText("취미4");

        hobby5Btn.setText("취미5");

        javax.swing.GroupLayout p5_mainpanalLayout = new javax.swing.GroupLayout(p5_mainpanal);
        p5_mainpanal.setLayout(p5_mainpanalLayout);
        p5_mainpanalLayout.setHorizontalGroup(
            p5_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5_mainpanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p5_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p5_mainpanalLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
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
            .addGroup(p5_mainpanalLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(tomainPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tomymoimPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        p5_mainpanalLayout.setVerticalGroup(
            p5_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5_mainpanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p5_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(p5_mainpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomainPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tomymoimPanalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pp.add(p5_mainpanal, "c5");

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
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void moim_crea_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moim_crea_BtnActionPerformed
        card.show(pp, "c3");
    }//GEN-LAST:event_moim_crea_BtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        log_id.getText();
        log_pwd.getText();
        card.show(pp, "c5");
                
    }//GEN-LAST:event_loginBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        card.show(pp, "c1");
    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        card.show(pp, "c1");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void cmoimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoimBtnActionPerformed
        cmoim_name.getText();
        card.show(pp,"c4");
    }//GEN-LAST:event_cmoimBtnActionPerformed

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
                new Asemi_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cmoimBtn;
    private javax.swing.JTextField cmoim_info;
    private javax.swing.JTextField cmoim_name;
    private javax.swing.JButton hobby1Btn;
    private javax.swing.JButton hobby2Btn;
    private javax.swing.JButton hobby3Btn;
    private javax.swing.JButton hobby4Byn;
    private javax.swing.JButton hobby5Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jmoimBtn;
    private javax.swing.JButton joinBtn;
    private javax.swing.JComboBox<String> join_genderCom;
    private javax.swing.JComboBox<String> join_hobbyCom;
    private javax.swing.JTextField join_id;
    private javax.swing.JComboBox<String> join_locCom;
    private javax.swing.JTextField join_name;
    private javax.swing.JTextField join_pwd;
    private javax.swing.JTextField join_tel;
    private javax.swing.JTextField log_id;
    private javax.swing.JTextField log_pwd;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable mainPrintTable;
    private javax.swing.JLabel moimTitle;
    private javax.swing.JButton moim_crea_Btn;
    private javax.swing.JTextArea moim_info;
    private javax.swing.JTable moimlist;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel p1_login;
    private javax.swing.JPanel p2_adduser;
    private javax.swing.JPanel p3_createmoim;
    private javax.swing.JPanel p4_moimpage;
    private javax.swing.JPanel p5_mainpanal;
    private javax.swing.JPanel pp;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchword;
    private javax.swing.JButton tomainPanalBtn;
    private javax.swing.JButton tomymoimPanalBtn;
    // End of variables declaration//GEN-END:variables
}
