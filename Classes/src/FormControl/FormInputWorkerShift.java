package FormControl;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextArea;

import ExtendedSupportClasses.JPanelExtended;

@SuppressWarnings("serial")
public class FormInputWorkerShift extends JPanelExtended {
	private JTextArea ShiftField;

	/**
	 * Create the panel.
	 */
	public FormInputWorkerShift() {
		
		JLabel lblInputWorkerShift = new JLabel("Input Worker's Shift");
		lblInputWorkerShift.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblInputWorkerShift.setBounds(57, 11, 324, 57);
		add(lblInputWorkerShift);
		
		ShiftField = new JTextArea();
		ShiftField.setLineWrap(true);
		ShiftField.setBounds(91, 79, 228, 87);
		ShiftField.setToolTipText("Input the worker's shift");
		add(ShiftField);
		ShiftField.setColumns(10);
		ShiftField.setRows(10);
		ShiftField.setWrapStyleWord(true);
	}
	
	public String getShift(){
		return ShiftField.getText();
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(430, 230);
	}
}
