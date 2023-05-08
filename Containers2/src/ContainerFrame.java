import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ContainerFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton create_bulk;
	private JButton create_ref;
	private JButton cal_cost;
	private JTextField code;
	private JTextField destination;
	private JTextField weight;
	private JTextField power;
	private static Ship ship;
	
	public ContainerFrame(Ship s) {
		ship = s;
		panel = new JPanel();

		code = new JTextField(5);
		code.setToolTipText("id");
		destination = new JTextField(10);
		destination.setToolTipText("Destination");
		weight = new JTextField(10);
		weight.setToolTipText("Weight(for bulk)");
		power = new JTextField(10);
		power.setToolTipText("Power(for Refridgerator)");
		create_bulk = new JButton("Create Bulk");
		create_ref = new JButton("Create Refridgerator");
		cal_cost=new JButton("Callculate Cost");
		this.setContentPane(panel);
		panel.add(code);
		panel.add(destination);
		panel.add(weight);
		panel.add(create_bulk);
		panel.add(power);
		panel.add(create_ref);
		panel.add(cal_cost);
		ButtonListener listener = new ButtonListener();
		create_bulk.addActionListener(listener);
		create_ref.addActionListener(listener);
		cal_cost.addActionListener(listener);
		
		
		this.setVisible(true);
		this.setTitle("Container Frame");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	
	
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String c =	code.getText();
			String d =	destination.getText();
			if(e.getSource() == create_bulk) {int w =	Integer.parseInt(weight.getText());
			Container cont = new Bulk(c,d,w);
			ContainerFrame.ship.addContainer(cont); 
			}else if(e.getSource() == create_ref) {int p =	Integer.parseInt(power.getText());
			Container cont = new Refridgerator(c,d,p);
			ContainerFrame.ship.addContainer(cont); 
			}else {
				setVisible(false);
				new ChargeCalculator(ship);
			}
		

		}
}
}
