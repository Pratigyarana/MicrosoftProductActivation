
import javax.swing.*; // It lets us use all the functionality provided by swing
import java.awt.*; // It lets us use all the functionality provided by awt
import java.awt.event.*; // It abstract adapter class for receiving mouse events
import java.util.*; // It lets us use all the functionality provided by util
import java.io.*; // It lets us use all the functionality provided by input output string

//Implementing Action Listner
public class ProductGUI implements ActionListener,KeyListener{
    JFrame f;
    JPanel panel;
    JLabel lbltitle,lblProductNumber,lblProductName,lblTotalPrice,lblclientCompanyName
    ,lblLAD,lblLED,lblAKey,lblNoOfUser,
    lblPricePerUser,lblTotalprice,lblpno,lblNewPrice,lblProductN4,lblProductNo;
    JTextField txtProductNumber;
    JTextField txtProductName;
    JTextField txtTotalPrice;
    JTextField txtclientCompanyName;
    JTextField txtLAD;
    JTextField txtLED;
    JTextField txtAKey;
    JTextField txtNoOfUser;
    JTextField txtPricePerUser;
    JTextField txtProductNo;
    JTextField txtProductN4;
    JTextField txtNewPrice;
    JTextField txtpno;
    JButton btnaddproduct;
    JButton btnactivatelicense;
    JButton btnterminatelicense;
    JButton btnSetPricePerUser;
    JButton btndisplay;
    JButton btnclear;
    
    ArrayList <MicrosoftProduct> list=new ArrayList<MicrosoftProduct>(); //Defining arraylist type of parent class
    
    public ProductGUI(){
            lbltitle=new JLabel("Microsoft Product");
           
            lblProductNumber=new JLabel("Product No: ");
            txtProductNumber= new JTextField();
            
            lblProductName=new JLabel("Product Name: ");
            txtProductName = new JTextField();
            
            lblPricePerUser= new JLabel("Price Per User: ");
            txtPricePerUser = new JTextField();
            
            btnaddproduct = new JButton("Add Product");
            btnaddproduct.setBounds(590,120,130,30);
            
            lblpno = new JLabel("Product No: ");
            txtpno = new JTextField();
            
            lblclientCompanyName = new JLabel("Client Company Name: ");
            txtclientCompanyName = new JTextField();
            
            lblNoOfUser = new JLabel("No. of User: ");
            txtNoOfUser = new JTextField();
           
            lblLAD = new JLabel("License Activation Date: ");
            txtLAD = new JTextField();
           
            lblLED = new JLabel("License Expire Date: ");
            txtLED = new JTextField();
            
            lblAKey = new JLabel("Activation Key:");
            txtAKey = new JTextField();
            
            lblTotalPrice = new JLabel("Total Price : ");
            txtTotalPrice = new JTextField();
           
            btnactivatelicense = new JButton("Activate License");
            btnactivatelicense.setBounds(590,340,150,30);
            
            lblProductNo= new JLabel("Product N0:");
            txtProductNo= new JTextField();
          
            btnterminatelicense = new JButton("Terminate License");
            btnterminatelicense.setBounds(590,430,150,30);
            
            lblProductN4 = new JLabel("Product No:");
            txtProductN4 = new JTextField();
            
            lblNewPrice = new JLabel("Price Per User: ");
            txtNewPrice = new JTextField();
            
            btnSetPricePerUser = new JButton("Set Price Per User");
            btnSetPricePerUser.setBounds(590,560,150,30);
             
            btndisplay = new JButton("Display");
            btndisplay.setBounds(20,640,130,30);
           
            btnclear = new JButton("Clear");
            btnclear.setBounds(590,640,130,30);
            
            lbltitle.setBounds(300,10,250,30);
            lblProductNumber.setBounds(20,50,120,25);
            txtProductNumber.setBounds(150,50,150,25);
            lblProductName.setBounds(430,50,100,25);
            txtProductName.setBounds(590,50,150,25);
            lblPricePerUser.setBounds(20,100,100,25);
            txtPricePerUser.setBounds(150,100,150,25);
            lblpno.setBounds(20,200,200,25);
            txtpno.setBounds(150,200,150,25);
            lblclientCompanyName.setBounds(430,200,150,25);
            txtclientCompanyName.setBounds(590,200,150,25);
            lblNoOfUser.setBounds(20,250,150,25);
            txtNoOfUser.setBounds(150,250,150,25);
            lblLAD.setBounds(430,250,150,25);
            txtLAD.setBounds(590,250,150,25);
            lblLED.setBounds(20,300,150,25);
            txtLED.setBounds(150,300,150,25);
            lblAKey.setBounds(430,300,100,25);
            txtAKey.setBounds(590,300,150,25);
            lblTotalPrice.setBounds(20,350,150,25);
            txtTotalPrice.setBounds(150,350,150,25);
            lblProductNo.setBounds(20,420,150,25);
            txtProductNo.setBounds(150,420,150,25);
            lblProductN4.setBounds(20,520,150,25);
            txtProductN4.setBounds(150,520,150,25);
            lblNewPrice.setBounds(430,520,150,25);
            txtNewPrice.setBounds(590,520,150,25);
            

            btnaddproduct.addActionListener(this);
            btnactivatelicense.addActionListener(this);
            btnterminatelicense.addActionListener(this);
            btnSetPricePerUser.addActionListener(this);
            btndisplay.addActionListener(this);
            txtNoOfUser.addKeyListener(this);
            btnclear.addActionListener(this);
            txtTotalPrice.setEditable(false);
            
            panel=new JPanel();
            panel.setLayout(null);
            panel.add(lbltitle);
            panel.add(lblProductNumber);
            panel.add(lblProductName);
            panel.add(lblPricePerUser);
            panel.add(lblclientCompanyName);
            panel.add(lblLAD);
            panel.add(lblLED);
            panel.add(lblAKey);
            panel.add(lblNoOfUser);
            panel.add(lblTotalPrice);
            panel.add(lblProductNo);
            panel.add(lblProductN4);
            panel.add(lblNewPrice);
            panel.add(lblpno);
            
            panel.add(txtProductNumber);
            panel.add(txtProductName);
            panel.add(txtPricePerUser);
            panel.add(txtTotalPrice);
            panel.add(txtclientCompanyName);
            panel.add(txtLAD);
            panel.add(txtLED);
            panel.add(txtAKey);
            panel.add(txtNoOfUser);
            panel.add(txtProductNo);
            panel.add(txtProductN4);
            panel.add(txtNewPrice);
            panel.add(txtpno);
            
            panel.add(btnaddproduct);
            panel.add(btnactivatelicense);
            panel.add(btnterminatelicense);
            panel.add(btnSetPricePerUser);
            panel.add(btnclear);
            panel.add(btndisplay);
            
            Font font = new Font("ARIAL", Font.PLAIN, 25);
            
            f=new JFrame("ProductGUI");
            f.add(panel);
            f.setSize(800,700);
            lbltitle.setFont(font);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyPressed(KeyEvent ke){}
    public void keyTyped(KeyEvent ke){}
    public void keyReleased(KeyEvent ke)
    {
       try{
           int pno = Integer.parseInt(txtpno.getText());
           int NoOfUser = Integer.parseInt(txtNoOfUser.getText());
           setTotalPrice(pno,NoOfUser);
       }catch(Exception ex){
            JOptionPane.showMessageDialog(f, "Please enter the valid Number.");
       } 
    }
    public void setTotalPrice(int productNo,int numberOfUser){
        boolean productNoFound = false;
        for(MicrosoftProduct listItem:list){
            if(listItem.getProductNo()==productNo){
                EnterpriseEdition obj = (EnterpriseEdition)listItem;
                int totalPrice=numberOfUser*obj.getPricePerUser();
                txtTotalPrice.setText(totalPrice+"");
                productNoFound=true;
                break;
            }
        }
        if(productNoFound==false){
            txtTotalPrice.setText(0+"");
        }
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(btnaddproduct)){  //Creating an event for addproduct button
            String productno = txtProductNumber.getText();
            String ProductName = txtProductName.getText();
            String PricePerUser = txtPricePerUser.getText();
            if(productno.equals("") || ProductName.equals("") || PricePerUser.equals("")){
                JOptionPane.showMessageDialog(f,"Please enter all the data");
            }else{
                int productnoInt=Integer.parseInt(productno);
                int PricePerUserInt=Integer.parseInt(PricePerUser);
                boolean dupliValue=false;
                for(MicrosoftProduct listItem:list){
                    if(listItem.getProductNo()==productnoInt|listItem.getProductName()==ProductName||listItem.getPrice()==PricePerUserInt){
                        dupliValue=true;
                        break;
                    }
                }
                if(dupliValue==false){
                    EnterpriseEdition edition=new EnterpriseEdition(productnoInt,ProductName,PricePerUserInt);
                    list.add(edition);
                    JOptionPane.showMessageDialog(f,"The product is added successfully");
                }else{
                    JOptionPane.showMessageDialog(f,"The product number is already added."); 
                }
            }
        }
        if (e.getSource().equals(btnactivatelicense)){ // Creating an event for activatelicense button
            boolean productnoFound = false;
            String productNo=txtpno.getText();
            String clientCompanyName=txtclientCompanyName.getText();
            String NoOfUser=txtNoOfUser.getText();
            String LAD=txtLAD.getText();
            String LED=txtLED.getText();
            String AKey=txtAKey.getText();
            String TotalPrice=txtTotalPrice.getText();
            if(productNo.isEmpty() || clientCompanyName.isEmpty() || NoOfUser.isEmpty() || LAD.isEmpty() || 
            LED.isEmpty() || LAD.isEmpty() || AKey.isEmpty() || TotalPrice.isEmpty()){
                JOptionPane.showMessageDialog(null," Please enter all the data.","ERROR",JOptionPane.ERROR_MESSAGE); 
            }else{
                try{
                    int productNoInt = Integer.parseInt(productNo);
                    int NoOfUserInt = Integer.parseInt(NoOfUser);
                    int noOfUser = Integer.parseInt(NoOfUser);
                    for (MicrosoftProduct listItem:list){
                        if(listItem.getProductNo()==productNoInt){
                            productnoFound = true;
                            EnterpriseEdition obj = (EnterpriseEdition)listItem;
                            if(obj.getIsActivated() == true){
                                JOptionPane.showMessageDialog(null, "The license has been already activated.");
                                break;
                            }
                            else{
                            obj.activateLicense(clientCompanyName, noOfUser, LAD,
                            LED, AKey);
                            JOptionPane.showMessageDialog(null,"The license is activated successfully.");
                            break;
                        }
                    }
                    }
                    if(productnoFound == false){
                        JOptionPane.showMessageDialog(null,"Product number is not found in the list.","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NullPointerException ex){
                }
            }
        }
        if (e.getSource().equals(btnterminatelicense)){ // Creating an event for terminate license button
            boolean productnoFound = false;
            String ProductNo=txtProductNo.getText();
            if(ProductNo.isEmpty()){
                JOptionPane.showMessageDialog(null," Please enter the product number.","ERROR",JOptionPane.ERROR_MESSAGE);
            }else{  
                try{
                int ProductNoInt = Integer.parseInt(ProductNo); 
                for (MicrosoftProduct listItem:list){
                    if(listItem.getProductNo()==ProductNoInt){
                        productnoFound = true;
                        EnterpriseEdition obj = (EnterpriseEdition)listItem;
                        if(obj.getIsActivated() == true){
                            obj.terminateLicense();
                            JOptionPane.showMessageDialog(null,"The license is terminated successfully.");
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null,"The product is available to issue the license.");
                            break;
                        } 
                            
                    }   
                }   
                if(productnoFound == false){
                    JOptionPane.showMessageDialog(null,"The product number is not found in the list.","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                }catch(NullPointerException ex){
                }
            }
        }
        if (e.getSource().equals(btnSetPricePerUser)){ // Creating an event for set price per user button
            boolean productnoFound = false;
            String ProductNum=txtProductN4.getText();
            int ProductNumInt = Integer.parseInt(ProductNum);
            for (MicrosoftProduct listItem:list){
                 if(listItem.getProductNo()==ProductNumInt){
                     productnoFound = true;
                     EnterpriseEdition obj = (EnterpriseEdition)listItem;
                     if(obj.getIsActivated() == true){
                          
                         JOptionPane.showMessageDialog(null,"The price per user cannot be changed because the license is already activated.");
                         break;
                     }else{
                         obj.getPricePerUser(); 
                         JOptionPane.showMessageDialog(null,"The new price per user has been successfully set.");
                         break;
                     }   
                 }
            } 
            if(productnoFound == false){
                JOptionPane.showMessageDialog(null,"The product number is not found in the list.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
                
        }
        if(e.getSource().equals(btndisplay)){ // Creating an event for display button
            try{
            String getProductN4=txtProductN4.getText();
            int capture=Integer.parseInt(getProductN4);
            for(MicrosoftProduct listItem:list){
                if(listItem.getProductNo()==capture){
                EnterpriseEdition obj = (EnterpriseEdition)listItem;
                obj.productDetails();
            }
        }
        }
        catch(NumberFormatException ex)
        { JOptionPane.showMessageDialog(null,"Enter the product number");
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Please enter the valid number");}
        }
        if (e.getSource().equals(btnclear)){  // Creating an event for clear button
            txtProductNumber.setText("");
            txtProductName.setText("");
            txtTotalPrice.setText("");
            txtclientCompanyName.setText("");
            txtLAD.setText("");
            txtLED.setText("");
            txtAKey.setText("");
            txtNoOfUser.setText("");
            txtPricePerUser.setText("");
            txtProductN4.setText("");
            txtProductNo.setText("");
            txtNewPrice.setText("");
            txtpno.setText("");
        }
    }
    public static void main(String[]args){
            new ProductGUI(); 
    }
}
    
