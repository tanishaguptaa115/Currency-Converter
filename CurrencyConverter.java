package javacurrencyconverter;

import javax.swing.JOptionPane;

public class CurrencyConverter extends javax.swing.JFrame {

    String[] currencyUnits = {
            "units",
            "ARS", // Argentine Peso
            "BRL", // Brazilian Real
            "CAD", // Canadian Dollar
            "DOP", // Dominican Peso
            "EUR", // Euro
            "HTG", // Haitian Gourde
            "JPY", // Japanese Yen
            "KES", // Kenyan Shilling
            "LYD", // Libyan Dinar
            "MXN", // Mexican Peso
            "OMR", // Omani Rial
            "PYG", // Paraguayan Guarani
            "QAR", // Qatari Rial
            "RWF", // Rwandan Franc
            "RSD", // Serbian Dinar
            "KRW", // South Korean Won
            "THB", // Thai Baht
            "TRY", // Turkish Lira
            "UAH", // Ukrainian Hryvnia
            "USD", // United States Dollar
            "VND", // Vietnamese Dong
            "MAD", // Moroccan Dirham
            "YER", // Yemeni Rial
            "ZWD", // Zimbabwean Dollar
            "INR" // Indian Rupee added
    };

    double argentinePesos = 468.25;
    double brazilianReais = 5.05;
    double canadianDollars = 1.37;
    double dominicanPesos = 55.46;
    double franceEuros = 0.94;
    double haitianGourdes = 116.18;
    double japaneseYen = 143.34;
    double kenyanShillings = 148.75;
    double libyanDinars = 4.64;
    double mexicanPesos = 18.24;
    double omaniRials = 0.38;
    double paraguayanGuarani = 7000.00;
    double qatariRials = 3.64;
    double rwandanFrancs = 1161.67;
    double serbianDinars = 106.10;
    double southKoreanWon = 1319.91;
    double thaiBaht = 35.18;
    double turkishLire = 27.44;
    double ukrainianHryvnia = 36.88;
    double uSDollars = 1.00;
    double vietnameseDongs = 23348.00;
    double moroccanDirhams = 9.84;
    double yemeniRials = 250.00;
    double zimbabweanDollars = 1765.00;
    double indianRupees = 82.31;

    public CurrencyConverter() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Currency Converter");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("From Currency Of");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("To Currency Of");

        firstCountry.setFont(new java.awt.Font("Segoe UI", 1, 14));
        firstCountry.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Argentina",
                        "Brazil", "Canada", "Dominican Republic", "France", "Haiti", "Japan",
                        "Kenya", "Libya", "Mexico",
                        "Oman", "Paraguay", "Qatar", "Rwanda", "Serbia", "South Korea",
                        "Thailand", "Turkey", "Ukraine",
                        "United States", "Vietnam", "Western Sahara", "Yemen", "Zimbabwe", "India" }));
        firstCountry.addItemListener(evt -> firstCountryItemStateChanged(evt));

        secondCountry.setFont(new java.awt.Font("Segoe UI", 1, 14));
        secondCountry.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Argentina",
                        "Brazil", "Canada", "Dominican Republic", "France", "Haiti", "Japan",
                        "Kenya", "Libya", "Mexico",
                        "Oman", "Paraguay", "Qatar", "Rwanda", "Serbia", "South Korea",
                        "Thailand", "Turkey", "Ukraine",
                        "United States", "Vietnam", "Western Sahara", "Yemen", "Zimbabwe", "India" }));
        secondCountry.addItemListener(evt -> secondCountryItemStateChanged(evt));

        t1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        t1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        t2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        t2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t2.addActionListener(evt -> t2ActionPerformed(evt));

        firstCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        secondCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setText("Convert");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton2.setText("Reset");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton3.setText("Exit");
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(jButton1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(firstCurrencyUnit,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(t1,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(firstCountry,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                150,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(secondCurrencyUnit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                150,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(t2,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(secondCountry,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        150,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(56, 56, 56)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        62,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstCountry,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secondCountry,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstCurrencyUnit)
                                        .addComponent(secondCurrencyUnit))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {
        // No implementation needed here
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {
        int position = firstCountry.getSelectedIndex();
        firstCurrencyUnit.setText(currencyUnits[position]);
    }

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {
        int position = secondCountry.getSelectedIndex();
        secondCurrencyUnit.setText(currencyUnits[position]);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        if (firstCountry.getSelectedIndex() == 0 || secondCountry.getSelectedIndex() == 0
                || t1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must select both currencies and enter the amount.",
                    "Error message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double amountToChange = Double.parseDouble(t1.getText());
        double amountInBaseCurrency = 0.0;
        double amountChanged = 0.0;

        // Convert to base currency (using USD as the base)
        switch (firstCountry.getSelectedItem().toString()) {
            case "Argentina":
                amountInBaseCurrency = amountToChange / argentinePesos;
                break;
            case "Brazil":
                amountInBaseCurrency = amountToChange / brazilianReais;
                break;
            case "Canada":
                amountInBaseCurrency = amountToChange / canadianDollars;
                break;
            case "Dominican Republic":
                amountInBaseCurrency = amountToChange / dominicanPesos;
                break;
            case "France":
                amountInBaseCurrency = amountToChange / franceEuros;
                break;
            case "Haiti":
                amountInBaseCurrency = amountToChange / haitianGourdes;
                break;
            case "Japan":
                amountInBaseCurrency = amountToChange / japaneseYen;
                break;
            case "Kenya":
                amountInBaseCurrency = amountToChange / kenyanShillings;
                break;
            case "Libya":
                amountInBaseCurrency = amountToChange / libyanDinars;
                break;
            case "Mexico":
                amountInBaseCurrency = amountToChange / mexicanPesos;
                break;
            case "Oman":
                amountInBaseCurrency = amountToChange / omaniRials;
                break;
            case "Paraguay":
                amountInBaseCurrency = amountToChange / paraguayanGuarani;
                break;
            case "Qatar":
                amountInBaseCurrency = amountToChange / qatariRials;
                break;
            case "Rwanda":
                amountInBaseCurrency = amountToChange / rwandanFrancs;
                break;
            case "Serbia":
                amountInBaseCurrency = amountToChange / serbianDinars;
                break;
            case "South Korea":
                amountInBaseCurrency = amountToChange / southKoreanWon;
                break;
            case "Thailand":
                amountInBaseCurrency = amountToChange / thaiBaht;
                break;
            case "Turkey":
                amountInBaseCurrency = amountToChange / turkishLire;
                break;
            case "Ukraine":
                amountInBaseCurrency = amountToChange / ukrainianHryvnia;
                break;
            case "United States":
                amountInBaseCurrency = amountToChange / uSDollars;
                break;
            case "Vietnam":
                amountInBaseCurrency = amountToChange / vietnameseDongs;
                break;
            case "Western Sahara":
                amountInBaseCurrency = amountToChange / moroccanDirhams;
                break;
            case "Yemen":
                amountInBaseCurrency = amountToChange / yemeniRials;
                break;
            case "Zimbabwe":
                amountInBaseCurrency = amountToChange / zimbabweanDollars;
                break;
            case "India":
                amountInBaseCurrency = amountToChange / indianRupees;
                break;
            default:
                amountInBaseCurrency = 0.0;
        }

        // Convert from base currency to target currency
        switch (secondCountry.getSelectedItem().toString()) {
            case "Argentina":
                amountChanged = amountInBaseCurrency * argentinePesos;
                break;
            case "Brazil":
                amountChanged = amountInBaseCurrency * brazilianReais;
                break;
            case "Canada":
                amountChanged = amountInBaseCurrency * canadianDollars;
                break;
            case "Dominican Republic":
                amountChanged = amountInBaseCurrency * dominicanPesos;
                break;
            case "France":
                amountChanged = amountInBaseCurrency * franceEuros;
                break;
            case "Haiti":
                amountChanged = amountInBaseCurrency * haitianGourdes;
                break;
            case "Japan":
                amountChanged = amountInBaseCurrency * japaneseYen;
                break;
            case "Kenya":
                amountChanged = amountInBaseCurrency * kenyanShillings;
                break;
            case "Libya":
                amountChanged = amountInBaseCurrency * libyanDinars;
                break;
            case "Mexico":
                amountChanged = amountInBaseCurrency * mexicanPesos;
                break;
            case "Oman":
                amountChanged = amountInBaseCurrency * omaniRials;
                break;
            case "Paraguay":
                amountChanged = amountInBaseCurrency * paraguayanGuarani;
                break;
            case "Qatar":
                amountChanged = amountInBaseCurrency * qatariRials;
                break;
            case "Rwanda":
                amountChanged = amountInBaseCurrency * rwandanFrancs;
                break;
            case "Serbia":
                amountChanged = amountInBaseCurrency * serbianDinars;
                break;
            case "South Korea":
                amountChanged = amountInBaseCurrency * southKoreanWon;
                break;
            case "Thailand":
                amountChanged = amountInBaseCurrency * thaiBaht;
                break;
            case "Turkey":
                amountChanged = amountInBaseCurrency * turkishLire;
                break;
            case "Ukraine":
                amountChanged = amountInBaseCurrency * ukrainianHryvnia;
                break;
            case "United States":
                amountChanged = amountInBaseCurrency * uSDollars;
                break;
            case "Vietnam":
                amountChanged = amountInBaseCurrency * vietnameseDongs;
                break;
            case "Western Sahara":
                amountChanged = amountInBaseCurrency * moroccanDirhams;
                break;
            case "Yemen":
                amountChanged = amountInBaseCurrency * yemeniRials;
                break;
            case "Zimbabwe":
                amountChanged = amountInBaseCurrency * zimbabweanDollars;
                break;
            case "India":
                amountChanged = amountInBaseCurrency * indianRupees;
                break;
            default:
                amountChanged = amountInBaseCurrency * 0.0;
        }

        String value = String.format("%.2f", amountChanged);
        t2.setText(value);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new CurrencyConverter().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration
}