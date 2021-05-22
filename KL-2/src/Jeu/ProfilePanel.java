package Jeu;

import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ProfilePanel extends JPanel {
	
    @SuppressWarnings("unused")
	private Echiquier echiquier;

    public ProfilePanel(Echiquier echiquier){
        super(new java.awt.FlowLayout());
        this.echiquier = echiquier;
        super.setBorder(EchecSwing.blackline);
        super.setPreferredSize(new Dimension(250, 300));
    }
}
