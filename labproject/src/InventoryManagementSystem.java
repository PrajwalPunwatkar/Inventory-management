import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryManagementSystem extends JFrame {
    private InventoryManager inventoryManager;

    private JTextField nameField;
    private JTextField quantityField;
    private JTextField priceField;
    private JTextArea outputArea;

    public InventoryManagementSystem() {
        inventoryManager = new InventoryManager();
        createUI();
    }

    private void createUI() {
        setTitle("Inventory Management System");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameField = new JTextField(15);
        quantityField = new JTextField(5);
        priceField = new JTextField(5);
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        JButton addButton = new JButton("Add Product");
        JButton updateButton = new JButton("Update Stock");
        JButton reportButton = new JButton("Generate Report");
        JButton saveButton = new JButton("Save Inventory");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                double price = Double.parseDouble(priceField.getText());
                Product product = new Product(name, quantity, price);
                inventoryManager.addProduct(product);
                outputArea.append("Added: " + product + "\n");
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                inventoryManager.updateStock(name, quantity);
                outputArea.append("Updated stock for: " + name + " to " + quantity + "\n");
            }
        });

        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder report = new StringBuilder("Inventory Report:\n");
                for (Product product : inventoryManager.getProducts()) {
                    report.append(product).append("\n");
                }
                outputArea.setText(report.toString());
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventoryManager.saveToFile("inventory.dat");
                outputArea.append("Inventory saved to file.\n");
            }
        });

        add(new JLabel("Product Name:"));
        add(nameField);
        add(new JLabel("Quantity:"));
        add(quantityField);
        add(new JLabel("Price:"));
        add(priceField);
        add(addButton);
        add(updateButton);
        add(reportButton);
        add(saveButton);
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InventoryManagementSystem());
    }
}