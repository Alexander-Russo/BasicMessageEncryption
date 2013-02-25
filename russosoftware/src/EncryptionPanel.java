package russosoftware.src;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class EncryptionPanel extends JFrame
{
	private static final long serialVersionUID = 4758251771478547528L;

	public JTextField inputField = new JTextField("Place text you wish to encrypt or decrypt here.");
	public JButton encryptButton = new JButton("Encrypt");
	public JButton decryptRegButton = new JButton("Decrypt Regular");
	//public JButton decryptBinButton = new JButton("Decrypt Binary");
	public JTextField outputField = new JTextField("Output");
	public JButton copyToClipButton = new JButton("Copy Output to Clipboard");
	
	public ComponentListener compListener;
	
	public EncryptionPanel(int width, int height, String panelTitle)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(width, height));
		this.setTitle(panelTitle);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		setupComponents();
	}
	
	private void setupComponents() 
	{
		compListener = new ComponentListener();
		inputField.setMinimumSize(new Dimension(10, 100));
		add(inputField);
		
		encryptButton.addActionListener(compListener);
		add(encryptButton);
		
		decryptRegButton.addActionListener(compListener);
		add(decryptRegButton);
		
		//add(decryptBinButton);
		
		outputField.setSize(new Dimension(10, 100));
		outputField.setEditable(false);
		add(outputField);
		
		copyToClipButton.addActionListener(compListener);
		add(copyToClipButton);
	}

	public class ComponentListener implements MouseListener, KeyListener, ActionListener, ClipboardOwner
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == decryptRegButton)
			{
				String src = inputField.getText();
				outputField.setText(DecryptionUtilities.decryptChars(src.toCharArray()));
			}else
			//if(e.getSource() == decryptBinButton)
			//{
			//	String[] src = inputField.getText().split(" ");
				//outputField.setText(DecryptionUtilities.decryptChars(binary));
			//}
			if(e.getSource() == encryptButton)
			{
				String src = inputField.getText();
				outputField.setText(EncryptionUtilities.encryptString(src));
			}else
			if(e.getSource() == copyToClipButton)
			{
				String src = outputField.getText();
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				clip.setContents(new StringSelection(src), (ClipboardOwner) this);
			}
		}

		@Override
		public void keyTyped(KeyEvent e) 
		{
			
		}

		@Override
		public void keyPressed(KeyEvent e) 
		{
			
		}

		@Override
		public void keyReleased(KeyEvent e) 
		{
			
		}

		@Override
		public void mouseClicked(MouseEvent e) 
		{
			
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			
		}

		@Override
		public void mouseReleased(MouseEvent e) 
		{
			
		}

		@Override
		public void mouseEntered(MouseEvent e) 
		{
			
		}

		@Override
		public void mouseExited(MouseEvent e) 
		{			
		}

		@Override
		public void lostOwnership(Clipboard clipboard, Transferable contents) 
		{
			
		}
	}
}
