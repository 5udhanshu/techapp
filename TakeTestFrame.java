/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquiz.gui;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquiz.dao.PerformanceDAO;
import techquiz.dao.QuestionDAO;
import techquiz.dto.AnswerPojo;
import techquiz.dto.AnswerStore;
import techquiz.dto.ExamPojo;
import techquiz.dto.PerformancePojo;
import techquiz.dto.QuestionPojo;
import techquiz.dto.QuestionStore;
import techquiz.dto.UserProfile;

/**
 *
 * @author devanshi
 */
public class TakeTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TakeTestFrame
     */
    private ExamPojo exam;
    private QuestionStore qstore;
    private AnswerStore astore;
    private int qno,pos=0;
    
    public TakeTestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("The Quiz App");
        lblUsername.setText("Hello "+UserProfile.getUsername());
        qstore=new QuestionStore();//default constructor
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);//question: 1...is type me set kr rha he
    }
     public TakeTestFrame(ExamPojo exam) {
         this();
         this.exam=exam;
         lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
         loadQuestions();
         //brings the question paper of that examid.
         showQuestion();
     
     }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 0));
        lblTitle.setText("PAPER SETTING PANEL");

        lblQno.setBackground(new java.awt.Color(0, 0, 0));
        lblQno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 153, 0));
        lblQno.setText("Question No:");

        lbllogout.setBackground(new java.awt.Color(0, 0, 0));
        lbllogout.setForeground(new java.awt.Color(255, 102, 0));
        lbllogout.setText("LogOut");
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbllogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbllogoutMouseExited(evt);
            }
        });

        lblUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblUsername.setForeground(new java.awt.Color(255, 153, 0));

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 153, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 153, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 153, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\CORE JAVA PROJECT SLIDES\\Images used in project\\onlineexam\\good luck2.jpg")); // NOI18N
        jLabel6.setText("jLabel6");

        jrOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 153, 0));
        jrOption1.setText("jRadioButton1");

        jrOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 153, 0));
        jrOption2.setText("jRadioButton2");

        jrOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(255, 153, 0));
        jrOption3.setText("jRadioButton3");

        jrOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(255, 153, 0));
        jrOption4.setText("jRadioButton4");

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 153, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllogout)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNext)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrOption1)
                                    .addComponent(jrOption3))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrOption4)
                                    .addComponent(jrOption2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addGap(82, 82, 82)
                                .addComponent(btnDone)
                                .addGap(81, 81, 81))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbllogout))
                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption3)
                    .addComponent(jrOption4))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnCancel)
                    .addComponent(btnDone)
                    .addComponent(btnPrevious))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
        this.dispose();
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
    }//GEN-LAST:event_lbllogoutMouseClicked

    private void lbllogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseEntered

        lbllogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,12);
        lbllogout.setFont(f);
    }//GEN-LAST:event_lbllogoutMouseEntered

    private void lbllogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseExited

        lbllogout.setForeground(new Color(255,153,0));
        Font f=new Font("Tahoma",Font.BOLD,12);
        lbllogout.setFont(f);
    }//GEN-LAST:event_lbllogoutMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)//if the question is not unattempted then
        {
            QuestionPojo question=qstore.getQuestion(pos);//we will get the current question from this
            String correctAnswer=question.getCorrectAnswer();//correct ans for this particular question
            AnswerPojo newanswer=new AnswerPojo();//we will create answer pojo object and fill the student's attempted answer details into it.
            newanswer.setExamID(exam.getExamId());
            newanswer.setSubject(exam.getLanguage());
            newanswer.setCorrectAnswer(correctAnswer);
            newanswer.setQno(qno);
            newanswer.setAnswer(chosenAnswer);
            AnswerPojo answer=astore.getAnswerByQno(qno);//this is to check if already this answer is attempted then we will retrive its answerpojo from the answer store. by giving it the qno. 
            if(answer==null)//if it is not alrready attempted.
            {
                astore.addAnswer(answer);
            }
            else
            {
                if(newanswer.getAnswer().equals(answer.getAnswer())==false)//this is to check that previos attempted answer is same as the new answer attempted of that particular question.
                {
                    int apos=astore.removeAnswer(answer);
       //it removes the current answer by taking its answer pojo and storing the pos of which it will remove.
                    
                   astore.setAnswerAt(apos,newanswer);
      //insert the new answer and store it back in that position only.
                }
            }
        }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
        qno++;
        if(qno>qstore.getCount())
                 {
// this condition is to check if the student is at the last question and then he preeses next then he will rotate back to the first question.
            qno=1;
        }
        lblQno.setText("Question No:"+qno);
        showQuestion();//used for showing the next question
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed

        String chosenAnswer=getUserAnswer();//here we are doing this just to check that if the user after attempting the last question presses done then we need to add its record for the last question in the db
        if(chosenAnswer!=null)
        {
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newanswer=new AnswerPojo();
            newanswer.setExamID(exam.getExamId());
            newanswer.setSubject(exam.getLanguage());
            newanswer.setCorrectAnswer(correctAnswer);
            newanswer.setQno(qno);
            newanswer.setAnswer(chosenAnswer);
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
            {
                astore.addAnswer(answer);
            }
            else
            {
                if(newanswer.getAnswer().equals(answer.getAnswer())==false)
                {
                    int apos=astore.removeAnswer(answer); 
                    astore.setAnswerAt(apos,newanswer);
                }
            }
        }
        int right=0,wrong=0;
        for(QuestionPojo question:qstore.getAllQuestions())
        {
            int qno=question.getQno();
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
            {
                continue;//in this the loop will continue again and the rest of the body of the loop will not be executed.
            }
            else
            {
                String chosenAnswer1=answer.getAnswer();
                String correctAnswer1=answer.getCorrectAnswer();
                if(chosenAnswer1.equals(correctAnswer1))
                {
                    ++right;
                }
                else
                {
                   ++wrong;
                }
            }
        }
        String reportCard="Total Questions:"+qstore.getCount();
        reportCard+="\nRight Answer:"+right;
        reportCard+="\nWrong Answer:"+wrong;
        reportCard+="\nUnattempted:"+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null,reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            PerformancePojo performance=new PerformancePojo(UserProfile.getUsername(),exam.getExamId(),exam.getLanguage(),right,wrong,(qstore.getCount()-(right+wrong)),(double)((right/qstore.getCount())*100));
            PerformanceDAO.addPerformance(performance);
            JOptionPane.showMessageDialog(null,"Your performance has been succesfully added to the database","Performance added!",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Exception In DB:"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newanswer=new AnswerPojo();
            newanswer.setExamID(exam.getExamId());
            newanswer.setSubject(exam.getLanguage());
            newanswer.setCorrectAnswer(correctAnswer);
            newanswer.setQno(qno);
            newanswer.setAnswer(chosenAnswer);
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
            {
                astore.addAnswer(answer);
            }
            else
            {
                if(newanswer.getAnswer().equals(answer.getAnswer())==false)
                {
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(apos,newanswer);
                }
            }
        }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
        qno--;
        if(qno<=0)
        {
            qno=qstore.getCount();
        }
        lblQno.setText("Question No:"+qno);
        showQuestion();//used for showing the previous question
    }//GEN-LAST:event_btnPreviousActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
private void loadQuestions()
{
    try
    {
        ArrayList<QuestionPojo> questionList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
        
         for(QuestionPojo obj:questionList)
         {
             qstore.addQuestion(obj);
         }
    }
    
    catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Exception In DB:"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
}
public void showQuestion()
{
    QuestionPojo question=qstore.getQuestion(pos);
    buttonGroup1.clearSelection();
    txtQuestion.setText(question.getQuestion());
    jrOption1.setText(question.getAnswer1());
    jrOption2.setText(question.getAnswer2());
    jrOption3.setText(question.getAnswer3());
    jrOption4.setText(question.getAnswer4());
    AnswerPojo answer=astore.getAnswerByQno(qno);//this is when we revisit the question and check in answerstore if this question is attempted or not. if attempted it will give the choosen anser for that question and then automatically set the radio button of that answer.
    if(answer==null)//when we visit that question for the first time.
    {
        return;
    }
    String choosenAnswer=answer.getAnswer();//answer.getUserAnswer();
    switch(choosenAnswer)
    {
        case "Answer1":
            jrOption1.setSelected(true);
            break;
        case "Answer2":
            jrOption2.setSelected(true);
            break;
        case "Answer3":
            jrOption3.setSelected(true);
            break;
        case "Answer4":
            jrOption4.setSelected(true);
            break;
    }

}

public String getUserAnswer()//to send it to db which option was selected by the student for a particular question.
{
    if(jrOption1.isSelected())
        return "Answer1";
    else if(jrOption2.isSelected())
        return "Answer2";
    else if(jrOption3.isSelected())
        return "Answer3";
    else if(jrOption4.isSelected())
        return "Answer4";
    else
        return null;
}
}