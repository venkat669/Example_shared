import javax.swing.*;

public class GUI_pract_1 {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter name ");
        JOptionPane.showMessageDialog(null,"hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter age "));
        JOptionPane.showMessageDialog(null, "your age is " +age);
        double hei = Double.parseDouble(JOptionPane.showInputDialog("enter  height"));
        JOptionPane.showMessageDialog(null, "height is " +hei);
    }
}
