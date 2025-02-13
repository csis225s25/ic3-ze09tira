/** Java Program to create a simple JComboBox
*
*  Modified from Geeks for Geeks user @andrew1234
*  @author Ira Goldstein
*  @version Spring 2010 
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ComboBoxDemo extends JFrame implements ItemListener {

	// frame
	static JFrame frame;

	// label
	static JLabel label, label1;

	// combobox
	static JComboBox cBox1;

	// main class
	public static void main(String[] args)
	{
		// create a new frame
		frame = new JFrame("Combo Box Demo");
		
        // tell the JFrame that when someone closes the
        // window, the application should terminate
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		// create a object
		ComboBoxDemo s = new ComboBoxDemo();

		// set layout of frame
		frame.setLayout(new FlowLayout());

		// array of string containing cities
		String s1[] = { "Albany", "Schenectady", "Troy", "Glens Falls", "Catskill" };

		// create checkbox
        cBox1 = new JComboBox(s1);
		
		// add ItemListener
		cBox1.addItemListener(s);

		// create labels
		label = new JLabel("select your city ");
		label1 = new JLabel("Albany selected");

		// set color of text
		label.setForeground(Color.red);
	    label1.setForeground(Color.blue);

		// create a new panel
		JPanel p = new JPanel();

		p.add(label);

		// add combobox to panel
		p.add(cBox1);

		p.add(label1);

		// add panel to frame
		frame.add(p);

		// set the size of frame
		frame.setSize(400, 300);

		frame.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		// if the state combobox is changed
		if (e.getSource() == cBox1) {

			label1.setText(cBox1.getSelectedItem() + " selected");
		}
	}
}
