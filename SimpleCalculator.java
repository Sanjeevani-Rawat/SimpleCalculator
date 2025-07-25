import javax.swing.*;   // allows gui commands like JFrame, JButton, JLable etc.
import java.awt.*;      // let us use to layout managers, colors, fonts etc.
import java.awt.event.*;    // let us use to handle events like button click, key press etc.

class SimpleCalculator {    // class name
    public static void main(String[] args) {    // entry pt for java prgm, it runs first when the app starts
        JFrame frame = new JFrame("Simple Calculator");     // creates a window with name simple calculator
        // frame.setVisible(true);     // makes the window visible   // this will at add at end so that entire comopnents of frame apear at once 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // closes the window and the program when we close it 
        frame.setBounds(500, 100, 280, 480);    // set position and size of the window
        frame.setResizable(false);

        Container c = frame.getContentPane();   // this the body of the frame where all the components r added
        c.setLayout(null);      // set layout manager to null, so we can set position and size of components manually
        c.setBackground(new Color(129, 154, 145));

        JLabel label1 = new JLabel("Perform Operation with 2 Inputs -");       // creates a label at the top of the window
        label1.setBounds(30, 5, 230, 50);
        c.add(label1);      // adds the label to the window 


        final JTextField tf1 = new JTextField();      // creates a text field to input the numbers and perform operations
        tf1.setBounds(20, 60, 230, 50);     // final keyword is used to prevent the variable from being changed once it's been assigned a value
        tf1.setEditable(false);     // user can’t type anything manually — only buttons will add characters
        c.add(tf1);     // final is used coz its accessed inside action listener (inner classes)


        JButton b1 = new JButton("->");     // creates a button with "->" on it and sets its position and size
        b1.setBounds(20, 120, 110, 50);
        c.add(b1);
        /*
        JButton b2 = new JButton("()");
        b2.setBounds(80, 120, 50, 50);
        c.add(b2);
        */
        JButton b3 = new JButton("%");
        b3.setBounds(140, 120, 50, 50);
        c.add(b3);
        JButton b4 = new JButton("/");
        b4.setBounds(200, 120, 50, 50);
        c.add(b4);

        JButton b5 = new JButton("7");
        b5.setBounds(20, 180, 50, 50);
        c.add(b5);
        JButton b6 = new JButton("8");
        b6.setBounds(80, 180, 50, 50);
        c.add(b6);
        JButton b7 = new JButton("9");
        b7.setBounds(140, 180, 50, 50);
        c.add(b7);
        JButton b8 = new JButton("X");
        b8.setBounds(200, 180, 50, 50);
        c.add(b8);

        JButton b9 = new JButton("4");
        b9.setBounds(20, 240, 50, 50);
        c.add(b9);
        JButton b10 = new JButton("5");
        b10.setBounds(80, 240, 50, 50);
        c.add(b10);
        JButton b11 = new JButton("6");
        b11.setBounds(140, 240, 50, 50);
        c.add(b11);
        JButton b12 = new JButton("-");
        b12.setBounds(200, 240, 50, 50);
        c.add(b12);

        JButton b13 = new JButton("1");
        b13.setBounds(20, 300, 50, 50);
        c.add(b13);
        JButton b14 = new JButton("2");
        b14.setBounds(80, 300, 50, 50);
        c.add(b14);
        JButton b15 = new JButton("3");
        b15.setBounds(140, 300, 50, 50);
        c.add(b15);
        JButton b16 = new JButton("+");
        b16.setBounds(200, 300, 50, 50);
        c.add(b16);

        JButton b17 = new JButton("C");
        b17.setBounds(20, 360, 50, 50);
        c.add(b17);
        JButton b18 = new JButton("0");
        b18.setBounds(80,360, 50, 50);
        c.add(b18);
        JButton b19 = new JButton(".");
        b19.setBounds(140, 360, 50, 50);
        c.add(b19);
        JButton b20 = new JButton("=");
        b20.setBounds(200, 360, 50, 50);
        c.add(b20);


        Color originalColor1 = b1.getBackground();
        // Color originalColor2 = b2.getBackground();
        Color originalColor3 = b3.getBackground();
        Color originalColor4 = b4.getBackground();
        Color originalColor5 = b5.getBackground();
        Color originalColor6 = b6.getBackground();
        Color originalColor7 = b7.getBackground();
        Color originalColor8 = b8.getBackground();
        Color originalColor9 = b9.getBackground();
        Color originalColor10 = b10.getBackground();
        Color originalColor11 = b11.getBackground();
        Color originalColor12 = b12.getBackground();
        Color originalColor13 = b13.getBackground();
        Color originalColor14 = b14.getBackground();
        Color originalColor15 = b15.getBackground();
        Color originalColor16 = b16.getBackground();
        Color originalColor17 = b17.getBackground();
        Color originalColor18 = b18.getBackground();
        Color originalColor19 = b19.getBackground();
        Color originalColor20 = b20.getBackground();

        b1.addActionListener(new ActionListener() {     
            // Deletes the last character from the text field (like a backspace).
            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();       // takes the txt form the field
                b1.setBackground(new Color(167, 193, 168));    // change the color of the button when clicked
                tf1.setText("");              // clears the field
                for (int i=0; i<s.length()-1; i++){
                    tf1.setText(tf1.getText()+s.charAt(i)); // loops through the txt and adds all characters except the last one
                }

                // to reset the color after short delay
                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b1.setBackground(originalColor1); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        /* 
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "()");
            }
        });
        */
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b3.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "%");       // adds the % symbol to the text field

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b3.setBackground(originalColor3); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b4.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "/");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b4.setBackground(originalColor4); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // String s = b5.getText();
                b5.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "7");       // when 7 is clicked , it will add 7 to the text field

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b5.setBackground(originalColor5); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b6.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "8");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b6.setBackground(originalColor6); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b7.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "9");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b7.setBackground(originalColor7); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b8.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "*");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b8.setBackground(originalColor8); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b9.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "4");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b9.setBackground(originalColor9); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b10.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "5");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b10.setBackground(originalColor10); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b11.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "6");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b11.setBackground(originalColor11); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b12.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "-");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b12.setBackground(originalColor12); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b13.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "1");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b13.setBackground(originalColor13); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b14.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "2");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b14.setBackground(originalColor14); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b15.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "3");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b15.setBackground(originalColor15); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b16.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "+");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b16.setBackground(originalColor16); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b17.setBackground(new Color(167, 193, 168));
                tf1.setText("");        // clear the input field
                
                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b17.setBackground(originalColor17); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b18.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + "0");

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b18.setBackground(originalColor18); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b19.setBackground(new Color(167, 193, 168));
                tf1.setText(tf1.getText() + ".");       // adds a decimal point

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b19.setBackground(originalColor19); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();
            }
        });
        b20.addActionListener(new ActionListener() {        // this line add action listener to b20 button i.e, = <when user click on this button it will perform the code inside it>

            // here we will handle the actual calculation
            // It extracts the operator, splits the expression, parses numbers, and does calculation.
            // Shows the result or an error if the format is wrong.

            public void actionPerformed(ActionEvent e) {    // this mthd will called when the button is clicked
                b20.setBackground(new Color(167, 193, 168));

                Timer t = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b20.setBackground(originalColor20); // reset the color of the button
                    }
                });
                t.setRepeats(false);
                t.start();


                try {
                    String exp = tf1.getText(); // get the expression from the text field 5+7 n stores it into exp
                    char operator = 0;      // help us to store and identify the operator
                    int index = -1;         // help us to identify the position of operator in the expression
                    // find the operator 
                    // This loop goes through the string one character at a time to find the operator (+, -, *, /).
                    for (int i = 0; i<exp.length(); i++){
                        char ch= exp.charAt(i);
                        if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                            operator = ch;  // store the operator
                            index = i;      // store the position of operator
                            break;
                        }
                    }
                    // split the expression into two parts
                    double num1 = Double.parseDouble(exp.substring(0, index));  // Takes the first number from the expression string, before the operator, and converts it from text to number.     For "5+7" → substring(0, 1) → "5" → converted to 5.0.
                    double num2 = Double.parseDouble(exp.substring(index + 1));            // Takes the second number, which is after the operator.     For "5+7" → substring(2) → "7" → becomes 7.0.
                    double result = 0;      // Declares a variable result to store the final answer after calculation.
                    // do the calculation based on the operator
                    switch (operator) {
                        case '+': result = num1 + num2; break;
                        case '-': result = num1 - num2; break;
                        case '*': result = num1 * num2; break;
                        case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
                        case '%': result = num1 % num2; break;
                    }       
                    tf1.setText(String.valueOf(result));    // show the result
                } catch (Exception ex) {
                    tf1.setText("Error");       // show an error message if the format is wrong
                }
            }
        });

        frame.setVisible(true);     // makes the window visible
    }
}