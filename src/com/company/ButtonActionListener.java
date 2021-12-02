package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class ButtonActionListener implements ActionListener {

    private static final Dimension modalWindowSize = new Dimension(800, 600);
    private static final String prefix = "<html><p align=\"center\" width=\"600\">";
    private static final String postfix = "</p></html>";

    private static final String loadText = "Посмотрим что скажут звезды...";


    private static String GetFormattedString(String text)
    {
        return prefix + text + postfix;
    }

    public void actionPerformed(ActionEvent e)
    {
        if (Objects.equals(e.getActionCommand(), "GET"))
        {
            try
            {
                Thread.sleep(2000);

                JDialog dialog = new JDialog(MainFrame.GetInstance(), "Your destiny...", true);
                dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                //dialog.setLayout(new BorderLayout());

                // create answer text
                JLabel answerText = new JLabel();
                answerText.setText(GetFormattedString(AnswerMaker.GetAnswer()));
                answerText.setFont(MainFrame.font);
                answerText.setVerticalAlignment(JLabel.CENTER);
                answerText.setHorizontalAlignment(JLabel.CENTER);
                answerText.setOpaque(true);
                answerText.setForeground(Color.WHITE);
                answerText.setBackground(new Color(255, 255, 255, 0));
                answerText.setSize(modalWindowSize);


                JPanel modalImagePanel = new ModalImagePanel();
                //modalImagePanel.setLayout(new BorderLayout());
                modalImagePanel.setSize(modalWindowSize);
                modalImagePanel.add(answerText, BorderLayout.CENTER);

                // add text to the frame
                dialog.add(modalImagePanel);


                dialog.setSize(modalWindowSize);
                dialog.setResizable(false);
                dialog.setVisible(true);
            }
            catch (Exception exception)
            {
                System.out.println("Some error occurred: " + exception.getMessage());
            }
        }
    }
}
