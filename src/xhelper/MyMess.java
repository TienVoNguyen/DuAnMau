/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xhelper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author NTV
 */
public class MyMess {
    public static void msgTrue(Component paren, String msg) {
        JOptionPane.showMessageDialog(paren, msg);
    }
    
    public static void msgFalse(Component paren, String msg) {
        JOptionPane.showMessageDialog(paren, msg, "Lỗi",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public static void msgWarning(Component paren, String msg) {
        JOptionPane.showMessageDialog(paren, msg, "Cảnh báo",
                JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean question(Component paren, String msg) {
        int choose = JOptionPane.showConfirmDialog(paren, msg,
                "Question", JOptionPane.YES_NO_OPTION);
        return choose != JOptionPane.YES_OPTION;
    }
    
    public static String prompt(Component parent, String messenge) {
        return JOptionPane.showInputDialog(parent, messenge,
                "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
