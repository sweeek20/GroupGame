import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Game extends JFrame implements ActionListener {
    private JButton rock, paper, scissors;
    private JTextField text1, text2;


    public static void main(String[] args) {
        //create game space
        Game g = new Game();
        g.setSize(250, 150);
        g.setup();

        g.setTitle("Rock Paper Scissors");
        g.setBounds(200,200,600,600);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // g.setResizable(false);
       // g.setVisible(true);
       // g.add(g);

    }
    private void setup() {
        JFrame obj = new JFrame();

        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        text1 = new JTextField(15);
        window.add(text1);

        text2 = new JTextField(15);
        window.add(text2);

        rock = new JButton("Rock");
        window.add(rock);
        rock.addActionListener(this);


        paper = new JButton("Paper");
        window.add(paper);
        paper.addActionListener(this);

        scissors = new JButton("Scissors");
        window.add(scissors);
        scissors.addActionListener(this);

    }

public void actionPerformed(ActionEvent event){
        Object s= event.getSource();
        int player;
        int computer;
        String winner;
        Random rand=new Random();
        if (s==rock){
            player=0;

        }else if(s==paper){
            player=1;

        }else if (s==scissors){
            player=2;
        }

        computer=rand.nextInt(3);
        //insert winner call to method here

}
    //rock 0
    //paper 1
    //scissors 2

private String winner(int player, int computer){
        String winner;
        if (player==computer){
            winner="Tie";
        } else if (player==0 && computer ==1){
            winner="Computer";
        }else if(player==1&& computer==2){
            winner="Computer";
        }else if(player==2 && computer==0){
            winner="Computer";
        }else{
            winner="Player";
        }






}


    }





