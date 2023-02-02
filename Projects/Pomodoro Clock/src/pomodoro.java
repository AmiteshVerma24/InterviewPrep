// Importing the required packages
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class pomodoro extends javax.swing.JFrame {
    Timer timer;       // To keep track of time
    int pomodoroNo;    // To keep track of the session
    boolean paused;    // For pause or play function
    public pomodoro() 
    {   
        initComponents();  
    }
    private void initComponents() {
        pomodoroPanel = new javax.swing.JPanel();           // For the window
        pomodoroTimeLabel = new javax.swing.JLabel();       // Pomodoro time label
        shortBreakLabel = new javax.swing.JLabel();         // Short break label
        longBreakLabel = new javax.swing.JLabel();          // Long break label
        pause = new javax.swing.JButton();                  // Pause button
        reset = new javax.swing.JButton();                  // Reset button
        timerLabel = new javax.swing.JLabel();              // Timer label
        timeElapsed = new javax.swing.JLabel();             // Keep track of time elapsed
        pomodoroTime = new javax.swing.JTextField();        // Text field for pomodoro time input
        shortBreakTime = new javax.swing.JTextField();      // Text field for short break input
        longBreakTime = new javax.swing.JTextField();       // Text field for long break input
        start = new javax.swing.JButton();                  // Start button
        // Styling the various componets of UI
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pomodoroPanel.setBackground(new java.awt.Color(57, 62, 70));
        pomodoroTimeLabel.setFont(new java.awt.Font("Calibri", 1, 14)); 
        pomodoroTimeLabel.setForeground(new java.awt.Color(238, 238, 238));
        pomodoroTimeLabel.setText("Pomodoro Time: ");
        shortBreakLabel.setFont(new java.awt.Font("Calibri", 1, 14));
        shortBreakLabel.setForeground(new java.awt.Color(238, 238, 238));
        shortBreakLabel.setText("Short Break Time: ");
        longBreakLabel.setFont(new java.awt.Font("Calibri", 1, 14)); 
        longBreakLabel.setForeground(new java.awt.Color(238, 238, 238));
        longBreakLabel.setText("Long Break Time:");
        pause.setFont(new java.awt.Font("Calibri", 1, 11));
        pause.setText("Pause");
        pause.setDoubleBuffered(true);
        pause.setEnabled(false);
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        reset.setFont(new java.awt.Font("Calibri", 1, 11));
        reset.setText("Reset");
        reset.setEnabled(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        timerLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        timerLabel.setText("Timer: ");
        timeElapsed.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        timeElapsed.setText("0:00:00");
        pomodoroTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pomodoroTime.setText("0:25:00");
        pomodoroTime.setAlignmentY(0.6F);
        pomodoroTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomodoroTimeActionPerformed(evt);
            }
        });
        shortBreakTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        shortBreakTime.setText("0:05:00");
        shortBreakTime.setAlignmentY(0.6F);
        longBreakTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        longBreakTime.setText("0:30:00");
        longBreakTime.setAlignmentY(0.6F);
        start.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        // Arranging the componets of the UI
        javax.swing.GroupLayout pomodoroPanelLayout = new javax.swing.GroupLayout(pomodoroPanel);
        pomodoroPanel.setLayout(pomodoroPanelLayout);
        pomodoroPanelLayout.setHorizontalGroup(
            pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                        .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pomodoroTimeLabel)
                                    .addComponent(longBreakLabel)
                                    .addComponent(shortBreakLabel))
                                .addGap(30, 30, 30)
                                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(longBreakTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(shortBreakTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(pomodoroTime, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                                .addComponent(timerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeElapsed)
                                .addGap(60, 60, 60)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pomodoroPanelLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(start)
                        .addGap(18, 18, 18)
                        .addComponent(pause)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(25, 25, 25))))
        );
        pomodoroPanelLayout.setVerticalGroup(
            pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pomodoroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pomodoroTimeLabel)
                    .addComponent(pomodoroTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shortBreakLabel)
                    .addComponent(shortBreakTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longBreakLabel)
                    .addComponent(longBreakTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timerLabel)
                    .addComponent(timeElapsed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pomodoroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(pause)
                    .addComponent(start))
                .addGap(20, 20, 20))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(pomodoroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(pomodoroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }
    // Function to display timer
    public void setTime(int time) 
    {   
            
            long timeNow = 1000*time;
            long second = (timeNow / 1000) % 60;
            long minute = (timeNow / (1000 * 60)) % 60;
            long hour = (timeNow / (1000 * 60 * 60)) % 24;
            timeElapsed.setText(String.format("%02d:%02d:%02d", hour, minute, second));
    }
    // Function to run pomodoro time
    public void pomodoroTimer() 
    {  
        timer = new Timer();
        timer.schedule(new TimerTask()  {
        int counter = 0;
        String [] customTime = pomodoroTime.getText().split(":");
        int counterLimit = Integer.parseInt(customTime[0])*60*60 + Integer.parseInt(customTime[1])*60+
                 Integer.parseInt(customTime[2]);
        
        @Override
        public void run()
            {   
                if(!paused)
                { 
                ++counter;
                setTime(counter);
                if(counter == counterLimit && pomodoroNo < 4) //if less than 4 pomodoros are complete, take a short break
                    {   
                       timer.cancel();
                       Toolkit.getDefaultToolkit().beep();
                       JOptionPane.showMessageDialog(null,"You have completed a pomodoro! Take a short break!");
                       shortBreakTimer();
                       pomodoroNo ++;
                    }
           
                else if (counter == counterLimit && pomodoroNo == 4) //if 4 pomodoros are complete, take a long break
                    {
                        timer.cancel();
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null,"You have completed 4 pomodoros! Take a long break!");
                        longBreakTimer();
                    }
                }   }},0,1000);
    }
    // Function that runs for short-break time
    public void shortBreakTimer() 
    {   
        timer = new Timer();
        timer.schedule(new TimerTask()  {
        int counter = 0;
        String [] customTime = shortBreakTime.getText().split(":");
        int counterLimit = Integer.parseInt(customTime[0])*60*60 + Integer.parseInt(customTime[1])*60+
                 Integer.parseInt(customTime[2]);
       
        @Override
        public void run()
            {   
                if (!paused)
                {
                ++counter;
                setTime(counter);
                if(counter == counterLimit) 
                    {  timer.cancel();
                       Toolkit.getDefaultToolkit().beep();
                       JOptionPane.showMessageDialog(null,"Time up! Resume work.");
                       pomodoroTimer();
                       
                    }
                }}},0,1000); 
    }    
    // Funtion that runs for long break time
    public void longBreakTimer() 
    {
        timer = new Timer();
        timer.schedule(new TimerTask()  {
        int counter = 0;
        String [] customTime = longBreakTime.getText().split(":");
        int counterLimit = Integer.parseInt(customTime[0])*60*60 + Integer.parseInt(customTime[1])*60+
                 Integer.parseInt(customTime[2]);
        @Override
        public void run()
            {  
               if(!paused)
               {
                ++counter;
                setTime(counter);
                if(counter == counterLimit) 
                {   
                    timer.cancel();
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null,"Time up! Resume work.");
                    pomodoroNo = 1;
                    pomodoroTimer();
                }
               }}},0,1000);
    }    
    // Adding the button on pressed functionality
    private void startActionPerformed(java.awt.event.ActionEvent evt) {
       pause.setEnabled(true);
       reset.setEnabled(true);
       pomodoroTimer();
       pomodoroNo = 1;
       paused = false;
    }
    private void pomodoroTimeActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {   
        if(!paused)
        {
            paused = true;
            pause.setText("Unpause");
            reset.setEnabled(false);
        } 
        else
        {
            paused = false;
            pause.setText("Pause");
            reset.setEnabled(true);
        }
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        timer.cancel();
        timeElapsed.setText("00:00:00");
        pause.setEnabled(false);
        reset.setEnabled(false);   
    }
    // Main function
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pomodoro().setVisible(true);
            }
        });
    }
    // Objects which are used to create the pomodoro clock
    private javax.swing.JLabel longBreakLabel;
    private javax.swing.JTextField longBreakTime;
    private javax.swing.JButton pause;
    private javax.swing.JPanel pomodoroPanel;
    private javax.swing.JTextField pomodoroTime;
    private javax.swing.JLabel pomodoroTimeLabel;
    private javax.swing.JButton reset;
    private javax.swing.JLabel shortBreakLabel;
    private javax.swing.JTextField shortBreakTime;
    private javax.swing.JButton start;
    private javax.swing.JLabel timeElapsed;
    private javax.swing.JLabel timerLabel;
}
