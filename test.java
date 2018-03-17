import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

class test implements ActionListener
{

	Button add,sub,mul,div,quit;
	Button one,two,three,four,five,six,seven,eight,nine,zero;
	JButton eagle;
	TextField tf,tf2,tf3;
	Label l;
	Frame f;
	Panel p;
	ImageIcon zeero;

	void myframe()
	{
		 f = new Frame("At the end Everything Adds up...");

		zeero = new ImageIcon("corsair.png");

		eagle = new JButton("Corsair",zeero);
		eagle.setBounds(280,180,150,50);

		p = new Panel();
		add = new Button("Add");
		sub = new Button("Sub");
		mul = new Button("Mul");
		div = new Button("Div");
		quit = new Button("Quit");

		zero = new Button("0");
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");


		l = new Label("Calculator");

		tf = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();

		tf.addActionListener(this);
		tf2.addActionListener(this);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		quit.addActionListener(this);

		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);


		p.add(add);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(quit);

		p.add(zero);
		p.add(one);
		p.add(two);
		p.add(three);
		p.add(four);
		p.add(five);
		p.add(six);
		p.add(seven);
		p.add(eight);
		p.add(nine);

		p.add(eagle);
		p.add(l);

		p.add(tf);
		p.add(tf2);
		p.add(tf3);

		add.setBounds(50,300,50,50);
		sub.setBounds(110,300,50,50);
		mul.setBounds(170,300,50,50);
		div.setBounds(230,300,50,50);
		quit.setBounds(290,300,50,50);

		one.setBounds(100,160,30,30);
		two.setBounds(140,160,30,30);
		three.setBounds(180,160,30,30);
		four.setBounds(100,200,30,30);
		five.setBounds(140,200,30,30);
		six.setBounds(180,200,30,30);
		seven.setBounds(100,240,30,30);
		eight.setBounds(140,240,30,30);
		nine.setBounds(180,240,30,30);
		zero.setBounds(220,195,40,40);


		tf.setBounds(50,50,150,40);
		tf2.setBounds(280,50,150,40);
		tf3.setBounds(100,100,280,50);

		l.setBounds(200,10,100,30);


		p.add(add);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(quit);

		p.add(tf);
		p.add(tf2);
		p.add(tf3);

		tf.setText("0");
		tf2.setText("0");
		//tf2.setEchoChar('*');

		ImageIcon icon = new ImageIcon("xodo.png");

		f.setIconImage(icon.getImage());

		f.add(p);
		p.setLayout(null);
		f.setVisible(true);
		f.setSize(500,400);

	}

		public void actionPerformed(ActionEvent ae)
		{


			if(ae.getSource()==one)
				{

					//if(tf.isSelected() == true)
									
					{
						int num1 = Integer.parseInt(tf.getText());
						tf.setText(""+num1+"1");
					}
					
				/*	if(tf2.isSelected() == true)
					{
						int num2 = Integer.parseInt(tf2.getText());
						tf2.setText(""+num2+"1");
					}
				*/	

					p.setBackground(Color.LIGHT_GRAY);
				}

			if(ae.getSource()==two)
				{
					p.setBackground(Color.GRAY);

				}

			if(ae.getSource()==three)
				{
					p.setBackground(Color.DARK_GRAY);
				}

			if(ae.getSource()==four)
				{
					p.setBackground(Color.GREEN);
				}

			if(ae.getSource()==five)
				{
					p.setBackground(Color.PINK);
				}

			if(ae.getSource()==six)
				{
					p.setBackground(Color.YELLOW);
				}

			if(ae.getSource()==seven)
				{
					p.setBackground(Color.MAGENTA);
				}

			if(ae.getSource()==eight)
				{
					p.setBackground(Color.CYAN);
				}

			if(ae.getSource()==nine)
				{
					p.setBackground(Color.ORANGE);
				}


		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			if (ae.getSource() == add )
				{
					float x = Float.parseFloat(tf.getText());
					float y = Float.parseFloat(tf2.getText());


					float z = x + y;
					tf3.setText(""+z);

				}
			if (ae.getSource() == sub )
				{
					int x = Integer.parseInt(tf.getText());
					int y = Integer.parseInt(tf2.getText());

					int z = x-y;
					tf3.setText("Subtracted"+z);
				}
			if (ae.getSource() == mul )
				{
					int x = Integer.parseInt(tf.getText());
					int y = Integer.parseInt(tf2.getText());

					int z = x * y;
					tf3.setText("Multiplied"+z);
				}
			if (ae.getSource() == div )
				{
					int x = Integer.parseInt(tf.getText());
					int y = Integer.parseInt(tf2.getText());

					int z = x/y;
					tf3.setText("Divided"+ z);
				}
			if (ae.getSource() == quit )
				{
					int x = Integer.parseInt(tf.getText());
					int y = Integer.parseInt(tf2.getText());

					tf3.setText("Bye Bye");
					System.exit(0);
				}
		}

	public static void main(String args[])
	{
		test t = new test();

		t.myframe();

	}
}
