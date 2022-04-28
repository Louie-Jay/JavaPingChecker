/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingchecker.Controller;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MainController {
    
    private boolean runNet;
    Thread netThread;
    
    private boolean runDate;
    private Thread dateThread;
    
    private Thread startThread;
    private boolean writing;
    private BufferedReader in;
    
    public MainController() {
       runNet = true;
       runDate = true;
       writing = true;
    }
    
    private void setComputerName(JLabel prmCName) {
        try {
            Map<String, String> env = System.getenv();
            if (env.containsKey("COMPUTERNAME")) {
                prmCName.setText(env.get("COMPUTERNAME"));
            } else if (env.containsKey("HOSTNAME")) {
                prmCName.setText(env.get("HOSTNAME"));
            } else {
                prmCName.setText("Unknown Computer");
            }
            this.updateColor(prmCName);
        } catch (Exception e) {
            prmCName.setText("Error");
            this.updateColor(prmCName);
        }
    }
    
    private void setIPAddress(JLabel prmIP) {
        try (final DatagramSocket socket = new DatagramSocket()) {
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            String ip = socket.getLocalAddress().getHostAddress();
            prmIP.setText(ip);
            Thread.sleep(4000);
            this.updateColor(prmIP);
        } catch (Exception ex) {
            prmIP.setText("Error");
            this.updateColor(prmIP);
        }
    }
    
    private void setMACAddress(JLabel prmMac) {
        try {

            InetAddress inetIP = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(inetIP);

            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            prmMac.setText(sb.toString());
            this.updateColor(prmMac);

        } catch (UnknownHostException e) {
            prmMac.setText("Error");
            this.updateColor(prmMac);
        } catch (SocketException e) {
            prmMac.setText("Error");
            this.updateColor(prmMac);
        }
    }
    
    private void setNetworkStatus(JLabel prmNStat) {
        netThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (runNet) {                    
                    try {
                    URL url = new URL("http://www.google.com");
                    URLConnection conn = url.openConnection();
                        conn.connect();
                        conn.getInputStream().close();
                        prmNStat.setText("Connected");
                        Thread.sleep(1000);
                        MainController.this.updateColor(prmNStat);
                    } catch (MalformedURLException e) {
                        prmNStat.setText("Error:");
                        MainController.this.updateColor(prmNStat);
                    } catch (IOException e) {
                        prmNStat.setText("Offline");
                        MainController.this.updateColor(prmNStat);
                    }catch (InterruptedException e) {
                        prmNStat.setText("Error:");
                        MainController.this.updateColor(prmNStat);
                    }
                }
            }
        });
        netThread.start();
    }
    
    private void setDateTime(JLabel prmDate) {
        dateThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (runDate) {
                    try {
                        String date = new Date().toString();
                        prmDate.setText(date);
                        Thread.sleep(1000);
                        MainController.this.updateColor(prmDate);
                    } catch (Exception e) {
                        prmDate.setText("Error");
                        MainController.this.updateColor(prmDate);
                    }
                }
            }
        });
        dateThread.start();
    }
    
    public void start(JTextArea prmResult, String manualAddress, boolean prmEndless) {
        startThread = new Thread(new Runnable() {
            @Override
            public void run() {
                writing = true;
                String ip = "";
                if (manualAddress.equals("")) {
                    ip = "google.com";
                }else{
                    ip = manualAddress;
                }
                
                String pingCmd = "ping " + ip + ((prmEndless) ? " -t": "");
                prmResult.setText("");
                
                prmResult.append("===== Ping test: "+pingCmd+" ("+new Date().toString()+") =====\n");
                try {
                    Runtime r = Runtime.getRuntime();
                    Process p = r.exec(pingCmd);

                    in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String inputLine;
                    while (writing == true && (inputLine = in.readLine()) != null) {
                        prmResult.append(inputLine + "\n");
                        
                    }
                    in.close();

                } catch (IOException e) {
                    prmResult.append("Invalid address!");
                }
            }
        });
        startThread.start();
    }
    
    public void setManual(JCheckBox prmChkAddress, JTextField prmTxtAddress){
        prmTxtAddress.setEnabled(prmChkAddress.isSelected());
    }
    
    public void stop(JTextArea prmResult){
        try {
            in.close();
            writing = false;
            startThread.interrupt();
            prmResult.append("===== Ping test stopped: ("+new Date().toString()+") =====\n");
        } catch (Exception e) {
            prmResult.append("Nothing to stop here.\n");
        }
        
    }
    
    public void about(JTextArea prmResult){
        prmResult.append("===== Created by Louiejay F. Lomibao =====");
    }
    
    public void loadInfo(HashMap<String, JLabel> prmLabel){
        
        this.setComputerName(prmLabel.get("CName"));
        
        this.setIPAddress(prmLabel.get("IPAdr"));
        
        this.setMACAddress(prmLabel.get("MACAdr"));
        
        this.setNetworkStatus(prmLabel.get("NStat"));
        
        this.setDateTime(prmLabel.get("DT"));
        
        
    }
    
    private void updateColor(JLabel prmLabel){
        switch(prmLabel.getText()){
            case "Error":
            case "Nothing to stop here.":
            case "Offline":
                prmLabel.setForeground(Color.red);
                break;
            default:
                prmLabel.setForeground(new Color(0 , 255, 0));
                break;
        }
    
    }
    
    public void exit(){
        runNet = false;
        netThread.interrupt();
      
        runDate = false;
        dateThread.interrupt();
        
        System.exit(0);
    }
    
}
