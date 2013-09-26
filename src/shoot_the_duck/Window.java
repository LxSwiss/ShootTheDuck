package shoot_the_duck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Window extends JFrame implements ActionListener{
        
    private Window()
    {
    
        this.setTitle("Shoot the duck");
        
     
        if(false) 
        {
         
            this.setUndecorated(true);
           
            this.setExtendedState(this.MAXIMIZED_BOTH);
        }
        else
        {
            this.setSize(800, 600);
          
            this.setLocationRelativeTo(null);
            
            this.setResizable(false);
        }
        
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setContentPane(new Framework());
        
        this.setVisible(true);
        
        // Generate new Button
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setVisible(true);
        
        //add Button to the Frame
        this.add(cancelButton);
        
        //Add Action Listener to Button
        cancelButton.addActionListener (this);
    }

    public static void main(String[] args)
    {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window();
            }
        });
    }

    // Terminates the Program if the CancelButton is being pressed
	@Override
	public void actionPerformed(ActionEvent arg0) {
				System.exit(0); 
	}
}
