package graphique;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class Teste extends JPanel {

	/**
	 * Create the panel.
	 */
	public Teste() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTreo = new JLabel("TREO");
		lblTreo.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblTreo = new GridBagConstraints();
		gbc_lblTreo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTreo.gridx = 0;
		gbc_lblTreo.gridy = 0;
		add(lblTreo, gbc_lblTreo);
		
		JLabel lblGreg = new JLabel("GREG");
		GridBagConstraints gbc_lblGreg = new GridBagConstraints();
		gbc_lblGreg.gridx = 0;
		gbc_lblGreg.gridy = 1;
		add(lblGreg, gbc_lblGreg);

	}

}
