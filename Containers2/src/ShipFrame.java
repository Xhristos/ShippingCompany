import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ShipFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton create;
	private JButton set_containers;
	private JTextField ship_cappacity;
	private Ship ship;
	public ShipFrame(Ship s) {
		 ship = s;
		panel = new JPanel();
	    create = new JButton("Set cappacity");
	    ship_cappacity = new JTextField(10);
	    ship_cappacity.setToolTipText("capacity");
	    set_containers=new JButton("Containers");
	    this.setContentPane(panel);
	    panel.add(create);
	    panel.add(ship_cappacity);
	    panel.add(set_containers);
	    ButtonListener listener = new ButtonListener();
	    create.addActionListener(listener);
	    set_containers.addActionListener(listener);
		this.setVisible(true);
		this.setTitle("Ship");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);

	
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == create) {
			ship.capacity = Integer.parseInt(ship_cappacity.getText());
			}if(e.getSource()== set_containers) {
				setVisible(false);
				new ContainerFrame(ship);
			}
			
		}
		}
}
