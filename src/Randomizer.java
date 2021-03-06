import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Randomizer{

	public static void main(String args[]){
		
		try {
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (Exception e) {
	    }

		JFrame frame = new JFrame("");
		JLabel title = new JLabel("Devin's Important Decision Maker");
		JPanel panel = new JPanel();
		JButton button = new JButton("Decide!");
		JLabel result = new JLabel("Enter chance of Yes");
		JTextField input = new JTextField("0.5");

		result.setHorizontalAlignment(JLabel.CENTER);
		input.setHorizontalAlignment(JTextField.CENTER);
		title.setHorizontalAlignment(JLabel.CENTER);

		panel.add(title);
		panel.add(button);
		panel.add(input);
		panel.add(result);

		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 1, 200, 20));
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));

		frame.pack();
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setMinimumSize(new Dimension(200, 100));
		frame.setLocationRelativeTo(null);

		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){

				double in = 0;

				try{
					in = Double.parseDouble(input.getText());
					
					if(Math.random() < in){
						result.setText("Yes");
					}
					else{
						result.setText("No");
					}
					
				}catch (Exception e2){
					result.setText("Invalid Input Bozo Brain");
				}
			}
		});
	}
}
