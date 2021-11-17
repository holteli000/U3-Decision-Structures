import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */


    public static void main(String[] args) {

        int gradelevel = Integer.parseInt(JOptionPane.showInputDialog("what is your grade level(9, 10, 11, 12"));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("how many suspensions do you have"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("how much money, rounded down to the nearest $5, do you have?"));

        if (gradelevel >= 11) {
            if (discipline >= 1) {
                JOptionPane.showMessageDialog(null, "you cant get a ticket");
            } else {

                if (money >= 40) {
                    JOptionPane.showMessageDialog(null, "you can purchase a ticket");
                } else {
                    JOptionPane.showMessageDialog(null, "you cant get a ticket");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "you cant get a ticket");
        }
    }
}