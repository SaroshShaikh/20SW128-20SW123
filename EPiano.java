//----------EPIANO SEMESTER PROJECT, MADE BY MUHAMMAD SAROSH (SEC 3 , 20SW128) & FAEEZ AHMED (SEC 1 , 20SW123)----------\\




import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;



class Piano extends JFrame  {
    Container c ;
    JLabel head;


    Piano() {
        setTitle("                                                              " +
                "                                                                   " +
                "                               Electronic Piano");
        setSize(1200,450);
        setLocation(180,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);



        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);


        ImageIcon icon = new ImageIcon("piano.png");
        setIconImage(icon.getImage());





        //------------------ BLACK BUTTONS ------------------\\
        JButton btn1 = new JButton();
        btn1.setBounds(60,113,80,180);
        btn1.setBackground(Color.black);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try {
                    File file = new File ("key02.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip=AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });

        c.add(btn1);






        JButton btn3 = new JButton();
        btn3.setBounds(140,113,80,180);
        btn3.setBackground(Color.black);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip1;
                try {
                    File file1 = new File("key04.wav");
                    AudioInputStream sound1 = AudioSystem.getAudioInputStream(file1);
                    clip1 = AudioSystem.getClip();
                    clip1.open(sound1);
                    clip1.start();
                    c.add(btn1,0,-1);
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn3);






        JButton btn7 = new JButton();
        btn7.setBounds(335,113,80,180);
        btn7.setBackground(Color.black);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key07.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn7);







        JButton btn8 = new JButton();
        btn8.setBounds(415,113,80,180);
        btn8.setBackground(Color.black);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key09.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn8);







        JButton btn9 = new JButton();
        btn9.setBounds(495,113,80,180);
        btn9.setBackground(Color.black);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key11.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn9);







        JButton btn13 = new JButton();
        btn13.setBounds(697,113,80,180);
        btn13.setBackground(Color.black);
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key14.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn13);







        JButton btn14 = new JButton();
        btn14.setBounds(777,113,80,180);
        btn14.setBackground(Color.black);
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key16.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn14);







        JButton btn17 = new JButton();
        btn17.setBounds(857,113,80,180);
        btn17.setBackground(Color.black);
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key18.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn17);







        JButton btn20 = new JButton();
        btn20.setBounds(1030,113,80,180);
        btn20.setBackground(Color.black);
        btn20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key20.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn20);







        JButton btn21 = new JButton();
        btn21.setBounds(1111,113,75,180);
        btn21.setBackground(Color.black);
        btn21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key22.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn21);








        //------------------ WHITE BUTTONS ------------------\\
        JButton btn = new JButton();
        //btn.setFont();
        btn.setBounds(0,113,90,300);
        btn.setBackground(Color.pink);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip1 ;
                try {
                    File file1 = new File("key01.wav");
                    AudioInputStream sound1 = AudioSystem.getAudioInputStream(file1);
                    clip1 = AudioSystem.getClip();
                    clip1.open(sound1);
                    clip1.start();
                    c.add(btn1,0,-1);
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn);







        JButton btn2 = new JButton();
        btn2.setBounds(91,292,90,120);
        btn2.setBackground(Color.pink);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip1;
                try {
                    File file1 = new File("key03.wav");
                    AudioInputStream sound1 = AudioSystem.getAudioInputStream(file1);
                    clip1 = AudioSystem.getClip();
                    clip1.open(sound1);
                    clip1.start();
                    c.add(btn1,0,-1);
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn2);






        JButton btn4 =new JButton();
        btn4.setBounds(182,114,90,300);
        btn4.setBackground(Color.pink);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try {
                    File file = new File("key05.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip=AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn4);






        JButton btn5 = new JButton();
        btn5.setBounds(274,114,90,300);
        btn5.setBackground(Color.pink);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try {
                    File file = new File("key06.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn5);






        JButton btn6 = new JButton();
        btn6.setBounds(365,292,90,120);
        btn6.setBackground(Color.pink);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key08.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn6);







        JButton btn10 = new JButton();
        btn10.setBounds(456,292,90,120);
        btn10.setBackground(Color.pink);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key10.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn10);







        JButton btn11 = new JButton();
        btn11.setBounds(547,113,90,300);
        btn11.setBackground(Color.pink);
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key12.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn11);







        JButton btn12 = new JButton();
        btn12.setBounds(637,113,90,300);
        btn12.setBackground(Color.pink);
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key13.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn12);







        JButton btn15 = new JButton();
        btn15.setBounds(728,292,90,120);
        btn15.setBackground(Color.pink);
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key15.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                    }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn15);








        JButton btn16 = new JButton();
        btn16.setBounds(819,292,90,120);
        btn16.setBackground(Color.pink);
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key17.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                    }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn16);







        JButton btn18 = new JButton();
        btn18.setBounds(910,113,90,300);
        btn18.setBackground(Color.pink);
        btn18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key19.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn18);








        JButton btn19 = new JButton();
        btn19.setBounds(990,113,90,300);
        btn19.setBackground(Color.pink);
        btn19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key21.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn19);









        JButton btn22 = new JButton();
        btn22.setBounds(1080,292,110,120);
        btn22.setBackground(Color.pink);
        btn22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try{
                    File file = new File("key23.wav");
                    AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(sound);
                    clip.start();
                }
                catch (Exception e1)
                {

                }
            }
        });
        c.add(btn22);






        JButton btn26 = new JButton("Play Sound");
        btn26.setBounds(1055,40,100,30);
        btn26.setForeground(Color.white);
        btn26.setBackground(Color.darkGray);
        btn26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clip clip;
                try {

                    File file = new File("cinematicPiano.wav");
                        AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                        clip = AudioSystem.getClip();
                        clip.open(sound);
                        clip.start();
                        JOptionPane.showMessageDialog(null,"Press ok to stop");
                        System.out.println("Can't find file");
                        clip.stop();

                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });
        c.add(btn26);






        head = new JLabel();
        head.setText(" EPIANO");
        head.setBounds(455,0,400,90);
        head.setForeground(Color.white);
        c.add(head);

        Font font = new Font("University",Font.PLAIN,60);
        head.setFont(font);




        setLayout(null);
        c.setLayout(null);
        setVisible(true);

    }


}





//------------------ MAIN METHOD ------------------\\






public class EPiano {
    public static void main(String[] args) {



        Piano f = new Piano();




                                            }






                    }








//---------- END OF PROGRAM , MADE BY SAROSH SHAIKH (SEC 3 , 20SW128) & FAEEZ AHMED (SEC 1 , 20SW123)----------\\