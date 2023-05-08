import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ChargeCalculator extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton calc;
	private JTextField note;
	private JTextField most_expensive;

	
	private Ship ship;
	public ChargeCalculator(Ship s) {
		ship = s;
		panel = new JPanel();
		calc = new JButton("Calulate Charge");
		note = new JTextField(10);
		note.setToolTipText("Total charge for all containers");
		note.setEditable(false);
		most_expensive = new JTextField(20);
		most_expensive.setEditable(false);
		this.setContentPane(panel);
		panel.add(calc);
		panel.add(note);
		panel.add(most_expensive);
		ButtonListener listener = new ButtonListener();
		calc.addActionListener(listener);
		this.setVisible(true);
		this.setTitle("Charge calculator");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);

		
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double charge = ship.calcTotalCost();
			System.out.println(charge);
			System.out.println(ship.containers.get(0).id);
			note.setText( Double.toString(charge) );
			most_expensive.setText("The most expenice containers id is: " + ship.containers.get(0).id);
		}
}
}
