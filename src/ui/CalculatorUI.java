package ui;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import exceptions.*;

public class CalculatorUI extends javax.swing.JFrame {

    private int n;
    private int r;


    public CalculatorUI() {
        initComponents();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputBox = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        firstInput = new javax.swing.JTextField();
        secondInput = new javax.swing.JTextField();
        subButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ncrButton = new javax.swing.JButton();
        modButton = new javax.swing.JButton();
        sinButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        cotButton = new javax.swing.JButton();
        cosecButton = new javax.swing.JButton();
        secButton = new javax.swing.JButton();
        nprButton = new javax.swing.JButton();
        factorialButton = new javax.swing.JButton();
        xp3Button = new javax.swing.JButton();
        xp2Button = new javax.swing.JButton();
        xpyButton = new javax.swing.JButton();
        xp1invButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        epxButton = new javax.swing.JButton();
        lnButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        absButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        pieButton = new javax.swing.JButton();
        twopxButton = new javax.swing.JButton();
        tenpxButton = new javax.swing.JButton();
        npieButton = new javax.swing.JButton();
        Name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(440, 455));

        outputBox.setEditable(false);
        outputBox.setColumns(20);
        outputBox.setFont(new java.awt.Font("Monospaced", 1, 18));
        outputBox.setForeground(new java.awt.Color(102, 102, 102));
        outputBox.setRows(1);
        outputBox.setAutoscrolls(false);
        outputBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        outputBox.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(outputBox);

        addButton.setBackground(new java.awt.Color(102, 102, 102));
        addButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        firstInput.setFont(new java.awt.Font("Tahoma", 1, 12));
        firstInput.setForeground(new java.awt.Color(153, 153, 153));
        firstInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        firstInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstInputActionPerformed(evt);
            }
        });

        secondInput.setFont(new java.awt.Font("Tahoma", 1, 12));
        secondInput.setForeground(new java.awt.Color(153, 153, 153));
        secondInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        secondInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondInputActionPerformed(evt);
            }
        });

        subButton.setBackground(new java.awt.Color(102, 102, 102));
        subButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        subButton.setForeground(new java.awt.Color(255, 255, 255));
        subButton.setText("-");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });

        mulButton.setBackground(new java.awt.Color(102, 102, 102));
        mulButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        mulButton.setForeground(new java.awt.Color(255, 255, 255));
        mulButton.setText("*");
        mulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButtonActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Roboto Light", 0, 18));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("/");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 204, 204));
        clearButton.setFont(new java.awt.Font("Roboto Light", 0, 14));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("1st");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("2nd");

        ncrButton.setBackground(new java.awt.Color(102, 102, 102));
        ncrButton.setFont(new java.awt.Font("Roboto Light", 0, 16));
        ncrButton.setForeground(new java.awt.Color(255, 255, 255));
        ncrButton.setText("nCr");
        ncrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncrButtonActionPerformed(evt);
            }
        });

        modButton.setBackground(new java.awt.Color(102, 102, 102));
        modButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        modButton.setForeground(new java.awt.Color(255, 255, 255));
        modButton.setText("%");
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });

        sinButton.setBackground(new java.awt.Color(102, 102, 102));
        sinButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        sinButton.setForeground(new java.awt.Color(255, 255, 255));
        sinButton.setText("sin");
        sinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinButtonActionPerformed(evt);
            }
        });

        cosButton.setBackground(new java.awt.Color(102, 102, 102));
        cosButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        cosButton.setForeground(new java.awt.Color(255, 255, 255));
        cosButton.setText("cos");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        tanButton.setBackground(new java.awt.Color(102, 102, 102));
        tanButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        tanButton.setForeground(new java.awt.Color(255, 255, 255));
        tanButton.setText("tan");
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });

        cotButton.setBackground(new java.awt.Color(102, 102, 102));
        cotButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        cotButton.setForeground(new java.awt.Color(255, 255, 255));
        cotButton.setText("cot");
        cotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotButtonActionPerformed(evt);
            }
        });

        cosecButton.setBackground(new java.awt.Color(102, 102, 102));
        cosecButton.setFont(new java.awt.Font("Roboto Light", 0, 16));
        cosecButton.setForeground(new java.awt.Color(255, 255, 255));
        cosecButton.setText("cosec");
        cosecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosecButtonActionPerformed(evt);
            }
        });

        secButton.setBackground(new java.awt.Color(102, 102, 102));
        secButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        secButton.setForeground(new java.awt.Color(255, 255, 255));
        secButton.setText("sec");
        secButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secButtonActionPerformed(evt);
            }
        });

        nprButton.setBackground(new java.awt.Color(102, 102, 102));
        nprButton.setFont(new java.awt.Font("Roboto Light", 0, 16));
        nprButton.setForeground(new java.awt.Color(255, 255, 255));
        nprButton.setText("nPr");
        nprButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nprButtonActionPerformed(evt);
            }
        });

        factorialButton.setBackground(new java.awt.Color(102, 102, 102));
        factorialButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        factorialButton.setForeground(new java.awt.Color(255, 255, 255));
        factorialButton.setText("n!");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });

        xp3Button.setBackground(new java.awt.Color(102, 102, 102));
        xp3Button.setFont(new java.awt.Font("Roboto Light", 0, 18));
        xp3Button.setForeground(new java.awt.Color(255, 255, 255));
        xp3Button.setText("x^3");
        xp3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xp3ButtonActionPerformed(evt);
            }
        });

        xp2Button.setBackground(new java.awt.Color(102, 102, 102));
        xp2Button.setFont(new java.awt.Font("Roboto Light", 0, 18));
        xp2Button.setForeground(new java.awt.Color(255, 255, 255));
        xp2Button.setText("x^2");
        xp2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xp2ButtonActionPerformed(evt);
            }
        });

        xpyButton.setBackground(new java.awt.Color(102, 102, 102));
        xpyButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        xpyButton.setForeground(new java.awt.Color(255, 255, 255));
        xpyButton.setText("x^y");
        xpyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xpyButtonActionPerformed(evt);
            }
        });

        xp1invButton.setBackground(new java.awt.Color(102, 102, 102));
        xp1invButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        xp1invButton.setForeground(new java.awt.Color(255, 255, 255));
        xp1invButton.setText("x^-1");
        xp1invButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xp1invButtonActionPerformed(evt);
            }
        });

        rootButton.setBackground(new java.awt.Color(102, 102, 102));
        rootButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        rootButton.setForeground(new java.awt.Color(255, 255, 255));
        rootButton.setText("√");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        epxButton.setBackground(new java.awt.Color(102, 102, 102));
        epxButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        epxButton.setForeground(new java.awt.Color(255, 255, 255));
        epxButton.setText("e^x");
        epxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epxButtonActionPerformed(evt);
            }
        });

        lnButton.setBackground(new java.awt.Color(102, 102, 102));
        lnButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        lnButton.setForeground(new java.awt.Color(255, 255, 255));
        lnButton.setText("ln");
        lnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnButtonActionPerformed(evt);
            }
        });

        eButton.setBackground(new java.awt.Color(102, 102, 102));
        eButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        eButton.setForeground(new java.awt.Color(255, 255, 255));
        eButton.setText("e");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        logButton.setBackground(new java.awt.Color(102, 102, 102));
        logButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        logButton.setForeground(new java.awt.Color(255, 255, 255));
        logButton.setText("log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        absButton.setBackground(new java.awt.Color(102, 102, 102));
        absButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        absButton.setForeground(new java.awt.Color(255, 255, 255));
        absButton.setText("|x|");
        absButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(102, 102, 102));
        exitButton.setFont(new java.awt.Font("Roboto Light", 0, 14));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        pieButton.setBackground(new java.awt.Color(102, 102, 102));
        pieButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        pieButton.setForeground(new java.awt.Color(255, 255, 255));
        pieButton.setText("π");
        pieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieButtonActionPerformed(evt);
            }
        });

        twopxButton.setBackground(new java.awt.Color(102, 102, 102));
        twopxButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        twopxButton.setForeground(new java.awt.Color(255, 255, 255));
        twopxButton.setText("2^x");
        twopxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twopxButtonActionPerformed(evt);
            }
        });

        tenpxButton.setBackground(new java.awt.Color(102, 102, 102));
        tenpxButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        tenpxButton.setForeground(new java.awt.Color(255, 255, 255));
        tenpxButton.setText("10^x");
        tenpxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenpxButtonActionPerformed(evt);
            }
        });

        npieButton.setBackground(new java.awt.Color(102, 102, 102));
        npieButton.setFont(new java.awt.Font("Roboto Light", 0, 18));
        npieButton.setForeground(new java.awt.Color(255, 255, 255));
        npieButton.setText("nπ");
        npieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npieButtonActionPerformed(evt);
            }
        });


        Name.setBackground(new java.awt.Color(204, 204, 204));
        Name.setFont(new java.awt.Font("Bahnschrift", 0, 20));
        Name.setForeground(new java.awt.Color(153, 153, 153));
        Name.setText("Scientific Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(secondInput, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                                        .addComponent(firstInput))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(Name))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(ncrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(cosecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(secButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(cotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(nprButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(xp2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(xp3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(xpyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(xp1invButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(epxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(lnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(absButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(pieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(npieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(twopxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(tenpxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(firstInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Name))
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(secondInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(ncrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cosecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nprButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xp2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xp3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xpyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xp1invButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(epxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(absButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(npieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(twopxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tenpxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void secButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double degrees = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            degrees = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = 1.0 / Math.cos(Math.toRadians(degrees));
        outputBox.setText("    " + df.format(result));
    }

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double exp = 2.7182818284590452;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            firstInput.setText(null);
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = exp;
        outputBox.setText("    " + df.format(result));
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = 0, num2 = 0;
        try{
            num1 = Double.parseDouble(firstInput.getText());
            num2 = Double.parseDouble(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = num1 + num2;
        outputBox.setText("    " + result);
    }

    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = 0, num2 = 0;
        try{
            num1 = Double.parseDouble(firstInput.getText());
            num2 = Double.parseDouble(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = num1 - num2;
        outputBox.setText("    " + result);
    }

    private void secondInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void firstInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mulButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = 0, num2 = 0;
        try{
            num1 = Double.parseDouble(firstInput.getText());
            num2 = Double.parseDouble(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = num1 * num2;
        outputBox.setText("    " + result);
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        int num1 = 0, num2 = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            num1 = Integer.parseInt(firstInput.getText());
            num2 = Integer.parseInt(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = (double) num1 / (double) num2;
        outputBox.setText("    " + df.format(result));
    }

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int num1 = 0, num2 = 0;
        try{
            num1 = Integer.parseInt(firstInput.getText());
            num2 = Integer.parseInt(secondInput.getText());
            if(num1<num2){
                Exception x = null;
                throw(x);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(this, "Not possible to find modulus. Divisor is larger than dividend.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        int result = num1 % num2;
        outputBox.setText("    " + result);
    }

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        firstInput.setText(null);
        secondInput.setText(null);
        outputBox.setText(null);
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double degrees = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            degrees = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.sin(Math.toRadians(degrees));
        outputBox.setText("    " + df.format(result));
    }

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double degrees = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            degrees = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.cos(Math.toRadians(degrees));
        outputBox.setText("    " + df.format(result));
    }

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double degrees = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            degrees = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.tan(Math.toRadians(degrees));
        outputBox.setText("    " + df.format(result));
    }

    private void cosecButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double degrees = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            degrees = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = 1.0 / Math.sin(Math.toRadians(degrees));
        outputBox.setText("    " + df.format(result));
    }

    private void cotButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double degrees = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            degrees = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = 1.0 / Math.tan(Math.toRadians(degrees));
        outputBox.setText("    " + df.format(result));
    }

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = sqrt(number);
        outputBox.setText("    " + df.format(result));
    }

    private void xp2ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = pow(number,2);
        outputBox.setText("    " + df.format(result));
    }

    private void xp3ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = pow(number,3);
        outputBox.setText("    " + df.format(result));
    }

    private void xpyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double num1 = 0, num2=0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            num1 = Double.parseDouble(firstInput.getText());
            num2 = Double.parseDouble(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = pow(num1,num2);
        outputBox.setText("    " + df.format(result));
    }

    private void xp1invButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.pow(number,-1);
        outputBox.setText("    " + df.format(result));
    }

    private void pieButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double pie = 3.141592653589793;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            firstInput.setText(null);
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        outputBox.setText("    " + df.format(pie));
    }

    private void npieButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0, pie = 3.141592653589793;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = number * pie;
        outputBox.setText("    " + df.format(result));
    }

    private void epxButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.exp(number);
        outputBox.setText("    " + df.format(result));
    }

    private void twopxButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.pow(2,number);
        outputBox.setText("    " + df.format(result));
    }

    private void tenpxButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.pow(10,number);
        outputBox.setText("    " + df.format(result));
    }

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.log10(number);
        outputBox.setText("    " + df.format(result));
    }

    private void lnButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.log(number);
        outputBox.setText("    " + df.format(result));
    }

    private void absButtonActionPerformed(java.awt.event.ActionEvent evt) {
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        double result = Math.abs(number);
        outputBox.setText("    " + df.format(result));
    }

    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int fact=1;
        double number = 0;
        DecimalFormat df = new DecimalFormat("#.########");
        try{
            number = Double.parseDouble(firstInput.getText());
            secondInput.setText(null);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        double result = fact;
        outputBox.setText("    " + df.format(result));
    }

    private void ncrButtonActionPerformed(java.awt.event.ActionEvent evt) {
        long n = 1, r = 1;
        try{
            n = Integer.parseInt(firstInput.getText());
            r = Integer.parseInt(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        long x1 = 1, x2 = 1, y =  1, z = n - r;
        for (int i = 1; i <= n; i++){
            x1 = x1 * i;
        }
        for (int i = 1; i <= r; i++){
            x2 = x2 * i;
        }
        for (int i = 1; i <= z; i++){
            y = y * i;
        }
        long result =  x1 / (x2 * y);
        outputBox.setText("    " + result);
    }

    private void nprButtonActionPerformed(java.awt.event.ActionEvent evt) {
        long n = 1, r = 1;
        try{
            n = Integer.parseInt(firstInput.getText());
            r = Integer.parseInt(secondInput.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Put numerical value only.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        long x = 1, y =  1, z = n - r;
        for (int i = 1; i <= n; i++){
            x = x * i;
        }
        for (int i = 1; i <= z; i++){
            y = y * i;
        }
        long result = x / y;
        outputBox.setText("    " + result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorUI().setVisible(true);
        });
    }


    private javax.swing.JLabel Name;
    private javax.swing.JButton absButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton cosecButton;
    private javax.swing.JButton cotButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton epxButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JTextField firstInput;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lnButton;
    private javax.swing.JButton logButton;
    private javax.swing.JButton modButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton ncrButton;
    private javax.swing.JButton npieButton;
    private javax.swing.JButton nprButton;
    private javax.swing.JTextArea outputBox;
    private javax.swing.JButton pieButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JButton secButton;
    private javax.swing.JTextField secondInput;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton subButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JButton tenpxButton;
    private javax.swing.JButton twopxButton;
    private javax.swing.JButton xp1invButton;
    private javax.swing.JButton xp2Button;
    private javax.swing.JButton xp3Button;
    private javax.swing.JButton xpyButton;


    private void exit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void CloseFrame() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private double Pow(double number, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
