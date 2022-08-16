/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.view;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvoiceDialog extends JDialog {
    private final JTextField custNameField;
    private final JTextField invDateField;
    private final JLabel custNameLbl;
    private final JLabel invDateLbl;
    private final JButton okBtn;
    private final JButton cancelBtn;

    public InvoiceDialog(InvoiceFrame frame) {
        custNameLbl = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createInvoiceOK");
        cancelBtn.setActionCommand("createInvoiceCancel");
        
        okBtn.addActionListener(frame.getcontroller());
        cancelBtn.addActionListener(frame.getcontroller());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        Component add = add(invDateField);
        Component add1 = add(custNameLbl);
        add(custNameField);
        add(okBtn);
        Component add2 = add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
}
