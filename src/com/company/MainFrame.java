package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame
{
    private static final String fontFilename = "fonts/main.ttf";
    private static final String filename = "img/bg.jpg";
    public static Font font;

    private static MainFrame instance = null;

    public static final Dimension windowSize = new Dimension(1024, 768);

    public static MainFrame GetInstance() throws IOException, FontFormatException {
        if (instance == null)
        {
            instance = new MainFrame();
        }

        return instance;
    }

    private MainFrame() throws IOException, FontFormatException
    {
        super();
        InitializeFont();

        /* add components */
        // Create background
        ImagePanel mainPanel = new ImagePanel(filename);


        JLabel label = new JLabel("Введи свой вопрос...");
        label.setFont(font);
        label.setOpaque(true);
        label.setForeground(Color.WHITE);
        label.setBackground(new Color(255, 255, 255, 0));
        mainPanel.add(label);

        JTextField textField = new JTextField(17);
        textField.setFont(font);
        mainPanel.add(textField);

        JButton button = new JButton("Хочу знать ответ!");
        button.setFont(font);
        button.setActionCommand("GET");
        mainPanel.add(button);

        ActionListener actionListener = new ButtonActionListener();
        button.addActionListener(actionListener);

        getContentPane().add(mainPanel);
        pack();
    }

    private static void InitializeFont() throws IOException, FontFormatException {
        font = Font
                .createFont(Font.TRUETYPE_FONT, new File(fontFilename))
                .deriveFont(72f);
    }
}
