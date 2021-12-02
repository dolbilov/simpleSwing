package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    MainFrame mainFrame = MainFrame.GetInstance();
                    mainFrame.setTitle("Magic Answers");
                    mainFrame.setSize(MainFrame.windowSize);
                    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mainFrame.setResizable(false);
                    mainFrame.setVisible(true);
                }
                catch (Exception e)
                {
                    System.out.println("Some error occurred: " + e.getMessage());
                }
            }
        });
    }


}
