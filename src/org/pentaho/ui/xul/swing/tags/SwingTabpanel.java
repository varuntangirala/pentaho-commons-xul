package org.pentaho.ui.xul.swing.tags;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulDomContainer;
import org.pentaho.ui.xul.components.XulTabpanel;
import org.pentaho.ui.xul.swing.SwingElement;
import org.pentaho.ui.xul.util.Orient;

public class SwingTabpanel extends SwingElement implements XulTabpanel{
	
	
	public SwingTabpanel(XulComponent parent, XulDomContainer domContainer, String tagName) {
		super("tabpanel");


    this.orientation = Orient.VERTICAL;
    
    container = new JPanel(new GridBagLayout());

    managedObject = container;
    
    resetContainer();
    
	}
	
  public void resetContainer(){
    
    container.removeAll();
    
    gc = new GridBagConstraints();
    gc.gridy = GridBagConstraints.RELATIVE;
    gc.gridx = 0;
    gc.gridheight = 1;
    gc.gridwidth = GridBagConstraints.REMAINDER;
    gc.insets = new Insets(2,2,2,2);
    gc.fill = GridBagConstraints.HORIZONTAL;
    gc.anchor = GridBagConstraints.NORTHWEST;
    gc.weightx = 1;
    
  }

  @Override
  public void replaceChild(XulComponent oldElement, XulComponent newElement) {
    this.resetContainer();
    super.replaceChild(oldElement, newElement);
  }

}
