import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Perceptony {

    private int matrixSize = 36;
    private int iterN = 1000;
    private int exampleAmount = 30;
    private ArrayList<RecordHolder> recordHolderArray;

    private JButton button1; private JButton button2; private JButton button3; private JButton button4; private JButton button5;
    private JButton button6; private JButton button7; private JButton button8; private JButton button9; private JButton button10;
    private JButton button11; private JButton button12; private JButton button13; private JButton button14; private JButton button15;
    private JButton button16; private JButton button17; private JButton button18; private JButton button19; private JButton button20;
    private JButton button21; private JButton button22; private JButton button23; private JButton button24; private JButton button25;
    private JButton button26; private JButton button27; private JButton button28; private JButton button29; private JButton button30;
    private JButton button31; private JButton button32; private JButton button33; private JButton button34; private JButton button35;
    private JButton checkButton;
    private JTextField textField1;
    private JPanel jPanel;
    private JButton learnButton;
    private JButton clear;

    private Perceptony(){
        colorWhite();
        recordHolderArray = startLearn();

        clear.addActionListener(e -> {
            colorWhite();
            textField1.setText("");
        });

        button1.addActionListener(e -> {
            if ( button1.getBackground() == Color.WHITE ) {
                button1.setBackground(Color.black); button1.setForeground(Color.black); }
            else {button1.setBackground(Color.WHITE); button1.setForeground(Color.WHITE);} });
        button2.addActionListener(e -> {
            if ( button2.getBackground() == Color.WHITE ){
                button2.setBackground(Color.black); button2.setForeground(Color.black); }
            else {button2.setBackground(Color.WHITE); button2.setForeground(Color.WHITE);}});
        button3.addActionListener(e -> {
            if ( button3.getBackground() == Color.WHITE) {
                button3.setBackground(Color.black); button3.setForeground(Color.black);}
            else{button3.setForeground(Color.WHITE); button3.setBackground(Color.WHITE);}});
        button4.addActionListener(e -> {
            if ( button4.getBackground() == Color.WHITE){
                button4.setBackground(Color.black); button4.setForeground(Color.black); }
            else {button4.setBackground(Color.WHITE); button4.setForeground(Color.WHITE);}});
        button5.addActionListener(e -> {
            if ( button5.getBackground() == Color.WHITE){
                button5.setBackground(Color.black); button5.setForeground(Color.black); }
            else {button5.setBackground(Color.WHITE); button5.setForeground(Color.WHITE);}});
        button6.addActionListener(e -> {
            if ( button6.getBackground() == Color.WHITE){
                button6.setBackground(Color.black); button6.setForeground(Color.black); }
            else {button6.setBackground(Color.WHITE); button6.setForeground(Color.WHITE);}});
        button7.addActionListener(e -> {
            if ( button7.getBackground() == Color.WHITE){
                button7.setBackground(Color.black); button7.setForeground(Color.black); }
            else {button7.setBackground(Color.WHITE); button7.setForeground(Color.WHITE);}});
        button8.addActionListener(e -> {
            if ( button8.getBackground() == Color.WHITE){
                button8.setBackground(Color.black); button8.setForeground(Color.black); }
            else {button8.setBackground(Color.WHITE); button8.setForeground(Color.WHITE);}});
        button9.addActionListener(e -> {
            if ( button9.getBackground() == Color.WHITE){
                button9.setBackground(Color.black); button9.setForeground(Color.black); }
            else {button9.setBackground(Color.WHITE); button9.setForeground(Color.WHITE);}});
        button10.addActionListener(e -> {
            if ( button10.getBackground() == Color.WHITE){
                button10.setBackground(Color.black); button10.setForeground(Color.black); }
            else {button10.setBackground(Color.WHITE); button10.setForeground(Color.WHITE);}});
        button11.addActionListener(e -> {
            if ( button11.getBackground() == Color.WHITE){
                button11.setBackground(Color.black); button11.setForeground(Color.black); }
            else {button11.setBackground(Color.WHITE); button11.setForeground(Color.WHITE);}});
        button12.addActionListener(e -> {
            if ( button12.getBackground() == Color.WHITE){
                button12.setBackground(Color.black); button12.setForeground(Color.black); }
            else {button12.setBackground(Color.WHITE); button12.setForeground(Color.WHITE);}});
        button13.addActionListener(e -> {
            if ( button13.getBackground() == Color.WHITE){
                button13.setBackground(Color.black); button13.setForeground(Color.black); }
            else {button13.setBackground(Color.WHITE); button13.setForeground(Color.WHITE);}});
        button14.addActionListener(e -> {
            if ( button14.getBackground() == Color.WHITE){
                button14.setBackground(Color.black); button14.setForeground(Color.black); }
            else {button14.setBackground(Color.WHITE); button14.setForeground(Color.WHITE);}});
        button15.addActionListener(e -> {
            if ( button15.getBackground() == Color.WHITE){
                button15.setBackground(Color.black); button15.setForeground(Color.black); }
            else {button15.setBackground(Color.WHITE); button15.setForeground(Color.WHITE);}});
        button16.addActionListener(e -> {
            if ( button16.getBackground() == Color.WHITE){
                button16.setBackground(Color.black); button16.setForeground(Color.black); }
            else {button16.setBackground(Color.WHITE); button16.setForeground(Color.WHITE);}});
        button17.addActionListener(e -> {
            if ( button17.getBackground() == Color.WHITE){
                button17.setBackground(Color.black); button17.setForeground(Color.black); }
            else {button17.setBackground(Color.WHITE); button17.setForeground(Color.WHITE);}});
        button18.addActionListener(e -> {
            if ( button18.getBackground() == Color.WHITE){
                button18.setBackground(Color.black); button18.setForeground(Color.black); }
            else {button18.setBackground(Color.WHITE); button18.setForeground(Color.WHITE);}});
        button19.addActionListener(e -> {
            if ( button19.getBackground() == Color.WHITE){
                button19.setBackground(Color.black); button19.setForeground(Color.black); }
            else {button19.setBackground(Color.WHITE); button19.setForeground(Color.WHITE);}});
        button20.addActionListener(e -> {
            if ( button20.getBackground() == Color.WHITE){
                button20.setBackground(Color.black); button20.setForeground(Color.black); }
            else {button20.setBackground(Color.WHITE); button20.setForeground(Color.WHITE);}});
        button21.addActionListener(e -> {
            if ( button21.getBackground() == Color.WHITE){
                button21.setBackground(Color.black); button21.setForeground(Color.black); }
            else {button21.setBackground(Color.WHITE); button21.setForeground(Color.WHITE);}});
        button22.addActionListener(e -> {
            if ( button22.getBackground() == Color.WHITE){
                button22.setBackground(Color.black); button22.setForeground(Color.black); }
            else {button22.setBackground(Color.WHITE); button22.setForeground(Color.WHITE);}});
        button23.addActionListener(e -> {
            if ( button23.getBackground() == Color.WHITE){
                button23.setBackground(Color.black); button23.setForeground(Color.black); }
            else {button23.setBackground(Color.WHITE); button23.setForeground(Color.WHITE);}});
        button24.addActionListener(e -> {
            if ( button24.getBackground() == Color.WHITE){
                button24.setBackground(Color.black); button24.setForeground(Color.black); }
            else {button24.setBackground(Color.WHITE); button24.setForeground(Color.WHITE);}});
        button25.addActionListener(e -> {
            if ( button25.getBackground() == Color.WHITE){
                button25.setBackground(Color.black); button25.setForeground(Color.black); }
            else {button25.setBackground(Color.WHITE); button25.setForeground(Color.WHITE);}});
        button26.addActionListener(e -> {
            if ( button26.getBackground() == Color.WHITE){
                button26.setBackground(Color.black); button26.setForeground(Color.black); }
            else {button26.setBackground(Color.WHITE); button26.setForeground(Color.WHITE);}});
        button27.addActionListener(e -> {
            if ( button27.getBackground() == Color.WHITE){
                button27.setBackground(Color.black); button27.setForeground(Color.black); }
            else {button27.setBackground(Color.WHITE); button27.setForeground(Color.WHITE);}});
        button28.addActionListener(e -> {
            if ( button28.getBackground() == Color.WHITE){
                button28.setBackground(Color.black); button28.setForeground(Color.black); }
            else {button28.setBackground(Color.WHITE); button28.setForeground(Color.WHITE);}});
        button29.addActionListener(e -> {
            if ( button29.getBackground() == Color.WHITE){
                button29.setBackground(Color.black); button29.setForeground(Color.black); }
            else {button29.setBackground(Color.WHITE); button29.setForeground(Color.WHITE);}});
        button30.addActionListener(e -> {
            if ( button30.getBackground() == Color.WHITE){
                button30.setBackground(Color.black); button30.setForeground(Color.black); }
            else {button30.setBackground(Color.WHITE); button30.setForeground(Color.WHITE);}});
        button31.addActionListener(e -> {
            if ( button31.getBackground() == Color.WHITE){
                button31.setBackground(Color.black); button31.setForeground(Color.black); }
            else {button31.setBackground(Color.WHITE); button31.setForeground(Color.WHITE);}});
        button32.addActionListener(e -> {
            if ( button32.getBackground() == Color.WHITE){
                button32.setBackground(Color.black); button32.setForeground(Color.black); }
            else {button32.setBackground(Color.WHITE); button32.setForeground(Color.WHITE);}});
        button33.addActionListener(e -> {
            if ( button33.getBackground() == Color.WHITE){
                button33.setBackground(Color.black); button33.setForeground(Color.black); }
            else {button33.setBackground(Color.WHITE); button33.setForeground(Color.WHITE);}});
        button34.addActionListener(e -> {
            if ( button34.getBackground() == Color.WHITE){
                button34.setBackground(Color.black); button34.setForeground(Color.black); }
            else {button34.setBackground(Color.WHITE); button34.setForeground(Color.WHITE);}});
        button35.addActionListener(e -> {
            if ( button35.getBackground() == Color.WHITE){
                button35.setBackground(Color.black); button35.setForeground(Color.black); }
            else {button35.setBackground(Color.WHITE); button35.setForeground(Color.WHITE);}});

        learnButton.addActionListener(e -> {
                recordHolderArray = startLearn();
        });

        checkButton.addActionListener(e -> {
            int[] answerArray = new int[matrixSize];

            answerArray[0] = 1;
            if (button1.getBackground()== Color.black){ answerArray[1] = 1; } else {answerArray[1] = 0;}
            if (button2.getBackground()== Color.black){ answerArray[2] = 1; } else {answerArray[2] = 0;}
            if (button3.getBackground()== Color.black){ answerArray[3] = 1; } else {answerArray[3] = 0;}
            if (button4.getBackground()== Color.black){ answerArray[4] = 1; } else {answerArray[4] = 0;}
            if (button5.getBackground()== Color.black){ answerArray[5] = 1; } else {answerArray[5] = 0;}
            if (button6.getBackground()== Color.black){ answerArray[6] = 1; } else {answerArray[6] = 0;}
            if (button7.getBackground()== Color.black){ answerArray[7] = 1; } else {answerArray[7] = 0;}
            if (button8.getBackground()== Color.black){ answerArray[8] = 1; } else {answerArray[8] = 0;}
            if (button9.getBackground()== Color.black){ answerArray[9] = 1; } else {answerArray[9] = 0;}
            if (button10.getBackground()== Color.black){answerArray[10] = 1; } else {answerArray[10] = 0;}
            if (button11.getBackground()== Color.black){ answerArray[11] = 1; } else {answerArray[11] = 0;}
            if (button12.getBackground()== Color.black){ answerArray[12] = 1; } else {answerArray[12] = 0;}
            if (button13.getBackground()== Color.black){ answerArray[13] = 1; } else {answerArray[13] = 0;}
            if (button14.getBackground()== Color.black){ answerArray[14] = 1; } else {answerArray[14] = 0;}
            if (button15.getBackground()== Color.black){ answerArray[15] = 1; } else {answerArray[15] = 0;}
            if (button16.getBackground()== Color.black){ answerArray[16] = 1; } else {answerArray[16] = 0;}
            if (button17.getBackground()== Color.black){ answerArray[17] = 1; } else {answerArray[17] = 0;}
            if (button18.getBackground()== Color.black){ answerArray[18] = 1; } else {answerArray[18] = 0;}
            if (button19.getBackground()== Color.black){ answerArray[19] = 1; } else {answerArray[19] = 0;}
            if (button20.getBackground()== Color.black){ answerArray[20] = 1; } else {answerArray[20] = 0;}
            if (button21.getBackground()== Color.black){ answerArray[21] = 1; } else {answerArray[21] = 0;}
            if (button22.getBackground()== Color.black){ answerArray[22] = 1; } else {answerArray[22] = 0;}
            if (button23.getBackground()== Color.black){ answerArray[23] = 1; } else {answerArray[23] = 0;}
            if (button24.getBackground()== Color.black){ answerArray[24] = 1; } else {answerArray[24] = 0;}
            if (button25.getBackground()== Color.black){ answerArray[25] = 1; } else {answerArray[25] = 0;}
            if (button26.getBackground()== Color.black){ answerArray[26] = 1; } else {answerArray[26] = 0;}
            if (button27.getBackground()== Color.black){ answerArray[27] = 1; } else {answerArray[27] = 0;}
            if (button28.getBackground()== Color.black){ answerArray[28] = 1; } else {answerArray[28] = 0;}
            if (button29.getBackground()== Color.black){ answerArray[29] = 1; } else {answerArray[29] = 0;}
            if (button30.getBackground()== Color.black){ answerArray[30] = 1; } else {answerArray[30] = 0;}
            if (button31.getBackground()== Color.black){ answerArray[31] = 1; } else {answerArray[31] = 0;}
            if (button32.getBackground()== Color.black){ answerArray[32] = 1; } else {answerArray[32] = 0;}
            if (button33.getBackground()== Color.black){ answerArray[33] = 1; } else {answerArray[33] = 0;}
            if (button34.getBackground()== Color.black){ answerArray[34] = 1; } else {answerArray[34] = 0;}
            if (button35.getBackground()== Color.black){ answerArray[35] = 1; } else {answerArray[35] = 0;}


            textField1.setText("");
            StringBuilder answer = new StringBuilder();
            for (int num = 0 ; num < 10 ; num++) {
                if (check(num, answerArray, recordHolderArray) == 1) {
                    answer.append(Integer.toString(num)).append(" ");
                }
            }
            textField1.setText(answer.toString());
        });
    }

    private void colorWhite(){
        button1.setForeground(Color.WHITE); button1.setBackground(Color.WHITE); button2.setForeground(Color.WHITE); button2.setBackground(Color.WHITE);
        button3.setForeground(Color.WHITE); button3.setBackground(Color.WHITE); button4.setForeground(Color.WHITE); button4.setBackground(Color.WHITE);
        button5.setForeground(Color.WHITE); button5.setBackground(Color.WHITE); button6.setForeground(Color.WHITE); button6.setBackground(Color.WHITE);
        button7.setForeground(Color.WHITE); button7.setBackground(Color.WHITE); button8.setBackground(Color.WHITE); button8.setForeground(Color.WHITE);
        button9.setBackground(Color.WHITE); button9.setForeground(Color.WHITE); button10.setForeground(Color.WHITE); button10.setBackground(Color.WHITE);
        button11.setForeground(Color.WHITE); button11.setBackground(Color.WHITE); button12.setForeground(Color.WHITE); button12.setBackground(Color.WHITE);
        button13.setForeground(Color.WHITE); button13.setBackground(Color.WHITE); button14.setForeground(Color.WHITE); button14.setBackground(Color.WHITE);
        button15.setForeground(Color.WHITE); button15.setBackground(Color.WHITE); button16.setForeground(Color.WHITE); button16.setBackground(Color.WHITE);
        button17.setForeground(Color.WHITE); button17.setBackground(Color.WHITE); button18.setBackground(Color.WHITE); button18.setForeground(Color.WHITE);
        button19.setBackground(Color.WHITE); button19.setForeground(Color.WHITE); button21.setForeground(Color.WHITE); button21.setBackground(Color.WHITE);
        button20.setForeground(Color.WHITE); button20.setBackground(Color.WHITE); button22.setForeground(Color.WHITE); button22.setBackground(Color.WHITE);
        button23.setForeground(Color.WHITE); button23.setBackground(Color.WHITE); button24.setForeground(Color.WHITE); button24.setBackground(Color.WHITE);
        button25.setForeground(Color.WHITE); button25.setBackground(Color.WHITE); button26.setForeground(Color.WHITE); button26.setBackground(Color.WHITE);
        button27.setForeground(Color.WHITE); button27.setBackground(Color.WHITE); button28.setBackground(Color.WHITE); button28.setForeground(Color.WHITE);
        button29.setBackground(Color.WHITE); button29.setForeground(Color.WHITE); button30.setForeground(Color.WHITE); button30.setBackground(Color.WHITE);
        button31.setForeground(Color.WHITE); button31.setBackground(Color.WHITE); button32.setForeground(Color.WHITE); button32.setBackground(Color.WHITE);
        button33.setForeground(Color.WHITE); button33.setBackground(Color.WHITE); button34.setForeground(Color.WHITE); button34.setBackground(Color.WHITE);
        button35.setForeground(Color.WHITE); button35.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        Perceptony perceptony = new Perceptony();
        JFrame jFrame = new JFrame("Perceptony");
        jFrame.setPreferredSize(new Dimension(400, 400));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setContentPane(perceptony.jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private int check(int num, int[] answerArray, ArrayList<RecordHolder> recordHolderArray){
        double sum = 0.0;
        RecordHolder rH = recordHolderArray.get(num);
        double[] weights = rH.getWeight();
        double[] answerDouble = new double[matrixSize];

        for (int i = 0 ; i < matrixSize; i++){
            answerDouble[i] = (double) answerArray[i];
        }

        for (int i = 1 ; i < matrixSize; i++){
            sum += answerDouble[i] * weights[i];
        }

        sum -= weights[0];

        try {
            BufferedWriter bW = new BufferedWriter(new FileWriter("check.txt", true));
            bW.append(Integer.toString(num))
                    .append(" Suma: ").append(Double.toString(sum))
                    .append(" sgn: ").append(String.valueOf(Math.signum(sum)))
                    .append(" LifeTime: ").append(Integer.toString(rH.getLifeTime()))
                    .append(" ERR: ").append(Double.toString(rH.getERR()))
                    .append(" wagi: " );
            for (int i = 0 ; i < weights.length; i++){
                bW.append(Double.toString(weights[i])).append(" ");
            }
            bW.newLine();
            bW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (int) Math.signum(sum);
    }

    private ArrayList<RecordHolder> startLearn(){
        ArrayList<RecordHolder> recordHolderArray = new ArrayList<>();
        RecordHolder recordHolder;
        int[][] exampleArray = readFile();

        for (int numberToLearn = 0 ; numberToLearn < 10 ; numberToLearn++){
            recordHolder = learn(numberToLearn, exampleArray);
            recordHolderArray.add(recordHolder);
        }
        return recordHolderArray;
    }

    private int[][] readFile(){
        int[][] example = new int[exampleAmount][matrixSize];
        int lineNum = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("examples.txt"));
            String line = in.readLine();
            while ( line != null ){
                char[] a = line.toCharArray();
                for ( int i = 0 ; i < line.length(); i++){
                    example[lineNum][i] = Integer.valueOf(String.valueOf(a[i]));
                }
                lineNum++;
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return example;
    }

    private double[] weightRandom() {
        double[] weights = new double[matrixSize];
        Random random = new Random();
        for (int i = 0; i < matrixSize; i++) {
            weights[i] = random.nextDouble();
        }
        return weights;
    }

    private int[] getExample(int[][] exampleArray){
        Random random = new Random();
        int rand = random.nextInt(exampleAmount);
        return exampleArray[rand];
    }

    private int tJ(int numberToLearn, int randNum){
        if ( numberToLearn == randNum){
            return 1;
        } else {
            return -1;
        }
    }

    private int o(int[] example, double[] weights){
        double sum = 0.0;
        for ( int i = 1 ; i < matrixSize ; i++){
            sum += example[i] * weights[i];
        }

        if ( sum < weights[0] ){
            return -1;
        } else {
            return 1;
        }
    }

    private RecordHolder learn(int numberToLearn, int[][] exampleArray){
        double[] weights = weightRandom();
        int lifeTime  = 0;
        RecordHolder recordHolder = new RecordHolder(weights, lifeTime, 0);
        int[] example;
        for (int iter = 0 ; iter < iterN; iter++){
            example = getExample(exampleArray);
            int ERR = tJ(numberToLearn, example[0]) - o(example, weights);

            if ( ERR == 0 ){
                lifeTime++;
                if (recordHolder.getLifeTime() < lifeTime ){
                    recordHolder.setWeight(weights);
                    recordHolder.setERR(ERR);
                    recordHolder.setLifeTime(lifeTime);
                }
            } else {
                for( int i = 1 ; i < matrixSize; i++){
                    weights[i] += 0.1 * ERR * example[i];
                }
                weights[0] -=  0.1 * ERR;
                errorCheck(lifeTime, exampleArray, numberToLearn, recordHolder);
                lifeTime = 0;
            }
        }
        return recordHolder;
    }


    private void errorCheck(int lifeTime, int[][] exampleArray, int numberToLearn, RecordHolder recordHolder){
        int[] example;
        StringBuilder sb = new StringBuilder();
        sb.append(numberToLearn).append(": ");
        int howMany = 0;
        for (int i = 0; i < 30; i++) {
            example = exampleArray[i];
            int ERR = tJ(numberToLearn, example[0]) - o(example, recordHolder.getWeight());
            if (ERR != 0) {
                howMany++;
            }
        }
        sb.append("HowMany: ").append(howMany).append(" life time: ").append(lifeTime);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("results.txt", true));
            bufferedWriter.write(sb.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
