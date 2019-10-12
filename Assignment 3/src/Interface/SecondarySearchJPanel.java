/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CabInformation;
import Business.Car;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rhnye
 */
public class SecondarySearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecondarySearchJPanel
     */
    private JPanel userProcessContainer;
    private CabInformation cabInformation;
    private ArrayList<Car> tempArr;
    private ArrayList<Car> tempArr1;
    public SecondarySearchJPanel(JPanel userProcessContainer,CabInformation cabInformation, ArrayList<Car> tempArr) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.cabInformation = cabInformation;
        this.tempArr = tempArr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtManfactYear = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnSearchBrandName = new javax.swing.JButton();
        btnSearchModelNo = new javax.swing.JButton();
        btnSearchBySerialNo = new javax.swing.JButton();
        btnSearchByMfcYear = new javax.swing.JButton();
        btnSearchByAvailability = new javax.swing.JButton();
        btnSearchByCity = new javax.swing.JButton();
        btnSearchByMainCerficate = new javax.swing.JButton();
        txtrangemin = new javax.swing.JTextField();
        txtrangemax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnRangeMinMaxSeats = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        checkBoxYesAvailable = new javax.swing.JCheckBox();
        checkboxNoAvailable = new javax.swing.JCheckBox();
        checkboxYesCertify = new javax.swing.JCheckBox();
        checkboxNoCertify = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnSecSearch = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model Name", "Serial Number", "Minimum Seats", "Maximum Seats", "Manufacture Year", "Available", "City", "Maintenance Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Secondary Search");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search by Brand Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Search by");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Check if the car is ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Search by:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Search the car with");

        btnSearchBrandName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchBrandName.setText("Brand Name");
        btnSearchBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBrandNameActionPerformed(evt);
            }
        });

        btnSearchModelNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchModelNo.setText("Model Name");
        btnSearchModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchModelNoActionPerformed(evt);
            }
        });

        btnSearchBySerialNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchBySerialNo.setText("Serial Number");
        btnSearchBySerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBySerialNoActionPerformed(evt);
            }
        });

        btnSearchByMfcYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchByMfcYear.setText("Manufactered Year");
        btnSearchByMfcYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByMfcYearActionPerformed(evt);
            }
        });

        btnSearchByAvailability.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchByAvailability.setText("Available");
        btnSearchByAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByAvailabilityActionPerformed(evt);
            }
        });

        btnSearchByCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchByCity.setText("City");
        btnSearchByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByCityActionPerformed(evt);
            }
        });

        btnSearchByMainCerficate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchByMainCerficate.setText("Maintenance Certificate");
        btnSearchByMainCerficate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByMainCerficateActionPerformed(evt);
            }
        });

        txtrangemin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrangeminActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Min Seat");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Max Seat");

        btnRangeMinMaxSeats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRangeMinMaxSeats.setText("Search Car");
        btnRangeMinMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRangeMinMaxSeatsActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Search Categories");

        checkBoxYesAvailable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkBoxYesAvailable.setText("Yes");

        checkboxNoAvailable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkboxNoAvailable.setText("No");

        checkboxYesCertify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkboxYesCertify.setText("Yes");

        checkboxNoCertify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkboxNoCertify.setText("No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Set the range of Seats");

        btnSecSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSecSearch.setText("refresh");
        btnSecSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRangeMinMaxSeats)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtrangemax))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtrangemin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearchByMfcYear)
                                    .addComponent(btnSearchByAvailability)
                                    .addComponent(btnSearchByCity)
                                    .addComponent(btnSearchBrandName)
                                    .addComponent(btnSearchModelNo)
                                    .addComponent(btnSearchBySerialNo))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(checkBoxYesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkboxNoAvailable))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtManfactYear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSearchByMainCerficate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkboxYesCertify)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkboxNoCertify))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)))
                .addGap(245, 245, 245))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSecSearch)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearchBrandName)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchModelNo)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchBySerialNo)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnSearchByMfcYear)
                            .addComponent(txtManfactYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchByAvailability)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxYesAvailable)
                            .addComponent(checkboxNoAvailable))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchByCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchByMainCerficate)
                            .addComponent(jLabel10)
                            .addComponent(checkboxYesCertify)
                            .addComponent(checkboxNoCertify)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrangemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrangemax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRangeMinMaxSeats)))
                .addGap(67, 67, 67)
                .addComponent(btnSecSearch)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1523, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBrandNameActionPerformed
        // TODO add your handling code here:
        String brandName = txtBrandName.getText();
        if(brandName == null || brandName.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Brand Name");
            return;
        }

        if(txtBrandName.getText()!=null){

            DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
            dtm.setRowCount(0);
            tempArr1 = cabInformation.searchByBrand(txtBrandName.getText(), tempArr);
            for(Car car: tempArr1)
            {

                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);

            }
        }
    }//GEN-LAST:event_btnSearchBrandNameActionPerformed

    private void btnSearchModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchModelNoActionPerformed
        // TODO add your handling code here:
         String modelNumber = txtModelNumber.getText();
        if(modelNumber == null || modelNumber.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the Model Name");
                return;
            }
        if (txtModelNumber.getText()!=null) {
            
             DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
            dtm.setRowCount(0);
            tempArr1 = cabInformation.searchByBrand(txtModelNumber.getText(), tempArr);
            for(Car car: tempArr1)
            {
                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();     
            
                dtm.addRow(row);
//                txtModelNumber.setText("");
            
            }
        }
     
    }//GEN-LAST:event_btnSearchModelNoActionPerformed

    private void btnSearchBySerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBySerialNoActionPerformed
        // TODO add your handling code here:

        String serialNum = txtSerialNumber.getText();
        if(serialNum == null || serialNum.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter the Serial Number");
            return;}
        try{
            Double.parseDouble(txtSerialNumber.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter Number for Serial Number");
        }

        if(txtSerialNumber.getText()!=null){

            DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
            dtm.setRowCount(0);
            tempArr1 = cabInformation.searchByBrand(txtSerialNumber.getText(), tempArr);
            for(Car car: tempArr1)
            {

                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);
                //                txtSerialNumber.setText("");

            }
        }
    }//GEN-LAST:event_btnSearchBySerialNoActionPerformed

    private void btnSearchByMfcYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByMfcYearActionPerformed
        // TODO add your handling code here:
        String manufYear = txtManfactYear.getText();
        if(manufYear == null || manufYear.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Manufacturing Year");
            return;}
        try{
            Double.parseDouble(txtManfactYear.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter Number for Manufacturing Year");
        }

        if(txtManfactYear.getText()!=null){

            DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
            dtm.setRowCount(0);
            tempArr1 = cabInformation.searchByManufactureYear(txtManfactYear.getText(), tempArr);
            for(Car car: tempArr1)
            {

                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);
                //                txtManfactYear.setText("");

            }
        }
    }//GEN-LAST:event_btnSearchByMfcYearActionPerformed

    private void btnSearchByAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByAvailabilityActionPerformed
        // TODO add your handling code here:

        if (checkBoxYesAvailable.isSelected() == false && checkboxNoAvailable.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Please select Yes or No checkbox for Availibilty");
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        if(checkBoxYesAvailable.isSelected()==true){
            tempArr1 = cabInformation.searchByYesAvailable(tempArr);
            for(Car car: tempArr1)
            {
                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);

            }
        }
        else{
            tempArr1 = cabInformation.searchByNoAvailable(tempArr);
            for(Car car: tempArr1)
            {
                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);

            }

        }

    }//GEN-LAST:event_btnSearchByAvailabilityActionPerformed

    private void btnSearchByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByCityActionPerformed
        // TODO add your handling code here:
        String city= txtCity.getText();
        if(city == null || city.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter the City");
            return;
        }

        if(txtCity.getText()!=null){

            DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
            dtm.setRowCount(0);
            tempArr1 = cabInformation.searchByCity(txtCity.getText(), tempArr);
            for(Car car: tempArr1)
            {

                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);

            }
        }

    }//GEN-LAST:event_btnSearchByCityActionPerformed

    private void btnSearchByMainCerficateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByMainCerficateActionPerformed
        // TODO add your handling code here:
        if (checkboxYesCertify.isSelected()==false && checkboxNoCertify.isSelected()==false) {
            JOptionPane.showMessageDialog(null, "Please select Yes or No checkbox for Maintenance Certificate");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);

        if(checkboxYesCertify.isSelected()== true){
            tempArr1 = cabInformation.searchByYesMaintenanceCertificate(tempArr);
            for(Car car: tempArr1)
            {
                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);

            }
        }
        else{
            tempArr1 = cabInformation.searchByNoMaintenanceCertificate(tempArr);
            for(Car car: tempArr1)
            {
                Object[] row = new Object[9];
                row[0]=car; //Overide Object ToString Brand Name
                row[1]=car.getModel_num();
                row[2]=car.getSerial_num();
                row[3]=car.getMin_seats();
                row[4]=car.getMax_seats();
                row[5]=car.getManufactured_year();
                row[6]=car.isAvailable();
                row[7]=car.getAvailable_city();
                row[8]=car.isMaintenance_certificate();

                dtm.addRow(row);

            }
        }
    }//GEN-LAST:event_btnSearchByMainCerficateActionPerformed

    private void txtrangeminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrangeminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrangeminActionPerformed

    private void btnRangeMinMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRangeMinMaxSeatsActionPerformed
        // TODO add your handling code here:

        String minSeat = txtrangemin.getText();
        String maxSeat = txtrangemax.getText();

        if (minSeat.equals("") || maxSeat.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the Min & Max range of Seats");
            return;
        }

        try{
            Double.parseDouble(txtrangemin.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter Number for Minimum Seats");
        }

        //int maxSeats = Integer.parseInt(txtMaxSeats.getText());

        try{
            Double.parseDouble(txtrangemax.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter Number for Maximum Seats");
        }

        int minNoOfSeat = Integer.parseInt(minSeat);
        int maxNoOfSeat = Integer.parseInt(maxSeat);

        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        tempArr1 = cabInformation.searchByMinMaxSeat(minNoOfSeat,maxNoOfSeat, tempArr);
            for(Car car: tempArr1)
            {

            Object[] row = new Object[9];
            row[0]=car; //Overide Object ToString Brand Name
            row[1]=car.getModel_num();
            row[2]=car.getSerial_num();
            row[3]=car.getMin_seats();
            row[4]=car.getMax_seats();
            row[5]=car.getManufactured_year();
            row[6]=car.isAvailable();
            row[7]=car.getAvailable_city();
            row[8]=car.isMaintenance_certificate();

            dtm.addRow(row);
            //                txtSerialNumber.setText("");

        }

    }//GEN-LAST:event_btnRangeMinMaxSeatsActionPerformed

    private void btnSecSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecSearchActionPerformed
        // TODO add your handling code here:
        SecondarySearchJPanel panel = new SecondarySearchJPanel(userProcessContainer, cabInformation, tempArr);
        userProcessContainer.add("BrandNameListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnSecSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRangeMinMaxSeats;
    private javax.swing.JButton btnSearchBrandName;
    private javax.swing.JButton btnSearchByAvailability;
    private javax.swing.JButton btnSearchByCity;
    private javax.swing.JButton btnSearchByMainCerficate;
    private javax.swing.JButton btnSearchByMfcYear;
    private javax.swing.JButton btnSearchBySerialNo;
    private javax.swing.JButton btnSearchModelNo;
    private javax.swing.JButton btnSecSearch;
    private javax.swing.JCheckBox checkBoxYesAvailable;
    private javax.swing.JCheckBox checkboxNoAvailable;
    private javax.swing.JCheckBox checkboxNoCertify;
    private javax.swing.JCheckBox checkboxYesCertify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManfactYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtrangemax;
    private javax.swing.JTextField txtrangemin;
    // End of variables declaration//GEN-END:variables
}