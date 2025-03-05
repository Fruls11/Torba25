import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TorbaGUI extends JFrame implements ActionListener {
    private JTable table;
    private TorbaTableModel tableModel;
    private JTextField nosilnostField;
    private JCheckBox kompaktnaBox;
    private JButton addNakupButton, addPiknikButton;
    
    public TorbaGUI() {
        setTitle("Upravljanje torb");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        tableModel = new TorbaTableModel();
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Nosilnost (kg):"));
        nosilnostField = new JTextField();
        inputPanel.add(nosilnostField);
        
        inputPanel.add(new JLabel("Kompaktna torba:"));
        kompaktnaBox = new JCheckBox();
        inputPanel.add(kompaktnaBox);
        
        addNakupButton = new JButton("Dodaj torbo za nakupovanje");
        addNakupButton.addActionListener(this);
        inputPanel.add(addNakupButton);
        
        addPiknikButton = new JButton("Dodaj torbo za piknik");
        addPiknikButton.addActionListener(this);
        inputPanel.add(addPiknikButton);
        
        add(inputPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addNakupButton) {
            try {
                double nosilnost = Double.parseDouble(nosilnostField.getText());
                TorbaZaNakupovanje torba = new TorbaZaNakupovanje(nosilnost);
                tableModel.dodajTorbo(torba);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Napaka pri vnosu nosilnosti!", "Napaka", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == addPiknikButton) {
            try {
                double nosilnost = Double.parseDouble(nosilnostField.getText());
                boolean kompaktna = kompaktnaBox.isSelected();
                TorbaZaPiknik torba = new TorbaZaPiknik(nosilnost, kompaktna);
                tableModel.dodajTorbo(torba);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Napaka pri vnosu nosilnosti!", "Napaka", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TorbaGUI::new);
    }
}